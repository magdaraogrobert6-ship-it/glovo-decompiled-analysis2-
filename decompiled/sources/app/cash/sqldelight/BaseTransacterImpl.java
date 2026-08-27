package app.cash.sqldelight;

import app.cash.sqldelight.db.SqlDriver;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseTransacterImpl {
    private final SqlDriver driver;

    public final SqlDriver getDriver() {
        return this.driver;
    }

    public BaseTransacterImpl(SqlDriver sqlDriver) {
        sqlDriver.getClass();
        this.driver = sqlDriver;
    }

    public final void notifyQueries(int i, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        final Transacter.Transaction transactionCurrentTransaction = this.driver.currentTransaction();
        if (transactionCurrentTransaction != null) {
            if (transactionCurrentTransaction.getRegisteredQueries$runtime().add(Integer.valueOf(i))) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: app.cash.sqldelight.BaseTransacterImpl.notifyQueries.1
                    {
                        super(1);
                    }

                    public final void invoke(String str) {
                        str.getClass();
                        transactionCurrentTransaction.getPendingTables$runtime().add(str);
                    }

                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((String) obj);
                        return createFromParcel.INSTANCE;
                    }
                });
            }
        } else {
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: app.cash.sqldelight.BaseTransacterImpl.notifyQueries.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void invoke(String str) {
                    str.getClass();
                    linkedHashSet.add(str);
                }

                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((String) obj);
                    return createFromParcel.INSTANCE;
                }
            });
            SqlDriver sqlDriver = this.driver;
            String[] strArr = (String[]) linkedHashSet.toArray(new String[0]);
            sqlDriver.notifyListeners((String[]) Arrays.copyOf(strArr, strArr.length));
        }
    }

    public final String createArguments(int i) {
        if (i == 0) {
            return "()";
        }
        StringBuilder sb = new StringBuilder(i + 2);
        sb.append("(?");
        for (int i2 = 0; i2 < i - 1; i2++) {
            sb.append(",?");
        }
        sb.append(')');
        return sb.toString();
    }

    public final <R> R postTransactionCleanup(Transacter.Transaction transaction, Transacter.Transaction transaction2, Throwable th, R r) throws Throwable {
        transaction.getClass();
        boolean z = false;
        if (transaction2 != null) {
            if (transaction.getSuccessful$runtime() && transaction.getChildrenSuccessful$runtime()) {
                z = true;
            }
            transaction2.setChildrenSuccessful$runtime(z);
            transaction2.getPostCommitHooks$runtime().addAll(transaction.getPostCommitHooks$runtime());
            transaction2.getPostRollbackHooks$runtime().addAll(transaction.getPostRollbackHooks$runtime());
            transaction2.getRegisteredQueries$runtime().addAll(transaction.getRegisteredQueries$runtime());
            transaction2.getPendingTables$runtime().addAll(transaction.getPendingTables$runtime());
        } else if (transaction.getSuccessful$runtime() && transaction.getChildrenSuccessful$runtime()) {
            if (!transaction.getPendingTables$runtime().isEmpty()) {
                SqlDriver sqlDriver = this.driver;
                String[] strArr = (String[]) transaction.getPendingTables$runtime().toArray(new String[0]);
                sqlDriver.notifyListeners((String[]) Arrays.copyOf(strArr, strArr.length));
            }
            transaction.getPendingTables$runtime().clear();
            transaction.getRegisteredQueries$runtime().clear();
            Iterator<T> it = transaction.getPostCommitHooks$runtime().iterator();
            while (it.hasNext()) {
                ((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) it.next()).invoke();
            }
            transaction.getPostCommitHooks$runtime().clear();
        } else {
            try {
                Iterator<T> it2 = transaction.getPostRollbackHooks$runtime().iterator();
                while (it2.hasNext()) {
                    ((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) it2.next()).invoke();
                }
                transaction.getPostRollbackHooks$runtime().clear();
            } catch (Throwable th2) {
                if (th == null) {
                    throw th2;
                }
                StringBuilder sb = new StringBuilder("Exception while rolling back from an exception.\nOriginal exception: ");
                sb.append(th);
                Throwable cause = th.getCause();
                sb.append("\nwith cause ");
                sb.append(cause);
                sb.append("\n\nRollback exception: ");
                sb.append(th2);
                throw new Throwable(sb.toString(), th2);
            }
        }
        if (transaction2 == null && (th instanceof RollbackException)) {
            return (R) ((RollbackException) th).getValue();
        }
        if (th == null) {
            return r;
        }
        throw th;
    }
}

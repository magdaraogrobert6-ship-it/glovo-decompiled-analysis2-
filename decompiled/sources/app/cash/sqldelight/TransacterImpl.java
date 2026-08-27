package app.cash.sqldelight;

import app.cash.sqldelight.db.SqlDriver;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public abstract class TransacterImpl extends BaseTransacterImpl implements Transacter {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransacterImpl(SqlDriver sqlDriver) {
        super(sqlDriver);
        sqlDriver.getClass();
    }

    @Override // app.cash.sqldelight.Transacter
    public void transaction(boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        transactionWithWrapper(z, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }

    @Override // app.cash.sqldelight.Transacter
    public <R> R transactionWithResult(boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        return (R) transactionWithWrapper(z, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <R> R transactionWithWrapper(boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        Throwable th;
        Transacter.Transaction value = getDriver().newTransaction().getValue();
        Transacter.Transaction transactionEnclosingTransaction$runtime = value.enclosingTransaction$runtime();
        Object obj = null;
        if (transactionEnclosingTransaction$runtime != null && z) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Already in a transaction");
            return null;
        }
        try {
            value.setTransacter$runtime(this);
            Object objInvoke = r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new TransactionWrapper(value));
            try {
                value.setSuccessful$runtime(true);
                value.endTransaction$runtime();
                return (R) postTransactionCleanup(value, transactionEnclosingTransaction$runtime, null, objInvoke);
            } catch (Throwable th2) {
                th = th2;
                obj = objInvoke;
                value.endTransaction$runtime();
                return (R) postTransactionCleanup(value, transactionEnclosingTransaction$runtime, th, obj);
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}

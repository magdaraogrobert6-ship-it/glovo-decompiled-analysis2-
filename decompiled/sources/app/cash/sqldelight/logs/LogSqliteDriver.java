package app.cash.sqldelight.logs;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.Transacter;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import o.createFromParcel;
import o.onContentCardClicked;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes4.dex */
public final class LogSqliteDriver implements SqlDriver {
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM logger;
    private final SqlDriver sqlDriver;

    @Override // app.cash.sqldelight.db.SqlDriver
    public Transacter.Transaction currentTransaction() {
        return this.sqlDriver.currentTransaction();
    }

    public LogSqliteDriver(SqlDriver sqlDriver, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        sqlDriver.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        this.sqlDriver = sqlDriver;
        this.logger = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // app.cash.sqldelight.db.SqlDriver
    public void addListener(String[] strArr, Query.Listener listener) {
        strArr.getClass();
        listener.getClass();
        this.logger.invoke("BEGIN " + listener + " LISTENING TO [" + onContentCardClicked.serializer(strArr, null, null, null, 63) + ']');
        this.sqlDriver.addListener((String[]) Arrays.copyOf(strArr, strArr.length), listener);
    }

    @Override // app.cash.sqldelight.db.SqlDriver
    public QueryResult<Long> execute(Integer num, String str, int i, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        str.getClass();
        this.logger.invoke("EXECUTE\n ".concat(str));
        logParameters(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        return this.sqlDriver.execute(num, str, i, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }

    @Override // app.cash.sqldelight.db.SqlDriver
    public <R> QueryResult<R> executeQuery(Integer num, String str, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2) {
        str.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        this.logger.invoke("QUERY\n ".concat(str));
        logParameters(r8lambdaunavo3sxub_pc9xroryotnrlvsm2);
        return this.sqlDriver.executeQuery(num, str, r8lambdaunavo3sxub_pc9xroryotnrlvsm, i, r8lambdaunavo3sxub_pc9xroryotnrlvsm2);
    }

    @Override // app.cash.sqldelight.db.SqlDriver
    public void notifyListeners(String... strArr) {
        strArr.getClass();
        this.logger.invoke("NOTIFYING LISTENERS OF [" + onContentCardClicked.serializer(strArr, null, null, null, 63) + ']');
        this.sqlDriver.notifyListeners((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // app.cash.sqldelight.db.SqlDriver
    public void removeListener(String[] strArr, Query.Listener listener) {
        strArr.getClass();
        listener.getClass();
        this.logger.invoke("END " + listener + " LISTENING TO [" + onContentCardClicked.serializer(strArr, null, null, null, 63) + ']');
        this.sqlDriver.removeListener((String[]) Arrays.copyOf(strArr, strArr.length), listener);
    }

    private final void logParameters(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
            StatementParameterInterceptor statementParameterInterceptor = new StatementParameterInterceptor();
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(statementParameterInterceptor);
            List<Object> andClearParameters = statementParameterInterceptor.getAndClearParameters();
            if (andClearParameters.isEmpty()) {
                return;
            }
            this.logger.invoke(" " + andClearParameters);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.logger.invoke("CLOSE CONNECTION");
        this.sqlDriver.close();
    }

    @Override // app.cash.sqldelight.db.SqlDriver
    public QueryResult<Transacter.Transaction> newTransaction() {
        this.logger.invoke("TRANSACTION BEGIN");
        Transacter.Transaction value = this.sqlDriver.newTransaction().getValue();
        value.afterCommit(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: app.cash.sqldelight.logs.LogSqliteDriver.newTransaction.1
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3976invoke() {
                LogSqliteDriver.this.logger.invoke("TRANSACTION COMMIT");
            }

            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public /* bridge */ /* synthetic */ Object invoke() {
                m3976invoke();
                return createFromParcel.INSTANCE;
            }
        });
        value.afterRollback(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: app.cash.sqldelight.logs.LogSqliteDriver.newTransaction.2
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3977invoke() {
                LogSqliteDriver.this.logger.invoke("TRANSACTION ROLLBACK");
            }

            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public /* bridge */ /* synthetic */ Object invoke() {
                m3977invoke();
                return createFromParcel.INSTANCE;
            }
        });
        return QueryResult.Value.m3965boximpl(QueryResult.Value.m3966constructorimpl(value));
    }
}

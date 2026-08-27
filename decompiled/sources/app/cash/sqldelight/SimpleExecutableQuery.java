package app.cash.sqldelight;

import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes4.dex */
final class SimpleExecutableQuery<RowType> extends ExecutableQuery<RowType> {
    private final SqlDriver driver;
    private final String fileName;
    private final int identifier;
    private final String label;
    private final String query;

    public String toString() {
        return this.fileName + ':' + this.label;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleExecutableQuery(int i, SqlDriver sqlDriver, String str, String str2, String str3, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        super(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        sqlDriver.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        this.identifier = i;
        this.driver = sqlDriver;
        this.fileName = str;
        this.label = str2;
        this.query = str3;
    }

    @Override // app.cash.sqldelight.ExecutableQuery
    public <R> QueryResult<R> execute(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        SqlDriver sqlDriver = this.driver;
        int i = this.identifier;
        return sqlDriver.executeQuery(Integer.valueOf(i), this.query, r8lambdaunavo3sxub_pc9xroryotnrlvsm, 0, null);
    }
}

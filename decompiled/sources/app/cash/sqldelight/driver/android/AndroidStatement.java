package app.cash.sqldelight.driver.android;

import app.cash.sqldelight.db.SqlPreparedStatement;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public interface AndroidStatement extends SqlPreparedStatement {
    void close();

    long execute();

    <R> R executeQuery(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm);
}

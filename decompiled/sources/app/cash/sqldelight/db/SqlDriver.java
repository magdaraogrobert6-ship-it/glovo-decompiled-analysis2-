package app.cash.sqldelight.db;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.Transacter;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import java.io.Closeable;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public interface SqlDriver extends Closeable {
    void addListener(String[] strArr, Query.Listener listener);

    Transacter.Transaction currentTransaction();

    QueryResult<Long> execute(Integer num, String str, int i, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm);

    <R> QueryResult<R> executeQuery(Integer num, String str, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2);

    QueryResult<Transacter.Transaction> newTransaction();

    void notifyListeners(String... strArr);

    void removeListener(String[] strArr, Query.Listener listener);

    /* JADX INFO: loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ QueryResult execute$default(SqlDriver sqlDriver, Integer num, String str, int i, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 8) != 0) {
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm = null;
                }
                return sqlDriver.execute(num, str, i, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
            }
            IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: execute");
            return null;
        }

        public static /* synthetic */ QueryResult executeQuery$default(SqlDriver sqlDriver, Integer num, String str, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, int i2, Object obj) {
            if (obj == null) {
                return sqlDriver.executeQuery(num, str, r8lambdaunavo3sxub_pc9xroryotnrlvsm, i, (i2 & 16) != 0 ? null : r8lambdaunavo3sxub_pc9xroryotnrlvsm2);
            }
            IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: executeQuery");
            return null;
        }
    }
}

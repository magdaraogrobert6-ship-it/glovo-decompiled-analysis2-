package app.cash.sqldelight;

import app.cash.sqldelight.db.SqlDriver;
import com.huawei.hms.android.SystemUtils;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes4.dex */
public final class QueryKt {
    public static final <RowType> Query<RowType> Query(int i, String[] strArr, SqlDriver sqlDriver, String str, String str2, String str3, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        strArr.getClass();
        sqlDriver.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        return new SimpleQuery(i, strArr, sqlDriver, str, str2, str3, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }

    public static final <RowType> Query<RowType> Query(int i, String[] strArr, SqlDriver sqlDriver, String str, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        strArr.getClass();
        sqlDriver.getClass();
        str.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        return Query(i, strArr, sqlDriver, SystemUtils.UNKNOWN, SystemUtils.UNKNOWN, str, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }

    public static final <RowType> ExecutableQuery<RowType> Query(int i, SqlDriver sqlDriver, String str, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        sqlDriver.getClass();
        str.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        return Query(i, sqlDriver, SystemUtils.UNKNOWN, SystemUtils.UNKNOWN, str, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }

    public static final <RowType> ExecutableQuery<RowType> Query(int i, SqlDriver sqlDriver, String str, String str2, String str3, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        sqlDriver.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        return new SimpleExecutableQuery(i, sqlDriver, str, str2, str3, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }
}

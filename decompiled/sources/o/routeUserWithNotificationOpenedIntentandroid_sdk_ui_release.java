package o;

import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import com.sentiance.sdk.util.database.WhereClause;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class routeUserWithNotificationOpenedIntentandroid_sdk_ui_release implements r8lambdaUImhpfnOsq1UcjCBCD7BCDEtbLk {
    public final /* synthetic */ int serializer;

    public /* synthetic */ routeUserWithNotificationOpenedIntentandroid_sdk_ui_release(int i) {
        this.serializer = i;
    }

    @Override // o.r8lambdaUImhpfnOsq1UcjCBCD7BCDEtbLk
    public final Object serializer(SQLiteDatabase sQLiteDatabase) {
        if (this.serializer == 0) {
            int i = wakeScreenIfAppropriatelambda3.read;
            return Long.valueOf(DatabaseUtils.queryNumEntries(sQLiteDatabase, "payloads"));
        }
        int i2 = r8lambda43c3j9_07_y35Qq6GrmdmAdkBhI.RemoteActionCompatParcelizer;
        WhereClause whereClauseWrite = WhereClause.serializer("is_requested").write(1);
        return Integer.valueOf((int) DatabaseUtils.queryNumEntries(sQLiteDatabase, "data_sync_payloads", whereClauseWrite.IconCompatParcelizer(), whereClauseWrite.RemoteActionCompatParcelizer()));
    }
}

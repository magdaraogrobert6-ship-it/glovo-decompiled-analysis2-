package o;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.huawei.hms.push.constant.RemoteMessageConst;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class accessgetMediaClosecp implements accessgetMediaEjectcp {
    public final /* synthetic */ accessgetEightcp IconCompatParcelizer;
    public final /* synthetic */ long serializer;

    public /* synthetic */ accessgetMediaClosecp(long j, accessgetEightcp accessgeteightcp) {
        this.serializer = j;
        this.IconCompatParcelizer = accessgeteightcp;
    }

    @Override // o.accessgetMediaEjectcp
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.serializer));
        accessgetEightcp accessgeteightcp = this.IconCompatParcelizer;
        String str = accessgeteightcp.serializer;
        accessgetBrowsercp accessgetbrowsercp = accessgeteightcp.IconCompatParcelizer;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(accessgetMediaPlayPausecp.serializer(accessgetbrowsercp))}) < 1) {
            contentValues.put("backend_name", str);
            contentValues.put(RemoteMessageConst.Notification.PRIORITY, Integer.valueOf(accessgetMediaPlayPausecp.serializer(accessgetbrowsercp)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }
}

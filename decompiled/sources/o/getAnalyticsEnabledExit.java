package o;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.sentiance.sdk.util.database.WhereClause;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getAnalyticsEnabledExit implements r8lambdaUImhpfnOsq1UcjCBCD7BCDEtbLk {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object serializer;

    public /* synthetic */ getAnalyticsEnabledExit(int i, Object obj) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = obj;
    }

    @Override // o.r8lambdaUImhpfnOsq1UcjCBCD7BCDEtbLk
    public final Object serializer(SQLiteDatabase sQLiteDatabase) {
        wakeScreenIfAppropriatelambda3.serializer serializerVar;
        int i = this.RemoteActionCompatParcelizer;
        Object obj = this.serializer;
        if (i == 0) {
            int i2 = getCooldownEnterSeconds.RemoteActionCompatParcelizer;
            return Long.valueOf(sQLiteDatabase.insertOrThrow("event_metadata", "", (ContentValues) obj));
        }
        WhereClause whereClause = (WhereClause) obj;
        int i3 = wakeScreenIfAppropriatelambda3.read;
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = sQLiteDatabase.query("payloads", new String[]{"ROWID", "*"}, whereClause.IconCompatParcelizer(), whereClause.RemoteActionCompatParcelizer(), null, null, "rowid asc");
        while (cursorQuery.moveToNext()) {
            try {
                serializerVar = new wakeScreenIfAppropriatelambda3.serializer(cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("rowid")), cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("id")), cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("type")), cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("retry_count")), cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("true_as_of_secs")), cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("payload_id")), cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("ingestion_time")), cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("event_ingestion_time")), cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("thrift_schema_version")), null);
            } catch (IllegalArgumentException unused) {
                serializerVar = null;
            }
            if (serializerVar != null) {
                arrayList.add(serializerVar);
            }
        }
        cursorQuery.close();
        return arrayList;
    }
}

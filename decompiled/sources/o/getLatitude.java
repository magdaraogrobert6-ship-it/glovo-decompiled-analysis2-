package o;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.sentiance.sdk.util.database.WhereClause;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getLatitude implements migrateBlocklistedListslambda1 {
    public final /* synthetic */ long RemoteActionCompatParcelizer;
    public final /* synthetic */ int write;

    public /* synthetic */ getLatitude(long j, int i) {
        this.write = i;
        this.RemoteActionCompatParcelizer = j;
    }

    @Override // o.migrateBlocklistedListslambda1
    public final void serializer(SQLiteDatabase sQLiteDatabase) {
        int i = this.write;
        long j = this.RemoteActionCompatParcelizer;
        int i2 = getCooldownEnterSeconds.RemoteActionCompatParcelizer;
        if (i != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("is_valid", (Integer) 0);
            WhereClause whereClauseWrite = WhereClause.serializer("id").write(Long.valueOf(j));
            sQLiteDatabase.update("event_metadata", contentValues, whereClauseWrite.IconCompatParcelizer(), whereClauseWrite.RemoteActionCompatParcelizer());
            return;
        }
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("is_submitted", (Integer) 1);
        WhereClause whereClause = WhereClause.serializer("ingestion_time").read(Long.valueOf(j));
        sQLiteDatabase.update("event_metadata", contentValues2, whereClause.IconCompatParcelizer(), whereClause.RemoteActionCompatParcelizer());
    }
}

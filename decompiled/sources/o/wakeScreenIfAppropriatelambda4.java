package o;

import android.database.sqlite.SQLiteDatabase;
import com.sentiance.sdk.eventtimeline.timelines.stores.tables.Tables;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wakeScreenIfAppropriatelambda4 implements migrateBlocklistedListslambda1 {
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public /* synthetic */ wakeScreenIfAppropriatelambda4(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // o.migrateBlocklistedListslambda1
    public final void serializer(SQLiteDatabase sQLiteDatabase) {
        int i = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            int i2 = wakeScreenIfAppropriatelambda3.read;
            sQLiteDatabase.delete("payloads", null, null);
            return;
        }
        if (i != 1) {
            int i3 = r8lambda43c3j9_07_y35Qq6GrmdmAdkBhI.RemoteActionCompatParcelizer;
            sQLiteDatabase.delete("data_sync_payloads", null, null);
            return;
        }
        int i4 = setHeaderTextColor.write;
        for (Tables tables : Tables.values()) {
            sQLiteDatabase.delete(tables.getTable().MediaDescriptionCompat(), null, null);
        }
    }
}

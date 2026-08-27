package o;

import android.database.sqlite.SQLiteDatabase;
import com.sentiance.sdk.util.database.WhereClause;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wakeScreenIfAppropriatelambda2 implements migrateBlocklistedListslambda1 {
    public final /* synthetic */ String read;
    public final /* synthetic */ int serializer;

    public /* synthetic */ wakeScreenIfAppropriatelambda2(String str, int i) {
        this.serializer = i;
        this.read = str;
    }

    @Override // o.migrateBlocklistedListslambda1
    public final void serializer(SQLiteDatabase sQLiteDatabase) {
        int i = this.serializer;
        String str = this.read;
        if (i == 0) {
            int i2 = wakeScreenIfAppropriatelambda3.read;
            WhereClause whereClauseWrite = WhereClause.serializer("id").write(str);
            sQLiteDatabase.delete("payloads", whereClauseWrite.IconCompatParcelizer(), whereClauseWrite.RemoteActionCompatParcelizer());
        } else {
            int i3 = r8lambda43c3j9_07_y35Qq6GrmdmAdkBhI.RemoteActionCompatParcelizer;
            str.getClass();
            WhereClause whereClauseWrite2 = WhereClause.serializer("uuid").write(str);
            sQLiteDatabase.delete("data_sync_payloads", whereClauseWrite2.IconCompatParcelizer(), whereClauseWrite2.RemoteActionCompatParcelizer());
        }
    }
}

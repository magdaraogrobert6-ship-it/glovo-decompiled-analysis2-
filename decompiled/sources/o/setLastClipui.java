package o;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.google.firebase.firestore.proto.Target;
import com.google.re2j.Parser;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class setLastClipui implements onPostAttach {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Parser.Pair write;

    public /* synthetic */ setLastClipui(Parser.Pair pair, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.write = pair;
    }

    @Override // o.onPostAttach
    public final void IconCompatParcelizer(Object obj) {
        int i = this.RemoteActionCompatParcelizer;
        Parser.Pair pair = this.write;
        Cursor cursor = (Cursor) obj;
        if (i == 0) {
            int i2 = cursor.getInt(0);
            try {
                isFrameRateFromParent isframeratefromparent = (isFrameRateFromParent) Target.parseFrom(cursor.getBlob(1)).toBuilder();
                isframeratefromparent.RemoteActionCompatParcelizer();
                ((Target) isframeratefromparent.RemoteActionCompatParcelizer).clearLastLimboFreeSnapshotVersion();
                ((SQLiteDatabase) pair.RemoteActionCompatParcelizer).execSQL("UPDATE targets SET target_proto = ? WHERE target_id = ?", new Object[]{((Target) isframeratefromparent.serializer()).toByteArray(), Integer.valueOf(i2)});
                return;
            } catch (com.google.protobuf.InvalidProtocolBufferException unused) {
                getRectManager.write("Failed to decode Query data for target %s", Integer.valueOf(i2));
                throw null;
            }
        }
        String string = cursor.getString(0);
        long j = cursor.getLong(1);
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) pair.RemoteActionCompatParcelizer;
        Cursor cursorRawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(new takeOrElseDxMtmZc(1, new Object[]{string, Long.valueOf(j)}), "SELECT batch_id FROM mutations WHERE uid = ? AND batch_id <= ?", null, null);
        while (cursorRawQueryWithFactory.moveToNext()) {
            try {
                int i3 = cursorRawQueryWithFactory.getInt(0);
                SQLiteStatement sQLiteStatementCompileStatement = sQLiteDatabase.compileStatement("DELETE FROM mutations WHERE uid = ? AND batch_id = ?");
                sQLiteStatementCompileStatement.bindString(1, string);
                sQLiteStatementCompileStatement.bindLong(2, i3);
                getRectManager.RemoteActionCompatParcelizer(sQLiteStatementCompileStatement.executeUpdateDelete() != 0, "Mutation batch (%s, %d) did not exist", string, Integer.valueOf(i3));
                sQLiteDatabase.execSQL("DELETE FROM document_mutations WHERE uid = ? AND batch_id = ?", new Object[]{string, Integer.valueOf(i3)});
            } catch (Throwable th) {
                if (cursorRawQueryWithFactory != null) {
                    try {
                        cursorRawQueryWithFactory.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        cursorRawQueryWithFactory.close();
    }
}

package o;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class takeOrElseDxMtmZc implements SQLiteDatabase.CursorFactory {
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int write;

    public /* synthetic */ takeOrElseDxMtmZc(int i, Object obj) {
        this.write = i;
        this.RemoteActionCompatParcelizer = obj;
    }

    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        int i = this.write;
        Object obj = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            headH91voCI.write(sQLiteQuery, (Object[]) obj);
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
        sQLiteQuery.getClass();
        ((compositeOverOWjLjI) obj).bindTo(new constructorimpldefault(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }
}

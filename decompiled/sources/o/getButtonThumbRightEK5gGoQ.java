package o;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import bo.app.ff$$ExternalSyntheticOutline0;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class getButtonThumbRightEK5gGoQ extends SQLiteOpenHelper {
    public final /* synthetic */ getButtonStartEK5gGoQ RemoteActionCompatParcelizer;
    public boolean read;
    public long write;

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        SQLiteDatabase writableDatabase;
        getButtonStartEK5gGoQ getbuttonstartek5ggoq = this.RemoteActionCompatParcelizer;
        accessgetTvInputComposite1cp accessgettvinputcomposite1cp = getbuttonstartek5ggoq.MediaBrowserCompatMediaItem;
        if (this.read) {
            long j = this.write;
            accessgettvinputcomposite1cp.getClass();
            if (j + 3600000 > System.currentTimeMillis()) {
                throw new SQLiteException("Database creation failed");
            }
        }
        this.read = true;
        accessgettvinputcomposite1cp.getClass();
        this.write = System.currentTimeMillis();
        try {
            writableDatabase = super.getWritableDatabase();
        } catch (SQLiteException unused) {
            getbuttonstartek5ggoq.serializer.getDatabasePath(getbuttonstartek5ggoq.IconCompatParcelizer).delete();
            writableDatabase = null;
        }
        if (writableDatabase == null) {
            writableDatabase = super.getWritableDatabase();
        }
        this.read = false;
        return writableDatabase;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (write("gtm_hit_unique_ids", sQLiteDatabase)) {
            serializer(sQLiteDatabase, "gtm_hit_unique_ids", Arrays.asList("hit_unique_id"));
        } else {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS gtm_hit_unique_ids ('hit_unique_id' TEXT UNIQUE);");
        }
        if (write("gtm_hits", sQLiteDatabase)) {
            serializer(sQLiteDatabase, "gtm_hits", Arrays.asList("hit_id", "hit_url", "hit_time", "hit_first_send_time", "hit_method", "hit_unique_id", "hit_headers", "hit_body"));
        } else {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS gtm_hits ( 'hit_id' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, 'hit_time' INTEGER NOT NULL, 'hit_url' TEXT NOT NULL, 'hit_first_send_time' INTEGER NOT NULL, 'hit_method' TEXT NOT NULL, 'hit_unique_id' TEXT UNIQUE, 'hit_headers' TEXT, 'hit_body' TEXT);");
        }
        sQLiteDatabase.execSQL("CREATE TRIGGER IF NOT EXISTS save_unique_on_delete DELETE ON gtm_hits FOR EACH ROW WHEN OLD.hit_unique_id NOTNULL BEGIN     INSERT OR IGNORE INTO gtm_hit_unique_ids (hit_unique_id) VALUES (OLD.hit_unique_id); END;");
        sQLiteDatabase.execSQL("CREATE TRIGGER IF NOT EXISTS check_unique_on_insert BEFORE INSERT ON gtm_hits FOR EACH ROW WHEN NEW.hit_unique_id NOT NULL BEGIN     SELECT RAISE(ABORT, 'Duplicate unique ID.')     WHERE EXISTS (SELECT 1 FROM gtm_hit_unique_ids WHERE hit_unique_id = NEW.hit_unique_id); END;");
    }

    public static final void serializer(SQLiteDatabase sQLiteDatabase, String str, List list) {
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " WHERE 0", null);
        HashSet hashSet = new HashSet();
        try {
            for (String str2 : cursorRawQuery.getColumnNames()) {
                hashSet.add(str2);
            }
            cursorRawQuery.close();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (!hashSet.remove(str3)) {
                    throw new SQLiteException(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Database column ", str3, " missing in table ", str, "."));
                }
            }
            if (!hashSet.isEmpty()) {
                throw new SQLiteException(ff$$ExternalSyntheticOutline0.m("Database has extra columns in table ", str, "."));
            }
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        String path = sQLiteDatabase.getPath();
        try {
            if (Integer.parseInt(Build.VERSION.SDK) < 9) {
                return;
            }
            File file = new File(path);
            file.setReadable(false, false);
            file.setWritable(false, false);
            file.setReadable(true, true);
            file.setWritable(true, true);
        } catch (NumberFormatException unused) {
            getButtonThumbLeftEK5gGoQ.write("Invalid version number: ".concat(String.valueOf(Build.VERSION.SDK)));
        }
    }

    public static final boolean write(String str, SQLiteDatabase sQLiteDatabase) {
        boolean zMoveToFirst = false;
        Cursor cursorQuery = null;
        try {
            cursorQuery = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
            zMoveToFirst = cursorQuery.moveToFirst();
        } catch (SQLiteException unused) {
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return zMoveToFirst;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getButtonThumbRightEK5gGoQ(getButtonStartEK5gGoQ getbuttonstartek5ggoq, Context context) {
        super(context, "gtm_urls.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.RemoteActionCompatParcelizer = getbuttonstartek5ggoq;
        this.write = 0L;
    }
}

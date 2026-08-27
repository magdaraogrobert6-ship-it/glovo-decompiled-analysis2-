package o;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.sentiance.sdk.util.database.WhereClause;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE;

/* JADX INFO: loaded from: classes3.dex */
public abstract class isPushPrimer<T extends r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE> extends r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs<T> {

    public static class write<T extends write<T>> extends WhereClause {
    }

    public abstract List<String> MediaBrowserCompatMediaItem();

    public abstract List<String> MediaMetadataCompat();

    public abstract Byte MediaSessionCompatQueueItem();

    public abstract List<String> RatingCompat();

    public abstract void serializer(SQLiteDatabase sQLiteDatabase, int i) throws SQLException, IllegalArgumentException;

    public static long RemoteActionCompatParcelizer(Cursor cursor, String str) throws IllegalArgumentException {
        if (cursor.isNull(cursor.getColumnIndexOrThrow(str.concat("creation_time")))) {
            return 0L;
        }
        return IconCompatParcelizer.IconCompatParcelizer(str, "creation_time", cursor);
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final List<String> IconCompatParcelizer() {
        ArrayList arrayList = new ArrayList(MediaMetadataCompat());
        arrayList.add("id integer primary key autoincrement not null");
        arrayList.add("unique_id text not null unique");
        arrayList.add("event_time integer not null");
        arrayList.add("time_horizon integer not null");
        arrayList.add("creation_time integer not null");
        arrayList.add("update_time integer not null");
        return arrayList;
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final List<String> serializer() {
        ArrayList arrayList = new ArrayList(RatingCompat());
        arrayList.addAll(Collections.singletonList(read()));
        return arrayList;
    }

    public static long read(Cursor cursor, String str) throws IllegalArgumentException {
        if (cursor.isNull(cursor.getColumnIndexOrThrow(str.concat("update_time")))) {
            return 0L;
        }
        return IconCompatParcelizer.IconCompatParcelizer(str, "update_time", cursor);
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final List<String> write() {
        MediaBrowserCompatMediaItem();
        return Collections.EMPTY_LIST;
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final void write(SQLiteDatabase sQLiteDatabase, int i) throws SQLException, IllegalArgumentException {
        if (i == 4) {
            sQLiteDatabase.execSQL("ALTER TABLE " + MediaDescriptionCompat() + " ADD COLUMN time_horizon integer not null default 0");
        }
        if (i == 12) {
            sQLiteDatabase.execSQL("ALTER TABLE " + MediaDescriptionCompat() + " ADD COLUMN creation_time integer");
            sQLiteDatabase.execSQL("ALTER TABLE " + MediaDescriptionCompat() + " ADD COLUMN update_time integer");
            sQLiteDatabase.execSQL("UPDATE " + MediaDescriptionCompat() + " SET creation_time = event_time");
            sQLiteDatabase.execSQL("UPDATE " + MediaDescriptionCompat() + " SET update_time = event_time");
            sQLiteDatabase.execSQL(read());
        }
        serializer(sQLiteDatabase, i);
    }

    private String read() {
        return "CREATE INDEX " + MediaDescriptionCompat() + "_index_update_time ON " + MediaDescriptionCompat() + "(update_time);";
    }
}

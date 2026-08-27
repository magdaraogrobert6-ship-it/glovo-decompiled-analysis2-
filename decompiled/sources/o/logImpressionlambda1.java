package o;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class logImpressionlambda1 extends isPushPrimer<r8lambda65DqD4z8gFhR5ZTM_6mU_Ajg8B4> {
    private static logImpressionlambda1 serializer;

    @Override // o.isPushPrimer
    public final List<String> MediaBrowserCompatMediaItem() {
        return Collections.EMPTY_LIST;
    }

    @Override // o.isPushPrimer
    public final List<String> RatingCompat() {
        return Collections.EMPTY_LIST;
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final String MediaDescriptionCompat() {
        return "call";
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final Class<r8lambda65DqD4z8gFhR5ZTM_6mU_Ajg8B4> RemoteActionCompatParcelizer() {
        return r8lambda65DqD4z8gFhR5ZTM_6mU_Ajg8B4.class;
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0 RemoteActionCompatParcelizer(Cursor cursor) throws IllegalArgumentException {
        String str = r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs.read("");
        return new r8lambda65DqD4z8gFhR5ZTM_6mU_Ajg8B4(IconCompatParcelizer.IconCompatParcelizer(str, "id", cursor), MediaSessionCompatQueueItem.read(str, "unique_id", cursor), cursor.getInt(cursor.getColumnIndexOrThrow(str.concat("type"))), IconCompatParcelizer.IconCompatParcelizer(str, "event_time", cursor), IconCompatParcelizer.IconCompatParcelizer(str, "time_horizon", cursor), !cursor.isNull(cursor.getColumnIndexOrThrow(str.concat("last_active"))) ? Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(str.concat("last_active")))) : null, cursor.isNull(cursor.getColumnIndexOrThrow(str.concat("end_time"))) ? null : Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(str.concat("end_time")))), isPushPrimer.RemoteActionCompatParcelizer(cursor, str), isPushPrimer.read(cursor, str));
    }

    @Override // o.isPushPrimer
    public final Byte MediaSessionCompatQueueItem() {
        return (byte) 2;
    }

    public static logImpressionlambda1 read() {
        if (serializer == null) {
            serializer = new logImpressionlambda1();
        }
        return serializer;
    }

    @Override // o.isPushPrimer
    public final void serializer(SQLiteDatabase sQLiteDatabase, int i) throws SQLException {
        if (i == 11) {
            sQLiteDatabase.execSQL("DROP TABLE call");
            sQLiteDatabase.execSQL("CREATE TABLE call (id integer primary key autoincrement not null, unique_id text not null unique, event_time integer not null, time_horizon integer not null, type integer not null, last_active integer, end_time integer)");
        }
    }

    @Override // o.isPushPrimer
    public final List<String> MediaMetadataCompat() {
        return Arrays.asList("type integer not null", "last_active integer", "end_time integer");
    }
}

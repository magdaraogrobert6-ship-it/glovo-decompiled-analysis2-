package o;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.sentiance.sdk.eventtimeline.timelines.creators.HarshDrivingEntryType;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class setBrazeManager extends isPushPrimer<r8lambdaLPyJWl1WpW_cGrgMy_9R4FP1b0> {
    private static setBrazeManager serializer;

    @Override // o.isPushPrimer
    public final List<String> MediaBrowserCompatMediaItem() {
        return Collections.EMPTY_LIST;
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final String MediaDescriptionCompat() {
        return "harsh_driving_events";
    }

    @Override // o.isPushPrimer
    public final List<String> RatingCompat() {
        return Collections.singletonList("CREATE INDEX index_event_time_is_harsh on harsh_driving_events(event_time, is_harsh_event)");
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final Class<r8lambdaLPyJWl1WpW_cGrgMy_9R4FP1b0> RemoteActionCompatParcelizer() {
        return r8lambdaLPyJWl1WpW_cGrgMy_9R4FP1b0.class;
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0 RemoteActionCompatParcelizer(Cursor cursor) throws IllegalArgumentException {
        String str = r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs.read("");
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow(str.concat("type"));
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow(str.concat("confidence"));
        int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow(str.concat("type_motorcycle"));
        int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow(str.concat("confidence_motorcycle"));
        int columnIndexOrThrow5 = cursor.getColumnIndexOrThrow(str.concat("magnitude"));
        int columnIndexOrThrow6 = cursor.getColumnIndexOrThrow(str.concat("start_time"));
        int columnIndexOrThrow7 = cursor.getColumnIndexOrThrow(str.concat("end_time"));
        return new r8lambdaLPyJWl1WpW_cGrgMy_9R4FP1b0(IconCompatParcelizer.IconCompatParcelizer(str, "id", cursor), MediaSessionCompatQueueItem.read(str, "unique_id", cursor), IconCompatParcelizer.IconCompatParcelizer(str, "event_time", cursor), IconCompatParcelizer.IconCompatParcelizer(str, "time_horizon", cursor), cursor.getInt(cursor.getColumnIndexOrThrow(str.concat("is_harsh_event"))) == 1, cursor.isNull(columnIndexOrThrow) ? null : HarshDrivingEntryType.of(cursor.getInt(columnIndexOrThrow)), cursor.isNull(columnIndexOrThrow2) ? null : Integer.valueOf(cursor.getInt(columnIndexOrThrow2)), HarshDrivingEntryType.of(cursor.getInt(columnIndexOrThrow3)), cursor.isNull(columnIndexOrThrow4) ? null : Integer.valueOf(cursor.getInt(columnIndexOrThrow4)), cursor.isNull(columnIndexOrThrow5) ? null : Double.valueOf(cursor.getDouble(columnIndexOrThrow5)), cursor.isNull(columnIndexOrThrow6) ? null : Long.valueOf(cursor.getLong(columnIndexOrThrow6)), cursor.isNull(columnIndexOrThrow7) ? null : Long.valueOf(cursor.getLong(columnIndexOrThrow7)), isPushPrimer.RemoteActionCompatParcelizer(cursor, str), isPushPrimer.read(cursor, str));
    }

    @Override // o.isPushPrimer
    public final Byte MediaSessionCompatQueueItem() {
        return (byte) 6;
    }

    public static setBrazeManager read() {
        if (serializer == null) {
            serializer = new setBrazeManager();
        }
        return serializer;
    }

    @Override // o.isPushPrimer
    public final void serializer(SQLiteDatabase sQLiteDatabase, int i) throws SQLException {
        if (i == 9) {
            sQLiteDatabase.execSQL(ParcelableVolumeInfo().RemoteActionCompatParcelizer());
            return;
        }
        if (i != 13) {
            return;
        }
        sQLiteDatabase.beginTransaction();
        try {
            sQLiteDatabase.execSQL("ALTER TABLE harsh_driving_events ADD COLUMN type_motorcycle integer");
            sQLiteDatabase.execSQL("ALTER TABLE harsh_driving_events ADD COLUMN confidence_motorcycle integer");
            sQLiteDatabase.execSQL("UPDATE  harsh_driving_events SET type_motorcycle=type");
            sQLiteDatabase.execSQL("UPDATE  harsh_driving_events SET confidence_motorcycle=confidence");
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    @Override // o.isPushPrimer
    public final List<String> MediaMetadataCompat() {
        return Arrays.asList("is_harsh_event boolean not null CHECK (is_harsh_event IN (0,1))", "type integer", "confidence integer", "type_motorcycle integer", "confidence_motorcycle integer", "magnitude real", "start_time integer", "end_time integer");
    }
}

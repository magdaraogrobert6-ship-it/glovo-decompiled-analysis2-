package o;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class InAppMessageControl extends isPushPrimer<r8lambda92cmOJndUFWJcG9v70hQ0grNTsw> {
    private static InAppMessageControl serializer;

    @Override // o.isPushPrimer
    public final List<String> MediaBrowserCompatMediaItem() {
        return Collections.EMPTY_LIST;
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final String MediaDescriptionCompat() {
        return "phone_usage_evaluation_events";
    }

    @Override // o.isPushPrimer
    public final List<String> RatingCompat() {
        return Collections.singletonList("CREATE INDEX index_phone_usage_event_time on phone_usage_evaluation_events(event_time, is_phone_usage_event)");
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final Class<r8lambda92cmOJndUFWJcG9v70hQ0grNTsw> RemoteActionCompatParcelizer() {
        return r8lambda92cmOJndUFWJcG9v70hQ0grNTsw.class;
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0 RemoteActionCompatParcelizer(Cursor cursor) throws IllegalArgumentException {
        String str = r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs.read("");
        return new r8lambda92cmOJndUFWJcG9v70hQ0grNTsw(IconCompatParcelizer.IconCompatParcelizer(str, "id", cursor), MediaSessionCompatQueueItem.read(str, "unique_id", cursor), IconCompatParcelizer.IconCompatParcelizer(str, "event_time", cursor), IconCompatParcelizer.IconCompatParcelizer(str, "time_horizon", cursor), cursor.getInt(cursor.getColumnIndexOrThrow(str.concat("duration_millis"))), cursor.getInt(cursor.getColumnIndexOrThrow(str.concat("is_phone_usage_event"))) == 1, isPushPrimer.RemoteActionCompatParcelizer(cursor, str), isPushPrimer.read(cursor, str));
    }

    @Override // o.isPushPrimer
    public final List<String> MediaMetadataCompat() {
        return Arrays.asList("duration_millis integer not null", "is_phone_usage_event boolean not null CHECK (is_phone_usage_event IN (0,1))");
    }

    @Override // o.isPushPrimer
    public final void serializer(SQLiteDatabase sQLiteDatabase, int i) throws SQLException {
        if (i == 10) {
            sQLiteDatabase.execSQL(ParcelableVolumeInfo().RemoteActionCompatParcelizer());
        }
    }

    @Override // o.isPushPrimer
    public final Byte MediaSessionCompatQueueItem() {
        return (byte) 7;
    }

    public static InAppMessageControl read() {
        if (serializer == null) {
            serializer = new InAppMessageControl();
        }
        return serializer;
    }
}

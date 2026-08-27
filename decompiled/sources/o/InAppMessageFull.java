package o;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.sentiance.sdk.eventtimeline.timelines.creators.TransportChangeType;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class InAppMessageFull extends isPushPrimer<r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ> {
    private static InAppMessageFull write;

    @Override // o.isPushPrimer
    public final List<String> MediaBrowserCompatMediaItem() {
        return Collections.EMPTY_LIST;
    }

    public static r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ write(Cursor cursor, String str) throws IllegalArgumentException {
        String str2 = r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs.read(str);
        return new r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ(IconCompatParcelizer.IconCompatParcelizer(str2, "id", cursor), MediaSessionCompatQueueItem.read(str2, "unique_id", cursor), IconCompatParcelizer.IconCompatParcelizer(str2, "event_time", cursor), IconCompatParcelizer.IconCompatParcelizer(str2, "time_horizon", cursor), TransportChangeType.findByValue(cursor.getInt(cursor.getColumnIndexOrThrow(str2.concat("type")))), MediaSessionCompatQueueItem.read(str2, "event_correlation_id", cursor), isPushPrimer.RemoteActionCompatParcelizer(cursor, str2), isPushPrimer.read(cursor, str2), cursor.getInt(cursor.getColumnIndexOrThrow(str2.concat("is_provisional"))) == 1);
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final Class<r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ> RemoteActionCompatParcelizer() {
        return r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ.class;
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final /* synthetic */ r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0 RemoteActionCompatParcelizer(Cursor cursor) throws IllegalArgumentException {
        return write(cursor, "");
    }

    public static class read extends isPushPrimer.write<read> {
        public final void write(boolean z) {
            if (z) {
                return;
            }
            IconCompatParcelizer("is_provisional").write(0);
        }
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final String MediaDescriptionCompat() {
        return "transport_change";
    }

    @Override // o.isPushPrimer
    public final Byte MediaSessionCompatQueueItem() {
        return (byte) 1;
    }

    public static InAppMessageFull read() {
        if (write == null) {
            write = new InAppMessageFull();
        }
        return write;
    }

    @Override // o.isPushPrimer
    public final List<String> MediaMetadataCompat() {
        return Arrays.asList("type integer not null", "event_correlation_id string", "is_provisional integer not null default 0");
    }

    @Override // o.isPushPrimer
    public final List<String> RatingCompat() {
        return Arrays.asList("CREATE INDEX index_event_time on transport_change(event_time)", "CREATE INDEX index_type_event_time on transport_change(type, event_time)", "CREATE UNIQUE INDEX unique_index_unique_id on transport_change(unique_id)", "CREATE INDEX index_event_is_provisional on transport_change(is_provisional)");
    }

    @Override // o.isPushPrimer
    public final void serializer(SQLiteDatabase sQLiteDatabase, int i) throws SQLException {
        if (i == 17) {
            try {
                Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT * FROM transport_change LIMIT 0", null);
                try {
                    boolean z = cursorRawQuery.getColumnIndex("is_provisional") != -1;
                    cursorRawQuery.close();
                    if (z) {
                        return;
                    }
                } catch (Throwable th) {
                    if (cursorRawQuery != null) {
                        try {
                            cursorRawQuery.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Exception unused) {
            }
            sQLiteDatabase.execSQL("ALTER TABLE transport_change ADD COLUMN is_provisional integer not null default 0");
        }
    }
}

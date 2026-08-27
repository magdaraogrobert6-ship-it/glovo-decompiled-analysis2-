package o;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.sentiance.sdk.util.database.WhereClause;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class getAssetUrls extends isPushPrimer<accessgetClickLoggedp> {
    private static getAssetUrls write;

    @Override // o.isPushPrimer
    public final List<String> MediaBrowserCompatMediaItem() {
        return Collections.EMPTY_LIST;
    }

    @Override // o.isPushPrimer
    public final List<String> RatingCompat() {
        return Collections.EMPTY_LIST;
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final Class<accessgetClickLoggedp> RemoteActionCompatParcelizer() {
        return accessgetClickLoggedp.class;
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0 RemoteActionCompatParcelizer(Cursor cursor) throws IllegalArgumentException {
        String str = r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs.read("");
        return new accessgetClickLoggedp(IconCompatParcelizer.IconCompatParcelizer(str, "id", cursor), MediaSessionCompatQueueItem.read(str, "unique_id", cursor), IconCompatParcelizer.IconCompatParcelizer(str, "event_time", cursor), IconCompatParcelizer.IconCompatParcelizer(str, "time_horizon", cursor), cursor.getShort(cursor.getColumnIndexOrThrow(str.concat("timezone"))), MediaSessionCompatQueueItem.read(str, "timezone_id", cursor), isPushPrimer.RemoteActionCompatParcelizer(cursor, str), isPushPrimer.read(cursor, str));
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final String MediaDescriptionCompat() {
        return "timezone";
    }

    @Override // o.isPushPrimer
    public final void serializer(SQLiteDatabase sQLiteDatabase, int i) throws SQLException, IllegalArgumentException {
        String id;
        if (i == 2) {
            sQLiteDatabase.execSQL("ALTER TABLE timezone ADD COLUMN timezone_id text");
            Cursor cursorQuery = sQLiteDatabase.query("timezone", new String[]{"id", "timezone"}, null, null, null, null, null);
            while (cursorQuery.moveToNext()) {
                long j = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("id"));
                int i2 = (int) cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("timezone"));
                ContentValues contentValues = new ContentValues();
                String[] availableIDs = TimeZone.getAvailableIDs((int) TimeUnit.MINUTES.toMillis(i2));
                if (availableIDs != null && availableIDs.length > 0) {
                    id = availableIDs[0];
                } else {
                    id = TimeZone.getDefault().getID();
                }
                contentValues.put("timezone_id", id);
                WhereClause whereClauseWrite = WhereClause.serializer("id").write(Long.valueOf(j));
                sQLiteDatabase.update("timezone", contentValues, whereClauseWrite.IconCompatParcelizer(), whereClauseWrite.RemoteActionCompatParcelizer());
            }
            cursorQuery.close();
        }
    }

    public static getAssetUrls read() {
        if (write == null) {
            write = new getAssetUrls();
        }
        return write;
    }

    @Override // o.isPushPrimer
    public final List<String> MediaMetadataCompat() {
        return Arrays.asList("timezone integer not null", "timezone_id text not null");
    }

    @Override // o.isPushPrimer
    public final Byte MediaSessionCompatQueueItem() {
        return (byte) 100;
    }
}

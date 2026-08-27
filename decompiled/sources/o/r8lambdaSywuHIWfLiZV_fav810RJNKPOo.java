package o;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.sentiance.sdk.eventtimeline.timelines.stores.entries.VenueSignificance;
import com.sentiance.sdk.eventtimeline.timelines.stores.entries.VenueType;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public class r8lambdaSywuHIWfLiZV_fav810RJNKPOo extends setInAppMessageDarkThemeWrapper<_set_durationInMilliseconds_lambda0> {
    private static r8lambdaSywuHIWfLiZV_fav810RJNKPOo IconCompatParcelizer;

    @Override // o.setInAppMessageDarkThemeWrapper
    public final List<String> MediaSessionCompatQueueItem() {
        return Collections.singletonList("FOREIGN KEY(unique_id) REFERENCES transport_change(unique_id) ON DELETE CASCADE ON UPDATE RESTRICT");
    }

    @Override // o.setInAppMessageDarkThemeWrapper
    public final List<String> RatingCompat() {
        return Collections.singletonList("CREATE UNIQUE INDEX stationary_metadata_unique_id_index on stationary_metadata(unique_id)");
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final /* synthetic */ r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0 RemoteActionCompatParcelizer(Cursor cursor) throws IllegalArgumentException {
        return serializer(cursor, "");
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final String MediaDescriptionCompat() {
        return "stationary_metadata";
    }

    @Override // o.setInAppMessageDarkThemeWrapper
    public final void IconCompatParcelizer(SQLiteDatabase sQLiteDatabase, int i) throws SQLException {
        if (i == 6) {
            sQLiteDatabase.execSQL("ALTER TABLE stationary_metadata ADD COLUMN venue_significance integer;");
            sQLiteDatabase.execSQL("UPDATE stationary_metadata SET venue_significance = venue_type;");
        } else if (i == 8) {
            sQLiteDatabase.execSQL("ALTER TABLE stationary_metadata ADD COLUMN venue_type integer;");
        }
    }

    public static r8lambdaSywuHIWfLiZV_fav810RJNKPOo MediaBrowserCompatMediaItem() {
        if (IconCompatParcelizer == null) {
            IconCompatParcelizer = new r8lambdaSywuHIWfLiZV_fav810RJNKPOo();
        }
        return IconCompatParcelizer;
    }

    public static _set_durationInMilliseconds_lambda0 serializer(Cursor cursor, String str) throws IllegalArgumentException {
        logClick logclick;
        String str2 = r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs.read(str);
        String str3 = MediaSessionCompatQueueItem.read(str2, "unique_id", cursor);
        double d = cursor.getDouble(cursor.getColumnIndexOrThrow(str2.concat("latitude")));
        double d2 = cursor.getDouble(cursor.getColumnIndexOrThrow(str2.concat("longitude")));
        short s = cursor.getShort(cursor.getColumnIndexOrThrow(str2.concat("accuracy")));
        short s2 = cursor.getShort(cursor.getColumnIndexOrThrow(str2.concat(com.braze.models.IBrazeLocation.ALTITUDE)));
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow(str2.concat("wifi_info"));
        if (r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs.write(cursor, columnIndexOrThrow)) {
            try {
                logClick logclick2 = new logClick();
                logclick2.RemoteActionCompatParcelizer(cursor.getString(columnIndexOrThrow));
                logclick = logclick2;
            } catch (JSONException unused) {
                logclick = null;
            }
        } else {
            logclick = null;
        }
        VenueSignificance venueSignificanceFindByValue = VenueSignificance.findByValue(cursor.getInt(cursor.getColumnIndexOrThrow(str2.concat("venue_significance"))));
        if (venueSignificanceFindByValue == null) {
            venueSignificanceFindByValue = VenueSignificance.UNSET;
        }
        VenueSignificance venueSignificance = venueSignificanceFindByValue;
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow(str2.concat("venue_type"));
        return new _set_durationInMilliseconds_lambda0(str3, d, d2, s, s2, logclick, venueSignificance, !r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs.write(cursor, columnIndexOrThrow2) ? null : VenueType.findByValue(cursor.getInt(columnIndexOrThrow2)));
    }

    @Override // o.setInAppMessageDarkThemeWrapper
    public final List<String> read() {
        return Arrays.asList("latitude real not null", "longitude real not null", "accuracy integer not null", "altitude integer not null", "wifi_info text", "venue_significance integer not null", "venue_type integer");
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final Class<_set_durationInMilliseconds_lambda0> RemoteActionCompatParcelizer() {
        return _set_durationInMilliseconds_lambda0.class;
    }
}

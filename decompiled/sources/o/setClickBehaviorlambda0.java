package o;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.sentiance.sdk.ondevicecommon.CrashDetectorModeInternal;
import com.sentiance.sdk.ondevicecommon.CrashSeverityInternal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public class setClickBehaviorlambda0 extends isPushPrimer<r8lambda5plvMMYc7MSPH8a8XIGNiKxWbe0> {
    private static setClickBehaviorlambda0 RemoteActionCompatParcelizer;

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
        return CrashHianalyticsData.EVENT_ID_CRASH;
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final Class<r8lambda5plvMMYc7MSPH8a8XIGNiKxWbe0> RemoteActionCompatParcelizer() {
        return r8lambda5plvMMYc7MSPH8a8XIGNiKxWbe0.class;
    }

    @Override // o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs
    public final r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0 RemoteActionCompatParcelizer(Cursor cursor) throws IllegalArgumentException {
        Short shValueOf;
        r8lambdajVa0HW0zFC0lycNBZuexuYnMifw r8lambdajva0hw0zfc0lycnbzuexuynmifw;
        Integer numValueOf;
        r8lambdajVa0HW0zFC0lycNBZuexuYnMifw r8lambdajva0hw0zfc0lycnbzuexuynmifw2;
        CrashSeverityInternal crashSeverityInternal;
        int i;
        CrashDetectorModeInternal[] crashDetectorModeInternalArrValues;
        int length;
        int i2;
        CrashDetectorModeInternal crashDetectorModeInternal;
        String str = r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs.read("");
        long jIconCompatParcelizer = IconCompatParcelizer.IconCompatParcelizer(str, "id", cursor);
        String str2 = MediaSessionCompatQueueItem.read(str, "unique_id", cursor);
        long jIconCompatParcelizer2 = IconCompatParcelizer.IconCompatParcelizer(str, "event_time", cursor);
        long jIconCompatParcelizer3 = IconCompatParcelizer.IconCompatParcelizer(str, "time_horizon", cursor);
        Float fIconCompatParcelizer = r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs.IconCompatParcelizer(cursor, str.concat("latitude"));
        Float fIconCompatParcelizer2 = r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs.IconCompatParcelizer(cursor, str.concat("longitude"));
        try {
            int columnIndexOrThrow = cursor.getColumnIndexOrThrow(str.concat("accuracy"));
            shValueOf = r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs.write(cursor, columnIndexOrThrow) ? Short.valueOf(cursor.getShort(columnIndexOrThrow)) : null;
        } catch (IllegalArgumentException unused) {
        }
        Float fIconCompatParcelizer3 = r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs.IconCompatParcelizer(cursor, str.concat("magnitude"));
        Float fIconCompatParcelizer4 = r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs.IconCompatParcelizer(cursor, str.concat("confidence"));
        Float fIconCompatParcelizer5 = r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs.IconCompatParcelizer(cursor, str.concat("speed_at_impact"));
        Float fIconCompatParcelizer6 = r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs.IconCompatParcelizer(cursor, str.concat("delta_v"));
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow(str.concat("models"));
        if (r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs.write(cursor, columnIndexOrThrow2)) {
            r8lambdajVa0HW0zFC0lycNBZuexuYnMifw r8lambdajva0hw0zfc0lycnbzuexuynmifw3 = new r8lambdajVa0HW0zFC0lycNBZuexuYnMifw();
            try {
                r8lambdajva0hw0zfc0lycnbzuexuynmifw3.RemoteActionCompatParcelizer(cursor.getString(columnIndexOrThrow2));
                r8lambdajva0hw0zfc0lycnbzuexuynmifw = r8lambdajva0hw0zfc0lycnbzuexuynmifw3;
            } catch (JSONException unused2) {
                r8lambdajva0hw0zfc0lycnbzuexuynmifw = null;
            }
        } else {
            r8lambdajva0hw0zfc0lycnbzuexuynmifw = null;
        }
        long jRemoteActionCompatParcelizer = isPushPrimer.RemoteActionCompatParcelizer(cursor, str);
        long j = isPushPrimer.read(cursor, str);
        try {
            int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow(str.concat("severity"));
            numValueOf = r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs.write(cursor, columnIndexOrThrow3) ? Integer.valueOf(cursor.getInt(columnIndexOrThrow3)) : null;
            while (true) {
                if (i2 >= length) {
                    crashDetectorModeInternal = null;
                    break;
                }
                CrashDetectorModeInternal crashDetectorModeInternal2 = crashDetectorModeInternalArrValues[i2];
                CrashDetectorModeInternal[] crashDetectorModeInternalArr = crashDetectorModeInternalArrValues;
                if (crashDetectorModeInternal2.getMode() == i) {
                    crashDetectorModeInternal = crashDetectorModeInternal2;
                    break;
                }
                i2++;
                crashDetectorModeInternalArrValues = crashDetectorModeInternalArr;
            }
        } catch (IllegalArgumentException unused3) {
        }
        if (numValueOf == null) {
            r8lambdajva0hw0zfc0lycnbzuexuynmifw2 = r8lambdajva0hw0zfc0lycnbzuexuynmifw;
            crashSeverityInternal = null;
        } else {
            CrashSeverityInternal.IconCompatParcelizer iconCompatParcelizer = CrashSeverityInternal.Companion;
            int iIntValue = numValueOf.intValue();
            iconCompatParcelizer.getClass();
            r8lambdajva0hw0zfc0lycnbzuexuynmifw2 = r8lambdajva0hw0zfc0lycnbzuexuynmifw;
            if (iIntValue == 1) {
                crashSeverityInternal = CrashSeverityInternal.LOW;
            } else if (iIntValue == 2) {
                crashSeverityInternal = CrashSeverityInternal.MEDIUM;
            } else if (iIntValue != 3) {
                crashSeverityInternal = CrashSeverityInternal.INVALID;
            } else {
                crashSeverityInternal = CrashSeverityInternal.HIGH;
            }
        }
        CrashDetectorModeInternal.RemoteActionCompatParcelizer remoteActionCompatParcelizer = CrashDetectorModeInternal.Companion;
        CrashSeverityInternal crashSeverityInternal2 = crashSeverityInternal;
        i = cursor.getInt(cursor.getColumnIndexOrThrow(str.concat("detector_mode")));
        remoteActionCompatParcelizer.getClass();
        crashDetectorModeInternalArrValues = CrashDetectorModeInternal.values();
        length = crashDetectorModeInternalArrValues.length;
        i2 = 0;
        return new r8lambda5plvMMYc7MSPH8a8XIGNiKxWbe0(jIconCompatParcelizer, str2, jIconCompatParcelizer2, jIconCompatParcelizer3, fIconCompatParcelizer, fIconCompatParcelizer2, shValueOf, fIconCompatParcelizer3, fIconCompatParcelizer4, fIconCompatParcelizer5, fIconCompatParcelizer6, r8lambdajva0hw0zfc0lycnbzuexuynmifw2, jRemoteActionCompatParcelizer, j, crashSeverityInternal2, crashDetectorModeInternal == null ? CrashDetectorModeInternal.UNKNOWN : crashDetectorModeInternal);
    }

    @Override // o.isPushPrimer
    public final Byte MediaSessionCompatQueueItem() {
        return (byte) 4;
    }

    public static setClickBehaviorlambda0 read() {
        if (RemoteActionCompatParcelizer == null) {
            RemoteActionCompatParcelizer = new setClickBehaviorlambda0();
        }
        return RemoteActionCompatParcelizer;
    }

    @Override // o.isPushPrimer
    public final void serializer(SQLiteDatabase sQLiteDatabase, int i) throws SQLException {
        if (i == 19) {
            sQLiteDatabase.execSQL("ALTER TABLE crash ADD COLUMN severity integer");
        }
        if (i == 21) {
            sQLiteDatabase.execSQL("ALTER TABLE crash ADD COLUMN detector_mode integer not null default 0");
        }
    }

    @Override // o.isPushPrimer
    public final List<String> MediaMetadataCompat() {
        return Arrays.asList("latitude real", "longitude real", "accuracy integer", "magnitude real", "confidence real", "speed_at_impact real", "delta_v real", "models text", "severity integer", "detector_mode integer not null default 0");
    }
}

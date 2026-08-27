package o;

import android.location.Location;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class getDEFAULT_PUSH_DELIVERY_MIN_FLUSHandroid_sdk_base_releaseannotations {
    public static int serializer(List<Location> list) {
        HashSet hashSet = new HashSet();
        for (Location location : list) {
            hashSet.add(String.format(java.util.Locale.US, "%.5f,%.5f", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude())));
        }
        return hashSet.size();
    }

    public static String RemoteActionCompatParcelizer(Location location) {
        String strSubstring;
        if (location == null) {
            return null;
        }
        java.util.Locale locale = java.util.Locale.ENGLISH;
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        float accuracy = location.getAccuracy();
        long time = location.getTime();
        float speed = location.hasSpeed() ? location.getSpeed() : -1.0f;
        if (TextUtils.isEmpty(location.getProvider())) {
            strSubstring = "";
        } else {
            strSubstring = location.getProvider().substring(0, 1);
        }
        return String.format(locale, "%.4f,%.4f | a=%.2f | t=%d | s=%.2f | p=%s", Double.valueOf(latitude), Double.valueOf(longitude), Float.valueOf(accuracy), Long.valueOf(time), Float.valueOf(speed), strSubstring);
    }

    public static boolean IconCompatParcelizer(Location location) {
        double dAbs = Math.abs(location.getLatitude());
        if (dAbs < 0.0d || dAbs > 90.0d || dAbs == 90.0d) {
            return false;
        }
        double dAbs2 = Math.abs(location.getLongitude());
        return dAbs2 >= 0.0d && dAbs2 <= 180.0d;
    }
}

package o;

import android.location.Location;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class shutdownAllDataStoresdefault {
    public static String RemoteActionCompatParcelizer(writeMap writemap) {
        StringBuilder sb = new StringBuilder();
        for (int i = writemap.serializer; i > 0; i--) {
            int i2 = 1 << (i - 1);
            char c = (writemap.RemoteActionCompatParcelizer & i2) != 0 ? '2' : '1';
            if ((i2 & writemap.read) != 0) {
                c = (char) (c + 2);
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public static writeMap IconCompatParcelizer(Location location, int i) {
        return write(location.getLatitude(), location.getLongitude(), i);
    }

    public static List<String> read(Location location, int i) {
        writeMap writemapWrite = write(location.getLatitude(), location.getLongitude(), i);
        int i2 = writemapWrite.RemoteActionCompatParcelizer;
        int i3 = i2 - 1;
        int i4 = writemapWrite.read;
        int i5 = i4 + 1;
        String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(new writeMap(i3, i5, i));
        String strRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(new writeMap(i2, i5, i));
        int i6 = i2 + 1;
        String strRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer(new writeMap(i6, i5, i));
        String strRemoteActionCompatParcelizer4 = RemoteActionCompatParcelizer(new writeMap(i3, i4, i));
        String strRemoteActionCompatParcelizer5 = RemoteActionCompatParcelizer(new writeMap(i2, i4, i));
        String strRemoteActionCompatParcelizer6 = RemoteActionCompatParcelizer(new writeMap(i6, i4, i));
        int i7 = i4 - 1;
        return Arrays.asList(strRemoteActionCompatParcelizer, strRemoteActionCompatParcelizer2, strRemoteActionCompatParcelizer3, strRemoteActionCompatParcelizer4, strRemoteActionCompatParcelizer5, strRemoteActionCompatParcelizer6, RemoteActionCompatParcelizer(new writeMap(i3, i7, i)), RemoteActionCompatParcelizer(new writeMap(i2, i7, i)), RemoteActionCompatParcelizer(new writeMap(i6, i7, i)));
    }

    public static String serializer(String str, int i) {
        return str.substring(0, Math.min(str.length(), i));
    }

    public static writeMap write(double d, double d2, int i) {
        double radians = Math.toRadians(d);
        double dPow = Math.pow(2.0d, i);
        return new writeMap((int) (((d2 + 180.0d) / 360.0d) * dPow), (int) (((1.0d - (Math.log(Math.tan(radians) + (1.0d / Math.cos(radians))) / 3.141592653589793d)) / 2.0d) * dPow), i);
    }

    public static String read(String str, String str2) {
        String strSubstring = str.substring(str2.length());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strSubstring.length(); i++) {
            sb.append(Character.getNumericValue(strSubstring.charAt(i)) - 1);
        }
        return sb.toString();
    }
}

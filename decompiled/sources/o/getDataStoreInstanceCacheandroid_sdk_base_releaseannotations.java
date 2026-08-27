package o;

import android.location.Location;
import com.sentiance.sdk.util.BoundingBox;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getDataStoreInstanceCacheandroid_sdk_base_releaseannotations {
    public static final Location IconCompatParcelizer(String str) {
        str.getClass();
        int length = str.length();
        try {
            int i = 0;
            int i2 = 0;
            for (int length2 = str.length(); length2 > 0; length2--) {
                int i3 = 1 << (length2 - 1);
                char cCharAt = str.charAt(length - length2);
                if (cCharAt != '1') {
                    if (cCharAt == '2') {
                        i |= i3;
                    } else {
                        if (cCharAt != '3') {
                            if (cCharAt != '4') {
                                throw new Exception("Unexpected quad key digit");
                            }
                            i |= i3;
                        }
                        i2 |= i3;
                    }
                }
            }
            BoundingBox boundingBoxRemoteActionCompatParcelizer = new writeMap(i, i2, length).RemoteActionCompatParcelizer();
            Location location = new Location("");
            location.setLatitude((boundingBoxRemoteActionCompatParcelizer.read() + boundingBoxRemoteActionCompatParcelizer.RemoteActionCompatParcelizer()) / 2.0d);
            location.setLongitude((boundingBoxRemoteActionCompatParcelizer.MediaDescriptionCompat() + boundingBoxRemoteActionCompatParcelizer.IconCompatParcelizer()) / 2.0d);
            return location;
        } catch (Exception unused) {
            return null;
        }
    }
}

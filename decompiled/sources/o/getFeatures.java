package o;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class getFeatures {
    public static final Map RemoteActionCompatParcelizer;
    public final int read;
    public final String serializer;

    public final String toString() {
        return this.serializer;
    }

    static {
        HashMap map = new HashMap();
        map.put(serializer(32, 16, 67, 10, "SHA-256"), new getFeatures(1, "XMSS_SHA2_10_256"));
        map.put(serializer(32, 16, 67, 16, "SHA-256"), new getFeatures(2, "XMSS_SHA2_16_256"));
        map.put(serializer(32, 16, 67, 20, "SHA-256"), new getFeatures(3, "XMSS_SHA2_20_256"));
        map.put(serializer(64, 16, 131, 10, "SHA-512"), new getFeatures(4, "XMSS_SHA2_10_512"));
        map.put(serializer(64, 16, 131, 16, "SHA-512"), new getFeatures(5, "XMSS_SHA2_16_512"));
        map.put(serializer(64, 16, 131, 20, "SHA-512"), new getFeatures(6, "XMSS_SHA2_20_512"));
        map.put(serializer(32, 16, 67, 10, "SHAKE128"), new getFeatures(7, "XMSS_SHAKE_10_256"));
        map.put(serializer(32, 16, 67, 16, "SHAKE128"), new getFeatures(8, "XMSS_SHAKE_16_256"));
        map.put(serializer(32, 16, 67, 20, "SHAKE128"), new getFeatures(9, "XMSS_SHAKE_20_256"));
        map.put(serializer(64, 16, 131, 10, "SHAKE256"), new getFeatures(10, "XMSS_SHAKE_10_512"));
        map.put(serializer(64, 16, 131, 16, "SHAKE256"), new getFeatures(11, "XMSS_SHAKE_16_512"));
        map.put(serializer(64, 16, 131, 20, "SHAKE256"), new getFeatures(12, "XMSS_SHAKE_20_512"));
        RemoteActionCompatParcelizer = Collections.unmodifiableMap(map);
    }

    public static String serializer(int i, int i2, int i3, int i4, String str) {
        return str + "-" + i + "-" + i2 + "-" + i3 + "-" + i4;
    }

    public getFeatures(int i, String str) {
        this.read = i;
        this.serializer = str;
    }
}

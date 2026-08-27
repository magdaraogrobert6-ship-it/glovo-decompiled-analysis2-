package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class getEvaluationfwf_client_release {
    public static final Map RemoteActionCompatParcelizer;
    public final String IconCompatParcelizer;
    public final int serializer;

    public final String toString() {
        return this.IconCompatParcelizer;
    }

    static {
        HashMap map = new HashMap();
        getBitmapFromCache.serializer(1, "XMSSMT_SHA2_20/2_256", map, serializer("SHA-256", 32, 16, 67, 20, 2));
        getBitmapFromCache.serializer(2, "XMSSMT_SHA2_20/4_256", map, serializer("SHA-256", 32, 16, 67, 20, 4));
        getBitmapFromCache.serializer(3, "XMSSMT_SHA2_40/2_256", map, serializer("SHA-256", 32, 16, 67, 40, 2));
        getBitmapFromCache.serializer(4, "XMSSMT_SHA2_40/4_256", map, serializer("SHA-256", 32, 16, 67, 40, 4));
        getBitmapFromCache.serializer(5, "XMSSMT_SHA2_40/8_256", map, serializer("SHA-256", 32, 16, 67, 40, 8));
        getBitmapFromCache.serializer(6, "XMSSMT_SHA2_60/3_256", map, serializer("SHA-256", 32, 16, 67, 60, 3));
        getBitmapFromCache.serializer(7, "XMSSMT_SHA2_60/6_256", map, serializer("SHA-256", 32, 16, 67, 60, 6));
        getBitmapFromCache.serializer(8, "XMSSMT_SHA2_60/12_256", map, serializer("SHA-256", 32, 16, 67, 60, 12));
        getBitmapFromCache.serializer(9, "XMSSMT_SHA2_20/2_512", map, serializer("SHA-512", 64, 16, 131, 20, 2));
        getBitmapFromCache.serializer(10, "XMSSMT_SHA2_20/4_512", map, serializer("SHA-512", 64, 16, 131, 20, 4));
        getBitmapFromCache.serializer(11, "XMSSMT_SHA2_40/2_512", map, serializer("SHA-512", 64, 16, 131, 40, 2));
        getBitmapFromCache.serializer(12, "XMSSMT_SHA2_40/4_512", map, serializer("SHA-512", 64, 16, 131, 40, 4));
        getBitmapFromCache.serializer(13, "XMSSMT_SHA2_40/8_512", map, serializer("SHA-512", 64, 16, 131, 40, 8));
        getBitmapFromCache.serializer(14, "XMSSMT_SHA2_60/3_512", map, serializer("SHA-512", 64, 16, 131, 60, 3));
        getBitmapFromCache.serializer(15, "XMSSMT_SHA2_60/6_512", map, serializer("SHA-512", 64, 16, 131, 60, 6));
        getBitmapFromCache.serializer(16, "XMSSMT_SHA2_60/12_512", map, serializer("SHA-512", 64, 16, 131, 60, 12));
        getBitmapFromCache.serializer(17, "XMSSMT_SHAKE_20/2_256", map, serializer("SHAKE128", 32, 16, 67, 20, 2));
        getBitmapFromCache.serializer(18, "XMSSMT_SHAKE_20/4_256", map, serializer("SHAKE128", 32, 16, 67, 20, 4));
        getBitmapFromCache.serializer(19, "XMSSMT_SHAKE_40/2_256", map, serializer("SHAKE128", 32, 16, 67, 40, 2));
        getBitmapFromCache.serializer(20, "XMSSMT_SHAKE_40/4_256", map, serializer("SHAKE128", 32, 16, 67, 40, 4));
        getBitmapFromCache.serializer(21, "XMSSMT_SHAKE_40/8_256", map, serializer("SHAKE128", 32, 16, 67, 40, 8));
        getBitmapFromCache.serializer(22, "XMSSMT_SHAKE_60/3_256", map, serializer("SHAKE128", 32, 16, 67, 60, 3));
        getBitmapFromCache.serializer(23, "XMSSMT_SHAKE_60/6_256", map, serializer("SHAKE128", 32, 16, 67, 60, 6));
        getBitmapFromCache.serializer(24, "XMSSMT_SHAKE_60/12_256", map, serializer("SHAKE128", 32, 16, 67, 60, 12));
        getBitmapFromCache.serializer(25, "XMSSMT_SHAKE_20/2_512", map, serializer("SHAKE256", 64, 16, 131, 20, 2));
        getBitmapFromCache.serializer(26, "XMSSMT_SHAKE_20/4_512", map, serializer("SHAKE256", 64, 16, 131, 20, 4));
        getBitmapFromCache.serializer(27, "XMSSMT_SHAKE_40/2_512", map, serializer("SHAKE256", 64, 16, 131, 40, 2));
        getBitmapFromCache.serializer(28, "XMSSMT_SHAKE_40/4_512", map, serializer("SHAKE256", 64, 16, 131, 40, 4));
        getBitmapFromCache.serializer(29, "XMSSMT_SHAKE_40/8_512", map, serializer("SHAKE256", 64, 16, 131, 40, 8));
        getBitmapFromCache.serializer(30, "XMSSMT_SHAKE_60/3_512", map, serializer("SHAKE256", 64, 16, 131, 60, 3));
        getBitmapFromCache.serializer(31, "XMSSMT_SHAKE_60/6_512", map, serializer("SHAKE256", 64, 16, 131, 60, 6));
        map.put(serializer("SHAKE256", 64, 16, 131, 60, 12), new getEvaluationfwf_client_release(32, "XMSSMT_SHAKE_60/12_512"));
        RemoteActionCompatParcelizer = Collections.unmodifiableMap(map);
    }

    public getEvaluationfwf_client_release(int i, String str) {
        this.serializer = i;
        this.IconCompatParcelizer = str;
    }

    public static String serializer(String str, int i, int i2, int i3, int i4, int i5) {
        if (str != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("-");
            sb.append(i);
            sb.append("-");
            sb.append(i2);
            c8$$ExternalSyntheticOutline0.m(i3, i4, "-", "-", sb);
            return d$$ExternalSyntheticOutline0.m(i5, "-", sb);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("algorithmName == null");
        return null;
    }
}

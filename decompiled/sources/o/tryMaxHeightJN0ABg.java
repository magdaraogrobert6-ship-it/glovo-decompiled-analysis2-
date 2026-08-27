package o;

import java.util.LinkedHashMap;
import okio.Okio;

/* JADX INFO: loaded from: classes.dex */
public abstract class tryMaxHeightJN0ABg {
    private static int read = 1;
    private static int write;

    public static final float serializer(float f, float f2, float f3, float f4, float f5, float f6) {
        int i = 2 % 2;
        int i2 = read + 93;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            float f7 = f2 / f2;
            return (((((f5 - f6) - 3.0f) + f7) / (f5 / (((f5 + 0.0f) % f6) % (0.0f + f2)))) - f) * f3 * f4 * (f2 - f7) * 6.0f;
        }
        float f8 = f2 * f2;
        return (((((f5 + f6) * 3.0f) * f8) + (f5 - (((f5 * 2.0f) + f6) * (2.0f * f2)))) * f) - ((f3 - f4) * ((f2 - f8) * 6.0f));
    }

    public static accessgetAmbientShadowColor0d7_KjUjd serializer(long j, long j2, String str, String str2) {
        int i = 2 % 2;
        str.getClass();
        str2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("acknowledgment_url", str);
        linkedHashMap.put("delivery_id", Long.valueOf(j));
        linkedHashMap.put("confirmation_number", str2);
        linkedHashMap.put("initial_time", Long.valueOf(j2));
        accessgetAmbientShadowColor0d7_KjUjd accessgetambientshadowcolor0d7_kjujd = new accessgetAmbientShadowColor0d7_KjUjd(linkedHashMap);
        Okio.serializer(accessgetambientshadowcolor0d7_kjujd);
        int i2 = write + 15;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return accessgetambientshadowcolor0d7_kjujd;
    }
}

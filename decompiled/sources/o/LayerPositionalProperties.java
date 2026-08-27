package o;

import com.google.crypto.tink.internal.JsonParser$JsonElementTypeAdapter;

/* JADX INFO: loaded from: classes4.dex */
public abstract class LayerPositionalProperties {
    static {
        new JsonParser$JsonElementTypeAdapter(0);
    }

    public static boolean serializer(String str) {
        int length = str.length();
        int i = 0;
        while (i != length) {
            char cCharAt = str.charAt(i);
            int i2 = i + 1;
            if (!Character.isSurrogate(cCharAt)) {
                i = i2;
            } else {
                if (Character.isLowSurrogate(cCharAt) || i2 == length || !Character.isLowSurrogate(str.charAt(i2))) {
                    return false;
                }
                i += 2;
            }
        }
        return true;
    }
}

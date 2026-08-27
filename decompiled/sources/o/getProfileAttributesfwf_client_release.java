package o;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class getProfileAttributesfwf_client_release {
    public static final Map write;
    public final String IconCompatParcelizer;

    public final String toString() {
        return this.IconCompatParcelizer;
    }

    static {
        HashMap map = new HashMap();
        map.put(write(32, 67, "SHA-256"), new getProfileAttributesfwf_client_release(16777217, "WOTSP_SHA2-256_W16"));
        map.put(write(64, 131, "SHA-512"), new getProfileAttributesfwf_client_release(33554434, "WOTSP_SHA2-512_W16"));
        map.put(write(32, 67, "SHAKE128"), new getProfileAttributesfwf_client_release(50331651, "WOTSP_SHAKE128_W16"));
        map.put(write(64, 131, "SHAKE256"), new getProfileAttributesfwf_client_release(67108868, "WOTSP_SHAKE256_W16"));
        write = Collections.unmodifiableMap(map);
    }

    public static String write(int i, int i2, String str) {
        return str + "-" + i + "-16-" + i2;
    }

    public getProfileAttributesfwf_client_release(int i, String str) {
        this.IconCompatParcelizer = str;
    }
}

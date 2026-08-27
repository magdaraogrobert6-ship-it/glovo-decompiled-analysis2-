package o;

import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class TranslationsCompanion {
    public static void write(getNetworkModule getnetworkmodule, String str, String str2, String str3, String str4) {
        getnetworkmodule.IconCompatParcelizer(str);
        getnetworkmodule.IconCompatParcelizer(str2);
        getnetworkmodule.IconCompatParcelizer(str3);
        getnetworkmodule.IconCompatParcelizer(str4);
    }

    public static void RemoteActionCompatParcelizer(int i, int i2, getNetworkModule getnetworkmodule, HashMap map, Integer num) {
        map.put(num, new setHoldoutKeysfwf_client_release(i, i2, getnetworkmodule));
    }
}

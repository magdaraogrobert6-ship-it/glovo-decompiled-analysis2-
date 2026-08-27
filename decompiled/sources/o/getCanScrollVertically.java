package o;

/* JADX INFO: loaded from: classes2.dex */
public enum getCanScrollVertically {
    ANDROID_KEYSTORE("AndroidKeyStore", "AndroidKeyStore"),
    HUAWEI_KEYSTORE("HwKeystore", "HwUniversalKeyStoreProvider");

    private final String name;
    private final String providerName;

    public String getName() {
        return this.name;
    }

    public String getProviderName() {
        return this.providerName;
    }

    getCanScrollVertically(String str, String str2) {
        this.name = str;
        this.providerName = str2;
    }
}

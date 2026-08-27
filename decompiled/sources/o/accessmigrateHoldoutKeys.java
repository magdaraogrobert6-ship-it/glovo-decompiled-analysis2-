package o;

/* JADX INFO: loaded from: classes4.dex */
public final class accessmigrateHoldoutKeys extends setAll {
    public final byte[] serializer;

    public accessmigrateHoldoutKeys(accessgetMetricProviderp accessgetmetricproviderp, byte[] bArr) {
        super(accessgetmetricproviderp, true);
        this.serializer = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr);
    }
}

package o;

/* JADX INFO: loaded from: classes4.dex */
public final class accessgetHoldoutsWithLock extends setAll {
    public final byte[] serializer;

    public accessgetHoldoutsWithLock(accessgetMetricProviderp accessgetmetricproviderp, byte[] bArr) {
        super(accessgetmetricproviderp, false);
        this.serializer = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr);
    }
}

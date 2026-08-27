package o;

/* JADX INFO: loaded from: classes4.dex */
public final class accessgetFeaturesWithLock extends getContact {
    public final byte[] serializer;

    public accessgetFeaturesWithLock(byte[] bArr) {
        super(false);
        this.serializer = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr);
    }
}

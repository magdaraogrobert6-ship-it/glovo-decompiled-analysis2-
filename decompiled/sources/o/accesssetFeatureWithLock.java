package o;

/* JADX INFO: loaded from: classes4.dex */
public final class accesssetFeatureWithLock extends FWFRequest {
    public final byte[] IconCompatParcelizer;
    public final byte[] MediaMetadataCompat;
    public final byte[] RatingCompat;
    public final byte[] serializer;
    public final byte[] write;

    public accesssetFeatureWithLock(accesssetInitialDataHoldouts accesssetinitialdataholdouts, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        super(accesssetinitialdataholdouts, true);
        this.serializer = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr);
        this.IconCompatParcelizer = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr2);
        this.MediaMetadataCompat = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr3);
        this.RatingCompat = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr4);
        this.write = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr5);
    }

    public final byte[] IconCompatParcelizer() {
        return accessbootstrapIfNeeded.RemoteActionCompatParcelizer(this.write);
    }
}

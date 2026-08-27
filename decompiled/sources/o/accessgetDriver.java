package o;

/* JADX INFO: loaded from: classes4.dex */
public final class accessgetDriver extends setAll {
    public final byte[] RemoteActionCompatParcelizer;
    public final byte[] write;

    public accessgetDriver(accessgetHelpcenterRegionConfig accessgethelpcenterregionconfig, byte[] bArr) {
        super(accessgethelpcenterregionconfig, false);
        this.write = accessbootstrapIfNeeded.serializer(bArr, 0, bArr.length - 32);
        this.RemoteActionCompatParcelizer = accessbootstrapIfNeeded.serializer(bArr, bArr.length - 32, bArr.length);
    }

    public accessgetDriver(accessgetHelpcenterRegionConfig accessgethelpcenterregionconfig, byte[] bArr, byte[] bArr2) {
        super(accessgethelpcenterregionconfig, false);
        this.write = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr);
        this.RemoteActionCompatParcelizer = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr2);
    }
}

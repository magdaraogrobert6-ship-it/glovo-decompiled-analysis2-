package o;

/* JADX INFO: loaded from: classes4.dex */
public final class accessgetSerializerp extends writeTo {
    public final byte[] IconCompatParcelizer;
    public final byte[] MediaMetadataCompat;
    public final byte[] RemoteActionCompatParcelizer;
    public final byte[] write;

    public accessgetSerializerp(accessgetStoragep accessgetstoragep, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(accessgetstoragep, true);
        this.write = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr);
        this.RemoteActionCompatParcelizer = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr2);
        this.MediaMetadataCompat = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr3);
        this.IconCompatParcelizer = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr4);
    }
}

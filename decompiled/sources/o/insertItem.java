package o;

/* JADX INFO: loaded from: classes4.dex */
public final class insertItem extends writeTo {
    public final byte[] IconCompatParcelizer;
    public final byte[] MediaMetadataCompat;
    public final byte[] RemoteActionCompatParcelizer;
    public final byte[] write;

    public insertItem(selectItem selectitem, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(selectitem, true);
        this.write = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr);
        this.RemoteActionCompatParcelizer = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr2);
        this.IconCompatParcelizer = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr3);
        this.MediaMetadataCompat = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr4);
    }
}

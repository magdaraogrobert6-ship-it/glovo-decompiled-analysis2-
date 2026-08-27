package o;

/* JADX INFO: loaded from: classes2.dex */
public final class getClipDescription extends ClipboardExtensions_androidKt {
    public final int read;
    public final int write;

    @Override // o.ClipboardExtensions_androidKt
    public final int MediaBrowserCompatMediaItem() {
        return this.write;
    }

    @Override // o.ClipboardExtensions_androidKt, o.getClipMetadata
    public final int RatingCompat() {
        return this.read;
    }

    @Override // o.ClipboardExtensions_androidKt, o.getClipMetadata
    public final byte RemoteActionCompatParcelizer(int i) {
        getClipMetadata.RemoteActionCompatParcelizer(i, this.read);
        return this.MediaSessionCompatQueueItem[this.write + i];
    }

    @Override // o.ClipboardExtensions_androidKt, o.getClipMetadata
    public final byte serializer(int i) {
        return this.MediaSessionCompatQueueItem[this.write + i];
    }

    @Override // o.ClipboardExtensions_androidKt, o.getClipMetadata
    public final void serializer(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.MediaSessionCompatQueueItem, this.write + i, bArr, i2, i3);
    }

    public getClipDescription(byte[] bArr, int i, int i2) {
        super(bArr);
        getClipMetadata.serializer(i, i + i2, bArr.length);
        this.write = i;
        this.read = i2;
    }
}

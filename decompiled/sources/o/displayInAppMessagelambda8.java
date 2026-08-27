package o;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class displayInAppMessagelambda8 extends displayInAppMessagelambda9 implements Serializable {
    public int IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public int MediaSessionCompatQueueItem;
    public int RatingCompat;
    public int RemoteActionCompatParcelizer;
    public int read;

    @Override // o.displayInAppMessagelambda9
    public final int IconCompatParcelizer(int i) {
        return (serializer() >>> (32 - i)) & ((-i) >> 31);
    }

    @Override // o.displayInAppMessagelambda9
    public final int serializer() {
        int i = this.MediaBrowserCompatMediaItem;
        int i2 = i ^ (i >>> 2);
        this.MediaBrowserCompatMediaItem = this.RatingCompat;
        this.RatingCompat = this.MediaSessionCompatQueueItem;
        this.MediaSessionCompatQueueItem = this.read;
        int i3 = this.RemoteActionCompatParcelizer;
        this.read = i3;
        int i4 = ((i2 ^ (i2 << 1)) ^ i3) ^ (i3 << 4);
        this.RemoteActionCompatParcelizer = i4;
        int i5 = this.IconCompatParcelizer + 362437;
        this.IconCompatParcelizer = i5;
        return i4 + i5;
    }
}

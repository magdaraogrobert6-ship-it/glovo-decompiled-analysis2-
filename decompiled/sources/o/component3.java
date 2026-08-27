package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class component3 implements Iterator, displayInAppMessagelambda121 {
    public final AndroidContentCaptureManagersendContentCaptureAppearEvents1 IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public int serializer;
    public final int write;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.serializer < this.write;
    }

    @Override // java.util.Iterator
    public final Object next() {
        AndroidContentCaptureManagersendContentCaptureAppearEvents1 androidContentCaptureManagersendContentCaptureAppearEvents1 = this.IconCompatParcelizer;
        int i = androidContentCaptureManagersendContentCaptureAppearEvents1.MediaMetadataCompat;
        int i2 = this.RemoteActionCompatParcelizer;
        if (i != i2) {
            AbstractC0170getTimestamp.IconCompatParcelizer();
        }
        int i3 = this.serializer;
        this.serializer = androidContentCaptureManagersendContentCaptureAppearEvents1.RemoteActionCompatParcelizer[(i3 * 5) + 3] + i3;
        return new AndroidContentCaptureManagerupdateBuffersOnAppeared1(androidContentCaptureManagersendContentCaptureAppearEvents1, i3, i2);
    }

    public component3(AndroidContentCaptureManagersendContentCaptureAppearEvents1 androidContentCaptureManagersendContentCaptureAppearEvents1, int i, int i2) {
        this.IconCompatParcelizer = androidContentCaptureManagersendContentCaptureAppearEvents1;
        this.write = i2;
        this.serializer = i;
        this.RemoteActionCompatParcelizer = androidContentCaptureManagersendContentCaptureAppearEvents1.MediaMetadataCompat;
        if (androidContentCaptureManagersendContentCaptureAppearEvents1.PlaybackStateCompatCustomAction) {
            AbstractC0170getTimestamp.IconCompatParcelizer();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

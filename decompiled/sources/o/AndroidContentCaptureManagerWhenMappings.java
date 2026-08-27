package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidContentCaptureManagerWhenMappings implements Iterable, Iterator, displayInAppMessagelambda121 {
    public int RemoteActionCompatParcelizer;
    public final int read;
    public final AndroidContentCaptureManagersendContentCaptureAppearEvents1 write;

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.RemoteActionCompatParcelizer < this.read;
    }

    public AndroidContentCaptureManagerWhenMappings(AndroidContentCaptureManagersendContentCaptureAppearEvents1 androidContentCaptureManagersendContentCaptureAppearEvents1, int i) {
        this.write = androidContentCaptureManagersendContentCaptureAppearEvents1;
        int[] iArr = androidContentCaptureManagersendContentCaptureAppearEvents1.RemoteActionCompatParcelizer;
        int i2 = iArr[(i * 5) + 4];
        int i3 = i + 1;
        this.read = i3 < androidContentCaptureManagersendContentCaptureAppearEvents1.IconCompatParcelizer ? iArr[(i3 * 5) + 4] : androidContentCaptureManagersendContentCaptureAppearEvents1.MediaSessionCompatQueueItem;
        this.RemoteActionCompatParcelizer = i2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000e  */
    @Override // java.util.Iterator
    public final Object next() {
        Object obj;
        int i = this.RemoteActionCompatParcelizer;
        if (i >= 0) {
            Object[] objArr = this.write.MediaDescriptionCompat;
            if (i < objArr.length) {
                obj = objArr[i];
            } else {
                obj = null;
            }
        } else {
            obj = null;
        }
        this.RemoteActionCompatParcelizer = i + 1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

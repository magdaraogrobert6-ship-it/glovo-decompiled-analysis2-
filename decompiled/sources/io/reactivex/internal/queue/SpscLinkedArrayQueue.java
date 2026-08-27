package io.reactivex.internal.queue;

import androidx.compose.ui.graphics.Fields;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes4.dex */
public final class SpscLinkedArrayQueue<T> implements SimplePlainQueue<T> {
    public static final int RemoteActionCompatParcelizer = Integer.getInteger("jctools.spsc.max.lookahead.step", Fields.TransformOrigin).intValue();
    public static final Object read = new Object();
    public final int IconCompatParcelizer;
    public final AtomicLong MediaBrowserCompatMediaItem;
    public final int MediaDescriptionCompat;
    public long MediaMetadataCompat;
    public final int MediaSessionCompatQueueItem;
    public AtomicReferenceArray RatingCompat;
    public final AtomicLong serializer;
    public AtomicReferenceArray write;

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return this.MediaBrowserCompatMediaItem.get() == this.serializer.get();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object obj) {
        if (obj == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null is not a valid element");
            return false;
        }
        AtomicReferenceArray atomicReferenceArray = this.RatingCompat;
        AtomicLong atomicLong = this.MediaBrowserCompatMediaItem;
        long j = atomicLong.get();
        int i = this.MediaSessionCompatQueueItem;
        int i2 = ((int) j) & i;
        if (j < this.MediaMetadataCompat) {
            atomicReferenceArray.lazySet(i2, obj);
            atomicLong.lazySet(j + 1);
            return true;
        }
        long j2 = ((long) this.MediaDescriptionCompat) + j;
        if (atomicReferenceArray.get(((int) j2) & i) == null) {
            this.MediaMetadataCompat = j2 - 1;
            atomicReferenceArray.lazySet(i2, obj);
            atomicLong.lazySet(j + 1);
            return true;
        }
        long j3 = j + 1;
        if (atomicReferenceArray.get(((int) j3) & i) == null) {
            atomicReferenceArray.lazySet(i2, obj);
            atomicLong.lazySet(j3);
            return true;
        }
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.RatingCompat = atomicReferenceArray2;
        this.MediaMetadataCompat = (j + ((long) i)) - 1;
        atomicReferenceArray2.lazySet(i2, obj);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i2, read);
        atomicLong.lazySet(j3);
        return true;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() {
        AtomicReferenceArray atomicReferenceArray = this.write;
        AtomicLong atomicLong = this.serializer;
        long j = atomicLong.get();
        int i = this.IconCompatParcelizer;
        int i2 = ((int) j) & i;
        Object obj = atomicReferenceArray.get(i2);
        boolean z = obj == read;
        if (obj != null && !z) {
            atomicReferenceArray.lazySet(i2, null);
            atomicLong.lazySet(j + 1);
            return obj;
        }
        if (!z) {
            return null;
        }
        int i3 = i + 1;
        AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i3);
        atomicReferenceArray.lazySet(i3, null);
        this.write = atomicReferenceArray2;
        Object obj2 = atomicReferenceArray2.get(i2);
        if (obj2 != null) {
            atomicReferenceArray2.lazySet(i2, null);
            atomicLong.lazySet(j + 1);
        }
        return obj2;
    }

    public SpscLinkedArrayQueue(int i) {
        AtomicLong atomicLong = new AtomicLong();
        this.MediaBrowserCompatMediaItem = atomicLong;
        this.serializer = new AtomicLong();
        int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(Math.max(8, i) - 1));
        int i2 = iNumberOfLeadingZeros - 1;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(iNumberOfLeadingZeros + 1);
        this.RatingCompat = atomicReferenceArray;
        this.MediaSessionCompatQueueItem = i2;
        this.MediaDescriptionCompat = Math.min(iNumberOfLeadingZeros / 4, RemoteActionCompatParcelizer);
        this.write = atomicReferenceArray;
        this.IconCompatParcelizer = i2;
        this.MediaMetadataCompat = iNumberOfLeadingZeros - 2;
        atomicLong.lazySet(0L);
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }
}

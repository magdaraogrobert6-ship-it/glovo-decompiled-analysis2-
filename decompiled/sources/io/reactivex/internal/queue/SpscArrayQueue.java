package io.reactivex.internal.queue;

import androidx.compose.ui.graphics.Fields;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes4.dex */
public final class SpscArrayQueue<E> extends AtomicReferenceArray<E> implements SimplePlainQueue<E> {
    public static final Integer RemoteActionCompatParcelizer = Integer.getInteger("jctools.spsc.max.lookahead.step", Fields.TransformOrigin);
    public final AtomicLong IconCompatParcelizer;
    public long MediaBrowserCompatMediaItem;
    public final int read;
    public final AtomicLong serializer;
    public final int write;

    public SpscArrayQueue(int i) {
        super(1 << (32 - Integer.numberOfLeadingZeros(i - 1)));
        this.read = length() - 1;
        this.IconCompatParcelizer = new AtomicLong();
        this.serializer = new AtomicLong();
        this.write = Math.min(i / 4, RemoteActionCompatParcelizer.intValue());
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return this.IconCompatParcelizer.get() == this.serializer.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object obj) {
        if (obj == 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null is not a valid element");
            return false;
        }
        AtomicLong atomicLong = this.IconCompatParcelizer;
        long j = atomicLong.get();
        int i = this.read;
        int i2 = ((int) j) & i;
        if (j >= this.MediaBrowserCompatMediaItem) {
            long j2 = ((long) this.write) + j;
            if (get(i & ((int) j2)) == null) {
                this.MediaBrowserCompatMediaItem = j2;
            } else if (get(i2) != null) {
                return false;
            }
        }
        lazySet(i2, obj);
        atomicLong.lazySet(j + 1);
        return true;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() {
        AtomicLong atomicLong = this.serializer;
        long j = atomicLong.get();
        int i = ((int) j) & this.read;
        E e = get(i);
        if (e == null) {
            return null;
        }
        atomicLong.lazySet(j + 1);
        lazySet(i, null);
        return e;
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

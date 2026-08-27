package kotlinx.coroutines.internal;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o.markOnScreenCardsAsRead;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
public final class LockFreeTaskQueueCore<E> {
    public final /* synthetic */ AtomicReferenceArray IconCompatParcelizer;
    public final boolean MediaBrowserCompatMediaItem;
    public final int MediaMetadataCompat;
    public final int RatingCompat;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater serializer = AtomicReferenceFieldUpdater.newUpdater(LockFreeTaskQueueCore.class, Object.class, "_next$volatile");
    public static final /* synthetic */ long read = markOnScreenCardsAsRead.serializer.objectFieldOffset(LockFreeTaskQueueCore.class.getDeclaredField("_next$volatile"));
    public static final /* synthetic */ AtomicLongFieldUpdater RemoteActionCompatParcelizer = AtomicLongFieldUpdater.newUpdater(LockFreeTaskQueueCore.class, "_state$volatile");
    public static final Symbol write = new Symbol("REMOVE_FROZEN");

    public static final class Companion {
    }

    public static final class Placeholder {
        public final int write;

        public Placeholder(int i) {
            this.write = i;
        }
    }

    public final boolean RemoteActionCompatParcelizer() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        do {
            atomicLongFieldUpdater = RemoteActionCompatParcelizer;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, 2305843009213693952L | j));
        return true;
    }

    public final int read(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = RemoteActionCompatParcelizer;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.MediaMetadataCompat;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = this.MediaBrowserCompatMediaItem;
            AtomicReferenceArray atomicReferenceArray = this.IconCompatParcelizer;
            if (!z && atomicReferenceArray.get(i2 & i3) != null) {
                int i4 = this.RatingCompat;
                if (i4 < 1024 || ((i2 - i) & 1073741823) > (i4 >> 1)) {
                    return 1;
                }
            } else if (atomicLongFieldUpdater.compareAndSet(this, j, ((-1152921503533105153L) & j) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                atomicReferenceArray.set(i2 & i3, obj);
                LockFreeTaskQueueCore<E> lockFreeTaskQueueCoreWrite = this;
                while ((atomicLongFieldUpdater.get(lockFreeTaskQueueCoreWrite) & 1152921504606846976L) != 0) {
                    lockFreeTaskQueueCoreWrite = lockFreeTaskQueueCoreWrite.write();
                    AtomicReferenceArray atomicReferenceArray2 = lockFreeTaskQueueCoreWrite.IconCompatParcelizer;
                    int i5 = lockFreeTaskQueueCoreWrite.MediaMetadataCompat & i2;
                    Object obj2 = atomicReferenceArray2.get(i5);
                    if ((obj2 instanceof Placeholder) && ((Placeholder) obj2).write == i2) {
                        atomicReferenceArray2.set(i5, obj);
                    } else {
                        lockFreeTaskQueueCoreWrite = null;
                    }
                    if (lockFreeTaskQueueCoreWrite == null) {
                        return 0;
                    }
                }
                return 0;
            }
        }
    }

    public final Object serializer() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = RemoteActionCompatParcelizer;
            long j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                return write;
            }
            int i = (int) (j & 1073741823);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.MediaMetadataCompat;
            int i4 = i & i3;
            if ((i2 & i3) != i4) {
                AtomicReferenceArray atomicReferenceArray = this.IconCompatParcelizer;
                Object obj = atomicReferenceArray.get(i4);
                boolean z = this.MediaBrowserCompatMediaItem;
                if (obj == null) {
                    if (z) {
                    }
                } else if (!(obj instanceof Placeholder)) {
                    long j2 = (i + 1) & 1073741823;
                    if (atomicLongFieldUpdater.compareAndSet(this, j, (j & (-1073741824)) | j2)) {
                        atomicReferenceArray.set(i4, null);
                        return obj;
                    }
                    if (z) {
                        LockFreeTaskQueueCore<E> lockFreeTaskQueueCoreWrite = this;
                        while (true) {
                            long j3 = atomicLongFieldUpdater.get(lockFreeTaskQueueCoreWrite);
                            int i5 = (int) (j3 & 1073741823);
                            if ((j3 & 1152921504606846976L) != 0) {
                                lockFreeTaskQueueCoreWrite = lockFreeTaskQueueCoreWrite.write();
                            } else {
                                if (RemoteActionCompatParcelizer.compareAndSet(lockFreeTaskQueueCoreWrite, j3, (j3 & (-1073741824)) | j2)) {
                                    lockFreeTaskQueueCoreWrite.IconCompatParcelizer.set(lockFreeTaskQueueCoreWrite.MediaMetadataCompat & i5, null);
                                    lockFreeTaskQueueCoreWrite = null;
                                } else {
                                    continue;
                                }
                            }
                            if (lockFreeTaskQueueCoreWrite == null) {
                                return obj;
                            }
                        }
                    }
                }
            }
            return null;
        }
    }

    public final LockFreeTaskQueueCore write() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        long j2;
        do {
            atomicLongFieldUpdater = RemoteActionCompatParcelizer;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) == 0) {
                j2 = j | 1152921504606846976L;
            }
            return write(j);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, j2));
        j = j2;
        return write(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final LockFreeTaskQueueCore write(long j) {
        Unsafe unsafe;
        while (true) {
            serializer.getClass();
            Unsafe unsafe2 = markOnScreenCardsAsRead.serializer;
            long j2 = read;
            LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) unsafe2.getObjectVolatile(this, j2);
            if (lockFreeTaskQueueCore != null) {
                return lockFreeTaskQueueCore;
            }
            LockFreeTaskQueueCore lockFreeTaskQueueCore2 = new LockFreeTaskQueueCore(this.RatingCompat * 2, this.MediaBrowserCompatMediaItem);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.MediaMetadataCompat;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object placeholder = this.IconCompatParcelizer.get(i4);
                if (placeholder == null) {
                    placeholder = new Placeholder(i);
                }
                lockFreeTaskQueueCore2.IconCompatParcelizer.set(lockFreeTaskQueueCore2.MediaMetadataCompat & i, placeholder);
                i++;
            }
            RemoteActionCompatParcelizer.set(lockFreeTaskQueueCore2, (-1152921504606846977L) & j);
            do {
                unsafe = markOnScreenCardsAsRead.serializer;
                if (unsafe.compareAndSwapObject(this, read, (Object) null, lockFreeTaskQueueCore2)) {
                    break;
                }
            } while (unsafe.getObjectVolatile(this, j2) == null);
        }
    }

    public LockFreeTaskQueueCore(int i, boolean z) {
        this.RatingCompat = i;
        this.MediaBrowserCompatMediaItem = z;
        int i2 = i - 1;
        this.MediaMetadataCompat = i2;
        this.IconCompatParcelizer = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Check failed.");
            throw null;
        }
        if ((i & i2) == 0) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Check failed.");
        throw null;
    }
}

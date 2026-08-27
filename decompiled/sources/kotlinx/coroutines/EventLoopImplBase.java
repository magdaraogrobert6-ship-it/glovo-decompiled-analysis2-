package kotlinx.coroutines;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.ThreadSafeHeap;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;
import o.BrazeContentCardsManager;
import o.TextAnnouncementContentCardView;
import o.getParentViewGroup;
import o.isAnimatingClose;
import o.isCircle;
import o.markOnScreenCardsAsRead;
import o.onTouchEnded;
import o.r8lambdaIeStUzy5CWWlk7mkEPiDWAOEX0s;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setAndStartAnimation;
import o.setCloseButton;
import o.setOnBackInvokedCallback;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
public abstract class EventLoopImplBase extends EventLoop implements isAnimatingClose {
    public static final /* synthetic */ long MediaDescriptionCompat;
    public static final /* synthetic */ AtomicIntegerFieldUpdater MediaMetadataCompat;
    public static final /* synthetic */ long MediaSessionCompatResultReceiverWrapper;
    public static final /* synthetic */ AtomicReferenceFieldUpdater MediaSessionCompatToken = AtomicReferenceFieldUpdater.newUpdater(EventLoopImplBase.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater RatingCompat;
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    public abstract class DelayedTask implements Runnable, Comparable, setAndStartAnimation, ThreadSafeHeapNode {
        public int RemoteActionCompatParcelizer = -1;
        private volatile Object _heap;
        public long serializer;

        @Override // o.setAndStartAnimation
        public final void RemoteActionCompatParcelizer() {
            synchronized (this) {
                Object obj = this._heap;
                Symbol symbol = TimeoutKt.read;
                if (obj == symbol) {
                    return;
                }
                r8lambdaIeStUzy5CWWlk7mkEPiDWAOEX0s r8lambdaiestuzy5cwwlk7mkepidwaoex0s = obj instanceof r8lambdaIeStUzy5CWWlk7mkEPiDWAOEX0s ? (r8lambdaIeStUzy5CWWlk7mkEPiDWAOEX0s) obj : null;
                if (r8lambdaiestuzy5cwwlk7mkepidwaoex0s != null) {
                    synchronized (r8lambdaiestuzy5cwwlk7mkepidwaoex0s) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof ThreadSafeHeap ? (ThreadSafeHeap) obj2 : null) != null) {
                            r8lambdaiestuzy5cwwlk7mkepidwaoex0s.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
                        }
                    }
                }
                this._heap = symbol;
            }
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        public final void serializer(int i) {
            this.RemoteActionCompatParcelizer = i;
        }

        public final int write(long j, r8lambdaIeStUzy5CWWlk7mkEPiDWAOEX0s r8lambdaiestuzy5cwwlk7mkepidwaoex0s, EventLoopImplBase eventLoopImplBase) {
            synchronized (this) {
                if (this._heap == TimeoutKt.read) {
                    return 2;
                }
                synchronized (r8lambdaiestuzy5cwwlk7mkepidwaoex0s) {
                    ThreadSafeHeapNode[] threadSafeHeapNodeArr = r8lambdaiestuzy5cwwlk7mkepidwaoex0s.RemoteActionCompatParcelizer;
                    DelayedTask delayedTask = (DelayedTask) (threadSafeHeapNodeArr != null ? threadSafeHeapNodeArr[0] : null);
                    if (EventLoopImplBase.MediaMetadataCompat.get(eventLoopImplBase) == 1) {
                        return 1;
                    }
                    if (delayedTask == null) {
                        r8lambdaiestuzy5cwwlk7mkepidwaoex0s.IconCompatParcelizer = j;
                    } else {
                        long j2 = delayedTask.serializer;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - r8lambdaiestuzy5cwwlk7mkepidwaoex0s.IconCompatParcelizer > 0) {
                            r8lambdaiestuzy5cwwlk7mkepidwaoex0s.IconCompatParcelizer = j;
                        }
                    }
                    long j3 = this.serializer;
                    long j4 = r8lambdaiestuzy5cwwlk7mkepidwaoex0s.IconCompatParcelizer;
                    if (j3 - j4 < 0) {
                        this.serializer = j4;
                    }
                    r8lambdaiestuzy5cwwlk7mkepidwaoex0s.read(this);
                    return 0;
                }
            }
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            long j = this.serializer - ((DelayedTask) obj).serializer;
            if (j > 0) {
                return 1;
            }
            return j < 0 ? -1 : 0;
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        public final void serializer(r8lambdaIeStUzy5CWWlk7mkEPiDWAOEX0s r8lambdaiestuzy5cwwlk7mkepidwaoex0s) {
            if (this._heap != TimeoutKt.read) {
                this._heap = r8lambdaiestuzy5cwwlk7mkepidwaoex0s;
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Failed requirement.");
            }
        }

        public DelayedTask(long j) {
            this.serializer = j;
        }

        public String toString() {
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(new StringBuilder("Delayed[nanos="), this.serializer, ']');
        }
    }

    public abstract Thread RemoteActionCompatParcelizer();

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatch(TextAnnouncementContentCardView textAnnouncementContentCardView, Runnable runnable) {
        RemoteActionCompatParcelizer(runnable);
    }

    @Override // o.isAnimatingClose
    public setAndStartAnimation write(long j, Runnable runnable, TextAnnouncementContentCardView textAnnouncementContentCardView) {
        return isCircle.serializer(j, runnable, textAnnouncementContentCardView);
    }

    public final boolean IconCompatParcelizer(Runnable runnable) {
        Unsafe unsafe;
        Unsafe unsafe2;
        Unsafe unsafe3;
        while (true) {
            MediaSessionCompatToken.getClass();
            Unsafe unsafe4 = markOnScreenCardsAsRead.serializer;
            long j = MediaSessionCompatResultReceiverWrapper;
            Object objectVolatile = unsafe4.getObjectVolatile(this, j);
            if (MediaMetadataCompat.get(this) == 1) {
                return false;
            }
            if (objectVolatile == null) {
                do {
                    unsafe = markOnScreenCardsAsRead.serializer;
                    if (unsafe.compareAndSwapObject(this, MediaSessionCompatResultReceiverWrapper, (Object) null, runnable)) {
                        return true;
                    }
                } while (unsafe.getObjectVolatile(this, j) == null);
            } else if (objectVolatile instanceof LockFreeTaskQueueCore) {
                LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) objectVolatile;
                int i = lockFreeTaskQueueCore.read(runnable);
                if (i == 0) {
                    return true;
                }
                if (i == 1) {
                    LockFreeTaskQueueCore lockFreeTaskQueueCoreWrite = lockFreeTaskQueueCore.write();
                    do {
                        unsafe2 = markOnScreenCardsAsRead.serializer;
                        if (unsafe2.compareAndSwapObject(this, MediaSessionCompatResultReceiverWrapper, objectVolatile, lockFreeTaskQueueCoreWrite)) {
                            break;
                        }
                    } while (unsafe2.getObjectVolatile(this, j) == objectVolatile);
                } else if (i == 2) {
                    return false;
                }
            } else {
                if (objectVolatile == TimeoutKt.serializer) {
                    return false;
                }
                LockFreeTaskQueueCore lockFreeTaskQueueCore2 = new LockFreeTaskQueueCore(8, true);
                lockFreeTaskQueueCore2.read((Runnable) objectVolatile);
                lockFreeTaskQueueCore2.read(runnable);
                do {
                    unsafe3 = markOnScreenCardsAsRead.serializer;
                    if (unsafe3.compareAndSwapObject(this, MediaSessionCompatResultReceiverWrapper, objectVolatile, lockFreeTaskQueueCore2)) {
                        return true;
                    }
                } while (unsafe3.getObjectVolatile(this, j) == objectVolatile);
            }
        }
    }

    public final void MediaBrowserCompatMediaItem() {
        Unsafe unsafe;
        Unsafe unsafe2;
        while (true) {
            MediaSessionCompatToken.getClass();
            Unsafe unsafe3 = markOnScreenCardsAsRead.serializer;
            long j = MediaSessionCompatResultReceiverWrapper;
            Object objectVolatile = unsafe3.getObjectVolatile(this, j);
            Symbol symbol = TimeoutKt.serializer;
            if (objectVolatile == null) {
                do {
                    unsafe = markOnScreenCardsAsRead.serializer;
                    if (unsafe.compareAndSwapObject(this, MediaSessionCompatResultReceiverWrapper, (Object) null, symbol)) {
                        return;
                    }
                } while (unsafe.getObjectVolatile(this, j) == null);
            } else {
                if (objectVolatile instanceof LockFreeTaskQueueCore) {
                    ((LockFreeTaskQueueCore) objectVolatile).RemoteActionCompatParcelizer();
                    return;
                }
                if (objectVolatile == symbol) {
                    return;
                }
                LockFreeTaskQueueCore lockFreeTaskQueueCore = new LockFreeTaskQueueCore(8, true);
                lockFreeTaskQueueCore.read((Runnable) objectVolatile);
                do {
                    unsafe2 = markOnScreenCardsAsRead.serializer;
                    if (unsafe2.compareAndSwapObject(this, MediaSessionCompatResultReceiverWrapper, objectVolatile, lockFreeTaskQueueCore)) {
                        return;
                    }
                } while (unsafe2.getObjectVolatile(this, j) == objectVolatile);
            }
        }
    }

    public final Runnable MediaDescriptionCompat() {
        Unsafe unsafe;
        Unsafe unsafe2;
        while (true) {
            MediaSessionCompatToken.getClass();
            Unsafe unsafe3 = markOnScreenCardsAsRead.serializer;
            long j = MediaSessionCompatResultReceiverWrapper;
            Object objectVolatile = unsafe3.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                return null;
            }
            if (objectVolatile instanceof LockFreeTaskQueueCore) {
                LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) objectVolatile;
                Object objSerializer = lockFreeTaskQueueCore.serializer();
                if (objSerializer != LockFreeTaskQueueCore.write) {
                    return (Runnable) objSerializer;
                }
                LockFreeTaskQueueCore lockFreeTaskQueueCoreWrite = lockFreeTaskQueueCore.write();
                do {
                    unsafe = markOnScreenCardsAsRead.serializer;
                    if (unsafe.compareAndSwapObject(this, MediaSessionCompatResultReceiverWrapper, objectVolatile, lockFreeTaskQueueCoreWrite)) {
                        break;
                    }
                } while (unsafe.getObjectVolatile(this, j) == objectVolatile);
            } else {
                if (objectVolatile == TimeoutKt.serializer) {
                    return null;
                }
                do {
                    unsafe2 = markOnScreenCardsAsRead.serializer;
                    if (unsafe2.compareAndSwapObject(this, MediaSessionCompatResultReceiverWrapper, objectVolatile, (Object) null)) {
                        return (Runnable) objectVolatile;
                    }
                } while (unsafe2.getObjectVolatile(this, j) == objectVolatile);
            }
        }
    }

    public final void MediaMetadataCompat() {
        ThreadSafeHeapNode threadSafeHeapNodeRemoteActionCompatParcelizer;
        RatingCompat.getClass();
        r8lambdaIeStUzy5CWWlk7mkEPiDWAOEX0s r8lambdaiestuzy5cwwlk7mkepidwaoex0s = (r8lambdaIeStUzy5CWWlk7mkEPiDWAOEX0s) markOnScreenCardsAsRead.serializer.getObjectVolatile(this, MediaDescriptionCompat);
        if (r8lambdaiestuzy5cwwlk7mkepidwaoex0s == null || ThreadSafeHeap.read.get(r8lambdaiestuzy5cwwlk7mkepidwaoex0s) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (r8lambdaiestuzy5cwwlk7mkepidwaoex0s) {
                ThreadSafeHeapNode[] threadSafeHeapNodeArr = r8lambdaiestuzy5cwwlk7mkepidwaoex0s.RemoteActionCompatParcelizer;
                threadSafeHeapNodeRemoteActionCompatParcelizer = null;
                ThreadSafeHeapNode threadSafeHeapNode = threadSafeHeapNodeArr != null ? threadSafeHeapNodeArr[0] : null;
                if (threadSafeHeapNode != null) {
                    DelayedTask delayedTask = (DelayedTask) threadSafeHeapNode;
                    if (jNanoTime - delayedTask.serializer >= 0 && IconCompatParcelizer(delayedTask)) {
                        threadSafeHeapNodeRemoteActionCompatParcelizer = r8lambdaiestuzy5cwwlk7mkepidwaoex0s.RemoteActionCompatParcelizer(0);
                    }
                }
            }
        } while (((DelayedTask) threadSafeHeapNodeRemoteActionCompatParcelizer) != null);
    }

    public final void ParcelableVolumeInfo() {
        MediaSessionCompatToken.getClass();
        Unsafe unsafe = markOnScreenCardsAsRead.serializer;
        unsafe.putObjectVolatile(this, MediaSessionCompatResultReceiverWrapper, (Object) null);
        RatingCompat.getClass();
        unsafe.putObjectVolatile(this, MediaDescriptionCompat, (Object) null);
    }

    public void read(long j, DelayedTask delayedTask) {
        getParentViewGroup.write.IconCompatParcelizer(j, delayedTask);
    }

    public final int serializer(long j, DelayedTask delayedTask) {
        Unsafe unsafe;
        if (MediaMetadataCompat.get(this) == 1) {
            return 1;
        }
        RatingCompat.getClass();
        Unsafe unsafe2 = markOnScreenCardsAsRead.serializer;
        long j2 = MediaDescriptionCompat;
        r8lambdaIeStUzy5CWWlk7mkEPiDWAOEX0s r8lambdaiestuzy5cwwlk7mkepidwaoex0s = (r8lambdaIeStUzy5CWWlk7mkEPiDWAOEX0s) unsafe2.getObjectVolatile(this, j2);
        if (r8lambdaiestuzy5cwwlk7mkepidwaoex0s == null) {
            r8lambdaIeStUzy5CWWlk7mkEPiDWAOEX0s r8lambdaiestuzy5cwwlk7mkepidwaoex0s2 = new r8lambdaIeStUzy5CWWlk7mkEPiDWAOEX0s();
            r8lambdaiestuzy5cwwlk7mkepidwaoex0s2.IconCompatParcelizer = j;
            do {
                unsafe = markOnScreenCardsAsRead.serializer;
                if (unsafe.compareAndSwapObject(this, MediaDescriptionCompat, (Object) null, r8lambdaiestuzy5cwwlk7mkepidwaoex0s2)) {
                    break;
                }
            } while (unsafe.getObjectVolatile(this, j2) == null);
            Object objectVolatile = unsafe.getObjectVolatile(this, j2);
            objectVolatile.getClass();
            r8lambdaiestuzy5cwwlk7mkepidwaoex0s = (r8lambdaIeStUzy5CWWlk7mkEPiDWAOEX0s) objectVolatile;
        }
        return delayedTask.write(j, r8lambdaiestuzy5cwwlk7mkepidwaoex0s, this);
    }

    public final boolean write(DelayedTask delayedTask) {
        RatingCompat.getClass();
        r8lambdaIeStUzy5CWWlk7mkEPiDWAOEX0s r8lambdaiestuzy5cwwlk7mkepidwaoex0s = (r8lambdaIeStUzy5CWWlk7mkEPiDWAOEX0s) markOnScreenCardsAsRead.serializer.getObjectVolatile(this, MediaDescriptionCompat);
        ThreadSafeHeapNode threadSafeHeapNode = null;
        if (r8lambdaiestuzy5cwwlk7mkepidwaoex0s != null) {
            synchronized (r8lambdaiestuzy5cwwlk7mkepidwaoex0s) {
                ThreadSafeHeapNode[] threadSafeHeapNodeArr = r8lambdaiestuzy5cwwlk7mkepidwaoex0s.RemoteActionCompatParcelizer;
                threadSafeHeapNode = threadSafeHeapNodeArr != null ? threadSafeHeapNodeArr[0] : null;
            }
            threadSafeHeapNode = (DelayedTask) threadSafeHeapNode;
        }
        return threadSafeHeapNode == delayedTask;
    }

    public void RemoteActionCompatParcelizer(Runnable runnable) {
        MediaMetadataCompat();
        if (!IconCompatParcelizer(runnable)) {
            getParentViewGroup.write.RemoteActionCompatParcelizer(runnable);
            return;
        }
        Thread threadRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        if (Thread.currentThread() != threadRemoteActionCompatParcelizer) {
            LockSupport.unpark(threadRemoteActionCompatParcelizer);
        }
    }

    @Override // kotlinx.coroutines.EventLoop
    public void write() {
        ThreadLocalEventLoop.RemoteActionCompatParcelizer.set(null);
        MediaMetadataCompat.set(this, 1);
        MediaBrowserCompatMediaItem();
        while (read() <= 0) {
        }
        MediaSessionCompatToken();
    }

    public final void MediaSessionCompatToken() {
        ThreadSafeHeapNode threadSafeHeapNodeRemoteActionCompatParcelizer;
        long jNanoTime = System.nanoTime();
        while (true) {
            RatingCompat.getClass();
            r8lambdaIeStUzy5CWWlk7mkEPiDWAOEX0s r8lambdaiestuzy5cwwlk7mkepidwaoex0s = (r8lambdaIeStUzy5CWWlk7mkEPiDWAOEX0s) markOnScreenCardsAsRead.serializer.getObjectVolatile(this, MediaDescriptionCompat);
            if (r8lambdaiestuzy5cwwlk7mkepidwaoex0s == null) {
                return;
            }
            synchronized (r8lambdaiestuzy5cwwlk7mkepidwaoex0s) {
                threadSafeHeapNodeRemoteActionCompatParcelizer = ThreadSafeHeap.read.get(r8lambdaiestuzy5cwwlk7mkepidwaoex0s) > 0 ? r8lambdaiestuzy5cwwlk7mkepidwaoex0s.RemoteActionCompatParcelizer(0) : null;
            }
            DelayedTask delayedTask = (DelayedTask) threadSafeHeapNodeRemoteActionCompatParcelizer;
            if (delayedTask == null) {
                return;
            } else {
                read(jNanoTime, delayedTask);
            }
        }
    }

    public final boolean MediaSessionCompatQueueItem() {
        BrazeContentCardsManager brazeContentCardsManager = this.MediaSessionCompatQueueItem;
        if (brazeContentCardsManager == null || brazeContentCardsManager.isEmpty()) {
            RatingCompat.getClass();
            Unsafe unsafe = markOnScreenCardsAsRead.serializer;
            r8lambdaIeStUzy5CWWlk7mkEPiDWAOEX0s r8lambdaiestuzy5cwwlk7mkepidwaoex0s = (r8lambdaIeStUzy5CWWlk7mkEPiDWAOEX0s) unsafe.getObjectVolatile(this, MediaDescriptionCompat);
            if (r8lambdaiestuzy5cwwlk7mkepidwaoex0s != null && ThreadSafeHeap.read.get(r8lambdaiestuzy5cwwlk7mkepidwaoex0s) != 0) {
                return false;
            }
            MediaSessionCompatToken.getClass();
            Object objectVolatile = unsafe.getObjectVolatile(this, MediaSessionCompatResultReceiverWrapper);
            if (objectVolatile != null) {
                if (objectVolatile instanceof LockFreeTaskQueueCore) {
                    long j = LockFreeTaskQueueCore.RemoteActionCompatParcelizer.get((LockFreeTaskQueueCore) objectVolatile);
                    return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
                }
                if (objectVolatile == TimeoutKt.serializer) {
                }
            }
            return true;
        }
        return false;
    }

    static {
        Unsafe unsafe = markOnScreenCardsAsRead.serializer;
        MediaSessionCompatResultReceiverWrapper = unsafe.objectFieldOffset(EventLoopImplBase.class.getDeclaredField("_queue$volatile"));
        RatingCompat = AtomicReferenceFieldUpdater.newUpdater(EventLoopImplBase.class, Object.class, "_delayed$volatile");
        MediaDescriptionCompat = unsafe.objectFieldOffset(EventLoopImplBase.class.getDeclaredField("_delayed$volatile"));
        MediaMetadataCompat = AtomicIntegerFieldUpdater.newUpdater(EventLoopImplBase.class, "_isCompleted$volatile");
    }

    @Override // kotlinx.coroutines.EventLoop
    public final long read() {
        if (IconCompatParcelizer()) {
            return 0L;
        }
        MediaMetadataCompat();
        Runnable runnableMediaDescriptionCompat = MediaDescriptionCompat();
        if (runnableMediaDescriptionCompat == null) {
            return RatingCompat();
        }
        runnableMediaDescriptionCompat.run();
        return 0L;
    }

    public final long RatingCompat() {
        ThreadSafeHeapNode threadSafeHeapNode;
        BrazeContentCardsManager brazeContentCardsManager = this.MediaSessionCompatQueueItem;
        if (((brazeContentCardsManager == null || brazeContentCardsManager.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
            MediaSessionCompatToken.getClass();
            Unsafe unsafe = markOnScreenCardsAsRead.serializer;
            Object objectVolatile = unsafe.getObjectVolatile(this, MediaSessionCompatResultReceiverWrapper);
            if (objectVolatile != null) {
                if (objectVolatile instanceof LockFreeTaskQueueCore) {
                    long j = LockFreeTaskQueueCore.RemoteActionCompatParcelizer.get((LockFreeTaskQueueCore) objectVolatile);
                    if (((int) (1073741823 & j)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                        return 0L;
                    }
                } else if (objectVolatile == TimeoutKt.serializer) {
                    return Long.MAX_VALUE;
                }
            }
            RatingCompat.getClass();
            r8lambdaIeStUzy5CWWlk7mkEPiDWAOEX0s r8lambdaiestuzy5cwwlk7mkepidwaoex0s = (r8lambdaIeStUzy5CWWlk7mkEPiDWAOEX0s) unsafe.getObjectVolatile(this, MediaDescriptionCompat);
            if (r8lambdaiestuzy5cwwlk7mkepidwaoex0s != null) {
                synchronized (r8lambdaiestuzy5cwwlk7mkepidwaoex0s) {
                    ThreadSafeHeapNode[] threadSafeHeapNodeArr = r8lambdaiestuzy5cwwlk7mkepidwaoex0s.RemoteActionCompatParcelizer;
                    threadSafeHeapNode = threadSafeHeapNodeArr != null ? threadSafeHeapNodeArr[0] : null;
                }
                DelayedTask delayedTask = (DelayedTask) threadSafeHeapNode;
                if (delayedTask != null) {
                    long jNanoTime = delayedTask.serializer - System.nanoTime();
                    if (jNanoTime >= 0) {
                        return jNanoTime;
                    }
                }
            }
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    public final void IconCompatParcelizer(long j, DelayedTask delayedTask) {
        Thread threadRemoteActionCompatParcelizer;
        int iSerializer = serializer(j, delayedTask);
        if (iSerializer == 0) {
            if (!write(delayedTask) || Thread.currentThread() == (threadRemoteActionCompatParcelizer = RemoteActionCompatParcelizer())) {
                return;
            }
            LockSupport.unpark(threadRemoteActionCompatParcelizer);
            return;
        }
        if (iSerializer == 1) {
            read(j, delayedTask);
        } else {
            if (iSerializer == 2) {
                return;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("unexpected result");
        }
    }

    @Override // o.isAnimatingClose
    public final void serializer(long j, CancellableContinuationImpl cancellableContinuationImpl) {
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j2 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            setOnBackInvokedCallback setonbackinvokedcallback = new setOnBackInvokedCallback(this, j2 + jNanoTime, cancellableContinuationImpl);
            IconCompatParcelizer(jNanoTime, setonbackinvokedcallback);
            cancellableContinuationImpl.IconCompatParcelizer((onTouchEnded) new setCloseButton(0, setonbackinvokedcallback));
        }
    }
}

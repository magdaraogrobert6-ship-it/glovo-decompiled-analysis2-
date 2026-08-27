package kotlinx.coroutines.internal;

import bo.app.af$$ExternalSyntheticOutline0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DefaultExecutorKt;
import kotlinx.coroutines.TimeoutKt;
import o.TextAnnouncementContentCardView;
import o.isAnimatingClose;
import o.r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc;
import o.setAndStartAnimation;

/* JADX INFO: loaded from: classes4.dex */
public final class LimitedDispatcher extends CoroutineDispatcher implements isAnimatingClose {
    public static final /* synthetic */ AtomicIntegerFieldUpdater serializer = AtomicIntegerFieldUpdater.newUpdater(LimitedDispatcher.class, "runningWorkers$volatile");
    public final /* synthetic */ isAnimatingClose IconCompatParcelizer;
    public final LockFreeTaskQueue MediaBrowserCompatMediaItem;
    public final Object MediaSessionCompatQueueItem;
    public final int RatingCompat;
    public final String RemoteActionCompatParcelizer;
    private volatile /* synthetic */ int runningWorkers$volatile;
    public final CoroutineDispatcher write;

    public final class Worker implements Runnable {
        public Runnable IconCompatParcelizer;

        @Override // java.lang.Runnable
        public final void run() {
            int i = 0;
            while (true) {
                try {
                    this.IconCompatParcelizer.run();
                } catch (Throwable th) {
                    TimeoutKt.read(r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write, th);
                }
                try {
                    LimitedDispatcher limitedDispatcher = LimitedDispatcher.this;
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = LimitedDispatcher.serializer;
                    Runnable runnable = limitedDispatcher.read();
                    if (runnable == null) {
                        return;
                    }
                    this.IconCompatParcelizer = runnable;
                    i++;
                    if (i >= 16) {
                        LimitedDispatcher limitedDispatcher2 = LimitedDispatcher.this;
                        if (DispatchedContinuationKt.write(limitedDispatcher2.write, limitedDispatcher2)) {
                            LimitedDispatcher limitedDispatcher3 = LimitedDispatcher.this;
                            DispatchedContinuationKt.write(limitedDispatcher3.write, limitedDispatcher3, this);
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    LimitedDispatcher limitedDispatcher4 = LimitedDispatcher.this;
                    synchronized (limitedDispatcher4.MediaSessionCompatQueueItem) {
                        LimitedDispatcher.serializer.decrementAndGet(limitedDispatcher4);
                        throw th2;
                    }
                }
            }
        }

        public Worker(Runnable runnable) {
            this.IconCompatParcelizer = runnable;
        }
    }

    public final boolean IconCompatParcelizer() {
        synchronized (this.MediaSessionCompatQueueItem) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = serializer;
            if (atomicIntegerFieldUpdater.get(this) >= this.RatingCompat) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatch(TextAnnouncementContentCardView textAnnouncementContentCardView, Runnable runnable) {
        Runnable runnable2;
        this.MediaBrowserCompatMediaItem.write(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = serializer;
        if (atomicIntegerFieldUpdater.get(this) >= this.RatingCompat || !IconCompatParcelizer() || (runnable2 = read()) == null) {
            return;
        }
        try {
            DispatchedContinuationKt.write(this.write, this, new Worker(runnable2));
        } catch (Throwable th) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th;
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatchYield(TextAnnouncementContentCardView textAnnouncementContentCardView, Runnable runnable) {
        Runnable runnable2;
        this.MediaBrowserCompatMediaItem.write(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = serializer;
        if (atomicIntegerFieldUpdater.get(this) >= this.RatingCompat || !IconCompatParcelizer() || (runnable2 = read()) == null) {
            return;
        }
        try {
            this.write.dispatchYield(this, new Worker(runnable2));
        } catch (Throwable th) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th;
        }
    }

    public final Runnable read() {
        while (true) {
            Runnable runnable = (Runnable) this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.MediaSessionCompatQueueItem) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = serializer;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.MediaBrowserCompatMediaItem.read() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // o.isAnimatingClose
    public final void serializer(long j, CancellableContinuationImpl cancellableContinuationImpl) {
        this.IconCompatParcelizer.serializer(j, cancellableContinuationImpl);
    }

    @Override // o.isAnimatingClose
    public final setAndStartAnimation write(long j, Runnable runnable, TextAnnouncementContentCardView textAnnouncementContentCardView) {
        return this.IconCompatParcelizer.write(j, runnable, textAnnouncementContentCardView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LimitedDispatcher(CoroutineDispatcher coroutineDispatcher, int i, String str) {
        isAnimatingClose isanimatingclose = coroutineDispatcher instanceof isAnimatingClose ? (isAnimatingClose) coroutineDispatcher : null;
        this.IconCompatParcelizer = isanimatingclose == null ? DefaultExecutorKt.write : isanimatingclose;
        this.write = coroutineDispatcher;
        this.RatingCompat = i;
        this.RemoteActionCompatParcelizer = str;
        this.MediaBrowserCompatMediaItem = new LockFreeTaskQueue();
        this.MediaSessionCompatQueueItem = new Object();
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final CoroutineDispatcher limitedParallelism(int i, String str) {
        LimitedDispatcherKt.RemoteActionCompatParcelizer(i);
        if (i >= this.RatingCompat) {
            return str != null ? new NamedDispatcher(this, str) : this;
        }
        return super.limitedParallelism(i, str);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        String str = this.RemoteActionCompatParcelizer;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.write);
        sb.append(".limitedParallelism(");
        return af$$ExternalSyntheticOutline0.m(sb, this.RatingCompat, ')');
    }
}

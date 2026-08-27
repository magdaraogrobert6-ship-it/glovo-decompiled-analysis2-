package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class IoScheduler extends Scheduler {
    public static final ThreadWorker MediaDescriptionCompat;
    public static final RxThreadFactory MediaSessionCompatQueueItem;
    public static final boolean RatingCompat;
    public static final long RemoteActionCompatParcelizer = Long.getLong("rx2.io-keep-alive-time", 60).longValue();
    public static final RxThreadFactory serializer;
    public static final CachedWorkerPool write;
    public final AtomicReference MediaBrowserCompatMediaItem;

    public static final class CachedWorkerPool implements Runnable {
        public final ScheduledExecutorService IconCompatParcelizer;
        public final ThreadFactory MediaSessionCompatQueueItem;
        public final ScheduledFuture RemoteActionCompatParcelizer;
        public final long read;
        public final CompositeDisposable serializer;
        public final ConcurrentLinkedQueue write;

        @Override // java.lang.Runnable
        public final void run() {
            ConcurrentLinkedQueue<ThreadWorker> concurrentLinkedQueue = this.write;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            long jNanoTime = System.nanoTime();
            for (ThreadWorker threadWorker : concurrentLinkedQueue) {
                if (threadWorker.write > jNanoTime) {
                    return;
                }
                if (concurrentLinkedQueue.remove(threadWorker)) {
                    this.serializer.serializer(threadWorker);
                }
            }
        }

        public CachedWorkerPool(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
            ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
            long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0L;
            this.read = nanos;
            this.write = new ConcurrentLinkedQueue();
            this.serializer = new CompositeDisposable();
            this.MediaSessionCompatQueueItem = threadFactory;
            if (timeUnit != null) {
                scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, IoScheduler.serializer);
                scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(this, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                scheduledExecutorServiceNewScheduledThreadPool = null;
                scheduledFutureScheduleWithFixedDelay = null;
            }
            this.IconCompatParcelizer = scheduledExecutorServiceNewScheduledThreadPool;
            this.RemoteActionCompatParcelizer = scheduledFutureScheduleWithFixedDelay;
        }
    }

    public static final class EventLoopWorker extends Scheduler.Worker implements Runnable {
        public final ThreadWorker RemoteActionCompatParcelizer;
        public final CachedWorkerPool read;
        public final AtomicBoolean write = new AtomicBoolean();
        public final CompositeDisposable serializer = new CompositeDisposable();

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.write.compareAndSet(false, true)) {
                this.serializer.dispose();
                if (IoScheduler.RatingCompat) {
                    this.RemoteActionCompatParcelizer.read(this, 0L, TimeUnit.NANOSECONDS, null);
                    return;
                }
                CachedWorkerPool cachedWorkerPool = this.read;
                cachedWorkerPool.getClass();
                long jNanoTime = System.nanoTime();
                long j = cachedWorkerPool.read;
                ThreadWorker threadWorker = this.RemoteActionCompatParcelizer;
                threadWorker.write = jNanoTime + j;
                cachedWorkerPool.write.offer(threadWorker);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.write.get();
        }

        @Override // io.reactivex.Scheduler.Worker
        public final Disposable read(Runnable runnable, long j, TimeUnit timeUnit) {
            return this.serializer.serializer ? EmptyDisposable.INSTANCE : this.RemoteActionCompatParcelizer.read(runnable, j, timeUnit, this.serializer);
        }

        @Override // java.lang.Runnable
        public final void run() {
            CachedWorkerPool cachedWorkerPool = this.read;
            cachedWorkerPool.getClass();
            long jNanoTime = System.nanoTime();
            long j = cachedWorkerPool.read;
            ThreadWorker threadWorker = this.RemoteActionCompatParcelizer;
            threadWorker.write = jNanoTime + j;
            cachedWorkerPool.write.offer(threadWorker);
        }

        public EventLoopWorker(CachedWorkerPool cachedWorkerPool) {
            ThreadWorker threadWorker;
            this.read = cachedWorkerPool;
            if (cachedWorkerPool.serializer.serializer) {
                threadWorker = IoScheduler.MediaDescriptionCompat;
            } else {
                while (!cachedWorkerPool.write.isEmpty()) {
                    ThreadWorker threadWorker2 = (ThreadWorker) cachedWorkerPool.write.poll();
                    if (threadWorker2 != null) {
                        threadWorker = threadWorker2;
                    }
                }
                ThreadWorker threadWorker3 = new ThreadWorker(cachedWorkerPool.MediaSessionCompatQueueItem);
                cachedWorkerPool.serializer.read(threadWorker3);
                threadWorker = threadWorker3;
            }
            this.RemoteActionCompatParcelizer = threadWorker;
        }
    }

    @Override // io.reactivex.Scheduler
    public final Scheduler.Worker write() {
        return new EventLoopWorker((CachedWorkerPool) this.MediaBrowserCompatMediaItem.get());
    }

    public static final class ThreadWorker extends NewThreadWorker {
        public long write;

        public ThreadWorker(ThreadFactory threadFactory) {
            super(threadFactory);
            this.write = 0L;
        }
    }

    static {
        ThreadWorker threadWorker = new ThreadWorker(new RxThreadFactory("RxCachedThreadSchedulerShutdown"));
        MediaDescriptionCompat = threadWorker;
        threadWorker.dispose();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxCachedThreadScheduler", iMax, false);
        MediaSessionCompatQueueItem = rxThreadFactory;
        serializer = new RxThreadFactory("RxCachedWorkerPoolEvictor", iMax, false);
        RatingCompat = Boolean.getBoolean("rx2.io-scheduled-release");
        CachedWorkerPool cachedWorkerPool = new CachedWorkerPool(0L, null, rxThreadFactory);
        write = cachedWorkerPool;
        cachedWorkerPool.serializer.dispose();
        ScheduledFuture scheduledFuture = cachedWorkerPool.RemoteActionCompatParcelizer;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = cachedWorkerPool.IconCompatParcelizer;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public IoScheduler() {
        CachedWorkerPool cachedWorkerPool = write;
        AtomicReference atomicReference = new AtomicReference(cachedWorkerPool);
        this.MediaBrowserCompatMediaItem = atomicReference;
        CachedWorkerPool cachedWorkerPool2 = new CachedWorkerPool(RemoteActionCompatParcelizer, TimeUnit.SECONDS, MediaSessionCompatQueueItem);
        while (!atomicReference.compareAndSet(cachedWorkerPool, cachedWorkerPool2)) {
            if (atomicReference.get() != cachedWorkerPool) {
                cachedWorkerPool2.serializer.dispose();
                ScheduledFuture scheduledFuture = cachedWorkerPool2.RemoteActionCompatParcelizer;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                }
                ScheduledExecutorService scheduledExecutorService = cachedWorkerPool2.IconCompatParcelizer;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    return;
                }
                return;
            }
        }
    }
}

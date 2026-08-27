package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.ListCompositeDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class ComputationScheduler extends Scheduler {
    public static final RxThreadFactory MediaDescriptionCompat;
    public static final int RemoteActionCompatParcelizer;
    public static final PoolWorker serializer;
    public static final FixedSchedulerPool write;
    public final AtomicReference MediaBrowserCompatMediaItem;

    public static final class EventLoopWorker extends Scheduler.Worker {
        public final ListCompositeDisposable IconCompatParcelizer;
        public final ListCompositeDisposable RemoteActionCompatParcelizer;
        public volatile boolean read;
        public final PoolWorker serializer;
        public final CompositeDisposable write;

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.read;
        }

        public EventLoopWorker(PoolWorker poolWorker) {
            this.serializer = poolWorker;
            ListCompositeDisposable listCompositeDisposable = new ListCompositeDisposable();
            this.RemoteActionCompatParcelizer = listCompositeDisposable;
            CompositeDisposable compositeDisposable = new CompositeDisposable();
            this.write = compositeDisposable;
            ListCompositeDisposable listCompositeDisposable2 = new ListCompositeDisposable();
            this.IconCompatParcelizer = listCompositeDisposable2;
            listCompositeDisposable2.read(listCompositeDisposable);
            listCompositeDisposable2.read(compositeDisposable);
        }

        @Override // io.reactivex.Scheduler.Worker
        public final Disposable IconCompatParcelizer(Runnable runnable) {
            return this.read ? EmptyDisposable.INSTANCE : this.serializer.read(runnable, 0L, TimeUnit.MILLISECONDS, this.RemoteActionCompatParcelizer);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.read) {
                return;
            }
            this.read = true;
            this.IconCompatParcelizer.dispose();
        }

        @Override // io.reactivex.Scheduler.Worker
        public final Disposable read(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.read) {
                return EmptyDisposable.INSTANCE;
            }
            return this.serializer.read(runnable, j, timeUnit, this.write);
        }
    }

    public static final class FixedSchedulerPool {
        public long IconCompatParcelizer;
        public final int read;
        public final PoolWorker[] write;

        public FixedSchedulerPool(int i, ThreadFactory threadFactory) {
            this.read = i;
            this.write = new PoolWorker[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.write[i2] = new PoolWorker(threadFactory);
            }
        }

        public final PoolWorker read() {
            int i = this.read;
            if (i == 0) {
                return ComputationScheduler.serializer;
            }
            long j = this.IconCompatParcelizer;
            this.IconCompatParcelizer = 1 + j;
            return this.write[(int) (j % ((long) i))];
        }
    }

    @Override // io.reactivex.Scheduler
    public final Disposable RemoteActionCompatParcelizer(Runnable runnable, long j, long j2) {
        PoolWorker poolWorker = ((FixedSchedulerPool) this.MediaBrowserCompatMediaItem.get()).read();
        ScheduledExecutorService scheduledExecutorService = poolWorker.read;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (j2 <= 0) {
            InstantPeriodicTask instantPeriodicTask = new InstantPeriodicTask(runnable, scheduledExecutorService);
            try {
                instantPeriodicTask.IconCompatParcelizer(j <= 0 ? scheduledExecutorService.submit(instantPeriodicTask) : scheduledExecutorService.schedule(instantPeriodicTask, j, timeUnit));
                return instantPeriodicTask;
            } catch (RejectedExecutionException e) {
                RxJavaPlugins.IconCompatParcelizer(e);
                return EmptyDisposable.INSTANCE;
            }
        }
        ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(runnable);
        try {
            scheduledDirectPeriodicTask.read(poolWorker.read.scheduleAtFixedRate(scheduledDirectPeriodicTask, j, j2, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (RejectedExecutionException e2) {
            RxJavaPlugins.IconCompatParcelizer(e2);
            return EmptyDisposable.INSTANCE;
        }
    }

    @Override // io.reactivex.Scheduler
    public final Disposable read(Runnable runnable, long j, TimeUnit timeUnit) {
        PoolWorker poolWorker = ((FixedSchedulerPool) this.MediaBrowserCompatMediaItem.get()).read();
        poolWorker.getClass();
        ObjectHelper.write(runnable, "run is null");
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(runnable);
        ScheduledExecutorService scheduledExecutorService = poolWorker.read;
        try {
            scheduledDirectTask.read(j <= 0 ? scheduledExecutorService.submit(scheduledDirectTask) : scheduledExecutorService.schedule(scheduledDirectTask, j, timeUnit));
            return scheduledDirectTask;
        } catch (RejectedExecutionException e) {
            RxJavaPlugins.IconCompatParcelizer(e);
            return EmptyDisposable.INSTANCE;
        }
    }

    @Override // io.reactivex.Scheduler
    public final Scheduler.Worker write() {
        return new EventLoopWorker(((FixedSchedulerPool) this.MediaBrowserCompatMediaItem.get()).read());
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        int iIntValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (iIntValue > 0 && iIntValue <= iAvailableProcessors) {
            iAvailableProcessors = iIntValue;
        }
        RemoteActionCompatParcelizer = iAvailableProcessors;
        PoolWorker poolWorker = new PoolWorker(new RxThreadFactory("RxComputationShutdown"));
        serializer = poolWorker;
        poolWorker.dispose();
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        MediaDescriptionCompat = rxThreadFactory;
        FixedSchedulerPool fixedSchedulerPool = new FixedSchedulerPool(0, rxThreadFactory);
        write = fixedSchedulerPool;
        for (PoolWorker poolWorker2 : fixedSchedulerPool.write) {
            poolWorker2.dispose();
        }
    }

    public ComputationScheduler() {
        FixedSchedulerPool fixedSchedulerPool = write;
        AtomicReference atomicReference = new AtomicReference(fixedSchedulerPool);
        this.MediaBrowserCompatMediaItem = atomicReference;
        FixedSchedulerPool fixedSchedulerPool2 = new FixedSchedulerPool(RemoteActionCompatParcelizer, MediaDescriptionCompat);
        while (!atomicReference.compareAndSet(fixedSchedulerPool, fixedSchedulerPool2)) {
            if (atomicReference.get() != fixedSchedulerPool) {
                for (PoolWorker poolWorker : fixedSchedulerPool2.write) {
                    poolWorker.dispose();
                }
                return;
            }
        }
    }

    public static final class PoolWorker extends NewThreadWorker {
        public PoolWorker(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }
}

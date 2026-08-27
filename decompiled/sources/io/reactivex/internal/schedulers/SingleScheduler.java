package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class SingleScheduler extends Scheduler {
    public static final ScheduledExecutorService RemoteActionCompatParcelizer;
    public static final RxThreadFactory serializer;
    public final AtomicReference write;

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(0);
        RemoteActionCompatParcelizer = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.shutdown();
        serializer = new RxThreadFactory("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public static final class ScheduledWorker extends Scheduler.Worker {
        public final ScheduledExecutorService IconCompatParcelizer;
        public final CompositeDisposable RemoteActionCompatParcelizer = new CompositeDisposable();
        public volatile boolean read;

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.read;
        }

        public ScheduledWorker(ScheduledExecutorService scheduledExecutorService) {
            this.IconCompatParcelizer = scheduledExecutorService;
        }

        @Override // io.reactivex.Scheduler.Worker
        public final Disposable read(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.read) {
                return EmptyDisposable.INSTANCE;
            }
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(runnable, this.RemoteActionCompatParcelizer);
            this.RemoteActionCompatParcelizer.read(scheduledRunnable);
            ScheduledExecutorService scheduledExecutorService = this.IconCompatParcelizer;
            try {
                scheduledRunnable.write(j <= 0 ? scheduledExecutorService.submit((Callable) scheduledRunnable) : scheduledExecutorService.schedule((Callable) scheduledRunnable, j, timeUnit));
                return scheduledRunnable;
            } catch (RejectedExecutionException e) {
                dispose();
                RxJavaPlugins.IconCompatParcelizer(e);
                return EmptyDisposable.INSTANCE;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.read) {
                return;
            }
            this.read = true;
            this.RemoteActionCompatParcelizer.dispose();
        }
    }

    @Override // io.reactivex.Scheduler
    public final Scheduler.Worker write() {
        return new ScheduledWorker((ScheduledExecutorService) this.write.get());
    }

    @Override // io.reactivex.Scheduler
    public final Disposable RemoteActionCompatParcelizer(Runnable runnable, long j, long j2) {
        Future futureSchedule;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        AtomicReference atomicReference = this.write;
        if (j2 <= 0) {
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) atomicReference.get();
            InstantPeriodicTask instantPeriodicTask = new InstantPeriodicTask(runnable, scheduledExecutorService);
            try {
                if (j <= 0) {
                    futureSchedule = scheduledExecutorService.submit(instantPeriodicTask);
                } else {
                    futureSchedule = scheduledExecutorService.schedule(instantPeriodicTask, j, timeUnit);
                }
                instantPeriodicTask.IconCompatParcelizer(futureSchedule);
                return instantPeriodicTask;
            } catch (RejectedExecutionException e) {
                RxJavaPlugins.IconCompatParcelizer(e);
                return EmptyDisposable.INSTANCE;
            }
        }
        ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(runnable);
        try {
            scheduledDirectPeriodicTask.read(((ScheduledExecutorService) atomicReference.get()).scheduleAtFixedRate(scheduledDirectPeriodicTask, j, j2, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (RejectedExecutionException e2) {
            RxJavaPlugins.IconCompatParcelizer(e2);
            return EmptyDisposable.INSTANCE;
        }
    }

    public SingleScheduler() {
        AtomicReference atomicReference = new AtomicReference();
        this.write = atomicReference;
        boolean z = SchedulerPoolFactory.write;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, serializer);
        if (SchedulerPoolFactory.write && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            SchedulerPoolFactory.RemoteActionCompatParcelizer.put((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool, scheduledExecutorServiceNewScheduledThreadPool);
        }
        atomicReference.lazySet(scheduledExecutorServiceNewScheduledThreadPool);
    }

    @Override // io.reactivex.Scheduler
    public final Disposable read(Runnable runnable, long j, TimeUnit timeUnit) {
        Future futureSchedule;
        ObjectHelper.write(runnable, "run is null");
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(runnable);
        AtomicReference atomicReference = this.write;
        try {
            if (j <= 0) {
                futureSchedule = ((ScheduledExecutorService) atomicReference.get()).submit(scheduledDirectTask);
            } else {
                futureSchedule = ((ScheduledExecutorService) atomicReference.get()).schedule(scheduledDirectTask, j, timeUnit);
            }
            scheduledDirectTask.read(futureSchedule);
            return scheduledDirectTask;
        } catch (RejectedExecutionException e) {
            RxJavaPlugins.IconCompatParcelizer(e);
            return EmptyDisposable.INSTANCE;
        }
    }
}

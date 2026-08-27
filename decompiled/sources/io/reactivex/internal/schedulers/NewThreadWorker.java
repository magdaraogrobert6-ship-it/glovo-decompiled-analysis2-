package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableContainer;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class NewThreadWorker extends Scheduler.Worker {
    public volatile boolean IconCompatParcelizer;
    public final ScheduledExecutorService read;

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.IconCompatParcelizer;
    }

    public final ScheduledRunnable read(Runnable runnable, long j, TimeUnit timeUnit, DisposableContainer disposableContainer) {
        ScheduledRunnable scheduledRunnable = new ScheduledRunnable(runnable, disposableContainer);
        if (disposableContainer != null && !disposableContainer.read(scheduledRunnable)) {
            return scheduledRunnable;
        }
        ScheduledExecutorService scheduledExecutorService = this.read;
        try {
            scheduledRunnable.write(j <= 0 ? scheduledExecutorService.submit((Callable) scheduledRunnable) : scheduledExecutorService.schedule((Callable) scheduledRunnable, j, timeUnit));
            return scheduledRunnable;
        } catch (RejectedExecutionException e) {
            if (disposableContainer != null) {
                disposableContainer.serializer(scheduledRunnable);
            }
            RxJavaPlugins.IconCompatParcelizer(e);
            return scheduledRunnable;
        }
    }

    public NewThreadWorker(ThreadFactory threadFactory) {
        boolean z = SchedulerPoolFactory.write;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (SchedulerPoolFactory.write && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            SchedulerPoolFactory.RemoteActionCompatParcelizer.put((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool, scheduledExecutorServiceNewScheduledThreadPool);
        }
        this.read = scheduledExecutorServiceNewScheduledThreadPool;
    }

    @Override // io.reactivex.Scheduler.Worker
    public final Disposable read(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.IconCompatParcelizer ? EmptyDisposable.INSTANCE : read(runnable, j, timeUnit, null);
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        if (this.IconCompatParcelizer) {
            return;
        }
        this.IconCompatParcelizer = true;
        this.read.shutdownNow();
    }

    @Override // io.reactivex.Scheduler.Worker
    public final Disposable IconCompatParcelizer(Runnable runnable) {
        return read(runnable, 0L, null);
    }
}

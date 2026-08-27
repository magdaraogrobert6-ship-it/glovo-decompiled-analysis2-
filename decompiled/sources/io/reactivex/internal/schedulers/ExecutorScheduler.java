package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class ExecutorScheduler extends Scheduler {
    public static final Scheduler serializer = Schedulers.serializer;
    public final Executor RemoteActionCompatParcelizer;

    public final class DelayedDispose implements Runnable {
        public final DelayedRunnable serializer;

        @Override // java.lang.Runnable
        public final void run() {
            DelayedRunnable delayedRunnable = this.serializer;
            SequentialDisposable sequentialDisposable = delayedRunnable.IconCompatParcelizer;
            Disposable disposable = ExecutorScheduler.this.read(delayedRunnable);
            sequentialDisposable.getClass();
            DisposableHelper.replace(sequentialDisposable, disposable);
        }

        public DelayedDispose(DelayedRunnable delayedRunnable) {
            this.serializer = delayedRunnable;
        }
    }

    public static final class DelayedRunnable extends AtomicReference<Runnable> implements Runnable, Disposable {
        public final SequentialDisposable IconCompatParcelizer;
        public final SequentialDisposable serializer;

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (getAndSet(null) != null) {
                SequentialDisposable sequentialDisposable = this.serializer;
                sequentialDisposable.getClass();
                DisposableHelper.dispose(sequentialDisposable);
                SequentialDisposable sequentialDisposable2 = this.IconCompatParcelizer;
                sequentialDisposable2.getClass();
                DisposableHelper.dispose(sequentialDisposable2);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return get() == null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SequentialDisposable sequentialDisposable = this.IconCompatParcelizer;
            SequentialDisposable sequentialDisposable2 = this.serializer;
            Runnable runnable = get();
            if (runnable != null) {
                try {
                    runnable.run();
                    lazySet(null);
                    sequentialDisposable2.lazySet(DisposableHelper.DISPOSED);
                } finally {
                    lazySet(null);
                    sequentialDisposable2.lazySet(DisposableHelper.DISPOSED);
                    sequentialDisposable.lazySet(DisposableHelper.DISPOSED);
                }
            }
        }

        public DelayedRunnable(Runnable runnable) {
            super(runnable);
            this.serializer = new SequentialDisposable();
            this.IconCompatParcelizer = new SequentialDisposable();
        }
    }

    public static final class ExecutorWorker extends Scheduler.Worker implements Runnable {
        public volatile boolean IconCompatParcelizer;
        public final Executor RemoteActionCompatParcelizer;
        public final AtomicInteger read = new AtomicInteger();
        public final CompositeDisposable write = new CompositeDisposable();
        public final MpscLinkedQueue serializer = new MpscLinkedQueue();

        public final class SequentialDispose implements Runnable {
            public final SequentialDisposable serializer;
            public final Runnable write;

            @Override // java.lang.Runnable
            public final void run() {
                DisposableHelper.replace(this.serializer, ExecutorWorker.this.IconCompatParcelizer(this.write));
            }

            public SequentialDispose(SequentialDisposable sequentialDisposable, Runnable runnable) {
                this.serializer = sequentialDisposable;
                this.write = runnable;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.IconCompatParcelizer;
        }

        public static final class BooleanRunnable extends AtomicBoolean implements Runnable, Disposable {
            public final Runnable IconCompatParcelizer;

            @Override // io.reactivex.disposables.Disposable
            public final void dispose() {
                lazySet(true);
            }

            @Override // io.reactivex.disposables.Disposable
            public final boolean isDisposed() {
                return get();
            }

            public BooleanRunnable(Runnable runnable) {
                this.IconCompatParcelizer = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (get()) {
                    return;
                }
                try {
                    this.IconCompatParcelizer.run();
                } finally {
                    lazySet(true);
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            MpscLinkedQueue mpscLinkedQueue = this.serializer;
            int iAddAndGet = 1;
            while (!this.IconCompatParcelizer) {
                while (true) {
                    Runnable runnable = (Runnable) mpscLinkedQueue.poll();
                    if (runnable == null) {
                        break;
                    }
                    runnable.run();
                    if (this.IconCompatParcelizer) {
                        mpscLinkedQueue.clear();
                        return;
                    }
                }
                if (this.IconCompatParcelizer) {
                    mpscLinkedQueue.clear();
                    return;
                } else {
                    iAddAndGet = this.read.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            mpscLinkedQueue.clear();
        }

        public ExecutorWorker(Executor executor) {
            this.RemoteActionCompatParcelizer = executor;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.IconCompatParcelizer) {
                return;
            }
            this.IconCompatParcelizer = true;
            this.write.dispose();
            if (this.read.getAndIncrement() == 0) {
                this.serializer.clear();
            }
        }

        @Override // io.reactivex.Scheduler.Worker
        public final Disposable read(Runnable runnable, long j, TimeUnit timeUnit) {
            if (j <= 0) {
                return IconCompatParcelizer(runnable);
            }
            if (this.IconCompatParcelizer) {
                return EmptyDisposable.INSTANCE;
            }
            SequentialDisposable sequentialDisposable = new SequentialDisposable();
            SequentialDisposable sequentialDisposable2 = new SequentialDisposable(sequentialDisposable);
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(new SequentialDispose(sequentialDisposable2, runnable), this.write);
            this.write.read(scheduledRunnable);
            Executor executor = this.RemoteActionCompatParcelizer;
            if (executor instanceof ScheduledExecutorService) {
                try {
                    scheduledRunnable.write(((ScheduledExecutorService) executor).schedule((Callable) scheduledRunnable, j, timeUnit));
                } catch (RejectedExecutionException e) {
                    this.IconCompatParcelizer = true;
                    RxJavaPlugins.IconCompatParcelizer(e);
                    return EmptyDisposable.INSTANCE;
                }
            } else {
                scheduledRunnable.write(new DisposeOnCancel(ExecutorScheduler.serializer.read(scheduledRunnable, j, timeUnit)));
            }
            DisposableHelper.replace(sequentialDisposable, scheduledRunnable);
            return sequentialDisposable2;
        }

        @Override // io.reactivex.Scheduler.Worker
        public final Disposable IconCompatParcelizer(Runnable runnable) {
            if (this.IconCompatParcelizer) {
                return EmptyDisposable.INSTANCE;
            }
            BooleanRunnable booleanRunnable = new BooleanRunnable(runnable);
            this.serializer.offer(booleanRunnable);
            if (this.read.getAndIncrement() != 0) {
                return booleanRunnable;
            }
            try {
                this.RemoteActionCompatParcelizer.execute(this);
                return booleanRunnable;
            } catch (RejectedExecutionException e) {
                this.IconCompatParcelizer = true;
                this.serializer.clear();
                RxJavaPlugins.IconCompatParcelizer(e);
                return EmptyDisposable.INSTANCE;
            }
        }
    }

    @Override // io.reactivex.Scheduler
    public final Disposable RemoteActionCompatParcelizer(Runnable runnable, long j, long j2) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Executor executor = this.RemoteActionCompatParcelizer;
        if (!(executor instanceof ScheduledExecutorService)) {
            return super.RemoteActionCompatParcelizer(runnable, j, j2);
        }
        try {
            ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(runnable, 0);
            scheduledDirectPeriodicTask.read(((ScheduledExecutorService) executor).scheduleAtFixedRate(scheduledDirectPeriodicTask, j, j2, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (RejectedExecutionException e) {
            RxJavaPlugins.IconCompatParcelizer(e);
            return EmptyDisposable.INSTANCE;
        }
    }

    @Override // io.reactivex.Scheduler
    public final Disposable read(Runnable runnable, long j, TimeUnit timeUnit) {
        ObjectHelper.write(runnable, "run is null");
        Executor executor = this.RemoteActionCompatParcelizer;
        if (executor instanceof ScheduledExecutorService) {
            try {
                ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(runnable, 0);
                scheduledDirectTask.read(((ScheduledExecutorService) executor).schedule(scheduledDirectTask, j, timeUnit));
                return scheduledDirectTask;
            } catch (RejectedExecutionException e) {
                RxJavaPlugins.IconCompatParcelizer(e);
                return EmptyDisposable.INSTANCE;
            }
        }
        DelayedRunnable delayedRunnable = new DelayedRunnable(runnable);
        Disposable disposable = serializer.read(new DelayedDispose(delayedRunnable), j, timeUnit);
        SequentialDisposable sequentialDisposable = delayedRunnable.serializer;
        sequentialDisposable.getClass();
        DisposableHelper.replace(sequentialDisposable, disposable);
        return delayedRunnable;
    }

    @Override // io.reactivex.Scheduler
    public final Scheduler.Worker write() {
        return new ExecutorWorker(this.RemoteActionCompatParcelizer);
    }

    public ExecutorScheduler(Executor executor) {
        this.RemoteActionCompatParcelizer = executor;
    }

    @Override // io.reactivex.Scheduler
    public final Disposable read(Runnable runnable) {
        Executor executor = this.RemoteActionCompatParcelizer;
        ObjectHelper.write(runnable, "run is null");
        try {
            if (executor instanceof ExecutorService) {
                ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(runnable, 0);
                scheduledDirectTask.read(((ExecutorService) executor).submit(scheduledDirectTask));
                return scheduledDirectTask;
            }
            ExecutorWorker.BooleanRunnable booleanRunnable = new ExecutorWorker.BooleanRunnable(runnable);
            executor.execute(booleanRunnable);
            return booleanRunnable;
        } catch (RejectedExecutionException e) {
            RxJavaPlugins.IconCompatParcelizer(e);
            return EmptyDisposable.INSTANCE;
        }
    }
}

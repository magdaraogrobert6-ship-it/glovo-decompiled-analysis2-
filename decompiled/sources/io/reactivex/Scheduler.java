package io.reactivex;

import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.schedulers.NewThreadWorker;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Scheduler {
    public static final boolean IconCompatParcelizer = Boolean.getBoolean("rx2.scheduler.use-nanotime");
    public static final long read = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    public static final class DisposeTask implements Disposable, Runnable {
        public Thread IconCompatParcelizer;
        public final Worker read;
        public final Runnable serializer;

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.IconCompatParcelizer == Thread.currentThread()) {
                Worker worker = this.read;
                if (worker instanceof NewThreadWorker) {
                    NewThreadWorker newThreadWorker = (NewThreadWorker) worker;
                    if (newThreadWorker.IconCompatParcelizer) {
                        return;
                    }
                    newThreadWorker.IconCompatParcelizer = true;
                    newThreadWorker.read.shutdown();
                    return;
                }
            }
            this.read.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.read.isDisposed();
        }

        public DisposeTask(Runnable runnable, Worker worker) {
            this.serializer = runnable;
            this.read = worker;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.IconCompatParcelizer = Thread.currentThread();
            try {
                this.serializer.run();
            } finally {
                dispose();
                this.IconCompatParcelizer = null;
            }
        }
    }

    public static abstract class Worker implements Disposable {

        public final class PeriodicTask implements Runnable {
            public final Runnable IconCompatParcelizer;
            public long MediaDescriptionCompat;
            public long RemoteActionCompatParcelizer;
            public long read;
            public final long serializer;
            public final SequentialDisposable write;

            @Override // java.lang.Runnable
            public final void run() {
                long j;
                this.IconCompatParcelizer.run();
                SequentialDisposable sequentialDisposable = this.write;
                if (sequentialDisposable.isDisposed()) {
                    return;
                }
                Worker worker = Worker.this;
                worker.getClass();
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                long j2 = Worker.read(timeUnit);
                long j3 = Scheduler.read;
                long j4 = this.RemoteActionCompatParcelizer;
                long j5 = this.serializer;
                if (j2 + j3 < j4 || j2 >= j4 + j5 + j3) {
                    j = j2 + j5;
                    long j6 = this.read + 1;
                    this.read = j6;
                    this.MediaDescriptionCompat = j - (j5 * j6);
                } else {
                    long j7 = this.MediaDescriptionCompat;
                    long j8 = this.read + 1;
                    this.read = j8;
                    j = (j8 * j5) + j7;
                }
                this.RemoteActionCompatParcelizer = j2;
                DisposableHelper.replace(sequentialDisposable, worker.read(this, j - j2, timeUnit));
            }

            public PeriodicTask(long j, Runnable runnable, long j2, SequentialDisposable sequentialDisposable, long j3) {
                this.IconCompatParcelizer = runnable;
                this.write = sequentialDisposable;
                this.serializer = j3;
                this.RemoteActionCompatParcelizer = j2;
                this.MediaDescriptionCompat = j;
            }
        }

        public abstract Disposable read(Runnable runnable, long j, TimeUnit timeUnit);

        public Disposable IconCompatParcelizer(Runnable runnable) {
            return read(runnable, 0L, TimeUnit.NANOSECONDS);
        }

        public static long read(TimeUnit timeUnit) {
            return !Scheduler.IconCompatParcelizer ? timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS) : timeUnit.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
        }

        public final Disposable RemoteActionCompatParcelizer(Runnable runnable, long j, long j2) {
            SequentialDisposable sequentialDisposable = new SequentialDisposable();
            SequentialDisposable sequentialDisposable2 = new SequentialDisposable(sequentialDisposable);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long nanos = timeUnit.toNanos(j2);
            long j3 = read(TimeUnit.NANOSECONDS);
            Disposable disposable = read(new PeriodicTask(timeUnit.toNanos(j) + j3, runnable, j3, sequentialDisposable2, nanos), j, timeUnit);
            if (disposable == EmptyDisposable.INSTANCE) {
                return disposable;
            }
            DisposableHelper.replace(sequentialDisposable, disposable);
            return sequentialDisposable2;
        }
    }

    public abstract Worker write();

    public static final class PeriodicDirectTask implements Disposable, Runnable {
        public volatile boolean RemoteActionCompatParcelizer;
        public final Worker read;
        public final Runnable write;

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.RemoteActionCompatParcelizer = true;
            this.read.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.RemoteActionCompatParcelizer;
        }

        public PeriodicDirectTask(Runnable runnable, Worker worker) {
            this.write = runnable;
            this.read = worker;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.RemoteActionCompatParcelizer) {
                return;
            }
            try {
                this.write.run();
            } catch (Throwable th) {
                Exceptions.read(th);
                this.read.dispose();
                throw ExceptionHelper.write(th);
            }
        }
    }

    public Disposable RemoteActionCompatParcelizer(Runnable runnable, long j, long j2) {
        Worker workerWrite = write();
        PeriodicDirectTask periodicDirectTask = new PeriodicDirectTask(runnable, workerWrite);
        Disposable disposableRemoteActionCompatParcelizer = workerWrite.RemoteActionCompatParcelizer(periodicDirectTask, j, j2);
        return disposableRemoteActionCompatParcelizer == EmptyDisposable.INSTANCE ? disposableRemoteActionCompatParcelizer : periodicDirectTask;
    }

    public Disposable read(Runnable runnable, long j, TimeUnit timeUnit) {
        Worker workerWrite = write();
        ObjectHelper.write(runnable, "run is null");
        DisposeTask disposeTask = new DisposeTask(runnable, workerWrite);
        workerWrite.read(disposeTask, j, timeUnit);
        return disposeTask;
    }

    public Disposable read(Runnable runnable) {
        return read(runnable, 0L, TimeUnit.NANOSECONDS);
    }
}

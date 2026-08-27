package io.reactivex.internal.schedulers;

import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
final class InstantPeriodicTask implements Callable<Void>, Disposable {
    public static final FutureTask RemoteActionCompatParcelizer = new FutureTask(Functions.write, null);
    public final Runnable MediaSessionCompatQueueItem;
    public final ExecutorService serializer;
    public Thread write;
    public final AtomicReference read = new AtomicReference();
    public final AtomicReference IconCompatParcelizer = new AtomicReference();

    public final void IconCompatParcelizer(Future future) {
        while (true) {
            AtomicReference atomicReference = this.read;
            Future future2 = (Future) atomicReference.get();
            if (future2 == RemoteActionCompatParcelizer) {
                future.cancel(this.write != Thread.currentThread());
                return;
            } else {
                while (!atomicReference.compareAndSet(future2, future)) {
                    if (atomicReference.get() != future2) {
                    }
                }
                return;
            }
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        AtomicReference atomicReference = this.read;
        FutureTask futureTask = RemoteActionCompatParcelizer;
        Future future = (Future) atomicReference.getAndSet(futureTask);
        if (future != null && future != futureTask) {
            future.cancel(this.write != Thread.currentThread());
        }
        Future future2 = (Future) this.IconCompatParcelizer.getAndSet(futureTask);
        if (future2 == null || future2 == futureTask) {
            return;
        }
        future2.cancel(this.write != Thread.currentThread());
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.read.get() == RemoteActionCompatParcelizer;
    }

    public InstantPeriodicTask(Runnable runnable, ScheduledExecutorService scheduledExecutorService) {
        this.MediaSessionCompatQueueItem = runnable;
        this.serializer = scheduledExecutorService;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() {
        this.write = Thread.currentThread();
        try {
            this.MediaSessionCompatQueueItem.run();
            Future futureSubmit = this.serializer.submit(this);
            AtomicReference atomicReference = this.IconCompatParcelizer;
            loop0: while (true) {
                Future future = (Future) atomicReference.get();
                if (future == RemoteActionCompatParcelizer) {
                    futureSubmit.cancel(this.write != Thread.currentThread());
                    break;
                }
                do {
                    if (atomicReference.compareAndSet(future, futureSubmit)) {
                        break loop0;
                    }
                } while (atomicReference.get() == future);
            }
            this.write = null;
            return null;
        } catch (Throwable th) {
            this.write = null;
            RxJavaPlugins.IconCompatParcelizer(th);
            return null;
        }
    }
}

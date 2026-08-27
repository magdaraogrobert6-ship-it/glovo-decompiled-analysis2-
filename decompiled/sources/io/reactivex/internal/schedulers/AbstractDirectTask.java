package io.reactivex.internal.schedulers;

import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractDirectTask extends AtomicReference<Future<?>> implements Disposable {
    public static final FutureTask serializer;
    public static final FutureTask write;
    public Thread IconCompatParcelizer;
    public final Runnable read;

    static {
        Runnable runnable = Functions.write;
        write = new FutureTask(runnable, null);
        serializer = new FutureTask(runnable, null);
    }

    public AbstractDirectTask(Runnable runnable) {
        this.read = runnable;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        FutureTask futureTask;
        Future<?> future = get();
        if (future == write || future == (futureTask = serializer) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.IconCompatParcelizer != Thread.currentThread());
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        Future<?> future = get();
        return future == write || future == serializer;
    }

    public final void read(Future future) {
        Future<?> future2;
        do {
            future2 = get();
            if (future2 == write) {
                return;
            }
            if (future2 == serializer) {
                future.cancel(this.IconCompatParcelizer != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }
}

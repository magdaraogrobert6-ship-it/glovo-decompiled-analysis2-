package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.internal.fuseable.QueueDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class ObservableScalarXMap$ScalarDisposable<T> extends AtomicInteger implements QueueDisposable<T>, Runnable {
    public final Observer RemoteActionCompatParcelizer;
    public final Object write;

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        lazySet(3);
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        set(3);
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return get() == 3;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return get() != 1;
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    public final int requestFusion(int i) {
        lazySet(1);
        return 1;
    }

    public ObservableScalarXMap$ScalarDisposable(Object obj, Observer observer) {
        this.RemoteActionCompatParcelizer = observer;
        this.write = obj;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() {
        if (get() != 1) {
            return null;
        }
        lazySet(3);
        return this.write;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get() == 0 && compareAndSet(0, 2)) {
            Object obj = this.write;
            Observer observer = this.RemoteActionCompatParcelizer;
            observer.onNext(obj);
            if (get() == 2) {
                lazySet(3);
                observer.onComplete();
            }
        }
    }
}

package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BasicFuseableObserver<T, R> implements Observer<T>, QueueDisposable<R> {
    public final Observer IconCompatParcelizer;
    public Disposable RemoteActionCompatParcelizer;
    public boolean read;
    public QueueDisposable write;

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        this.write.clear();
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.RemoteActionCompatParcelizer.dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.RemoteActionCompatParcelizer.isDisposed();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return this.write.isEmpty();
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.RemoteActionCompatParcelizer, disposable)) {
            this.RemoteActionCompatParcelizer = disposable;
            if (disposable instanceof QueueDisposable) {
                this.write = (QueueDisposable) disposable;
            }
            this.IconCompatParcelizer.onSubscribe(this);
        }
    }

    public BasicFuseableObserver(Observer observer) {
        this.IconCompatParcelizer = observer;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        if (this.read) {
            RxJavaPlugins.IconCompatParcelizer(th);
        } else {
            this.read = true;
            this.IconCompatParcelizer.onError(th);
        }
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        if (this.read) {
            return;
        }
        this.read = true;
        this.IconCompatParcelizer.onComplete();
    }
}

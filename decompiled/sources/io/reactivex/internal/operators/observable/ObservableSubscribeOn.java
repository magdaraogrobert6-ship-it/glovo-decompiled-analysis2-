package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class ObservableSubscribeOn<T> extends AbstractObservableWithUpstream<T, T> {
    public final Scheduler IconCompatParcelizer;

    public static final class SubscribeOnObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {
        public final AtomicReference read = new AtomicReference();
        public final Observer write;

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this.read);
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.write.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            this.write.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            this.write.onNext(obj);
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.read, disposable);
        }

        public SubscribeOnObserver(Observer observer) {
            this.write = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }
    }

    public final class SubscribeTask implements Runnable {
        public final SubscribeOnObserver serializer;

        @Override // java.lang.Runnable
        public final void run() {
            ObservableSubscribeOn.this.read.subscribe(this.serializer);
        }

        public SubscribeTask(SubscribeOnObserver subscribeOnObserver) {
            this.serializer = subscribeOnObserver;
        }
    }

    @Override // io.reactivex.Observable
    public final void read(Observer observer) {
        SubscribeOnObserver subscribeOnObserver = new SubscribeOnObserver(observer);
        observer.onSubscribe(subscribeOnObserver);
        DisposableHelper.setOnce(subscribeOnObserver, this.IconCompatParcelizer.read(new SubscribeTask(subscribeOnObserver)));
    }

    public ObservableSubscribeOn(Observable observable, Scheduler scheduler) {
        super(observable);
        this.IconCompatParcelizer = scheduler;
    }
}

package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class ObservableUnsubscribeOn<T> extends AbstractObservableWithUpstream<T, T> {
    public final Scheduler serializer;

    public static final class UnsubscribeObserver<T> extends AtomicBoolean implements Observer<T>, Disposable {
        public final Scheduler IconCompatParcelizer;
        public final Observer read;
        public Disposable write;

        public final class DisposeTask implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                UnsubscribeObserver.this.write.dispose();
            }

            public DisposeTask() {
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return get();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (compareAndSet(false, true)) {
                this.IconCompatParcelizer.read(new DisposeTask());
            }
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.write, disposable)) {
                this.write = disposable;
                this.read.onSubscribe(this);
            }
        }

        public UnsubscribeObserver(Observer observer, Scheduler scheduler) {
            this.read = observer;
            this.IconCompatParcelizer = scheduler;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (get()) {
                return;
            }
            this.read.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            if (get()) {
                RxJavaPlugins.IconCompatParcelizer(th);
            } else {
                this.read.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (get()) {
                return;
            }
            this.read.onNext(obj);
        }
    }

    @Override // io.reactivex.Observable
    public final void read(Observer observer) {
        this.read.subscribe(new UnsubscribeObserver(observer, this.serializer));
    }

    public ObservableUnsubscribeOn(ObservableObserveOn observableObserveOn, Scheduler scheduler) {
        super(observableObserveOn);
        this.serializer = scheduler;
    }
}

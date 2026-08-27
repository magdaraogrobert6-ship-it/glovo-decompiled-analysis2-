package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.SerializedObserver;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class ObservableDelay<T> extends AbstractObservableWithUpstream<T, T> {
    public final Scheduler serializer;

    public static final class DelayObserver<T> implements Observer<T>, Disposable {
        public Disposable RemoteActionCompatParcelizer;
        public final Scheduler.Worker read;
        public final Observer serializer;

        public final class OnComplete implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                DelayObserver delayObserver = DelayObserver.this;
                Scheduler.Worker worker = delayObserver.read;
                try {
                    delayObserver.serializer.onComplete();
                } finally {
                    worker.dispose();
                }
            }

            public OnComplete() {
            }
        }

        public final class OnError implements Runnable {
            public final Throwable read;

            @Override // java.lang.Runnable
            public final void run() {
                DelayObserver delayObserver = DelayObserver.this;
                Scheduler.Worker worker = delayObserver.read;
                try {
                    delayObserver.serializer.onError(this.read);
                } finally {
                    worker.dispose();
                }
            }

            public OnError(Throwable th) {
                this.read = th;
            }
        }

        public final class OnNext implements Runnable {
            public final Object read;

            @Override // java.lang.Runnable
            public final void run() {
                DelayObserver.this.serializer.onNext(this.read);
            }

            public OnNext(Object obj) {
                this.read = obj;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.RemoteActionCompatParcelizer.dispose();
            this.read.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.read.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.read.read(new OnComplete(), 10L, TimeUnit.SECONDS);
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            this.read.read(new OnError(th), 0L, TimeUnit.SECONDS);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            this.read.read(new OnNext(obj), 10L, TimeUnit.SECONDS);
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.RemoteActionCompatParcelizer, disposable)) {
                this.RemoteActionCompatParcelizer = disposable;
                this.serializer.onSubscribe(this);
            }
        }

        public DelayObserver(Observer observer, Scheduler.Worker worker) {
            this.serializer = observer;
            this.read = worker;
        }
    }

    @Override // io.reactivex.Observable
    public final void read(Observer observer) {
        this.read.subscribe(new DelayObserver(new SerializedObserver(observer), this.serializer.write()));
    }

    public ObservableDelay(ObservableJust observableJust, Scheduler scheduler) {
        super(observableJust);
        this.serializer = scheduler;
    }
}

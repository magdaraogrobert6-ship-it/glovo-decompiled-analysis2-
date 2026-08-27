package io.reactivex.internal.operators.single;

import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class SingleSubscribeOn<T> extends Single<T> {
    public final Single IconCompatParcelizer;
    public final Scheduler read;

    public static final class SubscribeOnObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable, Runnable {
        public final Single IconCompatParcelizer;
        public final SequentialDisposable RemoteActionCompatParcelizer = new SequentialDisposable();
        public final SingleObserver serializer;

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th) {
            this.serializer.onError(th);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            this.serializer.onSuccess(obj);
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.IconCompatParcelizer.subscribe(this);
        }

        public SubscribeOnObserver(Single single, SingleObserver singleObserver) {
            this.serializer = singleObserver;
            this.IconCompatParcelizer = single;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
            SequentialDisposable sequentialDisposable = this.RemoteActionCompatParcelizer;
            sequentialDisposable.getClass();
            DisposableHelper.dispose(sequentialDisposable);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }
    }

    @Override // io.reactivex.Single
    public final void IconCompatParcelizer(SingleObserver singleObserver) {
        SubscribeOnObserver subscribeOnObserver = new SubscribeOnObserver(this.IconCompatParcelizer, singleObserver);
        singleObserver.onSubscribe(subscribeOnObserver);
        Disposable disposable = this.read.read(subscribeOnObserver);
        SequentialDisposable sequentialDisposable = subscribeOnObserver.RemoteActionCompatParcelizer;
        sequentialDisposable.getClass();
        DisposableHelper.replace(sequentialDisposable, disposable);
    }

    public SingleSubscribeOn(Single single, Scheduler scheduler) {
        this.IconCompatParcelizer = single;
        this.read = scheduler;
    }
}

package io.reactivex.internal.operators.single;

import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class SingleUnsubscribeOn<T> extends Single<T> {
    public final Scheduler serializer;
    public final Single write;

    public static final class UnsubscribeOnSingleObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable, Runnable {
        public Disposable IconCompatParcelizer;
        public final SingleObserver RemoteActionCompatParcelizer;
        public final Scheduler write;

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            Disposable andSet = getAndSet(disposableHelper);
            if (andSet != disposableHelper) {
                this.IconCompatParcelizer = andSet;
                this.write.read(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th) {
            this.RemoteActionCompatParcelizer.onError(th);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            this.RemoteActionCompatParcelizer.onSuccess(obj);
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.IconCompatParcelizer.dispose();
        }

        public UnsubscribeOnSingleObserver(SingleObserver singleObserver, Scheduler scheduler) {
            this.RemoteActionCompatParcelizer = singleObserver;
            this.write = scheduler;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                this.RemoteActionCompatParcelizer.onSubscribe(this);
            }
        }
    }

    @Override // io.reactivex.Single
    public final void IconCompatParcelizer(SingleObserver singleObserver) {
        this.write.subscribe(new UnsubscribeOnSingleObserver(singleObserver, this.serializer));
    }

    public SingleUnsubscribeOn(Single single, Scheduler scheduler) {
        this.write = single;
        this.serializer = scheduler;
    }
}

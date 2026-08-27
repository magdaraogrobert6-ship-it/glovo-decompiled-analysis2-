package io.reactivex.internal.operators.single;

import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class SingleObserveOn<T> extends Single<T> {
    public final Scheduler read;
    public final Single serializer;

    public static final class ObserveOnSingleObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable, Runnable {
        public Throwable RemoteActionCompatParcelizer;
        public Object read;
        public final Scheduler serializer;
        public final SingleObserver write;

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th) {
            this.RemoteActionCompatParcelizer = th;
            DisposableHelper.replace(this, this.serializer.read(this));
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            this.read = obj;
            DisposableHelper.replace(this, this.serializer.read(this));
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th = this.RemoteActionCompatParcelizer;
            SingleObserver singleObserver = this.write;
            if (th != null) {
                singleObserver.onError(th);
            } else {
                singleObserver.onSuccess(this.read);
            }
        }

        public ObserveOnSingleObserver(SingleObserver singleObserver, Scheduler scheduler) {
            this.write = singleObserver;
            this.serializer = scheduler;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                this.write.onSubscribe(this);
            }
        }
    }

    @Override // io.reactivex.Single
    public final void IconCompatParcelizer(SingleObserver singleObserver) {
        this.serializer.subscribe(new ObserveOnSingleObserver(singleObserver, this.read));
    }

    public SingleObserveOn(Single single, Scheduler scheduler) {
        this.serializer = single;
        this.read = scheduler;
    }
}

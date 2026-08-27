package io.reactivex.internal.operators.single;

import com.roadrunner.domain.util.RetryWithDelay$$ExternalSyntheticLambda1;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class SingleFlatMap<T, R> extends Single<R> {
    public final RetryWithDelay$$ExternalSyntheticLambda1 RemoteActionCompatParcelizer;
    public final SingleObserveOn serializer;

    public static final class SingleFlatMapCallback<T, R> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable {
        public final RetryWithDelay$$ExternalSyntheticLambda1 read;
        public final SingleObserver write;

        public static final class FlatMapSingleObserver<R> implements SingleObserver<R> {
            public final AtomicReference IconCompatParcelizer;
            public final SingleObserver serializer;

            @Override // io.reactivex.SingleObserver
            public final void onError(Throwable th) {
                this.serializer.onError(th);
            }

            @Override // io.reactivex.SingleObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.replace(this.IconCompatParcelizer, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public final void onSuccess(Object obj) {
                this.serializer.onSuccess(obj);
            }

            public FlatMapSingleObserver(AtomicReference atomicReference, SingleObserver singleObserver) {
                this.IconCompatParcelizer = atomicReference;
                this.serializer = singleObserver;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th) {
            this.write.onError(th);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            SingleObserver singleObserver = this.write;
            try {
                SingleSource singleSource = (SingleSource) this.read.apply(obj);
                if (isDisposed()) {
                    return;
                }
                singleSource.subscribe(new FlatMapSingleObserver(this, singleObserver));
            } catch (Throwable th) {
                Exceptions.read(th);
                singleObserver.onError(th);
            }
        }

        public SingleFlatMapCallback(SingleObserver singleObserver, RetryWithDelay$$ExternalSyntheticLambda1 retryWithDelay$$ExternalSyntheticLambda1) {
            this.write = singleObserver;
            this.read = retryWithDelay$$ExternalSyntheticLambda1;
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
        this.serializer.subscribe(new SingleFlatMapCallback(singleObserver, this.RemoteActionCompatParcelizer));
    }

    public SingleFlatMap(SingleObserveOn singleObserveOn, RetryWithDelay$$ExternalSyntheticLambda1 retryWithDelay$$ExternalSyntheticLambda1) {
        this.RemoteActionCompatParcelizer = retryWithDelay$$ExternalSyntheticLambda1;
        this.serializer = singleObserveOn;
    }
}

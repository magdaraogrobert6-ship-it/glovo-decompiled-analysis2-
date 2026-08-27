package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class CompletableToSingle<T> extends Single<T> {
    public final Callable RemoteActionCompatParcelizer;
    public final Completable serializer;

    public final class ToSingle implements CompletableObserver {
        public final SingleObserver IconCompatParcelizer;

        @Override // io.reactivex.CompletableObserver
        public final void onComplete() {
            SingleObserver singleObserver = this.IconCompatParcelizer;
            try {
                Object objCall = CompletableToSingle.this.RemoteActionCompatParcelizer.call();
                if (objCall == null) {
                    singleObserver.onError(new NullPointerException("The value supplied is null"));
                } else {
                    singleObserver.onSuccess(objCall);
                }
            } catch (Throwable th) {
                Exceptions.read(th);
                singleObserver.onError(th);
            }
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th) {
            this.IconCompatParcelizer.onError(th);
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            this.IconCompatParcelizer.onSubscribe(disposable);
        }

        public ToSingle(SingleObserver singleObserver) {
            this.IconCompatParcelizer = singleObserver;
        }
    }

    @Override // io.reactivex.Single
    public final void IconCompatParcelizer(SingleObserver singleObserver) {
        this.serializer.subscribe(new ToSingle(singleObserver));
    }

    public CompletableToSingle(Completable completable, Callable callable) {
        this.serializer = completable;
        this.RemoteActionCompatParcelizer = callable;
    }
}

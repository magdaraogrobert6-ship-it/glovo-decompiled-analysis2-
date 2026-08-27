package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;

/* JADX INFO: loaded from: classes4.dex */
public final class SingleDoOnSuccess<T> extends Single<T> {
    public final Consumer read;
    public final Single write;

    public final class DoOnSuccess implements SingleObserver<T> {
        public final SingleObserver IconCompatParcelizer;

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th) {
            this.IconCompatParcelizer.onError(th);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            this.IconCompatParcelizer.onSubscribe(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            SingleObserver singleObserver = this.IconCompatParcelizer;
            try {
                SingleDoOnSuccess.this.read.accept(obj);
                singleObserver.onSuccess(obj);
            } catch (Throwable th) {
                Exceptions.read(th);
                singleObserver.onError(th);
            }
        }

        public DoOnSuccess(SingleObserver singleObserver) {
            this.IconCompatParcelizer = singleObserver;
        }
    }

    @Override // io.reactivex.Single
    public final void IconCompatParcelizer(SingleObserver singleObserver) {
        this.write.subscribe(new DoOnSuccess(singleObserver));
    }

    public SingleDoOnSuccess(Single single, Consumer consumer) {
        this.write = single;
        this.read = consumer;
    }
}

package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;

/* JADX INFO: loaded from: classes4.dex */
public final class SingleOnErrorReturn<T> extends Single<T> {
    public final Function read;
    public final Single serializer;

    public final class OnErrorReturn implements SingleObserver<T> {
        public final SingleObserver RemoteActionCompatParcelizer;

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th) {
            SingleObserver singleObserver = this.RemoteActionCompatParcelizer;
            try {
                Object objApply = SingleOnErrorReturn.this.read.apply(th);
                if (objApply != null) {
                    singleObserver.onSuccess(objApply);
                    return;
                }
                NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
                nullPointerException.initCause(th);
                singleObserver.onError(nullPointerException);
            } catch (Throwable th2) {
                Exceptions.read(th2);
                singleObserver.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            this.RemoteActionCompatParcelizer.onSubscribe(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            this.RemoteActionCompatParcelizer.onSuccess(obj);
        }

        public OnErrorReturn(SingleObserver singleObserver) {
            this.RemoteActionCompatParcelizer = singleObserver;
        }
    }

    @Override // io.reactivex.Single
    public final void IconCompatParcelizer(SingleObserver singleObserver) {
        this.serializer.subscribe(new OnErrorReturn(singleObserver));
    }

    public SingleOnErrorReturn(Single single, Function function) {
        this.serializer = single;
        this.read = function;
    }
}

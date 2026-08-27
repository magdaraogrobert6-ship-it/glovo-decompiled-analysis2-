package io.reactivex.internal.operators.single;

import com.google.protobuf.FieldType$$ExternalSyntheticBUOutline0;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.operators.observable.ObservableAnySingle;

/* JADX INFO: loaded from: classes4.dex */
public final class SingleDoOnError<T> extends Single<T> {
    public final ObservableAnySingle IconCompatParcelizer;
    public final FieldType$$ExternalSyntheticBUOutline0 RemoteActionCompatParcelizer;

    public final class DoOnError implements SingleObserver<T> {
        public final SingleObserver serializer;

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th) {
            try {
                SingleDoOnError.this.RemoteActionCompatParcelizer.accept(th);
            } catch (Throwable th2) {
                Exceptions.read(th2);
                th = new CompositeException(th, th2);
            }
            this.serializer.onError(th);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            this.serializer.onSubscribe(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            this.serializer.onSuccess(obj);
        }

        public DoOnError(SingleObserver singleObserver) {
            this.serializer = singleObserver;
        }
    }

    @Override // io.reactivex.Single
    public final void IconCompatParcelizer(SingleObserver singleObserver) {
        this.IconCompatParcelizer.subscribe(new DoOnError(singleObserver));
    }

    public SingleDoOnError(ObservableAnySingle observableAnySingle, FieldType$$ExternalSyntheticBUOutline0 fieldType$$ExternalSyntheticBUOutline0) {
        this.IconCompatParcelizer = observableAnySingle;
        this.RemoteActionCompatParcelizer = fieldType$$ExternalSyntheticBUOutline0;
    }
}

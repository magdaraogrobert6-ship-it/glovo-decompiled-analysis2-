package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;

/* JADX INFO: loaded from: classes4.dex */
public final class SingleMap<T, R> extends Single<R> {
    public final Function read;
    public final Single write;

    public static final class MapSingleObserver<T, R> implements SingleObserver<T> {
        public final SingleObserver IconCompatParcelizer;
        public final Function serializer;

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
            try {
                Object objApply = this.serializer.apply(obj);
                ObjectHelper.write(objApply, "The mapper function returned a null value.");
                this.IconCompatParcelizer.onSuccess(objApply);
            } catch (Throwable th) {
                Exceptions.read(th);
                onError(th);
            }
        }

        public MapSingleObserver(SingleObserver singleObserver, Function function) {
            this.IconCompatParcelizer = singleObserver;
            this.serializer = function;
        }
    }

    @Override // io.reactivex.Single
    public final void IconCompatParcelizer(SingleObserver singleObserver) {
        this.write.subscribe(new MapSingleObserver(singleObserver, this.read));
    }

    public SingleMap(Single single, Function function) {
        this.write = single;
        this.read = function;
    }
}

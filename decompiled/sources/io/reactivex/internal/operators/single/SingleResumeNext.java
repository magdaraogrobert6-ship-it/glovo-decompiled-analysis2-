package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.ResumeSingleObserver;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class SingleResumeNext<T> extends Single<T> {
    public final Single RemoteActionCompatParcelizer;
    public final Function serializer;

    public static final class ResumeMainSingleObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable {
        public final Function IconCompatParcelizer;
        public final SingleObserver serializer;

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th) {
            SingleObserver singleObserver = this.serializer;
            try {
                Object objApply = this.IconCompatParcelizer.apply(th);
                ObjectHelper.write(objApply, "The nextFunction returned a null SingleSource.");
                ((SingleSource) objApply).subscribe(new ResumeSingleObserver(this, singleObserver));
            } catch (Throwable th2) {
                Exceptions.read(th2);
                singleObserver.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            this.serializer.onSuccess(obj);
        }

        public ResumeMainSingleObserver(SingleObserver singleObserver, Function function) {
            this.serializer = singleObserver;
            this.IconCompatParcelizer = function;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                this.serializer.onSubscribe(this);
            }
        }
    }

    @Override // io.reactivex.Single
    public final void IconCompatParcelizer(SingleObserver singleObserver) {
        this.RemoteActionCompatParcelizer.subscribe(new ResumeMainSingleObserver(singleObserver, this.serializer));
    }

    public SingleResumeNext(Single single, Function function) {
        this.RemoteActionCompatParcelizer = single;
        this.serializer = function;
    }
}

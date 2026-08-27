package io.reactivex.internal.operators.mixed;

import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.single.SingleJust;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class SingleFlatMapObservable<T, R> extends Observable<R> {
    public final SingleJust IconCompatParcelizer;
    public final OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 write;

    public static final class FlatMapObserver<T, R> extends AtomicReference<Disposable> implements Observer<R>, SingleObserver<T>, Disposable {
        public final Observer serializer;
        public final OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 write;

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.replace(this, disposable);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.serializer.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            this.serializer.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            this.serializer.onNext(obj);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            try {
                Object objApply = this.write.apply(obj);
                ObjectHelper.write(objApply, "The mapper returned a null Publisher");
                ((ObservableSource) objApply).subscribe(this);
            } catch (Throwable th) {
                Exceptions.read(th);
                this.serializer.onError(th);
            }
        }

        public FlatMapObserver(Observer observer, OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0) {
            this.serializer = observer;
            this.write = onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }
    }

    @Override // io.reactivex.Observable
    public final void read(Observer observer) {
        FlatMapObserver flatMapObserver = new FlatMapObserver(observer, this.write);
        observer.onSubscribe(flatMapObserver);
        this.IconCompatParcelizer.subscribe(flatMapObserver);
    }

    public SingleFlatMapObservable(SingleJust singleJust, OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0) {
        this.IconCompatParcelizer = singleJust;
        this.write = onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
    }
}

package io.reactivex.internal.operators.mixed;

import com.google.protobuf.FieldType$$ExternalSyntheticBUOutline0;
import io.reactivex.MaybeObserver;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.operators.maybe.MaybeMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class MaybeFlatMapObservable<T, R> extends Observable<R> {
    public final FieldType$$ExternalSyntheticBUOutline0 IconCompatParcelizer;
    public final MaybeMap RemoteActionCompatParcelizer;

    public static final class FlatMapObserver<T, R> extends AtomicReference<Disposable> implements Observer<R>, MaybeObserver<T>, Disposable {
        public final Observer IconCompatParcelizer;
        public final FieldType$$ExternalSyntheticBUOutline0 RemoteActionCompatParcelizer;

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
            this.IconCompatParcelizer.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            this.IconCompatParcelizer.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            this.IconCompatParcelizer.onNext(obj);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            try {
                ((ObservableSource) this.RemoteActionCompatParcelizer.apply(obj)).subscribe(this);
            } catch (Throwable th) {
                Exceptions.read(th);
                this.IconCompatParcelizer.onError(th);
            }
        }

        public FlatMapObserver(Observer observer, FieldType$$ExternalSyntheticBUOutline0 fieldType$$ExternalSyntheticBUOutline0) {
            this.IconCompatParcelizer = observer;
            this.RemoteActionCompatParcelizer = fieldType$$ExternalSyntheticBUOutline0;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }
    }

    @Override // io.reactivex.Observable
    public final void read(Observer observer) {
        FlatMapObserver flatMapObserver = new FlatMapObserver(observer, this.IconCompatParcelizer);
        observer.onSubscribe(flatMapObserver);
        this.RemoteActionCompatParcelizer.subscribe(flatMapObserver);
    }

    public MaybeFlatMapObservable(MaybeMap maybeMap, FieldType$$ExternalSyntheticBUOutline0 fieldType$$ExternalSyntheticBUOutline0) {
        this.RemoteActionCompatParcelizer = maybeMap;
        this.IconCompatParcelizer = fieldType$$ExternalSyntheticBUOutline0;
    }
}

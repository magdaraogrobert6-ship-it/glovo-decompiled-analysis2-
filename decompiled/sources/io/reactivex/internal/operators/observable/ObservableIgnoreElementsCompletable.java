package io.reactivex.internal.operators.observable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes4.dex */
public final class ObservableIgnoreElementsCompletable<T> extends Completable {
    public final Observable serializer;

    public static final class IgnoreObservable<T> implements Observer<T>, Disposable {
        public final CompletableObserver IconCompatParcelizer;
        public Disposable read;

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.read.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.read.isDisposed();
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
        public final void onSubscribe(Disposable disposable) {
            this.read = disposable;
            this.IconCompatParcelizer.onSubscribe(this);
        }

        public IgnoreObservable(CompletableObserver completableObserver) {
            this.IconCompatParcelizer = completableObserver;
        }
    }

    @Override // io.reactivex.Completable
    public final void serializer(CompletableObserver completableObserver) {
        this.serializer.subscribe(new IgnoreObservable(completableObserver));
    }

    public ObservableIgnoreElementsCompletable(Observable observable) {
        this.serializer = observable;
    }
}

package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;

/* JADX INFO: loaded from: classes4.dex */
public final class ObservableSwitchIfEmpty<T> extends AbstractObservableWithUpstream<T, T> {
    public final ObservableJust serializer;

    public static final class SwitchIfEmptyObserver<T> implements Observer<T> {
        public final ObservableJust read;
        public final Observer write;
        public boolean serializer = true;
        public final SequentialDisposable IconCompatParcelizer = new SequentialDisposable();

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            this.write.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            SequentialDisposable sequentialDisposable = this.IconCompatParcelizer;
            sequentialDisposable.getClass();
            DisposableHelper.set(sequentialDisposable, disposable);
        }

        public SwitchIfEmptyObserver(Observer observer, ObservableJust observableJust) {
            this.write = observer;
            this.read = observableJust;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (!this.serializer) {
                this.write.onComplete();
            } else {
                this.serializer = false;
                this.read.subscribe(this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.serializer) {
                this.serializer = false;
            }
            this.write.onNext(obj);
        }
    }

    @Override // io.reactivex.Observable
    public final void read(Observer observer) {
        SwitchIfEmptyObserver switchIfEmptyObserver = new SwitchIfEmptyObserver(observer, this.serializer);
        observer.onSubscribe(switchIfEmptyObserver.IconCompatParcelizer);
        this.read.subscribe(switchIfEmptyObserver);
    }

    public ObservableSwitchIfEmpty(ObservableFilter observableFilter, ObservableJust observableJust) {
        super(observableFilter);
        this.serializer = observableJust;
    }
}

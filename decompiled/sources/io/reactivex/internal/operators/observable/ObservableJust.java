package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.internal.fuseable.ScalarCallable;

/* JADX INFO: loaded from: classes4.dex */
public final class ObservableJust<T> extends Observable<T> implements ScalarCallable<T> {
    public final Object RemoteActionCompatParcelizer;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // io.reactivex.Observable
    public final void read(Observer observer) {
        ObservableScalarXMap$ScalarDisposable observableScalarXMap$ScalarDisposable = new ObservableScalarXMap$ScalarDisposable(this.RemoteActionCompatParcelizer, observer);
        observer.onSubscribe(observableScalarXMap$ScalarDisposable);
        observableScalarXMap$ScalarDisposable.run();
    }

    public ObservableJust(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
    }
}

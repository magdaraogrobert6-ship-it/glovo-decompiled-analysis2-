package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.fuseable.ScalarCallable;

/* JADX INFO: loaded from: classes4.dex */
public final class ObservableEmpty extends Observable<Object> implements ScalarCallable<Object> {
    public static final ObservableEmpty read = new ObservableEmpty();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return null;
    }

    @Override // io.reactivex.Observable
    public final void read(Observer observer) {
        EmptyDisposable.complete((Observer<?>) observer);
    }
}

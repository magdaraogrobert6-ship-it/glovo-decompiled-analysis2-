package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;

/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractObservableWithUpstream<T, U> extends Observable<U> {
    public final Observable read;

    public AbstractObservableWithUpstream(Observable observable) {
        this.read = observable;
    }
}

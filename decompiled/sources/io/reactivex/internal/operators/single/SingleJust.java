package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.internal.disposables.EmptyDisposable;

/* JADX INFO: loaded from: classes4.dex */
public final class SingleJust<T> extends Single<T> {
    public final Object read;

    @Override // io.reactivex.Single
    public final void IconCompatParcelizer(SingleObserver singleObserver) {
        singleObserver.onSubscribe(EmptyDisposable.INSTANCE);
        singleObserver.onSuccess(this.read);
    }

    public SingleJust(Object obj) {
        this.read = obj;
    }
}

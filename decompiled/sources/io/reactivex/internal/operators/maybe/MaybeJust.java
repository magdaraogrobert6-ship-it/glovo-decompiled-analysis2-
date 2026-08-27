package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.fuseable.ScalarCallable;

/* JADX INFO: loaded from: classes4.dex */
public final class MaybeJust<T> extends Maybe<T> implements ScalarCallable<T> {
    public final Object serializer;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.serializer;
    }

    @Override // io.reactivex.Maybe
    public final void IconCompatParcelizer(MaybeObserver maybeObserver) {
        maybeObserver.onSubscribe(EmptyDisposable.INSTANCE);
        maybeObserver.onSuccess(this.serializer);
    }

    public MaybeJust(Object obj) {
        this.serializer = obj;
    }
}

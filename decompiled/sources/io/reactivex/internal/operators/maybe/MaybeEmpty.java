package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.fuseable.ScalarCallable;

/* JADX INFO: loaded from: classes4.dex */
public final class MaybeEmpty extends Maybe<Object> implements ScalarCallable<Object> {
    public static final MaybeEmpty IconCompatParcelizer = new MaybeEmpty();

    @Override // io.reactivex.Maybe
    public final void IconCompatParcelizer(MaybeObserver maybeObserver) {
        EmptyDisposable.complete((MaybeObserver<?>) maybeObserver);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return null;
    }
}

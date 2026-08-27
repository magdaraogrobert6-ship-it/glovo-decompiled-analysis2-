package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.internal.disposables.EmptyDisposable;

/* JADX INFO: loaded from: classes4.dex */
public final class MaybeError<T> extends Maybe<T> {
    public final Throwable RemoteActionCompatParcelizer;

    @Override // io.reactivex.Maybe
    public final void IconCompatParcelizer(MaybeObserver maybeObserver) {
        maybeObserver.onSubscribe(EmptyDisposable.INSTANCE);
        maybeObserver.onError(this.RemoteActionCompatParcelizer);
    }

    public MaybeError(Throwable th) {
        this.RemoteActionCompatParcelizer = th;
    }
}

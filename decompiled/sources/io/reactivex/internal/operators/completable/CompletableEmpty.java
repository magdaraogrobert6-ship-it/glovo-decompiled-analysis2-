package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.internal.disposables.EmptyDisposable;

/* JADX INFO: loaded from: classes4.dex */
public final class CompletableEmpty extends Completable {
    public static final CompletableEmpty write = new CompletableEmpty();

    @Override // io.reactivex.Completable
    public final void serializer(CompletableObserver completableObserver) {
        EmptyDisposable.complete(completableObserver);
    }
}

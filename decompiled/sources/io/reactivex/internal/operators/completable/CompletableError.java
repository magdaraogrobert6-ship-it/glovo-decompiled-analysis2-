package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.internal.disposables.EmptyDisposable;

/* JADX INFO: loaded from: classes4.dex */
public final class CompletableError extends Completable {
    public final Throwable RemoteActionCompatParcelizer;

    @Override // io.reactivex.Completable
    public final void serializer(CompletableObserver completableObserver) {
        EmptyDisposable.error(this.RemoteActionCompatParcelizer, completableObserver);
    }

    public CompletableError(Throwable th) {
        this.RemoteActionCompatParcelizer = th;
    }
}

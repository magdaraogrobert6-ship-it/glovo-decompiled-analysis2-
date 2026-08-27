package io.reactivex.internal.disposables;

import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class SequentialDisposable extends AtomicReference<Disposable> implements Disposable {
    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.dispose(this);
    }

    public SequentialDisposable(SequentialDisposable sequentialDisposable) {
        lazySet(sequentialDisposable);
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    public SequentialDisposable() {
    }
}

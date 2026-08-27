package io.reactivex.disposables;

/* JADX INFO: loaded from: classes4.dex */
final class RunnableDisposable extends ReferenceDisposable<Runnable> {
    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return "RunnableDisposable(disposed=" + isDisposed() + ", " + get() + ")";
    }

    public RunnableDisposable(Object obj) {
        super(obj);
    }
}

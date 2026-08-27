package io.reactivex.internal.observers;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class ResumeSingleObserver<T> implements SingleObserver<T> {
    public final SingleObserver RemoteActionCompatParcelizer;
    public final AtomicReference write;

    @Override // io.reactivex.SingleObserver
    public final void onError(Throwable th) {
        this.RemoteActionCompatParcelizer.onError(th);
    }

    @Override // io.reactivex.SingleObserver
    public final void onSubscribe(Disposable disposable) {
        DisposableHelper.replace(this.write, disposable);
    }

    @Override // io.reactivex.SingleObserver
    public final void onSuccess(Object obj) {
        this.RemoteActionCompatParcelizer.onSuccess(obj);
    }

    public ResumeSingleObserver(AtomicReference atomicReference, SingleObserver singleObserver) {
        this.write = atomicReference;
        this.RemoteActionCompatParcelizer = singleObserver;
    }
}

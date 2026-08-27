package io.reactivex.internal.observers;

import io.reactivex.CompletableObserver;
import io.reactivex.MaybeObserver;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes4.dex */
public final class BlockingMultiObserver<T> extends CountDownLatch implements SingleObserver<T>, CompletableObserver, MaybeObserver<T> {
    public Disposable IconCompatParcelizer;
    public Object RemoteActionCompatParcelizer;
    public volatile boolean read;
    public Throwable serializer;

    @Override // io.reactivex.CompletableObserver
    public final void onComplete() {
        countDown();
    }

    @Override // io.reactivex.SingleObserver
    public final void onError(Throwable th) {
        this.serializer = th;
        countDown();
    }

    @Override // io.reactivex.SingleObserver
    public final void onSubscribe(Disposable disposable) {
        this.IconCompatParcelizer = disposable;
        if (this.read) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.SingleObserver
    public final void onSuccess(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
        countDown();
    }

    public BlockingMultiObserver(int i) {
        super(i);
    }
}

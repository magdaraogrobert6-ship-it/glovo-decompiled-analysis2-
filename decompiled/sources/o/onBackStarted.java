package o;

import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.rx2.RxAwaitKt;

/* JADX INFO: loaded from: classes4.dex */
public final class onBackStarted implements CompletableObserver {
    public final /* synthetic */ CancellableContinuationImpl IconCompatParcelizer;

    @Override // io.reactivex.CompletableObserver
    public final void onComplete() {
        this.IconCompatParcelizer.resumeWith(createFromParcel.INSTANCE);
    }

    @Override // io.reactivex.CompletableObserver
    public final void onError(Throwable th) {
        this.IconCompatParcelizer.resumeWith(coil3.ExtrasKt.IconCompatParcelizer(th));
    }

    @Override // io.reactivex.CompletableObserver
    public final void onSubscribe(Disposable disposable) {
        RxAwaitKt.serializer(this.IconCompatParcelizer, disposable);
    }

    public onBackStarted(CancellableContinuationImpl cancellableContinuationImpl) {
        this.IconCompatParcelizer = cancellableContinuationImpl;
    }
}

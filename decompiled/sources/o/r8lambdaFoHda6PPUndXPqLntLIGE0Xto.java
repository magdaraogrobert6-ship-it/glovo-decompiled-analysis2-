package o;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.channels.ProducerCoroutine;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaFoHda6PPUndXPqLntLIGE0Xto implements Observer {
    public final /* synthetic */ AtomicReference IconCompatParcelizer;
    public final /* synthetic */ InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 serializer;

    @Override // io.reactivex.Observer
    public final void onComplete() {
        ((ProducerCoroutine) this.serializer).IconCompatParcelizer((Throwable) null);
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        ((ProducerCoroutine) this.serializer).IconCompatParcelizer(th);
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
        try {
            isInteropViewHost.RemoteActionCompatParcelizer(obj, this.serializer);
        } catch (InterruptedException unused) {
        }
    }

    public r8lambdaFoHda6PPUndXPqLntLIGE0Xto(InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1, AtomicReference atomicReference) {
        this.serializer = inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
        this.IconCompatParcelizer = atomicReference;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        AtomicReference atomicReference;
        do {
            atomicReference = this.IconCompatParcelizer;
            if (atomicReference.compareAndSet(null, disposable)) {
                return;
            }
        } while (atomicReference.get() == null);
        disposable.dispose();
    }
}

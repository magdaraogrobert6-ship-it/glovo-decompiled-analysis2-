package o;

import androidx.work.RxWorker$1$$ExternalSyntheticLambda0;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import java.util.Objects;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.rx2.RxAwaitKt;

/* JADX INFO: loaded from: classes.dex */
public final class setShadowElevation implements SingleObserver {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public /* synthetic */ setShadowElevation(int i, Object obj) {
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = obj;
    }

    @Override // io.reactivex.SingleObserver
    public final void onError(Throwable th) {
        int i = this.RemoteActionCompatParcelizer;
        Object obj = this.IconCompatParcelizer;
        if (i != 0) {
            ((CancellableContinuationImpl) obj).resumeWith(coil3.ExtrasKt.IconCompatParcelizer(th));
        } else {
            ((onDrawWithContent) obj).serializer(th);
        }
    }

    @Override // io.reactivex.SingleObserver
    public final void onSubscribe(Disposable disposable) {
        int i = this.RemoteActionCompatParcelizer;
        Object obj = this.IconCompatParcelizer;
        if (i != 0) {
            RxAwaitKt.serializer((CancellableContinuationImpl) obj, disposable);
        } else {
            Objects.requireNonNull(disposable);
            ((onDrawWithContent) obj).RemoteActionCompatParcelizer(new RxWorker$1$$ExternalSyntheticLambda0(0, disposable), androidx.work.RxWorker.serializer);
        }
    }

    @Override // io.reactivex.SingleObserver
    public final void onSuccess(Object obj) {
        int i = this.RemoteActionCompatParcelizer;
        Object obj2 = this.IconCompatParcelizer;
        if (i != 0) {
            ((CancellableContinuationImpl) obj2).resumeWith(obj);
        } else {
            ((onDrawWithContent) obj2).RemoteActionCompatParcelizer(obj);
        }
    }
}

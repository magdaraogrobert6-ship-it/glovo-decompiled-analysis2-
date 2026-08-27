package kotlinx.coroutines.rx2;

import io.grpc.LoadBalancer$Helper;
import io.reactivex.Completable;
import io.reactivex.disposables.Disposable;
import kotlin.collections.AbstractMap$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CancellableContinuationImpl;
import o.createFromParcel;
import o.onBackStarted;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes4.dex */
public abstract class RxAwaitKt {
    public static final Object await(Completable completable, ContinuationImpl continuationImpl) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(continuationImpl));
        cancellableContinuationImpl.read();
        completable.subscribe(new onBackStarted(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        return result == CoroutineSingletons.COROUTINE_SUSPENDED ? result : createFromParcel.INSTANCE;
    }

    public static final void serializer(CancellableContinuationImpl cancellableContinuationImpl, Disposable disposable) {
        cancellableContinuationImpl.IconCompatParcelizer((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new AbstractMap$$ExternalSyntheticLambda0(3, disposable));
    }
}

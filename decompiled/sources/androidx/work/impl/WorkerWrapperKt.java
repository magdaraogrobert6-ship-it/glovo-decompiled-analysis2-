package androidx.work.impl;

import com.google.android.gms.tasks.zzc;
import io.grpc.LoadBalancer$Helper;
import java.util.concurrent.ExecutionException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CancellableContinuationImpl;
import o.DrawModifierNodeKt;
import o.accessgetSizeNHjbRcjd;
import o.accesssetSpotShadowColor8_81llAjd;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.setRotationX;

/* JADX INFO: loaded from: classes.dex */
public abstract class WorkerWrapperKt {
    public static final String RemoteActionCompatParcelizer = setRotationX.IconCompatParcelizer("WorkerWrapper");

    public static final Object awaitWithin(DrawModifierNodeKt drawModifierNodeKt, accesssetSpotShadowColor8_81llAjd accesssetspotshadowcolor8_81llajd, SuspendLambda suspendLambda) {
        Object obj;
        try {
            int i = 0;
            int i2 = 1;
            if (!drawModifierNodeKt.isDone()) {
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(suspendLambda));
                cancellableContinuationImpl.read();
                drawModifierNodeKt.RemoteActionCompatParcelizer(new zzc(drawModifierNodeKt, i2, cancellableContinuationImpl), accessgetSizeNHjbRcjd.INSTANCE);
                cancellableContinuationImpl.IconCompatParcelizer((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new WorkerWrapperKt$awaitWithin$2$1(accesssetspotshadowcolor8_81llajd, i, drawModifierNodeKt));
                Object result = cancellableContinuationImpl.getResult();
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                return result;
            }
            while (true) {
                try {
                    obj = drawModifierNodeKt.get();
                    break;
                } catch (InterruptedException unused) {
                    i = 1;
                } catch (Throwable th) {
                    if (i != 0) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (i != 0) {
                Thread.currentThread().interrupt();
            }
            return obj;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            cause.getClass();
            throw cause;
        }
    }
}

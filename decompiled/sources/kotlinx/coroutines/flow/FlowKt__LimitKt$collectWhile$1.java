package kotlinx.coroutines.flow;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import o.createFromParcel;

/* JADX INFO: loaded from: classes5.dex */
final class FlowKt__LimitKt$collectWhile$1<T> extends ContinuationImpl {
    public int IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public FlowKt__LimitKt$collectWhile$collector$1 write;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
        int i = (this.IconCompatParcelizer | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.IconCompatParcelizer = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        try {
            if (i == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                this.write = new FlowKt__LimitKt$collectWhile$collector$1();
                this.IconCompatParcelizer = 1;
                throw null;
            }
            if (i != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            FlowKt__LimitKt$collectWhile$collector$1 flowKt__LimitKt$collectWhile$collector$1 = this.write;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return createFromParcel.INSTANCE;
        } catch (AbortFlowException e) {
            if (e.write != i) {
                throw e;
            }
            JobKt.RemoteActionCompatParcelizer(getContext());
        }
    }
}

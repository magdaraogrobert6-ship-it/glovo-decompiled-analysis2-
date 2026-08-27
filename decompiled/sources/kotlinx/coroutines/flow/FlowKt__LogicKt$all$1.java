package kotlinx.coroutines.flow;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import o.ShortNewsContentCardView;
import o.cancelPendingWebViewPause;

/* JADX INFO: loaded from: classes5.dex */
final class FlowKt__LogicKt$all$1<T> extends ContinuationImpl {
    public FlowKt__LogicKt$all$$inlined$collectWhile$1 RemoteActionCompatParcelizer;
    public cancelPendingWebViewPause read;
    public int serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: Code duplicated, block: B:19:0x0040  */
    /* JADX WARN: Code duplicated, block: B:22:0x004f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlowKt__LogicKt$all$$inlined$collectWhile$1 flowKt__LogicKt$all$$inlined$collectWhile$1;
        cancelPendingWebViewPause cancelpendingwebviewpause;
        AbortFlowException e;
        this.write = obj;
        this.serializer = (this.serializer | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.serializer;
        if (i != 0) {
            if (i != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            flowKt__LogicKt$all$$inlined$collectWhile$1 = this.RemoteActionCompatParcelizer;
            cancelpendingwebviewpause = this.read;
            try {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } catch (AbortFlowException e2) {
                e = e2;
                if (e.write == flowKt__LogicKt$all$$inlined$collectWhile$1) {
                    throw e;
                }
                JobKt.RemoteActionCompatParcelizer(getContext());
            }
            return Boolean.valueOf(!cancelpendingwebviewpause.IconCompatParcelizer);
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        cancelPendingWebViewPause cancelpendingwebviewpause2 = new cancelPendingWebViewPause();
        flowKt__LogicKt$all$$inlined$collectWhile$1 = new FlowKt__LogicKt$all$$inlined$collectWhile$1(cancelpendingwebviewpause2);
        try {
            this.read = cancelpendingwebviewpause2;
            this.RemoteActionCompatParcelizer = flowKt__LogicKt$all$$inlined$collectWhile$1;
            this.serializer = 1;
            throw null;
        } catch (AbortFlowException e3) {
            cancelpendingwebviewpause = cancelpendingwebviewpause2;
            e = e3;
        }
        if (e.write == flowKt__LogicKt$all$$inlined$collectWhile$1) {
            throw e;
        }
        JobKt.RemoteActionCompatParcelizer(getContext());
        return Boolean.valueOf(!cancelpendingwebviewpause.IconCompatParcelizer);
    }

    public FlowKt__LogicKt$all$1(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}

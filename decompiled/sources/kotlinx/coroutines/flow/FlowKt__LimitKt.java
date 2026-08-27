package kotlinx.coroutines.flow;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class FlowKt__LimitKt {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final CoroutineSingletons access$emitAbort$FlowKt__LimitKt(FlowCollector flowCollector, Object obj, Object obj2, ContinuationImpl continuationImpl) {
        FlowKt__LimitKt$emitAbort$1 flowKt__LimitKt$emitAbort$1;
        if (continuationImpl instanceof FlowKt__LimitKt$emitAbort$1) {
            flowKt__LimitKt$emitAbort$1 = (FlowKt__LimitKt$emitAbort$1) continuationImpl;
            int i = flowKt__LimitKt$emitAbort$1.write;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$emitAbort$1.write = i - Integer.MIN_VALUE;
            } else {
                flowKt__LimitKt$emitAbort$1 = new FlowKt__LimitKt$emitAbort$1(continuationImpl);
            }
        } else {
            flowKt__LimitKt$emitAbort$1 = new FlowKt__LimitKt$emitAbort$1(continuationImpl);
        }
        Object obj3 = flowKt__LimitKt$emitAbort$1.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = flowKt__LimitKt$emitAbort$1.write;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj3);
            flowKt__LimitKt$emitAbort$1.RemoteActionCompatParcelizer = obj2;
            flowKt__LimitKt$emitAbort$1.write = 1;
            if (flowCollector.emit(obj, flowKt__LimitKt$emitAbort$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj2 = flowKt__LimitKt$emitAbort$1.RemoteActionCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj3);
        }
        throw new AbortFlowException(obj2);
    }
}

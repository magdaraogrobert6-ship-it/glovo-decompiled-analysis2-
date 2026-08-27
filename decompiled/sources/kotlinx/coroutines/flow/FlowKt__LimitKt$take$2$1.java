package kotlinx.coroutines.flow;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import o.ShortNewsContentCardView;
import o.createBrazeUserChangeEventSubscriberlambda01;
import o.createFromParcel;

/* JADX INFO: loaded from: classes4.dex */
final class FlowKt__LimitKt$take$2$1<T> implements FlowCollector {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ FlowCollector RemoteActionCompatParcelizer;
    public final /* synthetic */ createBrazeUserChangeEventSubscriberlambda01 write;

    public FlowKt__LimitKt$take$2$1(createBrazeUserChangeEventSubscriberlambda01 createbrazeuserchangeeventsubscriberlambda01, FlowCollector flowCollector, Object obj) {
        this.write = createbrazeuserchangeeventsubscriberlambda01;
        this.RemoteActionCompatParcelizer = flowCollector;
        this.IconCompatParcelizer = obj;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0059 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        FlowKt__LimitKt$take$2$1$emit$1 flowKt__LimitKt$take$2$1$emit$1;
        if (shortNewsContentCardView instanceof FlowKt__LimitKt$take$2$1$emit$1) {
            flowKt__LimitKt$take$2$1$emit$1 = (FlowKt__LimitKt$take$2$1$emit$1) shortNewsContentCardView;
            int i = flowKt__LimitKt$take$2$1$emit$1.RemoteActionCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$take$2$1$emit$1.RemoteActionCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                flowKt__LimitKt$take$2$1$emit$1 = new FlowKt__LimitKt$take$2$1$emit$1(this, shortNewsContentCardView);
            }
        } else {
            flowKt__LimitKt$take$2$1$emit$1 = new FlowKt__LimitKt$take$2$1$emit$1(this, shortNewsContentCardView);
        }
        Object obj2 = flowKt__LimitKt$take$2$1$emit$1.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = flowKt__LimitKt$take$2$1$emit$1.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i2 != 0) {
            if (i2 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                return createfromparcel;
            }
            if (i2 == 2) {
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                return createfromparcel;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj2);
        createBrazeUserChangeEventSubscriberlambda01 createbrazeuserchangeeventsubscriberlambda01 = this.write;
        int i3 = createbrazeuserchangeeventsubscriberlambda01.read + 1;
        createbrazeuserchangeeventsubscriberlambda01.read = i3;
        FlowCollector flowCollector = this.RemoteActionCompatParcelizer;
        if (i3 < 1) {
            flowKt__LimitKt$take$2$1$emit$1.RemoteActionCompatParcelizer = 1;
            if (flowCollector.emit(obj, flowKt__LimitKt$take$2$1$emit$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return createfromparcel;
        }
        flowKt__LimitKt$take$2$1$emit$1.RemoteActionCompatParcelizer = 2;
        if (FlowKt__LimitKt.access$emitAbort$FlowKt__LimitKt(flowCollector, obj, this.IconCompatParcelizer, flowKt__LimitKt$take$2$1$emit$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return createfromparcel;
    }
}

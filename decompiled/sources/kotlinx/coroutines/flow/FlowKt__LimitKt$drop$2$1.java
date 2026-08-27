package kotlinx.coroutines.flow;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import o.ShortNewsContentCardView;
import o.createBrazeUserChangeEventSubscriberlambda01;
import o.createFromParcel;

/* JADX INFO: loaded from: classes4.dex */
final class FlowKt__LimitKt$drop$2$1<T> implements FlowCollector {
    public final /* synthetic */ createBrazeUserChangeEventSubscriberlambda01 read;
    public final /* synthetic */ FlowCollector write;

    public FlowKt__LimitKt$drop$2$1(createBrazeUserChangeEventSubscriberlambda01 createbrazeuserchangeeventsubscriberlambda01, FlowCollector flowCollector) {
        this.read = createbrazeuserchangeeventsubscriberlambda01;
        this.write = flowCollector;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        FlowKt__LimitKt$drop$2$1$emit$1 flowKt__LimitKt$drop$2$1$emit$1;
        if (shortNewsContentCardView instanceof FlowKt__LimitKt$drop$2$1$emit$1) {
            flowKt__LimitKt$drop$2$1$emit$1 = (FlowKt__LimitKt$drop$2$1$emit$1) shortNewsContentCardView;
            int i = flowKt__LimitKt$drop$2$1$emit$1.serializer;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$drop$2$1$emit$1.serializer = i - Integer.MIN_VALUE;
            } else {
                flowKt__LimitKt$drop$2$1$emit$1 = new FlowKt__LimitKt$drop$2$1$emit$1(this, shortNewsContentCardView);
            }
        } else {
            flowKt__LimitKt$drop$2$1$emit$1 = new FlowKt__LimitKt$drop$2$1$emit$1(this, shortNewsContentCardView);
        }
        Object obj2 = flowKt__LimitKt$drop$2$1$emit$1.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = flowKt__LimitKt$drop$2$1$emit$1.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i2 != 0) {
            if (i2 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                return createfromparcel;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj2);
        createBrazeUserChangeEventSubscriberlambda01 createbrazeuserchangeeventsubscriberlambda01 = this.read;
        int i3 = createbrazeuserchangeeventsubscriberlambda01.read;
        if (i3 >= 1) {
            flowKt__LimitKt$drop$2$1$emit$1.serializer = 1;
            return this.write.emit(obj, flowKt__LimitKt$drop$2$1$emit$1) == coroutineSingletons ? coroutineSingletons : createfromparcel;
        }
        createbrazeuserchangeeventsubscriberlambda01.read = i3 + 1;
        return createfromparcel;
    }
}

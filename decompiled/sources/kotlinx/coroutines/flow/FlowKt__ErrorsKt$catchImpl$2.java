package kotlinx.coroutines.flow;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;

/* JADX INFO: loaded from: classes4.dex */
final class FlowKt__ErrorsKt$catchImpl$2<T> implements FlowCollector {
    public final /* synthetic */ FlowCollector IconCompatParcelizer;
    public final /* synthetic */ createInAppMessageEventSubscriber read;

    public FlowKt__ErrorsKt$catchImpl$2(createInAppMessageEventSubscriber createinappmessageeventsubscriber, FlowCollector flowCollector) {
        this.IconCompatParcelizer = flowCollector;
        this.read = createinappmessageeventsubscriber;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) throws Throwable {
        FlowKt__ErrorsKt$catchImpl$2$emit$1 flowKt__ErrorsKt$catchImpl$2$emit$1;
        FlowKt__ErrorsKt$catchImpl$2<T> flowKt__ErrorsKt$catchImpl$2;
        if (shortNewsContentCardView instanceof FlowKt__ErrorsKt$catchImpl$2$emit$1) {
            flowKt__ErrorsKt$catchImpl$2$emit$1 = (FlowKt__ErrorsKt$catchImpl$2$emit$1) shortNewsContentCardView;
            int i = flowKt__ErrorsKt$catchImpl$2$emit$1.write;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__ErrorsKt$catchImpl$2$emit$1.write = i - Integer.MIN_VALUE;
            } else {
                flowKt__ErrorsKt$catchImpl$2$emit$1 = new FlowKt__ErrorsKt$catchImpl$2$emit$1(this, shortNewsContentCardView);
            }
        } else {
            flowKt__ErrorsKt$catchImpl$2$emit$1 = new FlowKt__ErrorsKt$catchImpl$2$emit$1(this, shortNewsContentCardView);
        }
        Object obj2 = flowKt__ErrorsKt$catchImpl$2$emit$1.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = flowKt__ErrorsKt$catchImpl$2$emit$1.write;
        if (i2 != 0) {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            flowKt__ErrorsKt$catchImpl$2 = (FlowKt__ErrorsKt$catchImpl$2) flowKt__ErrorsKt$catchImpl$2$emit$1.read;
            try {
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                return createFromParcel.INSTANCE;
            } catch (Throwable th) {
                th = th;
                flowKt__ErrorsKt$catchImpl$2.read.IconCompatParcelizer = th;
                throw th;
            }
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj2);
        try {
            FlowCollector flowCollector = this.IconCompatParcelizer;
            flowKt__ErrorsKt$catchImpl$2$emit$1.read = this;
            flowKt__ErrorsKt$catchImpl$2$emit$1.write = 1;
            if (flowCollector.emit(obj, flowKt__ErrorsKt$catchImpl$2$emit$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return createFromParcel.INSTANCE;
        } catch (Throwable th2) {
            th = th2;
            flowKt__ErrorsKt$catchImpl$2 = this;
            flowKt__ErrorsKt$catchImpl$2.read.IconCompatParcelizer = th;
            throw th;
        }
    }
}

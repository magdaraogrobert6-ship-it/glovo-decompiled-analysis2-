package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import o.ShortNewsContentCardView;
import o.createBrazeUserChangeEventSubscriberlambda01;
import o.createFromParcel;

/* JADX INFO: loaded from: classes4.dex */
public final class FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 implements Flow<Object> {
    public final /* synthetic */ Flow IconCompatParcelizer;

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
        Object objCollect = this.IconCompatParcelizer.collect(new FlowKt__LimitKt$drop$2$1(new createBrazeUserChangeEventSubscriberlambda01(), flowCollector), shortNewsContentCardView);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : createFromParcel.INSTANCE;
    }

    public FlowKt__LimitKt$drop$$inlined$unsafeFlow$1(Flow flow) {
        this.IconCompatParcelizer = flow;
    }
}

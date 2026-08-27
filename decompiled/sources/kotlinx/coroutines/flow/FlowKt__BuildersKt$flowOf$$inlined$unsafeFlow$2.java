package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import o.ShortNewsContentCardView;
import o.createFromParcel;

/* JADX INFO: loaded from: classes4.dex */
public final class FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 implements Flow<Object> {
    public final /* synthetic */ Object serializer;

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
        Object objEmit = flowCollector.emit(this.serializer, shortNewsContentCardView);
        return objEmit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEmit : createFromParcel.INSTANCE;
    }

    public FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(Object obj) {
        this.serializer = obj;
    }
}

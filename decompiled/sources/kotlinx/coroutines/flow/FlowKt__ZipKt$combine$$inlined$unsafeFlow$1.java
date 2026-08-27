package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.CombineKt;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes4.dex */
public final class FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 implements Flow<Object> {
    public final /* synthetic */ Flow IconCompatParcelizer;
    public final /* synthetic */ Flow RemoteActionCompatParcelizer;
    public final /* synthetic */ r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY serializer;

    public FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(Flow flow, Flow flow2, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) {
        this.RemoteActionCompatParcelizer = flow;
        this.IconCompatParcelizer = flow2;
        this.serializer = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
        Object objCombineInternal = CombineKt.combineInternal(shortNewsContentCardView, FlowKt__ZipKt$nullArrayFactory$1.write, new FlowKt__ZipKt$combine$1$1(this.serializer, null), flowCollector, new Flow[]{this.RemoteActionCompatParcelizer, this.IconCompatParcelizer});
        return objCombineInternal == CoroutineSingletons.COROUTINE_SUSPENDED ? objCombineInternal : createFromParcel.INSTANCE;
    }
}

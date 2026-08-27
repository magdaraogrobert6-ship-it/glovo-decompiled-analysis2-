package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import o.ShortNewsContentCardView;
import o.cancelPendingWebViewPause;
import o.createFromParcel;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes4.dex */
public final class FlowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1 implements Flow<Object> {
    public final /* synthetic */ Flow IconCompatParcelizer;
    public final /* synthetic */ r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 RemoteActionCompatParcelizer;

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
        Object objCollect = this.IconCompatParcelizer.collect(new FlowKt__LimitKt$dropWhile$1$1(new cancelPendingWebViewPause(), flowCollector, this.RemoteActionCompatParcelizer), shortNewsContentCardView);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : createFromParcel.INSTANCE;
    }

    public FlowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, Flow flow) {
        this.IconCompatParcelizer = flow;
        this.RemoteActionCompatParcelizer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
    }
}

package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;
import o.createInAppMessageEventSubscriber;

/* JADX INFO: loaded from: classes4.dex */
final class FlowKt__ErrorsKt$catchImpl$1<T> extends ContinuationImpl {
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object serializer;
    public createInAppMessageEventSubscriber write;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.serializer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        return FlowKt.catchImpl(null, null, this);
    }

    public FlowKt__ErrorsKt$catchImpl$1(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}

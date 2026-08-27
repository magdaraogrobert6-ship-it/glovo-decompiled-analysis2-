package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.reactive.FlowSubscription;

/* JADX INFO: loaded from: classes4.dex */
public final class onBackProgressed extends ContinuationImpl {
    public FlowSubscription IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ FlowSubscription read;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onBackProgressed(FlowSubscription flowSubscription, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.read = flowSubscription;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        return FlowSubscription.access$flowProcessing(this.read, this);
    }
}

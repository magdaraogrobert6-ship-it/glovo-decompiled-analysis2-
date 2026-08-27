package o;

import com.deliveryhero.selfServiceChat.domain.analytics.WebChatEventsTrackerImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes2.dex */
public final class VectorNode extends ContinuationImpl {
    public WebChatEventsTrackerImpl IconCompatParcelizer;
    public SuspendLambda RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public int serializer;
    public final /* synthetic */ WebChatEventsTrackerImpl write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorNode(WebChatEventsTrackerImpl webChatEventsTrackerImpl, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.write = webChatEventsTrackerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.read = obj;
        this.serializer |= Integer.MIN_VALUE;
        return this.write.ifTrackingEnabled(this, null);
    }
}

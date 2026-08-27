package o;

import com.deliveryhero.selfServiceChat.ui.WebChatViewmodel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class VectorPropertyTrimPathEnd extends ContinuationImpl {
    public int RemoteActionCompatParcelizer;
    public WebChatViewmodel read;
    public /* synthetic */ Object serializer;
    public final /* synthetic */ WebChatViewmodel write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorPropertyTrimPathEnd(WebChatViewmodel webChatViewmodel, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.write = webChatViewmodel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.serializer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        return this.write.onInitStarted(this);
    }
}

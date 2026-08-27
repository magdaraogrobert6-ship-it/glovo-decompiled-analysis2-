package o;

import com.deliveryhero.selfServiceChat.ui.WebChatViewmodel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class VectorPropertyStroke extends ContinuationImpl {
    public final /* synthetic */ WebChatViewmodel IconCompatParcelizer;
    public WebChatViewmodel RemoteActionCompatParcelizer;
    public int read;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorPropertyStroke(WebChatViewmodel webChatViewmodel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = webChatViewmodel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.write = obj;
        this.read |= Integer.MIN_VALUE;
        return this.IconCompatParcelizer.notifyBridgeMessageFailure(null, this);
    }
}

package o;

import com.deliveryhero.selfServiceChat.ui.WebChatViewmodel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class VectorPropertyTrimPathOffset extends ContinuationImpl {
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ WebChatViewmodel RemoteActionCompatParcelizer;
    public WebChatViewmodel read;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorPropertyTrimPathOffset(WebChatViewmodel webChatViewmodel, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = webChatViewmodel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.IconCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        return this.RemoteActionCompatParcelizer.onCloseRequested(null, this);
    }
}

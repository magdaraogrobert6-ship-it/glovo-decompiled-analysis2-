package o;

import com.deliveryhero.selfServiceChat.ui.WebChatViewmodel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class VectorPropertyTrimPathStart extends ContinuationImpl {
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ WebChatViewmodel RemoteActionCompatParcelizer;
    public int read;
    public WebChatViewmodel write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorPropertyTrimPathStart(WebChatViewmodel webChatViewmodel, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = webChatViewmodel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.IconCompatParcelizer = obj;
        this.read |= Integer.MIN_VALUE;
        return this.RemoteActionCompatParcelizer.onHCWontHandleBackNavigation(null, this);
    }
}

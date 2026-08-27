package o;

import com.deliveryhero.selfServiceChat.ui.WebChatViewmodel$observeBridgeMessage$2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class VectorPropertyStrokeAlpha extends ContinuationImpl {
    public int IconCompatParcelizer;
    public final /* synthetic */ WebChatViewmodel$observeBridgeMessage$2 read;
    public WebChatViewmodel$observeBridgeMessage$2 serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorPropertyStrokeAlpha(WebChatViewmodel$observeBridgeMessage$2 webChatViewmodel$observeBridgeMessage$2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.read = webChatViewmodel$observeBridgeMessage$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.write = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        return this.read.emit((onViewAttachedToWindowlambda0) null, (ShortNewsContentCardView) this);
    }
}

package o;

import com.deliveryhero.selfServiceChat.ui.WebChatViewmodel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class AndroidVectorParser extends ContinuationImpl {
    public /* synthetic */ Object IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public WebChatViewmodel read;
    public final /* synthetic */ WebChatViewmodel serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidVectorParser(WebChatViewmodel webChatViewmodel, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.serializer = webChatViewmodel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.IconCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        return this.serializer.sendUpdatedVerificationToken(null, this);
    }
}

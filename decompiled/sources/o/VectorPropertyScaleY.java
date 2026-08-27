package o;

import android.net.Uri;
import com.deliveryhero.selfServiceChat.ui.WebChatViewmodel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class VectorPropertyScaleY extends ContinuationImpl {
    public final /* synthetic */ WebChatViewmodel IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public WebChatViewmodel read;
    public /* synthetic */ Object serializer;
    public Uri write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorPropertyScaleY(WebChatViewmodel webChatViewmodel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = webChatViewmodel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.serializer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        return WebChatViewmodel.access$cacheGalleryImage(this.IconCompatParcelizer, null, this);
    }
}

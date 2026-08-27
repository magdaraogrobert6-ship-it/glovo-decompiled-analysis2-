package o;

import com.deliveryhero.selfServiceChat.ui.WebViewManager;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class updateConfig extends ContinuationImpl {
    public int IconCompatParcelizer;
    public final /* synthetic */ WebViewManager read;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public updateConfig(WebViewManager webViewManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = webViewManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.write = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        return WebViewManager.access$fetchBaseUrl(this.read, this);
    }
}

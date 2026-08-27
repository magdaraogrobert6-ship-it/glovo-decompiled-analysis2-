package o;

import com.deliveryhero.selfServiceChat.ui.WebViewManager;
import com.foodora.courier.main.presentation.MainActivity;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class getDimension extends ContinuationImpl {
    public int IconCompatParcelizer;
    public final /* synthetic */ WebViewManager MediaBrowserCompatMediaItem;
    public /* synthetic */ Object MediaMetadataCompat;
    public WebViewManager RemoteActionCompatParcelizer;
    public MainActivity read;
    public ArrayList serializer;
    public String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getDimension(WebViewManager webViewManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaBrowserCompatMediaItem = webViewManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.MediaMetadataCompat = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        return WebViewManager.access$prefetchChatIds(this.MediaBrowserCompatMediaItem, null, null, this);
    }
}

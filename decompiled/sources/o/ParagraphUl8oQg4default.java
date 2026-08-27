package o;

import com.roadrunner.customerchat.selfservice.presentation.WebViewManager;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class ParagraphUl8oQg4default extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public String RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public int serializer;
    public final /* synthetic */ WebViewManager write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParagraphUl8oQg4default(WebViewManager webViewManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = webViewManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 9;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            this.read = obj;
            this.serializer |= Integer.MIN_VALUE;
            WebViewManager.access$fetchBaseChatUrl(this.write, null, this);
            obj2.hashCode();
            throw null;
        }
        this.read = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objAccess$fetchBaseChatUrl = WebViewManager.access$fetchBaseChatUrl(this.write, null, this);
        int i3 = MediaSessionCompatQueueItem + 119;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return objAccess$fetchBaseChatUrl;
        }
        obj2.hashCode();
        throw null;
    }
}

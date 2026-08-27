package o;

import com.roadrunner.customerchat.selfservice.presentation.WebViewManager;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class ParagraphczeNHc extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaDescriptionCompat = 1;
    public int IconCompatParcelizer;
    public String RemoteActionCompatParcelizer;
    public ArrayList read;
    public /* synthetic */ Object serializer;
    public final /* synthetic */ WebViewManager write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParagraphczeNHc(WebViewManager webViewManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = webViewManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 11;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object obj2 = null;
        Object objAccess$prefetchChatIds = WebViewManager.access$prefetchChatIds(this.write, null, null, this);
        int i4 = MediaDescriptionCompat + 9;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objAccess$prefetchChatIds;
        }
        obj2.hashCode();
        throw null;
    }
}

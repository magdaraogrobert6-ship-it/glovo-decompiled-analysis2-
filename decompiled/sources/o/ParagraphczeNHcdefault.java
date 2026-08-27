package o;

import com.roadrunner.customerchat.selfservice.presentation.WebViewManager;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class ParagraphczeNHcdefault extends ContinuationImpl {
    private static int MediaDescriptionCompat = 1;
    private static int write;
    public final /* synthetic */ WebViewManager IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int read;
    public String serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParagraphczeNHcdefault(WebViewManager webViewManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = webViewManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 63;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.RemoteActionCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return this.IconCompatParcelizer.fetchChatId(null, this);
        }
        this.RemoteActionCompatParcelizer = obj;
        this.read |= Integer.MIN_VALUE;
        this.IconCompatParcelizer.fetchChatId(null, this);
        throw null;
    }
}

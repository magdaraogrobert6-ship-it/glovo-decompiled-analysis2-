package o;

import android.webkit.JavascriptInterface;
import com.deliveryhero.perseus.logger.PerseusLogger$w$1;
import com.deliveryhero.selfServiceChat.ui.WebChatViewmodel;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes2.dex */
public final class VectorPainterKtRenderVectorGroup2 {
    public final java.lang.ref.WeakReference read;

    public VectorPainterKtRenderVectorGroup2(java.lang.ref.WeakReference weakReference) {
        this.read = weakReference;
    }

    @JavascriptInterface
    public final void postMessage(String str) {
        str.getClass();
        WebChatViewmodel webChatViewmodel = (WebChatViewmodel) this.read.get();
        if (webChatViewmodel != null) {
            asComposePaint ascomposepaintIconCompatParcelizer = toBitmapConfig1JJdX4A.IconCompatParcelizer(webChatViewmodel);
            BuildersKt.RemoteActionCompatParcelizer(ascomposepaintIconCompatParcelizer, new getConfig(ascomposepaintIconCompatParcelizer, webChatViewmodel, 2), null, new PerseusLogger$w$1((ShortNewsContentCardView) null, webChatViewmodel, str), 2);
        }
    }
}

package o;

import android.webkit.JavascriptInterface;
import com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel;
import com.roadrunner.web.presentation.WebViewViewModel$handleWebViewError$1;
import kotlinx.coroutines.BuildersKt;
import timber.log.Timber;

/* JADX INFO: loaded from: classes4.dex */
public final class MultiParagraphKt {
    private static int serializer = 0;
    private static int write = 1;
    public final java.lang.ref.WeakReference read;

    public MultiParagraphKt(java.lang.ref.WeakReference weakReference) {
        this.read = weakReference;
    }

    @JavascriptInterface
    public final void postMessage(String str) {
        int i = 2 % 2;
        int i2 = write + 97;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            str.getClass();
            Timber.RemoteActionCompatParcelizer.getClass();
            obj.hashCode();
            throw null;
        }
        str.getClass();
        Timber.RemoteActionCompatParcelizer.getClass();
        r8lambdabLCwxSdGMc8HhOHdC5nKm2_zQzM r8lambdablcwxsdgmc8hhohdc5nkm2_zqzm = (r8lambdabLCwxSdGMc8HhOHdC5nKm2_zQzM) this.read.get();
        if (r8lambdablcwxsdgmc8hhohdc5nkm2_zqzm != null) {
            WebChatViewModel webChatViewModel = (WebChatViewModel) r8lambdablcwxsdgmc8hhohdc5nkm2_zqzm;
            BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(webChatViewModel), new findParagraphByIndexlambda20(webChatViewModel, 1), null, new WebViewViewModel$handleWebViewError$1(webChatViewModel, str, (ShortNewsContentCardView) null), 2);
        }
        int i3 = write + 115;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 8 / 0;
        }
    }
}

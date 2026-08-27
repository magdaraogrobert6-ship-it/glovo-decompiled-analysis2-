package androidx.webkit.internal;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import o.accessgetFp32DenormalFloatp;

/* JADX INFO: loaded from: classes4.dex */
public class WebViewRenderProcessClientFrameworkAdapter extends WebViewRenderProcessClient {
    public final void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        WeakHashMap weakHashMap = accessgetFp32DenormalFloatp.serializer;
        if (((accessgetFp32DenormalFloatp) weakHashMap.get(webViewRenderProcess)) == null) {
            accessgetFp32DenormalFloatp accessgetfp32denormalfloatp = new accessgetFp32DenormalFloatp();
            new WeakReference(webViewRenderProcess);
            weakHashMap.put(webViewRenderProcess, accessgetfp32denormalfloatp);
        }
        throw null;
    }

    public final void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        WeakHashMap weakHashMap = accessgetFp32DenormalFloatp.serializer;
        if (((accessgetFp32DenormalFloatp) weakHashMap.get(webViewRenderProcess)) == null) {
            accessgetFp32DenormalFloatp accessgetfp32denormalfloatp = new accessgetFp32DenormalFloatp();
            new WeakReference(webViewRenderProcess);
            weakHashMap.put(webViewRenderProcess, accessgetfp32denormalfloatp);
        }
        throw null;
    }
}

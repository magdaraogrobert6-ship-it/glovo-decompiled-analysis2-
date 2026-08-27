package androidx.webkit;

import android.webkit.SafeBrowsingResponse;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.camera.video.Recorder$3;
import io.sentry.android.core.SystemEventsBreadcrumbsIntegration;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import o.getExponentimpl;
import o.getNegativeInfinityslo4al4;
import o.getPositiveInfinityslo4al4;
import o.toLongimpl;
import okio.Options;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewClientBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: loaded from: classes4.dex */
public class WebViewClientCompat extends WebViewClient implements WebViewClientBoundaryInterface {
    public static final String[] serializer = {"VISUAL_STATE_CALLBACK", "RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_HTTP_ERROR", "SHOULD_OVERRIDE_WITH_REDIRECTS", "SAFE_BROWSING_HIT"};

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return serializer;
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onPageCommitVisible(WebView webView, String str) {
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
    }

    public final void RemoteActionCompatParcelizer(WebView webView, WebResourceRequest webResourceRequest, Recorder$3 recorder$3) {
        if (toLongimpl.write("WEB_RESOURCE_ERROR_GET_CODE") && toLongimpl.write("WEB_RESOURCE_ERROR_GET_DESCRIPTION") && webResourceRequest.isForMainFrame()) {
            getNegativeInfinityslo4al4.MediaDescriptionCompat.getClass();
            if (((WebResourceError) recorder$3.MediaBrowserCompatMediaItem) == null) {
                getExponentimpl getexponentimpl = getPositiveInfinityslo4al4.RemoteActionCompatParcelizer;
                recorder$3.MediaBrowserCompatMediaItem = (WebResourceError) ((WebkitToCompatConverterBoundaryInterface) getexponentimpl.read).convertWebResourceError(Proxy.getInvocationHandler((WebResourceErrorBoundaryInterface) recorder$3.RemoteActionCompatParcelizer));
            }
            int errorCode = ((WebResourceError) recorder$3.MediaBrowserCompatMediaItem).getErrorCode();
            getNegativeInfinityslo4al4.MediaBrowserCompatMediaItem.getClass();
            if (((WebResourceError) recorder$3.MediaBrowserCompatMediaItem) == null) {
                getExponentimpl getexponentimpl2 = getPositiveInfinityslo4al4.RemoteActionCompatParcelizer;
                recorder$3.MediaBrowserCompatMediaItem = (WebResourceError) ((WebkitToCompatConverterBoundaryInterface) getexponentimpl2.read).convertWebResourceError(Proxy.getInvocationHandler((WebResourceErrorBoundaryInterface) recorder$3.RemoteActionCompatParcelizer));
            }
            onReceivedError(webView, errorCode, ((WebResourceError) recorder$3.MediaBrowserCompatMediaItem).getDescription().toString(), webResourceRequest.getUrl().toString());
        }
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, InvocationHandler invocationHandler) {
        int iWrite = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
        int iWrite2 = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
        int iWrite3 = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
        SafeBrowsingResponseBoundaryInterface safeBrowsingResponseBoundaryInterface = (SafeBrowsingResponseBoundaryInterface) Options.Companion.read(iWrite, 1514248696, iWrite2, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{SafeBrowsingResponseBoundaryInterface.class, invocationHandler}, iWrite3, -1514248694);
        if (!toLongimpl.write("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL")) {
            throw getNegativeInfinityslo4al4.RemoteActionCompatParcelizer();
        }
        getNegativeInfinityslo4al4.write.getClass();
        getExponentimpl getexponentimpl = getPositiveInfinityslo4al4.RemoteActionCompatParcelizer;
        ((SafeBrowsingResponse) ((WebkitToCompatConverterBoundaryInterface) getexponentimpl.read).convertSafeBrowsingResponse(Proxy.getInvocationHandler(safeBrowsingResponseBoundaryInterface))).showInterstitial(true);
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        if (toLongimpl.write("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL")) {
            getNegativeInfinityslo4al4.write.getClass();
            if (safeBrowsingResponse == null) {
                getExponentimpl getexponentimpl = getPositiveInfinityslo4al4.RemoteActionCompatParcelizer;
                safeBrowsingResponse = (SafeBrowsingResponse) ((WebkitToCompatConverterBoundaryInterface) getexponentimpl.read).convertSafeBrowsingResponse(Proxy.getInvocationHandler(null));
            }
            safeBrowsingResponse.showInterstitial(true);
            return;
        }
        throw getNegativeInfinityslo4al4.RemoteActionCompatParcelizer();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Recorder$3 recorder$3 = new Recorder$3(12);
        recorder$3.MediaBrowserCompatMediaItem = webResourceError;
        RemoteActionCompatParcelizer(webView, webResourceRequest, recorder$3);
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, InvocationHandler invocationHandler) {
        Recorder$3 recorder$3 = new Recorder$3(12);
        int iWrite = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
        int iWrite2 = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
        int iWrite3 = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
        recorder$3.RemoteActionCompatParcelizer = (WebResourceErrorBoundaryInterface) Options.Companion.read(iWrite, 1514248696, iWrite2, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{WebResourceErrorBoundaryInterface.class, invocationHandler}, iWrite3, -1514248694);
        RemoteActionCompatParcelizer(webView, webResourceRequest, recorder$3);
    }
}

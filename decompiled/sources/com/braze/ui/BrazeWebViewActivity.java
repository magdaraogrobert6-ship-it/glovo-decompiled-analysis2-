package com.braze.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.webkit.ConsoleMessage;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.FragmentActivity;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.braze.BrazeInternal;
import com.braze.enums.Channel;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.i$$ExternalSyntheticLambda0;
import com.braze.support.i$$ExternalSyntheticLambda1;
import com.braze.ui.actions.UriAction;
import com.braze.ui.support.ViewUtils;
import o.onContentCardDismissed;
import o.onItemDismisslambda0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint
public class BrazeWebViewActivity extends FragmentActivity {

    /* JADX INFO: renamed from: com.braze.ui.BrazeWebViewActivity$createWebViewClient$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00791 extends WebViewClient {
        private final Boolean handleUrlOverride(Context context, String str) {
            try {
                if (onContentCardDismissed.write(BrazeFileUtils.REMOTE_SCHEMES, Uri.parse(str).getScheme())) {
                    return null;
                }
                UriAction uriActionCreateUriActionFromUrlString = BrazeDeeplinkHandler.Companion.getInstance().createUriActionFromUrlString(str, BrazeWebViewActivity.this.getIntent().getExtras(), false, Channel.UNKNOWN);
                if (uriActionCreateUriActionFromUrlString == null) {
                    return Boolean.FALSE;
                }
                uriActionCreateUriActionFromUrlString.execute(context);
                BrazeWebViewActivity.this.finish();
                return Boolean.TRUE;
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda1(str, 1), 4, (Object) null);
                return null;
            }
        }

        public C00791() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String onRenderProcessGone$lambda$1() {
            return "The webview rendering process crashed, returning true";
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            webView.getClass();
            renderProcessGoneDetail.getClass();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda0(5), 6, (Object) null);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            webView.getClass();
            webResourceRequest.getClass();
            Context context = webView.getContext();
            context.getClass();
            String string = webResourceRequest.getUrl().toString();
            string.getClass();
            Boolean boolHandleUrlOverride = handleUrlOverride(context, string);
            return boolHandleUrlOverride != null ? boolHandleUrlOverride.booleanValue() : super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleUrlOverride$lambda$0(String str) {
            return ff$$ExternalSyntheticOutline0.m("Unexpected exception while processing url ", str, ". Passing url back to WebView.");
        }

        @Override // android.webkit.WebViewClient
        @onItemDismisslambda0
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            webView.getClass();
            str.getClass();
            Context context = webView.getContext();
            context.getClass();
            Boolean boolHandleUrlOverride = handleUrlOverride(context, str);
            return boolHandleUrlOverride != null ? boolHandleUrlOverride.booleanValue() : super.shouldOverrideUrlLoading(webView, str);
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.BrazeWebViewActivity$createWebChromeClient$1, reason: invalid class name */
    public static final class AnonymousClass1 extends WebChromeClient {
        @Override // android.webkit.WebChromeClient
        public Bitmap getDefaultVideoPoster() {
            return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            consoleMessage.getClass();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeWebViewActivity$createWebChromeClient$1$$ExternalSyntheticLambda0(consoleMessage, 0), 7, (Object) null);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String onConsoleMessage$lambda$0(ConsoleMessage consoleMessage) {
            int iLineNumber = consoleMessage.lineNumber();
            String strSourceId = consoleMessage.sourceId();
            ConsoleMessage.MessageLevel messageLevel = consoleMessage.messageLevel();
            String strMessage = consoleMessage.message();
            StringBuilder sbM = d$$ExternalSyntheticOutline0.m("Braze WebView Activity log. Line: ", iLineNumber, ". SourceId: ", strSourceId, ". Log Level: ");
            sbM.append(messageLevel);
            sbM.append(". Message: ");
            sbM.append(strMessage);
            return sbM.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCreate$lambda$1() {
        return "Error creating BrazeWebViewActivity. Webview will not display.";
    }

    public WebChromeClient createWebChromeClient() {
        return new AnonymousClass1();
    }

    public WebViewClient createWebViewClient() {
        return new C00791();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String string;
        try {
            super.onCreate(bundle);
            getWindow().setFlags(16777216, 16777216);
            if (BrazeInternal.INSTANCE.getConfigurationProvider(this).getShouldUseWindowFlagSecureInActivities()) {
                getWindow().setFlags(8192, 8192);
            }
            setContentView(R.layout.com_braze_webview_activity);
            WebView webView = (WebView) findViewById(R.id.com_braze_webview_activity_webview);
            webView.setLayerType(2, null);
            WebSettings settings = webView.getSettings();
            settings.getClass();
            settings.setAllowFileAccess(false);
            settings.setBuiltInZoomControls(true);
            settings.setJavaScriptEnabled(true);
            settings.setUseWideViewPort(true);
            settings.setLoadWithOverviewMode(true);
            settings.setDisplayZoomControls(false);
            settings.setDomStorageEnabled(true);
            Context applicationContext = getApplicationContext();
            applicationContext.getClass();
            if (ViewUtils.isDeviceInNightMode(applicationContext)) {
                int i = Build.VERSION.SDK_INT;
                if (i >= 33) {
                    settings.setAlgorithmicDarkeningAllowed(true);
                } else if (i >= 29) {
                    settings.setForceDark(2);
                }
            }
            webView.setWebChromeClient(createWebChromeClient());
            webView.setWebViewClient(createWebViewClient());
            Bundle extras = getIntent().getExtras();
            if (extras == null || (string = extras.getString("url")) == null) {
                return;
            }
            webView.loadUrl(string);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda0(4), 4, (Object) null);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}

package com.braze.ui.inappmessage.views;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import bo.app.d$$ExternalSyntheticOutline0;
import com.braze.support.BrazeLogger;
import com.braze.ui.BrazeWebViewActivity$createWebChromeClient$1$$ExternalSyntheticLambda0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.setRectOutlinetz77jQwdefault;

/* JADX INFO: loaded from: classes.dex */
public final class InAppMessageHtmlBaseView$messageWebView$6 extends WebChromeClient {
    final /* synthetic */ boolean $isLinkTargetSupported;
    final /* synthetic */ InAppMessageHtmlBaseView this$0;

    @Override // android.webkit.WebChromeClient
    public Bitmap getDefaultVideoPoster() {
        return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
    }

    public InAppMessageHtmlBaseView$messageWebView$6(InAppMessageHtmlBaseView inAppMessageHtmlBaseView, boolean z) {
        this.this$0 = inAppMessageHtmlBaseView;
        this.$isLinkTargetSupported = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCreateWindow$lambda$1() {
        return "linkTargetSupport not enabled, passing to super.onCreateWindow()";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCreateWindow$lambda$2() {
        return "onCreateWindow webView is null, not opening link";
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        consoleMessage.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this.this$0, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeWebViewActivity$createWebChromeClient$1$$ExternalSyntheticLambda0(consoleMessage, 1), 7, (Object) null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onConsoleMessage$lambda$0(ConsoleMessage consoleMessage) {
        int iLineNumber = consoleMessage.lineNumber();
        String strSourceId = consoleMessage.sourceId();
        ConsoleMessage.MessageLevel messageLevel = consoleMessage.messageLevel();
        String strMessage = consoleMessage.message();
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("Braze HTML In-app Message log. Line: ", iLineNumber, ". SourceId: ", strSourceId, ". Log Level: ");
        sbM.append(messageLevel);
        sbM.append(". Message: ");
        sbM.append(strMessage);
        return sbM.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCreateWindow$lambda$3(WebView.HitTestResult hitTestResult) {
        return "onCreateWindow HitTestResult is " + hitTestResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCreateWindow$lambda$5(WebView.HitTestResult hitTestResult) {
        return "Failed to open link in new window. " + hitTestResult;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        if (!this.$isLinkTargetSupported) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new setRectOutlinetz77jQwdefault(8), 6, (Object) null);
            return super.onCreateWindow(webView, z, z2, message);
        }
        final int i = 0;
        if (webView == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new setRectOutlinetz77jQwdefault(9), 6, (Object) null);
            return false;
        }
        final WebView.HitTestResult hitTestResult = webView.getHitTestResult();
        hitTestResult.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$messageWebView$6$$ExternalSyntheticLambda3
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i2 = i;
                WebView.HitTestResult hitTestResult2 = hitTestResult;
                if (i2 != 0) {
                    return i2 != 1 ? InAppMessageHtmlBaseView$messageWebView$6.onCreateWindow$lambda$5(hitTestResult2) : InAppMessageHtmlBaseView$messageWebView$6.onCreateWindow$lambda$4(hitTestResult2);
                }
                return InAppMessageHtmlBaseView$messageWebView$6.onCreateWindow$lambda$3(hitTestResult2);
            }
        }, 6, (Object) null);
        final int i2 = 2;
        try {
            int type = hitTestResult.getType();
            if (type == 2) {
                this.this$0.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("tel:" + hitTestResult.getExtra())));
                return false;
            }
            if (type == 4) {
                this.this$0.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("mailto:" + hitTestResult.getExtra())));
                return false;
            }
            if (type != 7) {
                final int i3 = 1;
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$messageWebView$6$$ExternalSyntheticLambda3
                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                    public final Object invoke() {
                        int i4 = i3;
                        WebView.HitTestResult hitTestResult2 = hitTestResult;
                        if (i4 != 0) {
                            return i4 != 1 ? InAppMessageHtmlBaseView$messageWebView$6.onCreateWindow$lambda$5(hitTestResult2) : InAppMessageHtmlBaseView$messageWebView$6.onCreateWindow$lambda$4(hitTestResult2);
                        }
                        return InAppMessageHtmlBaseView$messageWebView$6.onCreateWindow$lambda$3(hitTestResult2);
                    }
                }, 6, (Object) null);
                return false;
            }
            String extra = hitTestResult.getExtra();
            this.this$0.getContext().startActivity(new Intent("android.intent.action.VIEW", extra != null ? Uri.parse(extra) : null));
            return false;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$messageWebView$6$$ExternalSyntheticLambda3
                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public final Object invoke() {
                    int i4 = i2;
                    WebView.HitTestResult hitTestResult2 = hitTestResult;
                    if (i4 != 0) {
                        return i4 != 1 ? InAppMessageHtmlBaseView$messageWebView$6.onCreateWindow$lambda$5(hitTestResult2) : InAppMessageHtmlBaseView$messageWebView$6.onCreateWindow$lambda$4(hitTestResult2);
                    }
                    return InAppMessageHtmlBaseView$messageWebView$6.onCreateWindow$lambda$3(hitTestResult2);
                }
            }, 4, (Object) null);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCreateWindow$lambda$4(WebView.HitTestResult hitTestResult) {
        return d$$ExternalSyntheticOutline0.m(hitTestResult.getType(), "onCreateWindow: hitTestResult type was ", ". Not doing anything.");
    }
}

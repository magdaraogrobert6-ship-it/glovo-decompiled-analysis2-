package com.braze.ui.inappmessage.factories;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.InAppMessageHtmlFull;
import com.braze.support.BrazeLogger;
import com.braze.ui.R;
import com.braze.ui.inappmessage.IInAppMessageViewFactory;
import com.braze.ui.inappmessage.InAppMessageManagerBase$$ExternalSyntheticLambda1;
import com.braze.ui.inappmessage.jsinterface.InAppMessageJavascriptInterface;
import com.braze.ui.inappmessage.listeners.IInAppMessageWebViewClientListener;
import com.braze.ui.inappmessage.utils.InAppMessageWebViewClient;
import com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView;
import com.braze.ui.inappmessage.views.InAppMessageHtmlFullView;
import com.braze.ui.support.ViewUtils;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public class DefaultInAppMessageHtmlFullViewFactory implements IInAppMessageViewFactory {
    private final IInAppMessageWebViewClientListener inAppMessageWebViewClientListener;

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createInAppMessageView$lambda$0() {
        return "The device is not currently in touch mode. This message requires user touch interaction to display properly. Please set setIsTouchModeRequiredForHtmlInAppMessages to false to change this behavior.";
    }

    public DefaultInAppMessageHtmlFullViewFactory(IInAppMessageWebViewClientListener iInAppMessageWebViewClientListener) {
        iInAppMessageWebViewClientListener.getClass();
        this.inAppMessageWebViewClientListener = iInAppMessageWebViewClientListener;
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageViewFactory
    @SuppressLint
    public InAppMessageHtmlFullView createInAppMessageView(Activity activity, IInAppMessage iInAppMessage) {
        activity.getClass();
        iInAppMessage.getClass();
        View viewInflate = activity.getLayoutInflater().inflate(R.layout.com_braze_inappmessage_html_full, (ViewGroup) null);
        viewInflate.getClass();
        InAppMessageHtmlFullView inAppMessageHtmlFullView = (InAppMessageHtmlFullView) viewInflate;
        Context applicationContext = activity.getApplicationContext();
        applicationContext.getClass();
        if (new BrazeConfigurationProvider(applicationContext).isTouchModeRequiredForHtmlInAppMessages() && ViewUtils.isDeviceNotInTouchMode(inAppMessageHtmlFullView)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new InAppMessageManagerBase$$ExternalSyntheticLambda1(6), 6, (Object) null);
            return null;
        }
        Context applicationContext2 = activity.getApplicationContext();
        InAppMessageHtmlFull inAppMessageHtmlFull = (InAppMessageHtmlFull) iInAppMessage;
        applicationContext2.getClass();
        InAppMessageJavascriptInterface inAppMessageJavascriptInterface = new InAppMessageJavascriptInterface(applicationContext2, inAppMessageHtmlFull);
        inAppMessageHtmlFullView.setWebViewContent(inAppMessageHtmlFull.getMessage(), inAppMessageHtmlFull.getLocalAssetsDirectoryUrl());
        inAppMessageHtmlFullView.setInAppMessageWebViewClient(new InAppMessageWebViewClient(applicationContext2, iInAppMessage, this.inAppMessageWebViewClientListener, inAppMessageHtmlFull.getLocalAssetsDirectoryUrl()));
        WebView messageWebView = inAppMessageHtmlFullView.getMessageWebView();
        if (messageWebView != null) {
            messageWebView.addJavascriptInterface(inAppMessageJavascriptInterface, InAppMessageHtmlBaseView.BRAZE_BRIDGE_PREFIX);
        }
        inAppMessageHtmlFullView.setupDirectionalNavigation();
        return inAppMessageHtmlFullView;
    }
}

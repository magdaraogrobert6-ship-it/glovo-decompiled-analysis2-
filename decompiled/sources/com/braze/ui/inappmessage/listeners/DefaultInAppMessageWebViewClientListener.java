package com.braze.ui.inappmessage.listeners;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import bo.app.ig$$ExternalSyntheticLambda7;
import com.braze.Braze;
import com.braze.enums.Channel;
import com.braze.enums.inappmessage.MessageType;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.IInAppMessageHtml;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.BundleUtils;
import com.braze.support.i$$ExternalSyntheticLambda1;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.BrazeWebViewClient;
import com.braze.ui.actions.UriAction;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.InAppMessageManagerBase$$ExternalSyntheticLambda1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.hideCurrentlyDisplayingInAppMessage;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes.dex */
public class DefaultInAppMessageWebViewClientListener implements IInAppMessageWebViewClientListener {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void logHtmlInAppMessageClick(IInAppMessage iInAppMessage, Bundle bundle) {
            iInAppMessage.getClass();
            bundle.getClass();
            if (!bundle.containsKey(BrazeWebViewClient.QUERY_NAME_BUTTON_ID)) {
                if (iInAppMessage.getMessageType() == MessageType.HTML_FULL) {
                    iInAppMessage.logClick();
                }
            } else {
                IInAppMessageHtml iInAppMessageHtml = (IInAppMessageHtml) iInAppMessage;
                String string = bundle.getString(BrazeWebViewClient.QUERY_NAME_BUTTON_ID);
                if (string != null) {
                    iInAppMessageHtml.logButtonClick(string);
                }
            }
        }

        public final boolean parseUseWebViewFromQueryBundle(IInAppMessage iInAppMessage, Bundle bundle) {
            boolean z;
            boolean z2;
            boolean z3;
            iInAppMessage.getClass();
            bundle.getClass();
            if (bundle.containsKey(BrazeWebViewClient.QUERY_NAME_DEEPLINK)) {
                z = Boolean.parseBoolean(bundle.getString(BrazeWebViewClient.QUERY_NAME_DEEPLINK));
                z2 = true;
            } else {
                z = false;
                z2 = false;
            }
            if (bundle.containsKey(BrazeWebViewClient.QUERY_NAME_EXTERNAL_OPEN)) {
                z3 = Boolean.parseBoolean(bundle.getString(BrazeWebViewClient.QUERY_NAME_EXTERNAL_OPEN));
                z2 = true;
            } else {
                z3 = false;
            }
            boolean openUriInWebView = iInAppMessage.getOpenUriInWebView();
            if (z2) {
                return (z || z3) ? false : true;
            }
            return openUriInWebView;
        }

        private Companion() {
        }
    }

    private final BrazeInAppMessageManager getInAppMessageManager() {
        return BrazeInAppMessageManager.Companion.getInstance();
    }

    public static final void logHtmlInAppMessageClick(IInAppMessage iInAppMessage, Bundle bundle) {
        Companion.logHtmlInAppMessageClick(iInAppMessage, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCloseAction$lambda$0() {
        return "IInAppMessageWebViewClientListener.onCloseAction called.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCloseAction$lambda$1() {
        return "IInAppMessageWebViewClientListener.onCloseAction finished.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCustomEventAction$lambda$0() {
        return "IInAppMessageWebViewClientListener.onCustomEventAction called.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCustomEventAction$lambda$1() {
        return "Can't perform custom event action because the activity is null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onOtherUrlAction$lambda$0() {
        return "IInAppMessageWebViewClientListener.onOtherUrlAction called.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onOtherUrlAction$lambda$1(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Can't perform other url action because the cached activity is null. Url: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onOtherUrlAction$lambda$2(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("HTML message action listener handled url in onOtherUrlAction. Doing nothing further. Url: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onOtherUrlAction$lambda$3(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("UriAction is null. Not passing any URI to BrazeDeeplinkHandler. Url: ", str);
    }

    public static final boolean parseUseWebViewFromQueryBundle(IInAppMessage iInAppMessage, Bundle bundle) {
        return Companion.parseUseWebViewFromQueryBundle(iInAppMessage, bundle);
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageWebViewClientListener
    public void onCloseAction(IInAppMessage iInAppMessage, String str, Bundle bundle) {
        iInAppMessage.getClass();
        str.getClass();
        bundle.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new InAppMessageManagerBase$$ExternalSyntheticLambda1(20), 7, (Object) null);
        Companion.logHtmlInAppMessageClick(iInAppMessage, bundle);
        getInAppMessageManager().hideCurrentlyDisplayingInAppMessage(true);
        getInAppMessageManager().getHtmlInAppMessageActionListener().onCloseClicked(iInAppMessage, str, bundle);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new InAppMessageManagerBase$$ExternalSyntheticLambda1(21), 7, (Object) null);
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageWebViewClientListener
    public void onCustomEventAction(IInAppMessage iInAppMessage, String str, Bundle bundle) {
        BrazeWebViewClient.Companion companion;
        String customEventNameFromQueryBundle;
        iInAppMessage.getClass();
        str.getClass();
        bundle.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new InAppMessageManagerBase$$ExternalSyntheticLambda1(22), 7, (Object) null);
        if (getInAppMessageManager().getActivity() == null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new InAppMessageManagerBase$$ExternalSyntheticLambda1(23), 6, (Object) null);
            return;
        }
        if (getInAppMessageManager().getHtmlInAppMessageActionListener().onCustomEventFired(iInAppMessage, str, bundle) || (customEventNameFromQueryBundle = (companion = BrazeWebViewClient.Companion).parseCustomEventNameFromQueryBundle(bundle)) == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) customEventNameFromQueryBundle)) {
            return;
        }
        BrazeProperties propertiesFromQueryBundle = companion.parsePropertiesFromQueryBundle(bundle);
        Activity activity = getInAppMessageManager().getActivity();
        if (activity != null) {
            Braze.Companion.getInstance(activity).logCustomEvent(customEventNameFromQueryBundle, propertiesFromQueryBundle);
        }
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageWebViewClientListener
    public void onOtherUrlAction(IInAppMessage iInAppMessage, String str, Bundle bundle) {
        iInAppMessage.getClass();
        str.getClass();
        bundle.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        int i = 24;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new InAppMessageManagerBase$$ExternalSyntheticLambda1(i), 7, (Object) null);
        if (getInAppMessageManager().getActivity() == null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda1(str, 22), 6, (Object) null);
            return;
        }
        Companion companion = Companion;
        companion.logHtmlInAppMessageClick(iInAppMessage, bundle);
        if (getInAppMessageManager().getHtmlInAppMessageActionListener().onOtherUrlAction(iInAppMessage, str, bundle)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda1(str, 23), 6, (Object) null);
            return;
        }
        boolean useWebViewFromQueryBundle = companion.parseUseWebViewFromQueryBundle(iInAppMessage, bundle);
        Bundle bundle2 = BundleUtils.toBundle(iInAppMessage.getExtras());
        bundle2.putAll(bundle);
        BrazeDeeplinkHandler.Companion companion2 = BrazeDeeplinkHandler.Companion;
        UriAction uriActionCreateUriActionFromUrlString = companion2.getInstance().createUriActionFromUrlString(str, bundle2, useWebViewFromQueryBundle, Channel.INAPP_MESSAGE);
        if (uriActionCreateUriActionFromUrlString == null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda1(str, i), 6, (Object) null);
            return;
        }
        Uri uri = uriActionCreateUriActionFromUrlString.getUri();
        if (BrazeFileUtils.isLocalUri(uri)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ig$$ExternalSyntheticLambda7(2, uri, str), 6, (Object) null);
            return;
        }
        iInAppMessage.setAnimateOut(false);
        getInAppMessageManager().hideCurrentlyDisplayingInAppMessage(false);
        Activity activity = getInAppMessageManager().getActivity();
        if (activity != null) {
            companion2.getInstance().gotoUri(activity, uriActionCreateUriActionFromUrlString);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onOtherUrlAction$lambda$4(Uri uri, String str) {
        return "Not passing local uri to BrazeDeeplinkHandler. Got local uri: " + uri + " for url: " + str;
    }
}

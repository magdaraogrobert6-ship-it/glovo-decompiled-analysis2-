package com.braze.ui.banners.listeners;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.ig$$ExternalSyntheticLambda7;
import com.braze.Braze;
import com.braze.enums.Channel;
import com.braze.models.push.BrazeNotificationPayload$Companion$$ExternalSyntheticLambda0;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.i$$ExternalSyntheticLambda0;
import com.braze.support.i$$ExternalSyntheticLambda1;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.BrazeWebViewClient;
import com.braze.ui.actions.UriAction;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.hideCurrentlyDisplayingInAppMessage;
import o.isConvex;
import o.onContentCardDismissed;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public class DefaultBannerWebViewClientListener implements IBannerWebViewClientListener {
    public static final Companion Companion = new Companion(null);
    private final String placementId;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String logHtmlClick$lambda$0(String str, Bundle bundle) {
            return af$$ExternalSyntheticOutline0.m("Banner URL click queryBundle for placementId=", str, ": ", DefaultBannerWebViewClientListener.Companion.formatQueryBundleForLog(bundle));
        }

        public final void logHtmlClick(Context context, String str, Bundle bundle) {
            context.getClass();
            str.getClass();
            bundle.getClass();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationPayload$Companion$$ExternalSyntheticLambda0(8, bundle, str), 6, (Object) null);
            String string = bundle.getString(BrazeWebViewClient.QUERY_NAME_BUTTON_ID);
            if (string == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) string)) {
                string = null;
            }
            Braze.Companion.getInstance(context).logBannerClick(str, string);
        }

        private Companion() {
        }

        public final boolean parseUseWebViewFromQueryBundle(Bundle bundle) {
            boolean z;
            boolean z2;
            boolean z3;
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
            if (z2) {
                return (z || z3) ? false : true;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence formatQueryBundleForLog$lambda$0(Bundle bundle, String str) {
            return af$$ExternalSyntheticOutline0.m(str, ContainerUtils.KEY_VALUE_DELIMITER, bundle.getString(str));
        }

        private final String formatQueryBundleForLog(Bundle bundle) {
            if (bundle.isEmpty()) {
                return "{}";
            }
            Set<String> setKeySet = bundle.keySet();
            setKeySet.getClass();
            return onContentCardDismissed.IconCompatParcelizer(setKeySet, null, "{", "}", new isConvex(bundle, 2), 25);
        }
    }

    public static final void logHtmlClick(Context context, String str, Bundle bundle) {
        Companion.logHtmlClick(context, str, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCustomEventAction$lambda$0() {
        return "DefaultBannerWebViewClientListener.onCustomEventAction called.";
    }

    public static final boolean parseUseWebViewFromQueryBundle(Bundle bundle) {
        return Companion.parseUseWebViewFromQueryBundle(bundle);
    }

    public DefaultBannerWebViewClientListener(String str) {
        str.getClass();
        this.placementId = str;
    }

    @Override // com.braze.ui.banners.listeners.IBannerWebViewClientListener
    public void onCloseAction(Context context, String str, Bundle bundle) {
        context.getClass();
        str.getClass();
        bundle.getClass();
        Companion.logHtmlClick(context, this.placementId, bundle);
    }

    @Override // com.braze.ui.banners.listeners.IBannerWebViewClientListener
    public void onCustomEventAction(Context context, String str, Bundle bundle) {
        context.getClass();
        str.getClass();
        bundle.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda0(19), 7, (Object) null);
        BrazeWebViewClient.Companion companion = BrazeWebViewClient.Companion;
        String customEventNameFromQueryBundle = companion.parseCustomEventNameFromQueryBundle(bundle);
        if (customEventNameFromQueryBundle == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) customEventNameFromQueryBundle)) {
            return;
        }
        Braze.Companion.getInstance(context).logCustomEvent(customEventNameFromQueryBundle, companion.parsePropertiesFromQueryBundle(bundle));
    }

    @Override // com.braze.ui.banners.listeners.IBannerWebViewClientListener
    public void onOtherUrlAction(Context context, String str, Bundle bundle) {
        context.getClass();
        str.getClass();
        bundle.getClass();
        Companion companion = Companion;
        companion.logHtmlClick(context, this.placementId, bundle);
        boolean useWebViewFromQueryBundle = companion.parseUseWebViewFromQueryBundle(bundle);
        BrazeDeeplinkHandler.Companion companion2 = BrazeDeeplinkHandler.Companion;
        UriAction uriActionCreateUriActionFromUrlString = companion2.getInstance().createUriActionFromUrlString(str, bundle, useWebViewFromQueryBundle, Channel.BANNER);
        if (uriActionCreateUriActionFromUrlString == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda1(str, 21), 6, (Object) null);
            return;
        }
        Uri uri = uriActionCreateUriActionFromUrlString.getUri();
        if (BrazeFileUtils.isLocalUri(uri)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ig$$ExternalSyntheticLambda7(1, uri, str), 6, (Object) null);
        } else {
            companion2.getInstance().gotoUri(context, uriActionCreateUriActionFromUrlString);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onOtherUrlAction$lambda$0(String str) {
        return ff$$ExternalSyntheticOutline0.m("UriAction is null. Not passing any URI to BrazeDeeplinkHandler. Url: ", str, ".");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onOtherUrlAction$lambda$1(Uri uri, String str) {
        return "Not passing local uri to BrazeDeeplinkHandler. Got local uri: " + uri + " for url: " + str + ".";
    }
}

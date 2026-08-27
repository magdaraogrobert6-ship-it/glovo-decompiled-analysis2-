package com.braze.push.support;

import android.text.Html;
import android.text.Spanned;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils$$ExternalSyntheticLambda1;
import o.hideCurrentlyDisplayingInAppMessage;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class HtmlUtils {
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("HtmlUtils");

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getHtmlSpannedTextIfEnabled$lambda$0() {
        return "Cannot create html spanned text on blank text. Returning blank string.";
    }

    public static final CharSequence getHtmlSpannedTextIfEnabled(String str, BrazeConfigurationProvider brazeConfigurationProvider) {
        str.getClass();
        brazeConfigurationProvider.getClass();
        if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new JsonUtils$$ExternalSyntheticLambda1(15), 14, (Object) null);
            return str;
        }
        if (!brazeConfigurationProvider.isPushNotificationHtmlRenderingEnabled()) {
            return str;
        }
        Spanned spannedFromHtml = Html.fromHtml(str, 0);
        spannedFromHtml.getClass();
        return spannedFromHtml;
    }
}

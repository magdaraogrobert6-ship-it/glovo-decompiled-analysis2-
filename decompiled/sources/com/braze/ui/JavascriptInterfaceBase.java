package com.braze.ui;

import android.content.Context;
import android.webkit.JavascriptInterface;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.braze.Braze;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.support.BrazeLogger;
import com.braze.support.i$$ExternalSyntheticLambda1;
import java.math.BigDecimal;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.resumeWebviewIfNecessaryandroid_sdk_ui_release;
import o.setCarryoverInAppMessage;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class JavascriptInterfaceBase {
    private final Context context;

    public final Context getContext() {
        return this.context;
    }

    @JavascriptInterface
    public abstract void logButtonClick(String str);

    @JavascriptInterface
    public abstract void logClick();

    /* JADX INFO: Access modifiers changed from: private */
    public static final String parseProperties$lambda$0(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to parse properties JSON String: ", str);
    }

    @JavascriptInterface
    public final void requestImmediateDataFlush() {
        Braze.Companion.getInstance(this.context).requestImmediateDataFlush();
    }

    public JavascriptInterfaceBase(Context context) {
        context.getClass();
        this.context = context;
    }

    @JavascriptInterface
    public final void changeUser(String str, String str2) {
        str.getClass();
        Braze.Companion.getInstance(this.context).changeUser(str, str2);
    }

    @JavascriptInterface
    public final void logPurchaseWithJSON(String str, String str2, String str3, String str4, String str5) {
        str2.getClass();
        str4.getClass();
        BrazeProperties properties = parseProperties(str5);
        Double dMediaMetadataCompat = resumeWebviewIfNecessaryandroid_sdk_ui_release.MediaMetadataCompat(str2);
        if (dMediaMetadataCompat == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda1(str2, 4), 6, (Object) null);
            return;
        }
        Integer numMediaSessionCompatQueueItem = setCarryoverInAppMessage.MediaSessionCompatQueueItem(10, str4);
        if (numMediaSessionCompatQueueItem == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda1(str4, 5), 6, (Object) null);
        } else {
            Braze.Companion.getInstance(this.context).logPurchase(str, str3, new BigDecimal(String.valueOf(dMediaMetadataCompat.doubleValue())), numMediaSessionCompatQueueItem.intValue(), properties);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPurchaseWithJSON$lambda$0(String str) {
        return ff$$ExternalSyntheticOutline0.m("Failed to parse logPurchaseWithJSON price value '", str, "'");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPurchaseWithJSON$lambda$1(String str) {
        return ff$$ExternalSyntheticOutline0.m("Failed to parse logPurchaseWithJSON quantity value '", str, "'");
    }

    @JavascriptInterface
    public final void logCustomEventWithJSON(String str, String str2) {
        Braze.Companion.getInstance(this.context).logCustomEvent(str, parseProperties(str2));
    }

    public final BrazeProperties parseProperties(String str) {
        if (str == null) {
            return null;
        }
        try {
            if (str.equals("undefined") || str.equals("null")) {
                return null;
            }
            return new BrazeProperties(new JSONObject(str));
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda1(str, 3), 4, (Object) null);
            return null;
        }
    }
}

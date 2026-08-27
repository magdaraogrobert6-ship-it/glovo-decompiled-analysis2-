package com.braze.ui.support;

import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.WebSettings;
import com.braze.support.BrazeLogger;
import o.Float16Companion;
import o.getEpsilonslo4al4;
import o.getNegativeInfinityslo4al4;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.setRectOutlinetz77jQwdefault;
import o.toHexStringimpl;
import o.toLongimpl;

/* JADX INFO: loaded from: classes.dex */
public final class WebViewUtilsKt {
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("WebViewUtils");

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setWebViewSettings$lambda$0() {
        return "Failed to set dark mode WebView settings.";
    }

    @SuppressLint
    public static final void setWebViewSettings(WebSettings webSettings, Context context) {
        webSettings.getClass();
        context.getClass();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setDisplayZoomControls(false);
        webSettings.setDomStorageEnabled(true);
        webSettings.setAllowFileAccess(false);
        try {
            if (toLongimpl.write("FORCE_DARK") && ViewUtils.isDeviceInNightMode(context)) {
                Float16Companion float16Companion = getNegativeInfinityslo4al4.RemoteActionCompatParcelizer;
                if (float16Companion.write()) {
                    getEpsilonslo4al4.read(webSettings);
                } else {
                    if (!float16Companion.RemoteActionCompatParcelizer()) {
                        throw getNegativeInfinityslo4al4.RemoteActionCompatParcelizer();
                    }
                    toHexStringimpl.IconCompatParcelizer(webSettings).read();
                }
            }
            if (toLongimpl.write("FORCE_DARK_STRATEGY")) {
                if (!getNegativeInfinityslo4al4.serializer.RemoteActionCompatParcelizer()) {
                    throw getNegativeInfinityslo4al4.RemoteActionCompatParcelizer();
                }
                toHexStringimpl.IconCompatParcelizer(webSettings).MediaBrowserCompatMediaItem();
            }
        } catch (Throwable th) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, th, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new setRectOutlinetz77jQwdefault(21), 8, (Object) null);
        }
    }
}

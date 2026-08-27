package com.mapbox.common;

import android.content.Context;
import android.content.res.Resources;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import o.onViewAttachedToWindowlambda0;

/* JADX INFO: loaded from: classes5.dex */
public final class HttpSslConfig {
    private static volatile boolean allowOverride;
    private static final Context context;
    private static volatile SSLSocketFactory sslSocketFactory;
    private static volatile X509TrustManager trustManager;
    public static final HttpSslConfig INSTANCE = new HttpSslConfig();
    private static volatile int generation = -1;

    private HttpSslConfig() {
    }

    public final onViewAttachedToWindowlambda0 get() {
        synchronized (this) {
            onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = null;
            if (!allowOverride) {
                return null;
            }
            SSLSocketFactory sSLSocketFactory = sslSocketFactory;
            X509TrustManager x509TrustManager = trustManager;
            if (sSLSocketFactory != null && x509TrustManager != null) {
                onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(sSLSocketFactory, x509TrustManager);
            }
            return onviewattachedtowindowlambda0;
        }
    }

    public final boolean getAllowOverride() {
        return allowOverride;
    }

    public final int getGeneration() {
        return generation;
    }

    public final void set(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
        synchronized (this) {
            sSLSocketFactory.getClass();
            x509TrustManager.getClass();
            if (allowOverride) {
                sslSocketFactory = sSLSocketFactory;
                trustManager = x509TrustManager;
                generation++;
            }
        }
    }

    static {
        Context context2 = MapboxSDKCommon.INSTANCE.getContext();
        context = context2;
        String packageName = context2.getPackageName();
        Resources resources = context2.getResources();
        if (resources != null) {
            int identifier = resources.getIdentifier("com.mapbox.common.http.subdomain_override", "bool", packageName);
            int identifier2 = resources.getIdentifier("com.mapbox.common.http.subdomain_override_staging", "bool", packageName);
            if (identifier != 0 && resources.getBoolean(identifier)) {
                allowOverride = true;
            }
            if (identifier2 == 0 || !resources.getBoolean(identifier2)) {
                return;
            }
            allowOverride = true;
        }
    }
}

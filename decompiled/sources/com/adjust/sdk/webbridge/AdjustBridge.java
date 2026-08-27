package com.adjust.sdk.webbridge;

import android.app.Application;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes.dex */
public class AdjustBridge {
    private static AdjustBridgeInstance defaultInstance;

    public static AdjustBridgeInstance getDefaultInstance() {
        AdjustBridgeInstance adjustBridgeInstance;
        synchronized (AdjustBridge.class) {
            if (defaultInstance == null) {
                defaultInstance = new AdjustBridgeInstance();
            }
            adjustBridgeInstance = defaultInstance;
        }
        return adjustBridgeInstance;
    }

    public static AdjustBridgeInstance registerAndGetInstance(Application application, WebView webView) {
        AdjustBridgeInstance adjustBridgeInstance;
        synchronized (AdjustBridge.class) {
            if (defaultInstance == null) {
                defaultInstance = new AdjustBridgeInstance(application, webView);
            }
            adjustBridgeInstance = defaultInstance;
        }
        return adjustBridgeInstance;
    }

    public static void unregister() {
        synchronized (AdjustBridge.class) {
            AdjustBridgeInstance adjustBridgeInstance = defaultInstance;
            if (adjustBridgeInstance != null) {
                adjustBridgeInstance.unregister();
            }
            defaultInstance = null;
        }
    }

    public static void setApplicationContext(Application application) {
        getDefaultInstance().setApplicationContext(application);
    }

    public static void setWebView(WebView webView) {
        getDefaultInstance().setWebView(webView);
    }
}

package com.mapbox.common;

import android.content.Context;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxSDKCommon {
    public static final MapboxSDKCommon INSTANCE = new MapboxSDKCommon();
    private static Context appContext;

    private MapboxSDKCommon() {
    }

    public final MapboxSDKCommon invoke(Context context) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        appContext = applicationContext;
        return this;
    }

    public final Context getContext() {
        Context context = appContext;
        if (context != null) {
            return context;
        }
        removeNodeAtDepth.serializer("appContext");
        throw null;
    }
}

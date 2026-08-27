package com.mapbox.navigator;

import android.content.Context;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class MapboxNavigationNative {
    public static final MapboxNavigationNative INSTANCE = new MapboxNavigationNative();
    private static Context appContext;
    private static boolean isInitialized;

    private MapboxNavigationNative() {
    }

    public final boolean isInitialized() {
        return isInitialized;
    }

    public final void setInitialized(boolean z) {
        isInitialized = z;
    }

    public final void initialize(Context context) {
        context.getClass();
        isInitialized = true;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        appContext = applicationContext;
    }

    public final Context getAppContext$dash_native_release() {
        Context context = appContext;
        if (context != null) {
            return context;
        }
        removeNodeAtDepth.serializer("appContext");
        throw null;
    }
}

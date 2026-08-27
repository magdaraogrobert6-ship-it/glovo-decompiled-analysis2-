package com.mapbox.maps;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Looper;
import androidx.compose.ui.graphics.Fields;
import com.mapbox.common.MapboxSDKCommon;
import com.mapbox.maps.exception.WorkerThreadException;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class ThreadChecker {
    private static final String DEBUG_FIELD = "DEBUG";
    private static final String DEBUG_LOOKUP_FAILED = "Unable to lookup build config of application.";
    public static final ThreadChecker INSTANCE;
    private static final String METADATA_KEY = "com.mapbox.maps.ThreadChecker";
    private static final String METADATA_LOOKUP_FAILED = "No boolean metadata found for key com.mapbox.maps.ThreadChecker";
    private static final String TAG = "ThreadChecker";
    private static final boolean debug;
    private static final boolean enabled;

    private ThreadChecker() {
    }

    static {
        ThreadChecker threadChecker = new ThreadChecker();
        INSTANCE = threadChecker;
        enabled = threadChecker.resolveEnabledState();
        debug = threadChecker.resolveDebugState();
    }

    private final boolean resolveDebugState() {
        try {
            return Class.forName(MapboxSDKCommon.INSTANCE.getContext().getApplicationInfo().packageName + ".BuildConfig").getField(DEBUG_FIELD).getBoolean(null);
        } catch (Exception e) {
            MapboxLogger.logW(TAG, "Unable to lookup build config of application. " + e.getLocalizedMessage());
            return false;
        }
    }

    private final boolean resolveEnabledState() {
        try {
            Context context = MapboxSDKCommon.INSTANCE.getContext();
            PackageManager packageManager = context.getPackageManager();
            packageManager.getClass();
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), Fields.SpotShadowColor);
            applicationInfo.getClass();
            Bundle bundle = applicationInfo.metaData;
            if (bundle.containsKey(METADATA_KEY)) {
                return bundle.getBoolean(METADATA_KEY);
            }
            return true;
        } catch (Exception e) {
            MapboxLogger.logI(TAG, "No boolean metadata found for key com.mapbox.maps.ThreadChecker " + e.getLocalizedMessage());
            return true;
        }
    }

    private final boolean isMainThread() {
        Object[] objArr = {Thread.currentThread(), Looper.getMainLooper().getThread()};
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
    }

    public final void throwIfNotMainThread() {
        if ((!(!enabled) && !(!debug)) && !isMainThread()) {
            throw new WorkerThreadException();
        }
    }
}

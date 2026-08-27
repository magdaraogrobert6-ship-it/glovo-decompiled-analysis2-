package com.mapbox.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.os.SystemClock;
import java.io.File;
import o.getCieXyz;
import o.isItemDismissable;
import o.onContentCardClicked;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class BaseMapboxInitializerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String gatherSystemInfo(InitializerData initializerData, Context context, Throwable th) {
        Object isitemdismissable;
        Object isitemdismissable2;
        ApplicationInfo applicationInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            isitemdismissable = packageManager != null ? Boolean.valueOf(packageManager.isInstantApp()) : null;
        } catch (Throwable th2) {
            isitemdismissable = new isItemDismissable(th2);
        }
        try {
            PackageManager packageManager2 = context.getPackageManager();
            if (packageManager2 == null || (applicationInfo = packageManager2.getApplicationInfo(context.getPackageName(), 0)) == null) {
                isitemdismissable2 = null;
            } else {
                String[] list = new File(applicationInfo.nativeLibraryDir).list();
                isitemdismissable2 = list != null ? onContentCardClicked.serializer(list, null, null, null, 63) : "";
            }
        } catch (Throwable th3) {
            isitemdismissable2 = new isItemDismissable(th3);
        }
        StringBuilder sb = new StringBuilder("Failed to initialize: Attempt=");
        sb.append(initializerData.getCurrentInitAttempt());
        sb.append(", exception=[");
        sb.append(th.getClass().getSimpleName());
        sb.append("], initializer called ");
        sb.append(SystemClock.elapsedRealtime() - initializerData.getFirstInitElapsedTimeMs());
        sb.append(" ms ago, exception.message=[");
        sb.append(th.getMessage());
        sb.append("], exception.cause=[");
        Throwable cause = th.getCause();
        sb.append(cause != null ? cause.getClass().getSimpleName() : null);
        sb.append("], exception.cause.message=[");
        Throwable cause2 = th.getCause();
        sb.append(cause2 != null ? cause2.getMessage() : null);
        sb.append("], extractedNativeLibs=[");
        if (isitemdismissable2 instanceof isItemDismissable) {
            isitemdismissable2 = null;
        }
        sb.append((String) isitemdismissable2);
        sb.append("], isInstantApp=[");
        sb.append(isitemdismissable instanceof isItemDismissable ? null : isitemdismissable);
        sb.append("], isMainThread=[");
        sb.append(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{Looper.myLooper(), Looper.getMainLooper()}, getCieXyz.write())).booleanValue());
        sb.append(']');
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean skipFurtherInitialization(Class<?> cls) {
        InitializerData initializerData = BaseMapboxInitializer.Companion.getInitializersMap().get(cls);
        if (initializerData != null) {
            return initializerData.getState() == InitializerState.SUCCESS || initializerData.getState() == InitializerState.IN_PROGRESS;
        }
        return false;
    }
}

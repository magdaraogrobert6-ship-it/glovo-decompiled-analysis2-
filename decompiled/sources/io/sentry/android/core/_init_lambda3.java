package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.compose.ui.graphics.Fields;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.scale0AR0LA0default;

/* JADX INFO: loaded from: classes4.dex */
public abstract class _init_lambda3 {
    public static final scale0AR0LA0default serializer = new scale0AR0LA0default(new ActivityLifecycleIntegration$$ExternalSyntheticLambda1(15));
    public static final scale0AR0LA0default IconCompatParcelizer = new scale0AR0LA0default(new ActivityLifecycleIntegration$$ExternalSyntheticLambda1(16));
    public static final scale0AR0LA0default write = new scale0AR0LA0default(new ActivityLifecycleIntegration$$ExternalSyntheticLambda1(17));
    public static final scale0AR0LA0default read = new scale0AR0LA0default(new ActivityLifecycleIntegration$$ExternalSyntheticLambda1(18));
    public static final scale0AR0LA0default RemoteActionCompatParcelizer = new scale0AR0LA0default(new ActivityLifecycleIntegration$$ExternalSyntheticLambda1(19));

    public static boolean IconCompatParcelizer() {
        try {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            return runningAppProcessInfo.importance == 100;
        } catch (Throwable unused) {
        }
    }

    public static PackageInfo read(Context context, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0, r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq) {
        try {
            r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq.getClass();
            return Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(4096L)) : context.getPackageManager().getPackageInfo(context.getPackageName(), Fields.TransformOrigin);
        } catch (Throwable th) {
            brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error getting package info.", th);
            return null;
        }
    }

    public static /* synthetic */ ApplicationInfo IconCompatParcelizer(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(128L));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ PackageInfo write(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static ActivityManager.MemoryInfo read(Context context, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
                return memoryInfo;
            }
            brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "Error getting MemoryInfo.", new Object[0]);
            return null;
        } catch (Throwable th) {
            brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error getting MemoryInfo.", th);
            return null;
        }
    }

    public static String read(BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        try {
            return Build.MODEL.split(" ", -1)[0];
        } catch (Throwable th) {
            brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error getting device family.", th);
            return null;
        }
    }

    public static PackageInfo RemoteActionCompatParcelizer(Context context, r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq) {
        r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            return (PackageInfo) serializer.IconCompatParcelizer(context);
        }
        return (PackageInfo) IconCompatParcelizer.IconCompatParcelizer(context);
    }
}

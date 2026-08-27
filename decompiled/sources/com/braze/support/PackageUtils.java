package com.braze.support;

import android.content.Context;
import o.hideCurrentlyDisplayingInAppMessage;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class PackageUtils {
    public static final PackageUtils INSTANCE = new PackageUtils();
    private static String packageName;

    private PackageUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setResourcePackageName$lambda$0() {
        return "Package name may not be blank";
    }

    public static final String getResourcePackageName(Context context) {
        context.getClass();
        String str = packageName;
        if (str != null) {
            return str;
        }
        String packageName2 = context.getPackageName();
        packageName = packageName2;
        return packageName2 == null ? "unknown.package" : packageName2;
    }

    public static final void setResourcePackageName(String str) {
        str.getClass();
        if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new JsonUtils$$ExternalSyntheticLambda1(29), 6, (Object) null);
        } else {
            packageName = str;
        }
    }
}

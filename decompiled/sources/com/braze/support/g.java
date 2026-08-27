package com.braze.support;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.n$$ExternalSyntheticLambda0;
import com.google.android.gms.common.GoogleApiAvailability;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final g a = new g();

    public static final String c() {
        return "Unexpected exception while checking for com.google.android.gsf";
    }

    public static final boolean a(Context context) {
        context.getClass();
        int iIsGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context);
        if (iIsGooglePlayServicesAvailable == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) a, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda0(28), 7, (Object) null);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) a, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda0(iIsGooglePlayServicesAvailable, 29), 7, (Object) null);
        return false;
    }

    public static final boolean b(Context context) {
        context.getClass();
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                context.getPackageManager().getPackageInfo("com.google.android.gsf", PackageManager.PackageInfoFlags.of(0L));
                return true;
            }
            context.getPackageManager().getPackageInfo("com.google.android.gsf", 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) a, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda0(29), 4, (Object) null);
            return false;
        }
    }

    public static final String a() {
        return "Google Play Services Availability API not found. Google Play Services not enabled.";
    }

    public static final String a(int i) {
        return c8$$ExternalSyntheticOutline0.m(i, "Google Play Services is unavailable. Connection result: ");
    }

    public static final String b() {
        return "Google Play Services is available.";
    }
}

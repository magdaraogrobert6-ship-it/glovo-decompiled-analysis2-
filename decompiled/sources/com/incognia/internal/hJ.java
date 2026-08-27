package com.incognia.internal;

import android.os.Looper;
import android.util.Log;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.google.android.gms.common.GoogleApiAvailability;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import kotlin.jvm.internal.Lambda;
import o.isCurrentlyDisplayingInAppMessage;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes2.dex */
public final class hJ extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ Tj BGx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hJ(Tj tj) {
        super(0);
        this.BGx = tj;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        String str;
        String name = Tj.class.getName();
        Integer numValueOf = null;
        if (Looper.getMainLooper().equals(Looper.myLooper())) {
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer(ff$$ExternalSyntheticOutline0.m("[", name, "]: You can't execute this operation on the UI Thread"));
            return null;
        }
        boolean z = false;
        try {
            if (Tj.BGx(this.BGx, "com.google.android.gms.common.GoogleApiAvailability")) {
                int iIsGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this.BGx.BGx);
                numValueOf = Integer.valueOf(iIsGooglePlayServicesAvailable);
                if (iIsGooglePlayServicesAvailable == 0) {
                    z = true;
                }
            }
            if (!z) {
                if (numValueOf != null) {
                    Tj tj = this.BGx;
                    if (IU.BGx.get()) {
                        StringBuilder sb = new StringBuilder("GooglePlayServices access error. \n                        |Google Play Services is available returned error code: \n                        |");
                        sb.append(numValueOf);
                        sb.append(" (");
                        int iIntValue = numValueOf.intValue();
                        tj.getClass();
                        if (iIntValue == 1) {
                            str = "Service Missing";
                        } else if (iIntValue == 2) {
                            str = "Service Version Update Required";
                        } else if (iIntValue == 3) {
                            str = "Service Disabled";
                        } else if (iIntValue != 9) {
                            str = iIntValue != 18 ? "Unknown Code" : "Service Updating";
                        } else {
                            str = "Service Invalid";
                        }
                        sb.append(str);
                        sb.append(')');
                        Log.w("Incognia", isCurrentlyDisplayingInAppMessage.MediaDescriptionCompat(sb.toString()));
                    }
                } else if (IU.BGx.get()) {
                    Log.w("Incognia", "GooglePlayServices access error. Did you add the dependency?");
                }
            }
        } catch (Throwable unused) {
            if (IU.BGx.get()) {
            }
        }
        return Boolean.valueOf(z);
    }
}

package com.braze.support;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.kb;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final b a = new b();

    public static final kb a(Intent intent, ConnectivityManager connectivityManager) {
        intent.getClass();
        connectivityManager.getClass();
        String action = intent.getAction();
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) a, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda1(action, 0), 6, (Object) null);
            return kb.NONE;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            boolean booleanExtra = intent.getBooleanExtra("noConnectivity", false);
            if (activeNetworkInfo == null || booleanExtra) {
                return kb.NONE;
            }
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                if (type == 1 || type == 6) {
                    return kb.GREAT;
                }
                return type != 9 ? kb.NONE : kb.GOOD;
            }
            int subtype = activeNetworkInfo.getSubtype();
            if (subtype != 3) {
                return (subtype == 13 || subtype == 20) ? kb.GREAT : kb.BAD;
            }
            return kb.GOOD;
        } catch (SecurityException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) a, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda0(0), 4, (Object) null);
            return kb.NONE;
        }
    }

    public static final String a() {
        return "Failed to get active network information. Ensure the permission android.permission.ACCESS_NETWORK_STATE is defined in your AndroidManifest.xml";
    }

    public static final String a(String str) {
        return ff$$ExternalSyntheticOutline0.m("Unexpected system broadcast received [", str, "]");
    }

    public static final kb a(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities == null) {
            return kb.NONE;
        }
        int iMin = Math.min(networkCapabilities.getLinkDownstreamBandwidthKbps(), networkCapabilities.getLinkUpstreamBandwidthKbps());
        if (iMin > 14000) {
            return kb.GREAT;
        }
        if (iMin > 4000) {
            return kb.GOOD;
        }
        return kb.BAD;
    }
}

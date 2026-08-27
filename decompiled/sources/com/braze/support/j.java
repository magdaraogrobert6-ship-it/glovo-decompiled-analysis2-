package com.braze.support;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import o.ensureSubscribedToInAppMessageEvents;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class j {
    public static final j a = new j();

    public static final String a(String str) {
        str.getClass();
        try {
            InputStream inputStream = Runtime.getRuntime().exec(new String[]{"/system/bin/getprop", str}).getInputStream();
            inputStream.getClass();
            String line = new BufferedReader(new InputStreamReader(inputStream, ensureSubscribedToInAppMessageEvents.write), 8192).readLine();
            line.getClass();
            return line;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) a, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c$$ExternalSyntheticLambda7(24), 4, (Object) null);
            return "";
        }
    }

    public static final String a() {
        return "Caught exception while trying to read BrazeLogger tag from system properties.";
    }
}

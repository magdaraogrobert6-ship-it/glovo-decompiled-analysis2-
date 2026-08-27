package com.google.android.gms.security;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Log;
import coil3.util.ContextsKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.gtm.zzbv;
import io.sentry.android.core.SentryLogcatAdapter;
import java.lang.reflect.Method;
import o.accessgetSystemNavigationDowncp;
import o.getButton1EK5gGoQ;
import o.logImpressionlambda2;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ProviderInstaller {
    public static final GoogleApiAvailabilityLight RemoteActionCompatParcelizer = GoogleApiAvailabilityLight.getInstance();
    public static final Object IconCompatParcelizer = new Object();
    public static Method read = null;
    public static boolean write = false;

    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c0 A[Catch: all -> 0x00d4, TryCatch #1 {, blocks: (B:4:0x0014, B:7:0x0019, B:12:0x003b, B:13:0x0040, B:15:0x0043, B:17:0x0046, B:23:0x0052, B:25:0x0056, B:28:0x00ae, B:31:0x00c0, B:32:0x00c5, B:34:0x00c7, B:35:0x00d3, B:10:0x0025), top: B:41:0x0014, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00c7 A[Catch: all -> 0x00d4, TryCatch #1 {, blocks: (B:4:0x0014, B:7:0x0019, B:12:0x003b, B:13:0x0040, B:15:0x0043, B:17:0x0046, B:23:0x0052, B:25:0x0056, B:28:0x00ae, B:31:0x00c0, B:32:0x00c5, B:34:0x00c7, B:35:0x00d3, B:10:0x0025), top: B:41:0x0014, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static void installIfNeeded(Context context) {
        Context context2;
        boolean z;
        Context contextCreatePackageContext;
        accessgetSystemNavigationDowncp.serializer(context, "Context must not be null");
        RemoteActionCompatParcelizer.verifyGooglePlayServicesIsAvailable(context, 11925000);
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (IconCompatParcelizer) {
            Context context3 = null;
            if (write) {
                z = write;
                contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
                if (contextCreatePackageContext != null) {
                    write = true;
                    if (!z) {
                        long jUptimeMillis2 = SystemClock.uptimeMillis();
                        ClassLoader classLoader = contextCreatePackageContext.getClassLoader();
                        zzbv zzbvVar = new zzbv(Context.class, 4, context);
                        Class cls = Long.TYPE;
                        ContextsKt.IconCompatParcelizer(1456356990, logImpressionlambda2.read(), new Object[]{classLoader.loadClass("com.google.android.gms.common.security.ProviderInstallerImpl"), "reportRequestStats2", new zzbv[]{zzbvVar, new getButton1EK5gGoQ(cls, 4, Long.valueOf(jUptimeMillis)), new getButton1EK5gGoQ(cls, 4, Long.valueOf(jUptimeMillis2))}}, logImpressionlambda2.read(), logImpressionlambda2.read(), -1456356988, logImpressionlambda2.read());
                    }
                    context3 = contextCreatePackageContext;
                }
                if (context3 != null) {
                    RemoteActionCompatParcelizer(context3, "com.google.android.gms.common.security.ProviderInstallerImpl");
                    return;
                } else {
                    SentryLogcatAdapter.serializer("ProviderInstaller", "Failed to get remote context");
                    throw new GooglePlayServicesNotAvailableException();
                }
            }
            try {
                context2 = DynamiteModule.load(context, DynamiteModule.serializer, "com.google.android.gms.providerinstaller.dynamite").ResultReceiver;
            } catch (DynamiteModule.LoadingException e) {
                SentryLogcatAdapter.IconCompatParcelizer("ProviderInstaller", "Failed to load providerinstaller module: ".concat(String.valueOf(e.getMessage())));
                context2 = null;
            }
            if (context2 != null) {
                RemoteActionCompatParcelizer(context2, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                return;
            }
            z = write;
            try {
                contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                contextCreatePackageContext = null;
            }
            if (contextCreatePackageContext != null) {
                write = true;
                if (!z) {
                    try {
                        long jUptimeMillis3 = SystemClock.uptimeMillis();
                        ClassLoader classLoader2 = contextCreatePackageContext.getClassLoader();
                        zzbv zzbvVar2 = new zzbv(Context.class, 4, context);
                        Class cls2 = Long.TYPE;
                        ContextsKt.IconCompatParcelizer(1456356990, logImpressionlambda2.read(), new Object[]{classLoader2.loadClass("com.google.android.gms.common.security.ProviderInstallerImpl"), "reportRequestStats2", new zzbv[]{zzbvVar2, new getButton1EK5gGoQ(cls2, 4, Long.valueOf(jUptimeMillis)), new getButton1EK5gGoQ(cls2, 4, Long.valueOf(jUptimeMillis3))}}, logImpressionlambda2.read(), logImpressionlambda2.read(), -1456356988, logImpressionlambda2.read());
                    } catch (Exception e2) {
                        SentryLogcatAdapter.IconCompatParcelizer("ProviderInstaller", "Failed to report request stats: ".concat(e2.toString()));
                    }
                }
                context3 = contextCreatePackageContext;
            }
            if (context3 != null) {
                RemoteActionCompatParcelizer(context3, "com.google.android.gms.common.security.ProviderInstallerImpl");
                return;
            } else {
                SentryLogcatAdapter.serializer("ProviderInstaller", "Failed to get remote context");
                throw new GooglePlayServicesNotAvailableException();
            }
            throw th;
        }
    }

    public static void RemoteActionCompatParcelizer(Context context, String str) throws GooglePlayServicesNotAvailableException {
        try {
            if (read == null) {
                read = context.getClassLoader().loadClass(str).getMethod("insertProvider", Context.class);
            }
            read.invoke(null, context);
        } catch (Exception e) {
            Throwable cause = e.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                SentryLogcatAdapter.serializer("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(cause == null ? e.toString() : cause.toString())));
            }
            throw new GooglePlayServicesNotAvailableException();
        }
    }
}

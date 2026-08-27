package com.google.android.gms.common;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import androidx.compose.ui.graphics.Fields;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.logistics.rider.glovo.R;
import com.mapbox.navigation.core.telemetry.events.FeedbackEvent;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.accessgetSystemNavigationDowncp;
import o.accessgetTvInputHdmi4cp;
import o.accessgetTvInputcp;
import o.accessgetTvMediaContextMenucp;
import o.scale0AR0LA0default;

/* JADX INFO: loaded from: classes2.dex */
public abstract class GooglePlayServicesUtilLight {

    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";

    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 12451000;
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
    public static boolean read = false;
    public static boolean serializer = false;

    @Deprecated
    static final AtomicBoolean write = new AtomicBoolean();
    private static final AtomicBoolean IconCompatParcelizer = new AtomicBoolean();

    @Deprecated
    public static int getApkVersion(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            SentryLogcatAdapter.IconCompatParcelizer("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @Deprecated
    public static boolean isGooglePlayServicesUid(Context context, int i) {
        return accessgetTvInputHdmi4cp.IconCompatParcelizer(context, i);
    }

    @Deprecated
    public static boolean uidHasPackageName(Context context, int i, String str) {
        return accessgetTvInputHdmi4cp.read(context, i, str);
    }

    public static boolean zza(Context context, String str) throws PackageManager.NameNotFoundException {
        boolean zEquals = str.equals("com.google.android.gms");
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
            if (zEquals) {
                return applicationInfo.enabled;
            }
            return applicationInfo.enabled && !isRestrictedUserProfile(context);
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }

    @Deprecated
    public static void cancelAvailabilityErrorNotifications(Context context) {
        if (write.getAndSet(true)) {
            return;
        }
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION);
            if (notificationManager != null) {
                notificationManager.cancel(10436);
            }
        } catch (SecurityException unused) {
        }
    }

    public static void enableUsingApkIndependentContext() {
        IconCompatParcelizer.set(true);
    }

    public static boolean isRestrictedUserProfile(Context context) {
        Object systemService = context.getSystemService(FeedbackEvent.UI);
        accessgetSystemNavigationDowncp.IconCompatParcelizer(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    @Deprecated
    public static void ensurePlayServicesAvailable(Context context, int i) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        int iIsGooglePlayServicesAvailable = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, i);
        if (iIsGooglePlayServicesAvailable != 0) {
            Intent errorResolutionIntent = GoogleApiAvailabilityLight.getInstance().getErrorResolutionIntent(context, iIsGooglePlayServicesAvailable, "e");
            StringBuilder sb = new StringBuilder(String.valueOf(iIsGooglePlayServicesAvailable).length() + 46);
            sb.append("GooglePlayServices not available due to error ");
            sb.append(iIsGooglePlayServicesAvailable);
            SentryLogcatAdapter.serializer("GooglePlayServicesUtil", sb.toString());
            if (errorResolutionIntent != null) {
                throw new GooglePlayServicesRepairableException("Google Play Services not available");
            }
            throw new GooglePlayServicesNotAvailableException();
        }
    }

    @Deprecated
    public static int getClientVersion(Context context) {
        return accessgetTvInputcp.IconCompatParcelizer(context, context.getPackageName());
    }

    @Deprecated
    public static boolean isSidewinderDevice(Context context) {
        if (DefaultContentCardsUpdateHandlerCompanionCREATOR1.read == null) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.read = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return DefaultContentCardsUpdateHandlerCompanionCREATOR1.read.booleanValue();
    }

    @Deprecated
    public static Intent getGooglePlayServicesAvailabilityRecoveryIntent(int i) {
        return GoogleApiAvailabilityLight.getInstance().getErrorResolutionIntent(null, i, null);
    }

    public static boolean honorsDebugCertificates(Context context) {
        try {
            if (!serializer) {
                PackageInfo packageInfo = accessgetTvMediaContextMenucp.serializer(context).read(134217792, "com.google.android.gms");
                scale0AR0LA0default.write(context);
                if (packageInfo == null || scale0AR0LA0default.write(packageInfo, false) || !scale0AR0LA0default.write(packageInfo, true)) {
                    read = false;
                } else {
                    read = true;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            SentryLogcatAdapter.write("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
        } finally {
            serializer = true;
        }
        return read || !FeedbackEvent.UI.equals(Build.TYPE);
    }

    @Deprecated
    public static boolean isPlayStorePossiblyUpdating(Context context, int i) {
        if (i == 9) {
            return zza(context, "com.android.vending");
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0185 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x009b  */
    /* JADX WARN: Code duplicated, block: B:65:0x0106  */
    /* JADX WARN: Code duplicated, block: B:73:0x0130  */
    /* JADX WARN: Code duplicated, block: B:74:0x0132  */
    /* JADX WARN: Code duplicated, block: B:77:0x0137  */
    /* JADX WARN: Code duplicated, block: B:79:0x013b  */
    /* JADX WARN: Code duplicated, block: B:80:0x0181  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a1 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x01a3 A[RETURN] */
    public static int isGooglePlayServicesAvailable(Context context, int i) {
        boolean z;
        PackageInfo packageInfo;
        int i2;
        int i3;
        ApplicationInfo applicationInfo;
        try {
            context.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            SentryLogcatAdapter.serializer("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !IconCompatParcelizer.get()) {
            synchronized (accessgetSystemNavigationDowncp.IconCompatParcelizer) {
                if (!accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer) {
                    accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer = true;
                    try {
                        Bundle bundle = accessgetTvMediaContextMenucp.serializer(context).write(Fields.SpotShadowColor, context.getPackageName()).metaData;
                        if (bundle != null) {
                            bundle.getString("com.google.app.id");
                            accessgetSystemNavigationDowncp.read = bundle.getInt("com.google.android.gms.version");
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        SentryLogcatAdapter.IconCompatParcelizer("MetadataValueReader", "This should never happen.", e);
                    }
                }
            }
            int i4 = accessgetSystemNavigationDowncp.read;
            if (i4 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (i4 != GOOGLE_PLAY_SERVICES_VERSION_CODE) {
                throw new GooglePlayServicesIncorrectManifestValueException(i4);
            }
        }
        if (DefaultContentCardsUpdateHandlerCompanionCREATOR1.RemoteActionCompatParcelizer(context)) {
            z = false;
        } else {
            if (DefaultContentCardsUpdateHandlerCompanionCREATOR1.MediaSessionCompatQueueItem == null) {
                DefaultContentCardsUpdateHandlerCompanionCREATOR1.MediaSessionCompatQueueItem = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
            }
            if (DefaultContentCardsUpdateHandlerCompanionCREATOR1.MediaSessionCompatQueueItem.booleanValue()) {
                z = false;
            } else {
                z = true;
            }
        }
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(i >= 0);
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        if (z) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 134225984);
            } catch (PackageManager.NameNotFoundException unused2) {
                SentryLogcatAdapter.IconCompatParcelizer("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 134217792);
            scale0AR0LA0default.write(context);
            if (!scale0AR0LA0default.write(packageInfo2, true)) {
                SentryLogcatAdapter.IconCompatParcelizer("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
            } else {
                if (!z) {
                    if (z) {
                    }
                    i2 = packageInfo2.versionCode;
                    if (i2 == -1) {
                        i3 = -1;
                    } else {
                        i3 = i2 / 1000;
                    }
                    if (i3 < (i != -1 ? i / 1000 : -1)) {
                        applicationInfo = packageInfo2.applicationInfo;
                        if (applicationInfo == null) {
                            applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                        }
                        if (applicationInfo.enabled) {
                            return 0;
                        }
                        return 3;
                    }
                    StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i).length() + 11 + String.valueOf(i2).length());
                    sb.append("Google Play services out of date for ");
                    sb.append(packageName);
                    sb.append(".  Requires ");
                    sb.append(i);
                    sb.append(" but found ");
                    sb.append(i2);
                    SentryLogcatAdapter.IconCompatParcelizer("GooglePlayServicesUtil", sb.toString());
                    return 2;
                }
                accessgetSystemNavigationDowncp.IconCompatParcelizer(packageInfo);
                if (!scale0AR0LA0default.write(packageInfo, true)) {
                    SentryLogcatAdapter.IconCompatParcelizer("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                } else {
                    if (z || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                        i2 = packageInfo2.versionCode;
                        if (i2 == -1) {
                            i3 = -1;
                        } else {
                            i3 = i2 / 1000;
                        }
                        if (i3 < (i != -1 ? i / 1000 : -1)) {
                            applicationInfo = packageInfo2.applicationInfo;
                            if (applicationInfo == null) {
                                try {
                                    applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                                } catch (PackageManager.NameNotFoundException e2) {
                                    SentryLogcatAdapter.IconCompatParcelizer("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e2);
                                    return 1;
                                }
                            }
                            if (applicationInfo.enabled) {
                                return 3;
                            }
                            return 0;
                        }
                        StringBuilder sb2 = new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i).length() + 11 + String.valueOf(i2).length());
                        sb2.append("Google Play services out of date for ");
                        sb2.append(packageName);
                        sb2.append(".  Requires ");
                        sb2.append(i);
                        sb2.append(" but found ");
                        sb2.append(i2);
                        SentryLogcatAdapter.IconCompatParcelizer("GooglePlayServicesUtil", sb2.toString());
                        return 2;
                    }
                    SentryLogcatAdapter.IconCompatParcelizer("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                }
            }
            return 9;
        } catch (PackageManager.NameNotFoundException unused3) {
            SentryLogcatAdapter.IconCompatParcelizer("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
            return 1;
        }
    }

    @Deprecated
    public static boolean isPlayServicesPossiblyUpdating(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return zza(context, "com.google.android.gms");
        }
        return false;
    }
}

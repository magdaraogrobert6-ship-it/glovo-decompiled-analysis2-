package bo.app;

import android.app.ActivityManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.Locale;
import java.util.TimeZone;
import o.hideCurrentlyDisplayingInAppMessage;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class i5 implements o9 {
    public final Context a;
    public final BrazeConfigurationProvider b;
    public final String c;
    public final h5 d;
    public PackageInfo e;

    public final String h() {
        try {
            Object systemService = this.a.getSystemService("phone");
            systemService.getClass();
            String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
            if (networkOperatorName != null) {
                return hideCurrentlyDisplayingInAppMessage.read((CharSequence) networkOperatorName).toString();
            }
            return null;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new h$$ExternalSyntheticLambda1(27), 4, (Object) null);
            return null;
        }
    }

    public static final String e() {
        return "Failed to read notifications enabled state from NotificationManagerCompat.";
    }

    public static final String g() {
        return "Failed to collect background restriction information from Activity Manager";
    }

    public static final String i() {
        return "Caught exception while reading the phone carrier name.";
    }

    public final d5 b() {
        BrazeConfigurationProvider brazeConfigurationProvider = this.b;
        brazeConfigurationProvider.getClass();
        int i = Build.VERSION.SDK_INT;
        String strH = h();
        String str = Build.BRAND;
        String str2 = (str == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) ? null : str;
        String str3 = Build.MODEL;
        Locale locale = Locale.getDefault();
        locale.getClass();
        String string = locale.toString();
        string.getClass();
        TimeZone timeZone = TimeZone.getDefault();
        timeZone.getClass();
        return new d5(brazeConfigurationProvider, String.valueOf(i), strH, str2, str3, string, timeZone.getID(), Boolean.valueOf(d()), Boolean.valueOf(f()), this.d.readString(DataStoreKey.GOOGLE_ADVERTISING_ID, null), this.d.readBoolean(DataStoreKey.AD_TRACKING_ENABLED, null));
    }

    public i5(Context context, BrazeConfigurationProvider brazeConfigurationProvider) {
        context.getClass();
        brazeConfigurationProvider.getClass();
        this.a = context;
        this.b = brazeConfigurationProvider;
        PackageInfo packageInfoJ = j();
        this.c = packageInfoJ != null ? packageInfoJ.versionName : null;
        this.d = new h5(context);
    }

    public static final String a(String str) {
        return ff$$ExternalSyntheticOutline0.m("Unable to inspect package [", str, "]");
    }

    public final boolean d() {
        Object systemService = this.a.getSystemService(RemoteMessageConst.NOTIFICATION);
        systemService.getClass();
        return ((NotificationManager) systemService).areNotificationsEnabled();
    }

    public final boolean f() {
        try {
            Object systemService = this.a.getSystemService("activity");
            systemService.getClass();
            return ((ActivityManager) systemService).isBackgroundRestricted();
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new h$$ExternalSyntheticLambda1(28), 4, (Object) null);
            return false;
        }
    }

    public final PackageInfo j() {
        PackageInfo packageInfo = this.e;
        if (packageInfo != null) {
            return packageInfo;
        }
        String packageName = this.a.getPackageName();
        try {
            int i = Build.VERSION.SDK_INT;
            Context context = this.a;
            PackageInfo packageInfo2 = i >= 33 ? context.getPackageManager().getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(0L)) : context.getPackageManager().getPackageInfo(packageName, 0);
            this.e = packageInfo2;
            return packageInfo2;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new d4$$ExternalSyntheticLambda6(packageName, 5), 4, (Object) null);
            ApplicationInfo applicationInfo = this.a.getApplicationInfo();
            int i2 = Build.VERSION.SDK_INT;
            Context context2 = this.a;
            PackageInfo packageArchiveInfo = i2 >= 33 ? context2.getPackageManager().getPackageArchiveInfo(applicationInfo.sourceDir, PackageManager.PackageInfoFlags.of(0L)) : context2.getPackageManager().getPackageArchiveInfo(applicationInfo.sourceDir, 0);
            this.e = packageArchiveInfo;
            return packageArchiveInfo;
        }
    }

    public final String c() {
        PackageInfo packageInfoJ = j();
        if (packageInfoJ == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new h$$ExternalSyntheticLambda1(26), 7, (Object) null);
            return null;
        }
        return packageInfoJ.getLongVersionCode() + ".0.0.0";
    }

    public static final String a() {
        return "App version code could not be read. Returning null";
    }
}

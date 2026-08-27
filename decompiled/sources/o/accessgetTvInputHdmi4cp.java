package o;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import io.sentry.android.core.SentryLogcatAdapter;

/* JADX INFO: loaded from: classes2.dex */
public abstract class accessgetTvInputHdmi4cp {
    public static boolean IconCompatParcelizer(Context context, int i) {
        if (read(context, i, "com.google.android.gms")) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                scale0AR0LA0default scale0ar0la0defaultWrite = scale0AR0LA0default.write(context);
                scale0ar0la0defaultWrite.getClass();
                if (packageInfo != null) {
                    if (!scale0AR0LA0default.write(packageInfo, false)) {
                        if (scale0AR0LA0default.write(packageInfo, true)) {
                            if (!GooglePlayServicesUtilLight.honorsDebugCertificates((Context) scale0ar0la0defaultWrite.IconCompatParcelizer)) {
                                SentryLogcatAdapter.IconCompatParcelizer("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                            }
                        }
                    }
                    return true;
                }
                return false;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.isLoggable("UidVerifier", 3);
            }
        }
        return false;
    }

    public static boolean read(Context context, int i, String str) {
        getFocusEK5gGoQ getfocusek5ggoqSerializer = accessgetTvMediaContextMenucp.serializer(context);
        getfocusek5ggoqSerializer.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) getfocusek5ggoqSerializer.write.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }
}

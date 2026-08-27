package o;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;

/* JADX INFO: loaded from: classes3.dex */
public class r8lambdafxbJOrD4Rv7HbEvEIn3jpfsEg {
    private final Context IconCompatParcelizer;
    private final PackageManager RemoteActionCompatParcelizer;

    public r8lambdafxbJOrD4Rv7HbEvEIn3jpfsEg(Context context, PackageManager packageManager) {
        this.IconCompatParcelizer = context;
        this.RemoteActionCompatParcelizer = packageManager;
    }

    public final short serializer(parseLonglambda0 parselonglambda0) {
        Context context = this.IconCompatParcelizer;
        try {
            ApplicationInfo applicationInfo = this.RemoteActionCompatParcelizer.getApplicationInfo(context.getPackageName(), 0);
            if (applicationInfo != null) {
                return (short) applicationInfo.targetSdkVersion;
            }
            if (parselonglambda0 == null) {
                return (short) -1;
            }
            parselonglambda0.RemoteActionCompatParcelizer("getApplicationInfo returned null", new Object[0]);
            return (short) -1;
        } catch (Exception e) {
            if (parselonglambda0 == null) {
                return (short) -1;
            }
            parselonglambda0.IconCompatParcelizer(false, e, "Could not get ApplicationInfo for our own package (%s)", context.getPackageName());
            return (short) -1;
        }
    }

    public final Boolean read() {
        boolean zIsAutoRevokeWhitelisted;
        if (Build.VERSION.SDK_INT < 30 || serializer(null) < 30) {
            return null;
        }
        try {
            zIsAutoRevokeWhitelisted = this.RemoteActionCompatParcelizer.isAutoRevokeWhitelisted();
        } catch (Throwable unused) {
            zIsAutoRevokeWhitelisted = false;
        }
        return Boolean.valueOf(!zIsAutoRevokeWhitelisted);
    }
}

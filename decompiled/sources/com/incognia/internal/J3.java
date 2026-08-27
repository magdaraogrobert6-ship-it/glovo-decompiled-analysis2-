package com.incognia.internal;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class J3 {
    public static final List BGx(PackageManager packageManager, Intent intent) {
        return Build.VERSION.SDK_INT >= 33 ? packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(0L)) : packageManager.queryIntentActivities(intent, 0);
    }

    public static final List BGx(PackageManager packageManager, int i) {
        if (Build.VERSION.SDK_INT >= 33) {
            return packageManager.getInstalledPackages(PackageManager.PackageInfoFlags.of(i));
        }
        return packageManager.getInstalledPackages(i);
    }

    public static final PackageInfo BGx(PackageManager packageManager, String str, int i) {
        if (Build.VERSION.SDK_INT >= 33) {
            return packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(i));
        }
        return packageManager.getPackageInfo(str, i);
    }
}

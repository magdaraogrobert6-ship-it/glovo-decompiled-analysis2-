package o;

import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class access101 {
    public static boolean read(PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.hardware.fingerprint");
    }
}

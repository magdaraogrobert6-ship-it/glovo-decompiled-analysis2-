package o;

import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class access201 {
    public static boolean serializer(PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.hardware.biometrics.iris");
    }

    public static boolean write(PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.hardware.biometrics.face");
    }
}

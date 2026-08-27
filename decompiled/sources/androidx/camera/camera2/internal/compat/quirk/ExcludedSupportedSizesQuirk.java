package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import o.CameraUpdateException;

/* JADX INFO: loaded from: classes.dex */
public class ExcludedSupportedSizesQuirk implements CameraUpdateException {
    public static boolean RemoteActionCompatParcelizer() {
        return "SAMSUNG".equalsIgnoreCase(Build.BRAND) && "a05s".equalsIgnoreCase(Build.DEVICE) && Build.MODEL.toUpperCase().contains("SM-A057");
    }

    public static boolean serializer() {
        if (!"Nokia".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String str = Build.DEVICE;
        return "B2N".equalsIgnoreCase(str) || "B2N_sprout".equalsIgnoreCase(str);
    }
}

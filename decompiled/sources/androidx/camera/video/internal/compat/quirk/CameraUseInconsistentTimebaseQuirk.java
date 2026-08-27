package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import o.CameraUpdateException;

/* JADX INFO: loaded from: classes.dex */
public class CameraUseInconsistentTimebaseQuirk implements CameraUpdateException {
    public static final HashSet serializer = new HashSet(Arrays.asList("samsungexynos7570", "samsungexynos7870", "qcom"));
    public static final HashSet read = new HashSet(Arrays.asList("sm4350", "sm6375", "sm7325"));
    public static final HashSet RemoteActionCompatParcelizer = new HashSet(Arrays.asList("m2007j20cg", "m2007j20ct"));

    public static boolean read() {
        if (Build.VERSION.SDK_INT >= 31) {
            if (read.contains(Build.SOC_MODEL.toLowerCase())) {
                return true;
            }
        }
        if ("SAMSUNG".equalsIgnoreCase(Build.BRAND)) {
            if (serializer.contains(Build.HARDWARE.toLowerCase())) {
                return true;
            }
        }
        return RemoteActionCompatParcelizer.contains(Build.MODEL.toLowerCase());
    }
}

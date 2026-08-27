package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import com.huawei.hms.android.SystemUtils;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import o.CameraUpdateException;

/* JADX INFO: loaded from: classes.dex */
public class ImageCaptureFailedForVideoSnapshotQuirk implements CameraUpdateException {
    public static final HashSet serializer = new HashSet(Arrays.asList("itel l6006", "itel w6004", "moto g(20)", "moto e13", "moto e20", "rmx3231", "rmx3511", "sm-a032f", "sm-a035m", "sm-f946u1", "tecno mobile bf6"));

    public static boolean serializer() {
        String str = Build.MODEL;
        Locale locale = Locale.US;
        if (serializer.contains(str.toLowerCase(locale))) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 31 && "Spreadtrum".equalsIgnoreCase(Build.SOC_MANUFACTURER)) {
            return true;
        }
        String str2 = Build.HARDWARE;
        if (str2.toLowerCase(locale).startsWith("ums")) {
            return true;
        }
        String str3 = Build.BRAND;
        if ("itel".equalsIgnoreCase(str3) && str2.toLowerCase(locale).startsWith("sp")) {
            return true;
        }
        return SystemUtils.PRODUCT_HUAWEI.equalsIgnoreCase(str3) && "FIG-LX1".equalsIgnoreCase(str);
    }
}

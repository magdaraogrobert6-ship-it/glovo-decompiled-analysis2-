package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.framework.common.BundleUtil;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public abstract class handleMotionEvent8iAsVTc {
    public static final Pattern RatingCompat = Pattern.compile("^(?!(firebase_|google_|ga_))[A-Za-z][A-Za-z_0-9]*");

    public abstract boolean read();

    public static void write(String str, String str2) {
        if (str == null || str.length() == 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Attribute key must not be null or empty");
            return;
        }
        if (str2 == null || str2.length() == 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Attribute value must not be null or empty");
            return;
        }
        if (str.length() > 40) {
            java.util.Locale locale = java.util.Locale.US;
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Attribute key length must not exceed 40 characters");
        } else if (str2.length() > 100) {
            java.util.Locale locale2 = java.util.Locale.US;
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Attribute value length must not exceed 100 characters");
        } else {
            if (RatingCompat.matcher(str).matches()) {
                return;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Attribute key must start with letter, must only contain alphanumeric characters and underscore and must not start with \"firebase_\", \"google_\" and \"ga_");
        }
    }

    public static String RemoteActionCompatParcelizer(String str) {
        if (str == null) {
            return "Metric name must not be null";
        }
        if (str.length() > 100) {
            java.util.Locale locale = java.util.Locale.US;
            return "Metric name must not exceed 100 characters";
        }
        if (!str.startsWith(BundleUtil.UNDERLINE_TAG)) {
            return null;
        }
        for (recalculateWindowPosition recalculatewindowposition : recalculateWindowPosition.values()) {
            if (recalculatewindowposition.toString().equals(str)) {
                return null;
            }
        }
        return "Metric name must not start with '_'";
    }
}

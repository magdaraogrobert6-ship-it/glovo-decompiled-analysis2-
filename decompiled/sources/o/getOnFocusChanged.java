package o;

import android.app.Activity;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public abstract class getOnFocusChanged extends FocusListener {
    public static boolean serializer(Activity activity, String str) {
        int i = Build.VERSION.SDK_INT;
        if (i < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        if (i >= 32) {
            return accessgetEntercp.RemoteActionCompatParcelizer(activity, str);
        }
        return i == 31 ? accessgetDowncp.RemoteActionCompatParcelizer(activity, str) : activity.shouldShowRequestPermissionRationale(str);
    }
}

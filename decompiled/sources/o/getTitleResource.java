package o;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import com.huawei.location.base.activity.constant.ActivityErrorCode;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getTitleResource {
    public static final int IconCompatParcelizer;

    static {
        IconCompatParcelizer = (Integer.parseInt("100") == 200 || Integer.parseInt("100") == 300) ? ActivityErrorCode.PERMISSION_DENIED : 10803;
    }

    public static boolean read(Context context, String str) {
        String strConcat;
        if (context != null && !TextUtils.isEmpty(str)) {
            if (context.checkSelfPermission(str) == 0) {
                return true;
            }
            strConcat = "do not hasSelfPermission ".concat(str);
        } else {
            strConcat = "hasSelfPermission failed because of context or permission is null";
        }
        WrappedCompositionsetContent1211.read("PermissionUtil", strConcat);
        return false;
    }

    public static boolean IconCompatParcelizer(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return Environment.isExternalStorageManager();
        }
        return read(context, "android.permission.READ_EXTERNAL_STORAGE") && read(context, "android.permission.WRITE_EXTERNAL_STORAGE");
    }
}

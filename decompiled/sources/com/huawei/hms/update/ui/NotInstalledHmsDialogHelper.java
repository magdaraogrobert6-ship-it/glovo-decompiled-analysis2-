package com.huawei.hms.update.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.util.AndroidException;
import android.util.Base64;
import androidx.compose.ui.graphics.Fields;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.ResourceLoaderUtil;
import com.huawei.hms.utils.UIUtil;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class NotInstalledHmsDialogHelper {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static byte serializer = -112;

    public static int getConfirmResId(Activity activity) {
        Checker.checkNonNull(activity, "activity must not be null");
        a(activity);
        return ResourceLoaderUtil.getStringId("hms_confirm");
    }

    private static String a(Context context, String str) {
        if (context == null) {
            HMSLog.e("NotInstalledHmsDialogHelper", "In getAppName, context is null.");
            return "";
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            HMSLog.e("NotInstalledHmsDialogHelper", "In getAppName, Failed to get 'PackageManager' instance.");
            return "";
        }
        try {
            if (TextUtils.isEmpty(str)) {
                str = context.getPackageName();
            }
            CharSequence applicationLabel = packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, Fields.SpotShadowColor));
            return applicationLabel == null ? "" : applicationLabel.toString();
        } catch (AndroidException | RuntimeException unused) {
            HMSLog.e("NotInstalledHmsDialogHelper", "In getAppName, Failed to get app name.");
            return "";
        }
    }

    public static String getAppName(Activity activity) {
        if (activity == null) {
            return "";
        }
        return a(activity, activity.getPackageName());
    }

    private static void b(String str, Object[] objArr) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[(bArrDecode.length - i) - 1] ^ serializer);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }

    public static AlertDialog.Builder getDialogBuilder(Activity activity) {
        int i = 2 % 2;
        Checker.checkNonNull(activity, "activity must not be null");
        a(activity);
        int stringId = ResourceLoaderUtil.getStringId("hms_apk_not_installed_hints");
        String strA = a(activity, activity.getPackageName());
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, UIUtil.getDialogThemeId(activity));
        Object[] objArr = {strA};
        Resources resources = activity.getResources();
        Configuration configuration = resources.getConfiguration();
        Locale locale = Build.VERSION.SDK_INT >= 24 ? configuration.getLocales().get(0) : configuration.locale;
        String string = resources.getString(stringId);
        if (string.startsWith("%('")) {
            int i2 = RemoteActionCompatParcelizer + 19;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            Object[] objArr2 = new Object[1];
            b(string.substring(3), objArr2);
            string = ((String) objArr2[0]).intern();
        }
        AlertDialog.Builder message = builder.setMessage(String.format(locale, string, objArr));
        int i4 = RemoteActionCompatParcelizer + 87;
        read = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return message;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(Context context) {
        if (ResourceLoaderUtil.getmContext() == null) {
            ResourceLoaderUtil.setmContext(context.getApplicationContext());
        }
    }
}

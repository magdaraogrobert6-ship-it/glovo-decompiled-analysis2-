package com.huawei.hms.common.internal;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.util.Base64;
import androidx.compose.ui.graphics.Fields;
import com.huawei.hms.adapter.AvailableUtil;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.ResourceLoaderUtil;
import com.huawei.hms.utils.Util;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class ConnectionErrorMessages {
    private static byte IconCompatParcelizer = -112;
    private static int read = 0;
    private static int write = 1;

    private static boolean a(Context context) {
        return context != null && Util.isAvailableLibExist(context) && AvailableUtil.isInstallerLibExist(context);
    }

    public static String getErrorDialogButtonMessage(Activity activity, int i) {
        if (activity == null) {
            return null;
        }
        if (ResourceLoaderUtil.getmContext() == null) {
            ResourceLoaderUtil.setmContext(activity.getApplicationContext());
        }
        if (i == 1) {
            if (a(activity)) {
                return ResourceLoaderUtil.getString("hms_install");
            }
            return ResourceLoaderUtil.getString("hms_confirm");
        }
        if (i != 2) {
            return ResourceLoaderUtil.getString("hms_confirm");
        }
        if (a(activity)) {
            return ResourceLoaderUtil.getString("hms_update");
        }
        return ResourceLoaderUtil.getString("hms_confirm");
    }

    public static String getErrorTitle(Activity activity, int i) {
        if (activity == null) {
            return null;
        }
        if (ResourceLoaderUtil.getmContext() == null) {
            ResourceLoaderUtil.setmContext(activity.getApplicationContext());
        }
        if (i == 1) {
            if (a(activity)) {
                return ResourceLoaderUtil.getString("hms_install_message");
            }
            return null;
        }
        if (i == 2) {
            if (a(activity)) {
                return ResourceLoaderUtil.getString("hms_update_message");
            }
            return null;
        }
        if (i == 3) {
            return ResourceLoaderUtil.getString("hms_bindfaildlg_message");
        }
        if (i == 9) {
            HMSLog.e("HuaweiApiAvailability", "Huawei Mobile Services is invalid. Cannot recover.");
            return null;
        }
        HMSLog.e("HuaweiApiAvailability", "Unexpected error code " + i);
        return null;
    }

    private static void b(String str, Object[] objArr) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[(bArrDecode.length - i) - 1] ^ IconCompatParcelizer);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }

    public static String getErrorMessage(Activity activity, int i) {
        int i2 = 2 % 2;
        Object obj = null;
        if (activity != null) {
            if (ResourceLoaderUtil.getmContext() == null) {
                int i3 = write + 83;
                read = i3 % Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    ResourceLoaderUtil.setmContext(activity.getApplicationContext());
                } else {
                    ResourceLoaderUtil.setmContext(activity.getApplicationContext());
                    obj.hashCode();
                    throw null;
                }
            }
            if (i != 1 && i != 2) {
                int i4 = write + 83;
                read = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return null;
            }
            if (a(activity)) {
                String string = ResourceLoaderUtil.getString("hms_update_title");
                int i6 = read + 47;
                write = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    int i7 = 22 / 0;
                }
                return string;
            }
            int stringId = ResourceLoaderUtil.getStringId("hms_apk_not_installed_hints");
            Object[] objArr = {Util.getAppName(activity, activity.getPackageName())};
            Resources resources = activity.getResources();
            Configuration configuration = resources.getConfiguration();
            Locale locale = Build.VERSION.SDK_INT >= 24 ? configuration.getLocales().get(0) : configuration.locale;
            String string2 = resources.getString(stringId);
            if (string2.startsWith("%('")) {
                Object[] objArr2 = new Object[1];
                b(string2.substring(3), objArr2);
                string2 = ((String) objArr2[0]).intern();
            }
            return String.format(locale, string2, objArr);
        }
        int i8 = write + 89;
        read = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return null;
    }
}

package com.huawei.hms.utils;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Base64;
import androidx.compose.ui.graphics.Fields;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.log.HMSLog;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ResourceLoaderUtil {
    private static int RemoteActionCompatParcelizer = 1;
    private static Context a = null;
    private static String b = null;
    private static byte serializer = -112;
    private static int write;

    public static Context getmContext() {
        return a;
    }

    public static void setmContext(Context context) {
        a = context;
        if (context != null) {
            b = context.getPackageName();
        } else {
            b = null;
            HMSLog.e("ResourceLoaderUtil", "context is null");
        }
    }

    public static int getAnimId(String str) {
        Context context = a;
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier(str, "anim", b);
    }

    public static int getColorId(String str) {
        Context context = a;
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier(str, RemoteMessageConst.Notification.COLOR, b);
    }

    public static int getDimenId(String str) {
        Context context = a;
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier(str, "dimen", b);
    }

    public static Drawable getDrawable(String str) {
        Context context = a;
        if (context == null) {
            return null;
        }
        return context.getResources().getDrawable(getDrawableId(str));
    }

    public static int getDrawableId(String str) {
        Context context = a;
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier(str, "drawable", b);
    }

    public static int getIdId(String str) {
        Context context = a;
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier(str, "id", b);
    }

    public static int getLayoutId(String str) {
        Context context = a;
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier(str, "layout", b);
    }

    public static int getStringId(String str) {
        Context context = a;
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier(str, "string", b);
    }

    public static int getStyleId(String str) {
        Context context = a;
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier(str, "style", b);
    }

    public static String getString(String str) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 65;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Context context = a;
        if (context == null) {
            int i4 = i2 + 5;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return "";
        }
        String string = context.getResources().getString(getStringId(str));
        if (!string.startsWith("%('")) {
            return string;
        }
        int i6 = write + 125;
        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        Object[] objArr = new Object[1];
        c(string.substring(3), objArr);
        return ((String) objArr[0]).intern();
    }

    public static String getString(String str, Object... objArr) {
        Locale locale;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 65;
        int i3 = i2 % Fields.SpotShadowColor;
        write = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            Context context = a;
            if (context == null) {
                int i4 = i3 + 85;
                RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    throw null;
                }
                return "";
            }
            Resources resources = context.getResources();
            int stringId = getStringId(str);
            Configuration configuration = resources.getConfiguration();
            if (Build.VERSION.SDK_INT >= 24) {
                locale = configuration.getLocales().get(0);
                int i5 = write + 9;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
            } else {
                locale = configuration.locale;
            }
            String string = resources.getString(stringId);
            if (string.startsWith("%('")) {
                int i7 = write + 67;
                RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                Object[] objArr2 = new Object[1];
                c(string.substring(3), objArr2);
                string = ((String) objArr2[0]).intern();
            }
            return String.format(locale, string, objArr);
        }
        obj.hashCode();
        throw null;
    }

    private static void c(String str, Object[] objArr) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[(bArrDecode.length - i) - 1] ^ serializer);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}

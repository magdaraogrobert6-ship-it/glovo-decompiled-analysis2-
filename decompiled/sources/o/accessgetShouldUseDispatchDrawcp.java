package o;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class accessgetShouldUseDispatchDrawcp {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static byte read = -112;

    private static void a(String str, Object[] objArr) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[(bArrDecode.length - i) - 1] ^ read);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }

    public static String read(Context context, String str, String str2) {
        int i = 2 % 2;
        if (TextUtils.isEmpty(str2)) {
            int i2 = RemoteActionCompatParcelizer + 11;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                Log.w("ResourcesUtils", "resName is empty");
                return null;
            }
            Log.w("ResourcesUtils", "resName is empty");
            int i3 = 55 / 0;
            return null;
        }
        int identifier = context.getResources().getIdentifier(str2, "string", str);
        if (identifier == 0) {
            Log.w("ResourcesUtils", "resId == 0");
            return null;
        }
        try {
            String string = context.getResources().getString(identifier);
            if (!string.startsWith("%('")) {
                return string;
            }
            int i4 = IconCompatParcelizer + 79;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            a(string.substring(3), objArr);
            return ((String) objArr[0]).intern();
        } catch (Resources.NotFoundException e) {
            Log.e("ResourcesUtils", "resources not fund" + e.getMessage());
            return null;
        }
    }

    public static String serializer(Context context, String str, String str2, String str3) {
        try {
            return read(context, str, str2.concat(accessgetMinimumTouchTargetSizeMYxV2XQjd.read(MessageDigest.getInstance("SHA-256").digest(str3.getBytes("utf-8")))));
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
            Log.e("ResourcesUtils", "getResources exception:" + e.getMessage());
            return null;
        }
    }
}

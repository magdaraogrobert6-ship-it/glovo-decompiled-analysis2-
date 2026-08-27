package o;

import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ComposeScrollCaptureCallbackonScrollCaptureImageRequest2 {
    public static final Pattern read = Pattern.compile("[0-9]*[a-z|A-Z]*[一-龥]*");

    public static String write(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("SecurityComp10300301: ", str);
    }

    public static String serializer(String str, boolean z) {
        StringBuilder sb = new StringBuilder(androidx.compose.ui.graphics.Fields.RotationY);
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                if (!TextUtils.isEmpty(str)) {
                    int length = str.length();
                    int i = 1;
                    if (1 == length) {
                        str = String.valueOf('*');
                    } else {
                        StringBuilder sb2 = new StringBuilder(length);
                        for (int i2 = 0; i2 < length; i2++) {
                            char cCharAt = str.charAt(i2);
                            if (read.matcher(String.valueOf(cCharAt)).matches()) {
                                if (i % 2 == 0) {
                                    cCharAt = '*';
                                }
                                i++;
                            }
                            sb2.append(cCharAt);
                        }
                        str = sb2.toString();
                    }
                }
                sb.append(str);
            } else {
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public static void IconCompatParcelizer(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.e(write(str), serializer(str2, false));
    }

    public static void RemoteActionCompatParcelizer(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.e(write(str), serializer(str2, true));
    }
}

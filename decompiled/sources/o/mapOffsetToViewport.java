package o;

import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public abstract class mapOffsetToViewport {
    public static final Pattern read = Pattern.compile("[0-9]*[a-z|A-Z]*[一-龥]*");

    public static String serializer(String str) {
        StringBuilder sb = new StringBuilder(androidx.compose.ui.graphics.Fields.RotationY);
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static void read(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.e(str, serializer(str2));
    }
}

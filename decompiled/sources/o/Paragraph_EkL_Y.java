package o;

import android.content.Context;
import android.net.ConnectivityManager;

/* JADX INFO: loaded from: classes3.dex */
public final class Paragraph_EkL_Y {
    private static int read = 1;
    private static int write;

    public static ceilToInt read(Context context) {
        int i = 2 % 2;
        Object systemService = context.getSystemService("connectivity");
        systemService.getClass();
        ceilToInt ceiltoint = new ceilToInt((ConnectivityManager) systemService);
        int i2 = read + 89;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return ceiltoint;
    }
}

package o;

import android.app.Application;
import android.os.Build;

/* JADX INFO: loaded from: classes3.dex */
public final class TextOverflowCompanion {
    private static int serializer = 0;
    private static int write = 1;
    public final Application read;

    public TextOverflowCompanion(Application application) {
        application.getClass();
        this.read = application;
    }

    public final boolean read() {
        String str;
        int i = 2 % 2;
        if (Build.VERSION.SDK_INT >= 31) {
            int i2 = serializer;
            int i3 = i2 + 35;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                throw null;
            }
            int i4 = i2 + 77;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            str = "android.permission.BLUETOOTH_SCAN";
        } else {
            str = "android.permission.ACCESS_FINE_LOCATION";
        }
        return this.read.checkSelfPermission(str) == 0;
    }
}

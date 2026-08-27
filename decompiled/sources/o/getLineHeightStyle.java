package o;

import android.app.Application;

/* JADX INFO: loaded from: classes3.dex */
public final class getLineHeightStyle {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final Application write;

    public getLineHeightStyle(Application application) {
        application.getClass();
        this.write = application;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = read + 97;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Application application = this.write;
        try {
            String str = application.getPackageManager().getPackageInfo(application.getPackageName(), 0).versionName;
            if (str == null) {
                int i4 = read + 25;
                RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return "";
            }
            int i6 = RemoteActionCompatParcelizer + 77;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                return str;
            }
            throw null;
        } catch (Exception unused) {
            return "";
        }
    }
}

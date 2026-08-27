package o;

import android.app.Application;
import android.app.DownloadManager;

/* JADX INFO: loaded from: classes3.dex */
public abstract class waitForUserDependencyThreadandroid_sdk_base_release implements getColorIntegerOrNulllambda0 {
    private static int read = 0;
    private static int serializer = 1;

    public static DownloadManager read(Application application) {
        int i = 2 % 2;
        int i2 = read + 85;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            Object systemService = application.getSystemService((Class<Object>) DownloadManager.class);
            systemService.getClass();
            obj.hashCode();
            throw null;
        }
        Object systemService2 = application.getSystemService((Class<Object>) DownloadManager.class);
        systemService2.getClass();
        DownloadManager downloadManager = (DownloadManager) systemService2;
        int i3 = serializer + 13;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return downloadManager;
        }
        obj.hashCode();
        throw null;
    }
}

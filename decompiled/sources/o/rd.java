package o;

import android.app.Application;
import android.content.pm.PackageManager;
import android.os.Build;

/* JADX INFO: loaded from: classes3.dex */
public final class rd {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final Application read;
    public final /* synthetic */ int serializer;

    public /* synthetic */ rd(Application application, int i) {
        this.serializer = i;
        this.read = application;
    }

    public final String IconCompatParcelizer() {
        String installerPackageName;
        String installingPackageName;
        int i = 2 % 2;
        int i2 = write + 125;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        Application application = this.read;
        if (i4 != 0) {
            String packageName = application.getPackageName();
            PackageManager packageManager = application.getPackageManager();
            try {
                installingPackageName = Build.VERSION.SDK_INT >= 30 ? packageManager.getInstallSourceInfo(packageName).getInstallingPackageName() : packageManager.getInstallerPackageName(packageName);
            } catch (IllegalArgumentException unused) {
                installingPackageName = "installation_source_unavailable";
            }
            if (installingPackageName != null) {
                return installingPackageName;
            }
            int i5 = write + 13;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return "sideloading_or_adb_source";
        }
        try {
            PackageManager packageManager2 = application.getPackageManager();
            String packageName2 = application.getPackageName();
            if (Build.VERSION.SDK_INT >= 30) {
                int i7 = write + 43;
                IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    packageManager2.getInstallSourceInfo(packageName2).getInstallingPackageName();
                    Object obj = null;
                    try {
                        obj.hashCode();
                        throw null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                installerPackageName = packageManager2.getInstallSourceInfo(packageName2).getInstallingPackageName();
            } else {
                installerPackageName = packageManager2.getInstallerPackageName(packageName2);
            }
            if (installerPackageName != null) {
                return installerPackageName;
            }
        } catch (PackageManager.NameNotFoundException | IllegalAccessException unused2) {
        }
        int i8 = IconCompatParcelizer + 83;
        write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return "INVALID_INSTALLATION_SOURCE";
    }
}

package o;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public abstract class accessgetDstIncp {
    public static final io.sentry.hints.PlaybackStateCompatCustomAction serializer = new io.sentry.hints.PlaybackStateCompatCustomAction(3);

    public static void read(Context context, Executor executor, accessgetDarkencp accessgetdarkencp, boolean z) {
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        boolean z2 = false;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(getActiveFocusTargetNode.write(file, new FileInputStream(file)));
                        try {
                            long j = dataInputStream.readLong();
                            dataInputStream.close();
                            boolean z3 = j == packageInfo.lastUpdateTime;
                            if (z3) {
                                accessgetdarkencp.IconCompatParcelizer(2, null);
                            }
                            if (z3) {
                                context.getPackageName();
                                accessgetDstOvercp.RemoteActionCompatParcelizer(context, false);
                                return;
                            }
                        } catch (Throwable th) {
                            try {
                                dataInputStream.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (IOException unused) {
                    }
                }
            }
            context.getPackageName();
            androidx.camera.core.LegacySessionConfig legacySessionConfig = new androidx.camera.core.LegacySessionConfig(assets, executor, accessgetdarkencp, name, new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof"));
            if (legacySessionConfig.RemoteActionCompatParcelizer()) {
                androidx.camera.core.LegacySessionConfig legacySessionConfig2 = legacySessionConfig.read();
                legacySessionConfig2.serializer();
                boolean zIconCompatParcelizer = legacySessionConfig2.IconCompatParcelizer();
                if (zIconCompatParcelizer) {
                    read(packageInfo, filesDir);
                }
                if (zIconCompatParcelizer && z) {
                    z2 = true;
                }
            }
            accessgetDstOvercp.RemoteActionCompatParcelizer(context, z2);
        } catch (PackageManager.NameNotFoundException e) {
            accessgetdarkencp.IconCompatParcelizer(7, e);
            accessgetDstOvercp.RemoteActionCompatParcelizer(context, false);
        }
    }

    public static void read(PackageInfo packageInfo, File file) {
        File file2 = new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(getPositionInRoot.write(new FileOutputStream(file2), file2));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }
}

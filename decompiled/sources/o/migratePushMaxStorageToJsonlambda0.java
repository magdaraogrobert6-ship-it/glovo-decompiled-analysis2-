package o;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint
public class migratePushMaxStorageToJsonlambda0 {
    private final Context RemoteActionCompatParcelizer;
    private final PackageManager serializer;

    public final String read() {
        try {
            return this.serializer.getApplicationInfo(this.RemoteActionCompatParcelizer.getPackageName(), 0).processName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public migratePushMaxStorageToJsonlambda0(Context context, ActivityManager activityManager, PackageManager packageManager) {
        this.RemoteActionCompatParcelizer = context;
        this.serializer = packageManager;
    }
}

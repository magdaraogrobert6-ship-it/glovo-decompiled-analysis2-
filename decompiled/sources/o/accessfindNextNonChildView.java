package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.stats.WakeLock;

/* JADX INFO: loaded from: classes2.dex */
public abstract class accessfindNextNonChildView {
    public static WakeLock RemoteActionCompatParcelizer;
    public static final Object serializer = new Object();

    public static ComponentName IconCompatParcelizer(Context context, Intent intent) {
        synchronized (serializer) {
            serializer(context);
            boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
            intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
            ComponentName componentNameStartService = context.startService(intent);
            if (componentNameStartService == null) {
                return null;
            }
            if (!booleanExtra) {
                RemoteActionCompatParcelizer.IconCompatParcelizer();
            }
            return componentNameStartService;
        }
    }

    public static void RemoteActionCompatParcelizer(Intent intent) {
        synchronized (serializer) {
            if (RemoteActionCompatParcelizer != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                RemoteActionCompatParcelizer.read();
            }
        }
    }

    public static void serializer(Context context) {
        if (RemoteActionCompatParcelizer == null) {
            WakeLock wakeLock = new WakeLock(context);
            RemoteActionCompatParcelizer = wakeLock;
            synchronized (wakeLock.write) {
                wakeLock.MediaDescriptionCompat = true;
            }
        }
    }
}

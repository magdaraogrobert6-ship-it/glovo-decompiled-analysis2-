package o;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getAvReceiverPowerEK5gGoQ {
    public static final int RemoteActionCompatParcelizer;

    public static PendingIntent serializer(int i, Context context, Intent intent) {
        return PendingIntent.getActivity(context, 0, intent, i);
    }

    static {
        RemoteActionCompatParcelizer = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }
}

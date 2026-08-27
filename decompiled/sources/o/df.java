package o;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Process;

/* JADX INFO: loaded from: classes3.dex */
public abstract class df {
    private static int RemoteActionCompatParcelizer = 1;
    public static int read;
    private static int serializer;
    public static int write;

    public static PendingIntent write(int i, Context context, Intent intent) {
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 73;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            PendingIntent.getActivity(context, i, intent, 201326592);
            throw null;
        }
        PendingIntent activity = PendingIntent.getActivity(context, i, intent, 201326592);
        int i4 = serializer + 101;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return activity;
    }

    public static final void RemoteActionCompatParcelizer(Activity activity, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        int i = 2 % 2;
        activity.getClass();
        FocusModifierKt.IconCompatParcelizer(coil3.util.UtilsKt.write(activity)).post(new Q(0, r8lambdardpfsr94j4iebcwx_kpqzpm8k0));
        int i2 = serializer + 101;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    public static int IconCompatParcelizer() {
        int i = read;
        int i2 = i % 9533206;
        read = i + 1;
        if (i2 != 0) {
            return write;
        }
        int iMyUid = Process.myUid();
        write = iMyUid;
        return iMyUid;
    }
}

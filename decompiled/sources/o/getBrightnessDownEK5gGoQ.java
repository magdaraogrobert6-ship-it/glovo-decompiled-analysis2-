package o;

import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getBrightnessDownEK5gGoQ {
    public static final int RemoteActionCompatParcelizer;

    static {
        RemoteActionCompatParcelizer = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }
}

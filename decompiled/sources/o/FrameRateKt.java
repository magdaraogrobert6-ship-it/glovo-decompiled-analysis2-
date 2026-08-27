package o;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class FrameRateKt {
    public static final boolean RemoteActionCompatParcelizer;

    static {
        RemoteActionCompatParcelizer = Build.VERSION.SDK_INT >= 34;
    }
}

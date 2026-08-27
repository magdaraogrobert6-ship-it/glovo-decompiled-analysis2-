package androidx.camera.video.internal.compat.quirk;

import android.annotation.SuppressLint;
import android.os.Build;
import o.CameraUpdateException;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint
public final class PrematureEndOfStreamVideoQuirk implements CameraUpdateException {
    public static final boolean IconCompatParcelizer;
    public static final PrematureEndOfStreamVideoQuirk write = new PrematureEndOfStreamVideoQuirk();

    static {
        IconCompatParcelizer = "OPPO".equalsIgnoreCase(Build.BRAND) && "CPH1931".equalsIgnoreCase(Build.MODEL);
    }
}

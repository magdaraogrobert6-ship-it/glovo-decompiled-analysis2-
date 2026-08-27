package androidx.camera.core.impl.utils;

import android.view.Surface;
import androidx.transition.Transition$1;

/* JADX INFO: loaded from: classes.dex */
public abstract class SurfaceUtil {
    private static native int[] nativeGetSurfaceInfo(Surface surface);

    static {
        System.loadLibrary("surface_util_jni");
    }

    public static Transition$1 IconCompatParcelizer(Surface surface) {
        int[] iArrNativeGetSurfaceInfo = nativeGetSurfaceInfo(surface);
        Transition$1 transition$1 = new Transition$1(6);
        int i = iArrNativeGetSurfaceInfo[0];
        int i2 = iArrNativeGetSurfaceInfo[1];
        int i3 = iArrNativeGetSurfaceInfo[2];
        return transition$1;
    }
}

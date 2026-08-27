package com.mapbox.maps.renderer;

import android.view.Surface;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes2.dex */
@Keep
class SurfaceWrapper {
    private long peer = 0;

    private native void initialize();

    private native long nativeGetANativeWindow();

    private native void nativeRelease();

    private native void nativeSetSurface(Surface surface);

    public native void finalize();

    public long getANativeWindow() {
        return nativeGetANativeWindow();
    }

    public void releaseSurface() {
        nativeRelease();
    }

    public void setSurface(Surface surface) {
        nativeSetSurface(surface);
    }

    public SurfaceWrapper() {
        initialize();
    }
}

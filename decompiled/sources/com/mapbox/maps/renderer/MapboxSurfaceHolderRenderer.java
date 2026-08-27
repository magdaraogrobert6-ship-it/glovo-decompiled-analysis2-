package com.mapbox.maps.renderer;

import android.view.Surface;
import android.view.SurfaceHolder;
import com.mapbox.maps.ContextMode;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxSurfaceHolderRenderer extends MapboxSurfaceRenderer implements SurfaceHolder.Callback {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxSurfaceHolderRenderer(SurfaceHolder surfaceHolder, int i, ContextMode contextMode, String str) {
        super(i, contextMode, str);
        surfaceHolder.getClass();
        contextMode.getClass();
        str.getClass();
        surfaceHolder.addCallback(this);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        surfaceHolder.getClass();
        Surface surface = surfaceHolder.getSurface();
        surface.getClass();
        surfaceChanged(surface, i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        surfaceHolder.getClass();
        surfaceCreated();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        surfaceHolder.getClass();
        surfaceDestroyed();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxSurfaceHolderRenderer(MapboxRenderThread mapboxRenderThread) {
        super(mapboxRenderThread);
        mapboxRenderThread.getClass();
    }
}

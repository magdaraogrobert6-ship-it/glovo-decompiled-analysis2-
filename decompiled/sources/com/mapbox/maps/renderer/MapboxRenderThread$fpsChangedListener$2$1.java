package com.mapbox.maps.renderer;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxRenderThread$fpsChangedListener$2$1 implements Runnable {
    final /* synthetic */ OnFpsChangedListener $new;
    final /* synthetic */ MapboxRenderThread this$0;

    public MapboxRenderThread$fpsChangedListener$2$1(MapboxRenderThread mapboxRenderThread, OnFpsChangedListener onFpsChangedListener) {
        this.this$0 = mapboxRenderThread;
        this.$new = onFpsChangedListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.this$0.fpsManager.setFpsChangedListener$maps_sdk_release(this.$new);
    }
}

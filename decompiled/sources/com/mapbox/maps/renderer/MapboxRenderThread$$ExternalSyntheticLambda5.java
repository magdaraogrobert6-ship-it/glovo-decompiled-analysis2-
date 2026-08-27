package com.mapbox.maps.renderer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class MapboxRenderThread$$ExternalSyntheticLambda5 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MapboxRenderThread f$0;

    public /* synthetic */ MapboxRenderThread$$ExternalSyntheticLambda5(MapboxRenderThread mapboxRenderThread, int i) {
        this.$r8$classId = i;
        this.f$0 = mapboxRenderThread;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = this.$r8$classId;
        MapboxRenderThread mapboxRenderThread = this.f$0;
        if (i != 0) {
            MapboxRenderThread.onSurfaceDestroyed$lambda$17$lambda$16$lambda$15(mapboxRenderThread);
        } else {
            MapboxRenderThread.destroy$lambda$37$lambda$36$lambda$35(mapboxRenderThread);
        }
    }
}

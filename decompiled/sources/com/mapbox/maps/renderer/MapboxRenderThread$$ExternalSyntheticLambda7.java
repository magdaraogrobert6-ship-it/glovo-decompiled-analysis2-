package com.mapbox.maps.renderer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class MapboxRenderThread$$ExternalSyntheticLambda7 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MapboxRenderThread f$0;

    public /* synthetic */ MapboxRenderThread$$ExternalSyntheticLambda7(MapboxRenderThread mapboxRenderThread, int i) {
        this.$r8$classId = i;
        this.f$0 = mapboxRenderThread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        MapboxRenderThread mapboxRenderThread = this.f$0;
        if (i != 0) {
            MapboxRenderThread.scheduleThreadServiceTypeReset$lambda$31(mapboxRenderThread);
        } else {
            MapboxRenderThread.onMapSet$lambda$32(mapboxRenderThread);
        }
    }
}

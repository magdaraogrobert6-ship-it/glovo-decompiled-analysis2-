package com.mapbox.maps;

import com.mapbox.maps.renderer.RendererSetupErrorListener;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class MapController$$ExternalSyntheticLambda3 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MapController f$0;
    public final /* synthetic */ RendererSetupErrorListener f$1;

    public /* synthetic */ MapController$$ExternalSyntheticLambda3(MapController mapController, RendererSetupErrorListener rendererSetupErrorListener, int i) {
        this.$r8$classId = i;
        this.f$0 = mapController;
        this.f$1 = rendererSetupErrorListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        RendererSetupErrorListener rendererSetupErrorListener = this.f$1;
        MapController mapController = this.f$0;
        if (i != 0) {
            MapController.removeRendererSetupErrorListener$lambda$13(mapController, rendererSetupErrorListener);
        } else {
            MapController.addRendererSetupErrorListener$lambda$12(mapController, rendererSetupErrorListener);
        }
    }
}

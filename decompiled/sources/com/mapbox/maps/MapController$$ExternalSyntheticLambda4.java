package com.mapbox.maps;

import com.mapbox.maps.renderer.MapboxRenderThread;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class MapController$$ExternalSyntheticLambda4 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ MapController$$ExternalSyntheticLambda4(int i, int i2, int i3, Object obj) {
        this.$r8$classId = i3;
        this.f$0 = obj;
        this.f$1 = i;
        this.f$2 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        int i2 = this.f$2;
        int i3 = this.f$1;
        Object obj = this.f$0;
        if (i != 0) {
            MapboxRenderThread.onSurfaceSizeChanged$lambda$13((MapboxRenderThread) obj, i3, i2);
        } else {
            MapController.onSizeChanged$lambda$9((MapController) obj, i3, i2);
        }
    }
}

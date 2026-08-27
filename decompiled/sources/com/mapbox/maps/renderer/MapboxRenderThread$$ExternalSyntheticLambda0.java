package com.mapbox.maps.renderer;

import androidx.core.content.res.ResourcesCompat$FontCallback;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class MapboxRenderThread$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ MapboxRenderThread$$ExternalSyntheticLambda0(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        int i2 = this.f$1;
        Object obj = this.f$0;
        if (i == 0) {
            MapboxRenderThread.setUserRefreshRate$lambda$24((MapboxRenderThread) obj, i2);
        } else if (i != 1) {
            ((ResourcesCompat$FontCallback) obj).onFontRetrievalFailed(i2);
        } else {
            MapboxRenderThread.setScreenRefreshRate$lambda$20((MapboxRenderThread) obj, i2);
        }
    }
}

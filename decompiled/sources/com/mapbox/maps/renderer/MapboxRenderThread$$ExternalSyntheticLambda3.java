package com.mapbox.maps.renderer;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.profileinstaller.ProfileInstallerInitializer$$ExternalSyntheticLambda1;
import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class MapboxRenderThread$$ExternalSyntheticLambda3 implements Choreographer.FrameCallback {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$0;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        if (i == 0) {
            MapboxRenderThread.presentFrameFunc$lambda$10((MapboxRenderThread) obj, j);
            return;
        }
        Handler.createAsync(Looper.getMainLooper()).postDelayed(new ProfileInstallerInitializer$$ExternalSyntheticLambda1((Context) obj, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
    }

    public /* synthetic */ MapboxRenderThread$$ExternalSyntheticLambda3(MapboxRenderThread mapboxRenderThread) {
        this.f$0 = mapboxRenderThread;
    }
}

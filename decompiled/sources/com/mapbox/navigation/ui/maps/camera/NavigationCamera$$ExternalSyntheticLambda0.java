package com.mapbox.navigation.ui.maps.camera;

import android.os.SystemClock;
import com.mapbox.navigation.ui.maps.camera.data.ViewportData;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class NavigationCamera$$ExternalSyntheticLambda0 {
    public final /* synthetic */ NavigationCamera f$0;

    public /* synthetic */ NavigationCamera$$ExternalSyntheticLambda0(NavigationCamera navigationCamera) {
        this.f$0 = navigationCamera;
    }

    public final void viewportDataSourceUpdated(ViewportData viewportData) {
        viewportData.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        NavigationCamera navigationCamera = this.f$0;
        if (jElapsedRealtime - navigationCamera.lastCameraStateLogTime >= 1000) {
            LoggerProviderKt.logI("Current camera state = " + navigationCamera.mapboxMap.getCameraState() + ", viewport update = " + viewportData, "NavigationCamera");
            navigationCamera.lastCameraStateLogTime = jElapsedRealtime;
        }
        navigationCamera.updateFrame(viewportData);
    }
}

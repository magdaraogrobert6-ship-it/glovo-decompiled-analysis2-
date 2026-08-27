package com.mapbox.navigation.ui.maps.camera.transition;

import android.view.animation.PathInterpolator;
import com.mapbox.maps.plugin.animation.CameraAnimationsPlugin;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultSimplifiedUpdateFrameTransitionProvider {
    public static final PathInterpolator LINEAR_INTERPOLATOR = new PathInterpolator(0.0f, 0.0f, 1.0f, 1.0f);
    public final CameraAnimationsPlugin cameraPlugin;

    public DefaultSimplifiedUpdateFrameTransitionProvider(CameraAnimationsPlugin cameraAnimationsPlugin) {
        this.cameraPlugin = cameraAnimationsPlugin;
    }
}

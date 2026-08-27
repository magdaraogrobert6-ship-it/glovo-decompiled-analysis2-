package com.mapbox.maps.plugin.delegates;

import com.mapbox.maps.CameraAnimationHint;
import com.mapbox.maps.MapOptions;
import com.mapbox.maps.Size;

/* JADX INFO: loaded from: classes2.dex */
public interface MapTransformDelegate {
    MapOptions getMapOptions();

    Size getSize();

    void setCameraAnimationHint(CameraAnimationHint cameraAnimationHint);

    void setGestureInProgress(boolean z);

    void setUserAnimationInProgress(boolean z);
}

package com.mapbox.maps.util;

import com.mapbox.maps.CameraOptions;

/* JADX INFO: loaded from: classes2.dex */
public final class CameraOptionsUtils {
    public static final boolean isEmpty(CameraOptions cameraOptions) {
        cameraOptions.getClass();
        return cameraOptions.getCenter() == null && cameraOptions.getPadding() == null && cameraOptions.getAnchor() == null && cameraOptions.getZoom() == null && cameraOptions.getBearing() == null && cameraOptions.getPitch() == null;
    }
}

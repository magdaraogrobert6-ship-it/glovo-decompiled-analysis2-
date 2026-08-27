package com.mapbox.maps;

import android.graphics.Bitmap;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.bindgen.DataRef;

/* JADX INFO: loaded from: classes2.dex */
public final class ExtensionUtils {
    @MapboxDelicateApi
    public static final Image toMapboxImage(Bitmap bitmap) {
        bitmap.getClass();
        if (bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Only ARGB_8888 bitmap config is supported!");
            return null;
        }
        DataRef dataRefAllocateNative = DataRef.allocateNative(bitmap.getByteCount());
        bitmap.copyPixelsToBuffer(dataRefAllocateNative.getBuffer());
        return new Image(bitmap.getWidth(), bitmap.getHeight(), dataRefAllocateNative);
    }

    public static /* synthetic */ CameraOptions toCameraOptions$default(CameraState cameraState, ScreenCoordinate screenCoordinate, int i, Object obj) {
        if ((i & 1) != 0) {
            screenCoordinate = null;
        }
        return toCameraOptions(cameraState, screenCoordinate);
    }

    public static final CameraOptions toCameraOptions(CameraState cameraState, ScreenCoordinate screenCoordinate) {
        cameraState.getClass();
        if (screenCoordinate != null) {
            CameraOptions cameraOptionsBuild = new CameraOptions.Builder().anchor(screenCoordinate).padding(cameraState.getPadding()).zoom(Double.valueOf(cameraState.getZoom())).pitch(Double.valueOf(cameraState.getPitch())).bearing(Double.valueOf(cameraState.getBearing())).build();
            cameraOptionsBuild.getClass();
            return cameraOptionsBuild;
        }
        CameraOptions cameraOptionsBuild2 = new CameraOptions.Builder().center(cameraState.getCenter()).padding(cameraState.getPadding()).zoom(Double.valueOf(cameraState.getZoom())).pitch(Double.valueOf(cameraState.getPitch())).bearing(Double.valueOf(cameraState.getBearing())).build();
        cameraOptionsBuild2.getClass();
        return cameraOptionsBuild2;
    }

    public static final CameraOptions toCameraOptions(CameraState cameraState) {
        cameraState.getClass();
        return toCameraOptions$default(cameraState, null, 1, null);
    }
}

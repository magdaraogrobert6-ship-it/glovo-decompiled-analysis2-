package com.mapbox.maps.plugin.delegates;

import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraBounds;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.MapCenterAltitudeMode;
import com.mapbox.maps.ScreenCoordinate;
import java.util.List;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public interface MapCameraManagerDelegate {
    CameraOptions cameraForCoordinates(List list, EdgeInsets edgeInsets, Double d, Double d2);

    void cameraForCoordinates(List list, CameraOptions cameraOptions, EdgeInsets edgeInsets, Double d, ScreenCoordinate screenCoordinate, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm);

    CameraOptions cameraForDrag(ScreenCoordinate screenCoordinate, ScreenCoordinate screenCoordinate2);

    Point coordinateForPixel(ScreenCoordinate screenCoordinate);

    CameraBounds getBounds();

    CameraState getCameraState();

    MapCenterAltitudeMode getCenterAltitudeMode();

    ScreenCoordinate pixelForCoordinate(Point point);

    void setCamera(CameraOptions cameraOptions);

    void setCenterAltitudeMode(MapCenterAltitudeMode mapCenterAltitudeMode);
}

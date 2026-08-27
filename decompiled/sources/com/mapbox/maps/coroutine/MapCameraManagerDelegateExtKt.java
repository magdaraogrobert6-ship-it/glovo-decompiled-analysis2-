package com.mapbox.maps.coroutine;

import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate;
import io.grpc.LoadBalancer$Helper;
import java.util.List;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import o.ShortNewsContentCardView;

/* JADX INFO: loaded from: classes5.dex */
public final class MapCameraManagerDelegateExtKt {
    public static final Object awaitCameraForCoordinates(MapCameraManagerDelegate mapCameraManagerDelegate, List list, CameraOptions cameraOptions, EdgeInsets edgeInsets, Double d, ScreenCoordinate screenCoordinate, ShortNewsContentCardView shortNewsContentCardView) {
        SafeContinuation safeContinuation = new SafeContinuation(LoadBalancer$Helper.intercepted(shortNewsContentCardView), CoroutineSingletons.UNDECIDED);
        mapCameraManagerDelegate.cameraForCoordinates(list, cameraOptions, edgeInsets, d, screenCoordinate, new MapCameraManagerDelegateExtKt$awaitCameraForCoordinates$2$1(safeContinuation));
        return safeContinuation.getOrThrow();
    }
}

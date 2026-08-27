package com.mapbox.navigation.ui.maps.route.line.api;

import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.ScreenCoordinate;
import java.util.List;
import o.ShortNewsContentCardView;

/* JADX INFO: loaded from: classes2.dex */
public interface ClosestRouteHandler {
    Object handle(MapboxMap mapboxMap, ScreenCoordinate screenCoordinate, List list, ShortNewsContentCardView shortNewsContentCardView);
}

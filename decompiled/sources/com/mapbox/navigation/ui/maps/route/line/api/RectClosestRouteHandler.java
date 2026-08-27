package com.mapbox.navigation.ui.maps.route.line.api;

import com.huawei.location.Vw$Vw;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.RenderedQueryGeometry;
import com.mapbox.maps.RenderedQueryOptions;
import com.mapbox.maps.ScreenBox;
import com.mapbox.maps.ScreenCoordinate;
import io.grpc.LoadBalancer$Helper;
import java.util.List;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import o.ShortNewsContentCardView;

/* JADX INFO: loaded from: classes2.dex */
public final class RectClosestRouteHandler implements ClosestRouteHandler {
    public final List layerIds;
    public final float padding;

    public RectClosestRouteHandler(List list, float f) {
        this.layerIds = list;
        this.padding = f;
    }

    @Override // com.mapbox.navigation.ui.maps.route.line.api.ClosestRouteHandler
    public final Object handle(MapboxMap mapboxMap, ScreenCoordinate screenCoordinate, List list, ShortNewsContentCardView shortNewsContentCardView) {
        double x = screenCoordinate.getX();
        double d = this.padding;
        ScreenBox screenBox = new ScreenBox(new ScreenCoordinate(x - d, screenCoordinate.getY() - d), new ScreenCoordinate(screenCoordinate.getX() + d, screenCoordinate.getY() + d));
        SafeContinuation safeContinuation = new SafeContinuation(LoadBalancer$Helper.intercepted(shortNewsContentCardView), CoroutineSingletons.UNDECIDED);
        mapboxMap.queryRenderedFeatures(new RenderedQueryGeometry(screenBox), new RenderedQueryOptions(this.layerIds, null), new Vw$Vw(list, 14, safeContinuation));
        return safeContinuation.getOrThrow();
    }
}

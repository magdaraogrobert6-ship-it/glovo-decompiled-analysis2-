package com.mapbox.navigator;

import com.mapbox.common.Cancelable;

/* JADX INFO: loaded from: classes4.dex */
public interface RouteGeometrySmoother {
    Cancelable smoothLaneGroupGeometries(RouteLaneGuidance routeLaneGuidance, SmoothedGeometryCallback smoothedGeometryCallback);
}

package com.mapbox.navigator.route_data;

/* JADX INFO: loaded from: classes5.dex */
public interface RdAnnotation {
    RdCongestionLevelArray congestion();

    RdU32OptionalArray congestionNumeric();

    RdF64Array distance();

    RdF64Array duration();

    RdSpeedLimitAnnotationArray maxspeed();

    RdF64Array speed();
}

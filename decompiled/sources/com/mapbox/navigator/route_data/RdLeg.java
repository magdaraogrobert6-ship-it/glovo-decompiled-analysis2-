package com.mapbox.navigator.route_data;

/* JADX INFO: loaded from: classes5.dex */
public interface RdLeg {
    double distance();

    double duration();

    RdStepArray steps();

    String summary();
}

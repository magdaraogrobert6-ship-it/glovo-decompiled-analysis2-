package com.mapbox.maps;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface CustomLayerMapProjection {
    List<Double> convertMercatorModelMatrix(List<Double> list, boolean z);

    List<Double> getModelMatrix();

    List<Double> getTransitionMatrix();

    float getTransitionPhase();
}

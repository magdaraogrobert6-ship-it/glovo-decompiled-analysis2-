package com.mapbox.geojson;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes2.dex */
@Keep
interface FlattenedCoordinateContainer<T, P> extends CoordinateContainer<T> {
    P flattenCoordinates();
}

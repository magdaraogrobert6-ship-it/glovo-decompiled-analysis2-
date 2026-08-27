package com.mapbox.navigator.route_data;

/* JADX INFO: loaded from: classes5.dex */
public interface RdIntersectionArray {
    void forEach(RdIntersectionArrayForEachCallback rdIntersectionArrayForEachCallback);

    RdIntersection get(long j);

    long size();
}

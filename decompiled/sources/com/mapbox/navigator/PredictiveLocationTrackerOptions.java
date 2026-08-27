package com.mapbox.navigator;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes4.dex */
public class PredictiveLocationTrackerOptions implements Serializable {
    private final int currentLocationRadius;
    private final int destinationLocationRadius;
    private final boolean loadPredictiveCacheForAlternativeRoutes;
    private final int routeBufferRadius;

    public int getCurrentLocationRadius() {
        return this.currentLocationRadius;
    }

    public int getDestinationLocationRadius() {
        return this.destinationLocationRadius;
    }

    public boolean getLoadPredictiveCacheForAlternativeRoutes() {
        return this.loadPredictiveCacheForAlternativeRoutes;
    }

    public int getRouteBufferRadius() {
        return this.routeBufferRadius;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public PredictiveLocationTrackerOptions(int i, int i2, int i3) {
        this.currentLocationRadius = i;
        this.routeBufferRadius = i2;
        this.destinationLocationRadius = i3;
        this.loadPredictiveCacheForAlternativeRoutes = false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[currentLocationRadius: ");
        IconCompatParcelizer.write(this.currentLocationRadius, ", routeBufferRadius: ", sb);
        IconCompatParcelizer.write(this.routeBufferRadius, ", destinationLocationRadius: ", sb);
        IconCompatParcelizer.write(this.destinationLocationRadius, ", loadPredictiveCacheForAlternativeRoutes: ", sb);
        return ff$$ExternalSyntheticOutline0.m(this.loadPredictiveCacheForAlternativeRoutes, sb, "]");
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.currentLocationRadius), Integer.valueOf(this.routeBufferRadius), Integer.valueOf(this.destinationLocationRadius), Boolean.valueOf(this.loadPredictiveCacheForAlternativeRoutes));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PredictiveLocationTrackerOptions predictiveLocationTrackerOptions = (PredictiveLocationTrackerOptions) obj;
        return this.currentLocationRadius == predictiveLocationTrackerOptions.currentLocationRadius && this.routeBufferRadius == predictiveLocationTrackerOptions.routeBufferRadius && this.destinationLocationRadius == predictiveLocationTrackerOptions.destinationLocationRadius && this.loadPredictiveCacheForAlternativeRoutes == predictiveLocationTrackerOptions.loadPredictiveCacheForAlternativeRoutes;
    }

    public PredictiveLocationTrackerOptions(int i, int i2, int i3, boolean z) {
        this.currentLocationRadius = i;
        this.routeBufferRadius = i2;
        this.destinationLocationRadius = i3;
        this.loadPredictiveCacheForAlternativeRoutes = z;
    }
}

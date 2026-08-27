package com.mapbox.navigator;

import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes5.dex */
public class RouteObjectMatcherError implements Serializable {
    private final String description;
    private final String routeObjectId;

    public String getDescription() {
        return this.description;
    }

    public String getRouteObjectId() {
        return this.routeObjectId;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.description, this.routeObjectId);
    }

    public RouteObjectMatcherError(String str, String str2) {
        this.description = str;
        this.routeObjectId = str2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[description: ");
        IconCompatParcelizer.read(sb, this.description, ", routeObjectId: ");
        return SweepGradientShader9KIMszodefault.read(sb, this.routeObjectId, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RouteObjectMatcherError routeObjectMatcherError = (RouteObjectMatcherError) obj;
        return Objects.equals(this.description, routeObjectMatcherError.description) && Objects.equals(this.routeObjectId, routeObjectMatcherError.routeObjectId);
    }
}

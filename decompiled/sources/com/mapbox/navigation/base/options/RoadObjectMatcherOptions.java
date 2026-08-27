package com.mapbox.navigation.base.options;

/* JADX INFO: loaded from: classes2.dex */
public final class RoadObjectMatcherOptions {
    public final NavigationTileDataDomain matchingGraphType;

    public final int hashCode() {
        return this.matchingGraphType.hashCode();
    }

    public RoadObjectMatcherOptions(NavigationTileDataDomain navigationTileDataDomain) {
        this.matchingGraphType = navigationTileDataDomain;
    }

    public final String toString() {
        return "RoadObjectMatcherOptions(openLRMaxDistanceToNode='null', matchingGraphType=" + this.matchingGraphType + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RoadObjectMatcherOptions.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.matchingGraphType == ((RoadObjectMatcherOptions) obj).matchingGraphType;
    }
}

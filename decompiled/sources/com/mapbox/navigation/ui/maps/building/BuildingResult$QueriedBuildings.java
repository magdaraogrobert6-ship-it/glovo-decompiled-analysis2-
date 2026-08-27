package com.mapbox.navigation.ui.maps.building;

import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes2.dex */
public final class BuildingResult$QueriedBuildings {
    public final Expected queriedBuildings;

    public final int hashCode() {
        return this.queriedBuildings.hashCode();
    }

    public BuildingResult$QueriedBuildings(Expected expected) {
        this.queriedBuildings = expected;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BuildingResult$QueriedBuildings) && this.queriedBuildings.equals(((BuildingResult$QueriedBuildings) obj).queriedBuildings);
    }

    public final String toString() {
        return "QueriedBuildings(queriedBuildings=" + this.queriedBuildings + ')';
    }
}

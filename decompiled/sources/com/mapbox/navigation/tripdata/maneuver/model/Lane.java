package com.mapbox.navigation.tripdata.maneuver.model;

import bo.app.af$$ExternalSyntheticOutline1;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class Lane {
    public final ArrayList allLanes;

    public final int hashCode() {
        return this.allLanes.hashCode();
    }

    public Lane(ArrayList arrayList) {
        this.allLanes = arrayList;
    }

    public final String toString() {
        return af$$ExternalSyntheticOutline1.m(new StringBuilder("Lane(allLanes="), this.allLanes, ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Lane.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.allLanes.equals(((Lane) obj).allLanes);
    }
}

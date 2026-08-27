package com.mapbox.navigation.tripdata.maneuver.model;

import bo.app.af$$ExternalSyntheticOutline1;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class LegIndexToManeuvers {
    public final int legIndex;
    public final ArrayList stepIndexToManeuvers;

    public final int hashCode() {
        return this.stepIndexToManeuvers.hashCode() + (Integer.hashCode(this.legIndex) * 31);
    }

    public LegIndexToManeuvers(int i, ArrayList arrayList) {
        this.legIndex = i;
        this.stepIndexToManeuvers = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegIndexToManeuvers)) {
            return false;
        }
        LegIndexToManeuvers legIndexToManeuvers = (LegIndexToManeuvers) obj;
        return this.legIndex == legIndexToManeuvers.legIndex && this.stepIndexToManeuvers.equals(legIndexToManeuvers.stepIndexToManeuvers);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LegIndexToManeuvers(legIndex=");
        sb.append(this.legIndex);
        sb.append(", stepIndexToManeuvers=");
        return af$$ExternalSyntheticOutline1.m(sb, this.stepIndexToManeuvers, ')');
    }
}

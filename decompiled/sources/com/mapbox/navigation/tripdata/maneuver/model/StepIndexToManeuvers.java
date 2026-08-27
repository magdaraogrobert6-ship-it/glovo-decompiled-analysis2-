package com.mapbox.navigation.tripdata.maneuver.model;

import bo.app.af$$ExternalSyntheticOutline1;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class StepIndexToManeuvers {
    public final ArrayList maneuverList;
    public final int stepIndex;

    public final int hashCode() {
        return this.maneuverList.hashCode() + (Integer.hashCode(this.stepIndex) * 31);
    }

    public StepIndexToManeuvers(int i, ArrayList arrayList) {
        this.stepIndex = i;
        this.maneuverList = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StepIndexToManeuvers)) {
            return false;
        }
        StepIndexToManeuvers stepIndexToManeuvers = (StepIndexToManeuvers) obj;
        return this.stepIndex == stepIndexToManeuvers.stepIndex && this.maneuverList.equals(stepIndexToManeuvers.maneuverList);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StepIndexToManeuvers(stepIndex=");
        sb.append(this.stepIndex);
        sb.append(", maneuverList=");
        return af$$ExternalSyntheticOutline1.m(sb, this.maneuverList, ')');
    }
}

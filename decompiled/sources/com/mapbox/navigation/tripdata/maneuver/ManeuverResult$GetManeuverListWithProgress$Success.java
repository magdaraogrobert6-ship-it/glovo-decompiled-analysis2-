package com.mapbox.navigation.tripdata.maneuver;

import bo.app.af$$ExternalSyntheticOutline1;
import java.util.ArrayList;
import o.SemanticsActionsCustomActions1;

/* JADX INFO: loaded from: classes2.dex */
public final class ManeuverResult$GetManeuverListWithProgress$Success extends SemanticsActionsCustomActions1 {
    public final ArrayList maneuvers;

    public final int hashCode() {
        return this.maneuvers.hashCode();
    }

    public ManeuverResult$GetManeuverListWithProgress$Success(ArrayList arrayList) {
        this.maneuvers = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ManeuverResult$GetManeuverListWithProgress$Success) && this.maneuvers.equals(((ManeuverResult$GetManeuverListWithProgress$Success) obj).maneuvers);
    }

    public final String toString() {
        return af$$ExternalSyntheticOutline1.m(new StringBuilder("Success(maneuvers="), this.maneuvers, ')');
    }
}

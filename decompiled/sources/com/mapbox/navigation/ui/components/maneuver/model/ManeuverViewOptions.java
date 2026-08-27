package com.mapbox.navigation.ui.components.maneuver.model;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class ManeuverViewOptions {
    public final int laneGuidanceTurnIconManeuver;
    public final int maneuverBackgroundColor;
    public final ManeuverPrimaryOptions primaryManeuverOptions;
    public final ManeuverSecondaryOptions secondaryManeuverOptions;
    public final int stepDistanceTextAppearance;
    public final int subManeuverBackgroundColor;
    public final ManeuverSubOptions subManeuverOptions;
    public final int turnIconManeuver;
    public final int upcomingManeuverBackgroundColor;

    public ManeuverViewOptions(int i, int i2, int i3, int i4, int i5, int i6, ManeuverPrimaryOptions maneuverPrimaryOptions, ManeuverSecondaryOptions maneuverSecondaryOptions, ManeuverSubOptions maneuverSubOptions) {
        this.maneuverBackgroundColor = i;
        this.subManeuverBackgroundColor = i2;
        this.upcomingManeuverBackgroundColor = i3;
        this.turnIconManeuver = i4;
        this.stepDistanceTextAppearance = i5;
        this.laneGuidanceTurnIconManeuver = i6;
        this.primaryManeuverOptions = maneuverPrimaryOptions;
        this.secondaryManeuverOptions = maneuverSecondaryOptions;
        this.subManeuverOptions = maneuverSubOptions;
    }

    public final String toString() {
        return "ManeuverViewOptions(maneuverBackgroundColor=" + this.maneuverBackgroundColor + ", subManeuverBackgroundColor=" + this.subManeuverBackgroundColor + ", upcomingManeuverBackgroundColor=" + this.upcomingManeuverBackgroundColor + ", turnIconManeuver=" + this.turnIconManeuver + ", stepDistanceTextAppearance=" + this.stepDistanceTextAppearance + ", laneGuidanceTurnIconManeuver=" + this.laneGuidanceTurnIconManeuver + ", primaryManeuverOptions=" + this.primaryManeuverOptions + ", secondaryManeuverOptions=" + this.secondaryManeuverOptions + ", subManeuverOptions=" + this.subManeuverOptions + ')';
    }

    public final int hashCode() {
        int iM = af$$ExternalSyntheticOutline0.m(this.laneGuidanceTurnIconManeuver, af$$ExternalSyntheticOutline0.m(this.stepDistanceTextAppearance, af$$ExternalSyntheticOutline0.m(this.turnIconManeuver, af$$ExternalSyntheticOutline0.m(this.upcomingManeuverBackgroundColor, af$$ExternalSyntheticOutline0.m(this.subManeuverBackgroundColor, this.maneuverBackgroundColor * 31, 31), 31), 31), 31), 31);
        int iHashCode = this.primaryManeuverOptions.hashCode();
        return this.subManeuverOptions.hashCode() + ((this.secondaryManeuverOptions.hashCode() + ((iHashCode + iM) * 31)) * 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ManeuverViewOptions.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        ManeuverViewOptions maneuverViewOptions = (ManeuverViewOptions) obj;
        return this.maneuverBackgroundColor == maneuverViewOptions.maneuverBackgroundColor && this.subManeuverBackgroundColor == maneuverViewOptions.subManeuverBackgroundColor && this.upcomingManeuverBackgroundColor == maneuverViewOptions.upcomingManeuverBackgroundColor && this.turnIconManeuver == maneuverViewOptions.turnIconManeuver && this.stepDistanceTextAppearance == maneuverViewOptions.stepDistanceTextAppearance && this.laneGuidanceTurnIconManeuver == maneuverViewOptions.laneGuidanceTurnIconManeuver && this.primaryManeuverOptions.equals(maneuverViewOptions.primaryManeuverOptions) && this.secondaryManeuverOptions.equals(maneuverViewOptions.secondaryManeuverOptions) && this.subManeuverOptions.equals(maneuverViewOptions.subManeuverOptions);
    }
}

package com.mapbox.navigation.ui.components.maneuver.model;

import o.getSetText;
import o.getShowTextSubstitution;

/* JADX INFO: loaded from: classes2.dex */
public final class ManeuverExitOptions {
    public final getSetText mutcdExitProperties;
    public final int textAppearance;
    public final getShowTextSubstitution viennaExitProperties;

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.textAppearance);
        return this.viennaExitProperties.hashCode() + ((this.mutcdExitProperties.hashCode() + (iHashCode * 31)) * 31);
    }

    public ManeuverExitOptions(int i, getSetText getsettext, getShowTextSubstitution getshowtextsubstitution) {
        this.textAppearance = i;
        this.mutcdExitProperties = getsettext;
        this.viennaExitProperties = getshowtextsubstitution;
    }

    public final String toString() {
        return "ManeuverExitOptions(textAppearance=" + this.textAppearance + ", mutcdExitProperties=" + this.mutcdExitProperties + ", viennaExitProperties=" + this.viennaExitProperties + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (ManeuverExitOptions.class.equals(obj != null ? obj.getClass() : null)) {
            obj.getClass();
            ManeuverExitOptions maneuverExitOptions = (ManeuverExitOptions) obj;
            return this.textAppearance == maneuverExitOptions.textAppearance && this.mutcdExitProperties == maneuverExitOptions.mutcdExitProperties && this.viennaExitProperties == maneuverExitOptions.viennaExitProperties;
        }
        return false;
    }
}

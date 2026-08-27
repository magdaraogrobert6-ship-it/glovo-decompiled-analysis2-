package com.mapbox.navigation.ui.components.maneuver.model;

/* JADX INFO: loaded from: classes2.dex */
public final class ManeuverSubOptions {
    public final ManeuverExitOptions exitOptions;
    public final int textAppearance;

    public final int hashCode() {
        return this.exitOptions.hashCode() + (Integer.hashCode(this.textAppearance) * 31);
    }

    public ManeuverSubOptions(int i, ManeuverExitOptions maneuverExitOptions) {
        this.textAppearance = i;
        this.exitOptions = maneuverExitOptions;
    }

    public final String toString() {
        return "ManeuverSubOptions(textAppearance=" + this.textAppearance + ", exitOptions=" + this.exitOptions + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ManeuverSubOptions.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        ManeuverSubOptions maneuverSubOptions = (ManeuverSubOptions) obj;
        return this.textAppearance == maneuverSubOptions.textAppearance && this.exitOptions.equals(maneuverSubOptions.exitOptions);
    }
}

package com.mapbox.navigation.ui.components.maneuver.model;

/* JADX INFO: loaded from: classes2.dex */
public final class ManeuverPrimaryOptions {
    public final ManeuverExitOptions exitOptions;
    public final int textAppearance;

    public final int hashCode() {
        return this.exitOptions.hashCode() + (Integer.hashCode(this.textAppearance) * 31);
    }

    public ManeuverPrimaryOptions(int i, ManeuverExitOptions maneuverExitOptions) {
        this.textAppearance = i;
        this.exitOptions = maneuverExitOptions;
    }

    public final String toString() {
        return "ManeuverPrimaryOptions(textAppearance=" + this.textAppearance + ", exitOptions=" + this.exitOptions + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ManeuverPrimaryOptions.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        ManeuverPrimaryOptions maneuverPrimaryOptions = (ManeuverPrimaryOptions) obj;
        return this.textAppearance == maneuverPrimaryOptions.textAppearance && this.exitOptions.equals(maneuverPrimaryOptions.exitOptions);
    }
}

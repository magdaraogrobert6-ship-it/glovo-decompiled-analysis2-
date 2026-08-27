package com.mapbox.navigation.ui.components.maneuver.model;

/* JADX INFO: loaded from: classes2.dex */
public final class ManeuverSecondaryOptions {
    public final ManeuverExitOptions exitOptions;
    public final int textAppearance;

    public final int hashCode() {
        return this.exitOptions.hashCode() + (Integer.hashCode(this.textAppearance) * 31);
    }

    public ManeuverSecondaryOptions(int i, ManeuverExitOptions maneuverExitOptions) {
        this.textAppearance = i;
        this.exitOptions = maneuverExitOptions;
    }

    public final String toString() {
        return "ManeuverSecondaryOptions(textAppearance=" + this.textAppearance + ", exitOptions=" + this.exitOptions + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ManeuverSecondaryOptions.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        ManeuverSecondaryOptions maneuverSecondaryOptions = (ManeuverSecondaryOptions) obj;
        return this.textAppearance == maneuverSecondaryOptions.textAppearance && this.exitOptions.equals(maneuverSecondaryOptions.exitOptions);
    }
}

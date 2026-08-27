package com.mapbox.navigation.base.internal.maneuver;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class ManeuverTurnIcon {
    public final Float degree;
    public final String drivingSide;
    public final Integer icon;
    public final boolean shouldFlipIcon;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public final int hashCode() {
        Float f = this.degree;
        int iHashCode = f == null ? 0 : f.hashCode();
        String str = this.drivingSide;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        boolean z = this.shouldFlipIcon;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        return this.icon.hashCode() + (((((iHashCode * 31) + iHashCode2) * 31) + r2) * 31);
    }

    public ManeuverTurnIcon(Float f, String str, boolean z, Integer num) {
        this.degree = f;
        this.drivingSide = str;
        this.shouldFlipIcon = z;
        this.icon = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ManeuverTurnIcon)) {
            return false;
        }
        ManeuverTurnIcon maneuverTurnIcon = (ManeuverTurnIcon) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.degree, maneuverTurnIcon.degree}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.drivingSide, maneuverTurnIcon.drivingSide}, getCieXyz.write())).booleanValue() && this.shouldFlipIcon == maneuverTurnIcon.shouldFlipIcon && this.icon.equals(maneuverTurnIcon.icon);
    }

    public final String toString() {
        return "ManeuverTurnIcon(degree=" + this.degree + ", drivingSide=" + this.drivingSide + ", shouldFlipIcon=" + this.shouldFlipIcon + ", icon=" + this.icon + ')';
    }
}

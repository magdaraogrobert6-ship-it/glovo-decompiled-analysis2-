package com.mapbox.navigation.tripdata.maneuver.model;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.List;
import o.SweepGradientShader9KIMszodefault;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class LaneIndicator {
    public final List accessDesignated;
    public final String activeDirection;
    public final List directions;
    public final String drivingSide;
    public final boolean isActive;

    public final int hashCode() {
        int iM = af$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m(this.directions, Boolean.hashCode(this.isActive) * 31, 31), 31, this.drivingSide);
        String str = this.activeDirection;
        return this.accessDesignated.hashCode() + ((iM + (str != null ? str.hashCode() : 0)) * 31);
    }

    public LaneIndicator(boolean z, String str, List list, String str2, List list2) {
        this.isActive = z;
        this.drivingSide = str;
        this.directions = list;
        this.activeDirection = str2;
        this.accessDesignated = list2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LaneIndicator(isActive=");
        sb.append(this.isActive);
        sb.append(", directions=");
        sb.append(this.directions);
        sb.append(", drivingSide=");
        sb.append(this.drivingSide);
        sb.append(", activeDirection=");
        sb.append(this.activeDirection);
        sb.append(", accessDesignated=");
        return SweepGradientShader9KIMszodefault.IconCompatParcelizer(sb, this.accessDesignated, ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!LaneIndicator.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        LaneIndicator laneIndicator = (LaneIndicator) obj;
        if (this.isActive != laneIndicator.isActive || !this.directions.equals(laneIndicator.directions) || !this.drivingSide.equals(laneIndicator.drivingSide)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.activeDirection, laneIndicator.activeDirection}, getCieXyz.write())).booleanValue() && this.accessDesignated.equals(laneIndicator.accessDesignated);
    }
}

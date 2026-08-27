package com.mapbox.navigation.tripdata.maneuver.model;

import com.mapbox.api.directions.v5.models.MapboxShield;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class RoadShieldComponentNode implements ComponentNode {
    public final MapboxShield mapboxShield;
    public final String shieldUrl;
    public final String text;

    public final int hashCode() {
        int iHashCode = this.text.hashCode();
        String str = this.shieldUrl;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        MapboxShield mapboxShield = this.mapboxShield;
        return (((iHashCode * 31) + iHashCode2) * 31) + (mapboxShield != null ? mapboxShield.hashCode() : 0);
    }

    public RoadShieldComponentNode(String str, String str2, MapboxShield mapboxShield) {
        this.text = str;
        this.shieldUrl = str2;
        this.mapboxShield = mapboxShield;
    }

    public final String toString() {
        return "RoadShieldComponentNode(text='" + this.text + "', shieldUrl=" + this.shieldUrl + ", mapboxShield=" + this.mapboxShield + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RoadShieldComponentNode.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        RoadShieldComponentNode roadShieldComponentNode = (RoadShieldComponentNode) obj;
        if (!this.text.equals(roadShieldComponentNode.text)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.shieldUrl, roadShieldComponentNode.shieldUrl}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mapboxShield, roadShieldComponentNode.mapboxShield}, getCieXyz.write())).booleanValue();
    }
}

package com.mapbox.navigation.tripdata.maneuver.model;

import bo.app.af$$ExternalSyntheticOutline0;
import java.util.List;
import o.SweepGradientShader9KIMszodefault;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class PrimaryManeuver {
    public final List componentList;
    public final Double degrees;
    public final String drivingSide;
    public final String id;
    public final String modifier;
    public final String text;
    public final String type;

    public final int hashCode() {
        int iM = af$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.text);
        String str = this.type;
        int iHashCode = str != null ? str.hashCode() : 0;
        Double d = this.degrees;
        int iHashCode2 = d != null ? d.hashCode() : 0;
        String str2 = this.modifier;
        int iHashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.drivingSide;
        return this.componentList.hashCode() + ((((((((iM + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public PrimaryManeuver(String str, String str2, String str3, Double d, String str4, String str5, List list) {
        list.getClass();
        this.id = str;
        this.text = str2;
        this.type = str3;
        this.degrees = d;
        this.modifier = str4;
        this.drivingSide = str5;
        this.componentList = list;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PrimaryManeuver(text='");
        sb.append(this.text);
        sb.append("', type=");
        sb.append(this.type);
        sb.append(", degrees=");
        sb.append(this.degrees);
        sb.append(", modifier=");
        sb.append(this.modifier);
        sb.append(", drivingSide=");
        sb.append(this.drivingSide);
        sb.append(", componentList=");
        return SweepGradientShader9KIMszodefault.IconCompatParcelizer(sb, this.componentList, ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!PrimaryManeuver.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        PrimaryManeuver primaryManeuver = (PrimaryManeuver) obj;
        if (!this.id.equals(primaryManeuver.id) || !this.text.equals(primaryManeuver.text)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.type, primaryManeuver.type}, getCieXyz.write())).booleanValue() || !removeNodeAtDepth.read(this.degrees, primaryManeuver.degrees)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.modifier, primaryManeuver.modifier}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.drivingSide, primaryManeuver.drivingSide}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.componentList, primaryManeuver.componentList}, getCieXyz.write())).booleanValue();
    }
}

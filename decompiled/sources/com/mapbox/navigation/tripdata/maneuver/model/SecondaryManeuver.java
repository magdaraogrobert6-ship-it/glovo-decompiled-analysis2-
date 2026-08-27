package com.mapbox.navigation.tripdata.maneuver.model;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.af$$ExternalSyntheticOutline1;
import java.util.ArrayList;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class SecondaryManeuver {
    public final ArrayList componentList;
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
        return this.componentList.hashCode() + ((this.drivingSide.hashCode() + ((((((iM + iHashCode) * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
    }

    public SecondaryManeuver(String str, String str2, String str3, Double d, String str4, String str5, ArrayList arrayList) {
        this.id = str;
        this.text = str2;
        this.type = str3;
        this.degrees = d;
        this.modifier = str4;
        this.drivingSide = str5;
        this.componentList = arrayList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SecondaryManeuver(id='");
        sb.append(this.id);
        sb.append("', text='");
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
        return af$$ExternalSyntheticOutline1.m(sb, this.componentList, ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!SecondaryManeuver.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        SecondaryManeuver secondaryManeuver = (SecondaryManeuver) obj;
        if (!this.id.equals(secondaryManeuver.id) || !this.text.equals(secondaryManeuver.text)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.type, secondaryManeuver.type}, getCieXyz.write())).booleanValue() || !removeNodeAtDepth.read(this.degrees, secondaryManeuver.degrees)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.modifier, secondaryManeuver.modifier}, getCieXyz.write())).booleanValue() && this.drivingSide.equals(secondaryManeuver.drivingSide) && this.componentList.equals(secondaryManeuver.componentList);
    }
}

package com.mapbox.navigation.base.trip.model.roadobject.incident;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class IncidentInfo {
    public final List affectedRoadNames;
    public final List alertcCodes;
    public final IncidentCongestion congestion;
    public final String countryCodeAlpha2;
    public final String countryCodeAlpha3;
    public final Date creationTime;
    public final String description;
    public final Date endTime;
    public final String id;
    public final String impact;
    public final boolean isClosed;
    public final List lanesBlocked;
    public final String lanesClearDesc;
    public final Integer length;
    public final String longDescription;
    public final HashMap multilingualAffectedRoadNames;
    public final Long numLanesBlocked;
    public final Date startTime;
    public final String subType;
    public final String subTypeDescription;
    public final HashMap trafficCodes;
    public final int type;

    public final int hashCode() {
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.type, this.id.hashCode() * 31, 31), 31, this.impact);
        IncidentCongestion incidentCongestion = this.congestion;
        int iM2 = d$$ExternalSyntheticOutline0.m((iM + (incidentCongestion != null ? incidentCongestion.hashCode() : 0)) * 31, 31, this.isClosed);
        Date date = this.creationTime;
        int iHashCode = date != null ? date.hashCode() : 0;
        Date date2 = this.startTime;
        int iHashCode2 = date2 != null ? date2.hashCode() : 0;
        Date date3 = this.endTime;
        int iHashCode3 = date3 != null ? date3.hashCode() : 0;
        String str = this.description;
        int iHashCode4 = str != null ? str.hashCode() : 0;
        String str2 = this.subType;
        int iHashCode5 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.subTypeDescription;
        int iHashCode6 = str3 != null ? str3.hashCode() : 0;
        List list = this.alertcCodes;
        int iHashCode7 = list != null ? list.hashCode() : 0;
        int iHashCode8 = this.trafficCodes.hashCode();
        String str4 = this.countryCodeAlpha2;
        int iHashCode9 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.countryCodeAlpha3;
        int iM3 = c8$$ExternalSyntheticOutline0.m(this.lanesBlocked, (((((iHashCode8 + ((((((((((((((iM2 + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31)) * 31) + iHashCode9) * 31) + (str5 != null ? str5.hashCode() : 0)) * 31, 31);
        String str6 = this.longDescription;
        int iHashCode10 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.lanesClearDesc;
        int iHashCode11 = str7 != null ? str7.hashCode() : 0;
        Long l = this.numLanesBlocked;
        int iHashCode12 = l != null ? l.hashCode() : 0;
        List list2 = this.affectedRoadNames;
        int iHashCode13 = list2 != null ? list2.hashCode() : 0;
        int iHashCode14 = this.multilingualAffectedRoadNames.hashCode();
        Integer num = this.length;
        return ((iHashCode14 + ((((((((iM3 + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31)) * 31) + (num != null ? num.hashCode() : 0);
    }

    public IncidentInfo(String str, int i, String str2, IncidentCongestion incidentCongestion, boolean z, Date date, Date date2, Date date3, String str3, String str4, String str5, List list, HashMap map, String str6, String str7, List list2, String str8, String str9, Long l, List list3, HashMap map2, Integer num) {
        this.id = str;
        this.type = i;
        this.impact = str2;
        this.congestion = incidentCongestion;
        this.isClosed = z;
        this.creationTime = date;
        this.startTime = date2;
        this.endTime = date3;
        this.description = str3;
        this.subType = str4;
        this.subTypeDescription = str5;
        this.alertcCodes = list;
        this.trafficCodes = map;
        this.countryCodeAlpha2 = str6;
        this.countryCodeAlpha3 = str7;
        this.lanesBlocked = list2;
        this.longDescription = str8;
        this.lanesClearDesc = str9;
        this.numLanesBlocked = l;
        this.affectedRoadNames = list3;
        this.multilingualAffectedRoadNames = map2;
        this.length = num;
    }

    public final String toString() {
        return "IncidentInfo(id='" + this.id + "', type=" + this.type + ", impact='" + this.impact + "', congestion=" + this.congestion + ", isClosed=" + this.isClosed + ", creationTime=" + this.creationTime + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", description=" + this.description + ", subType=" + this.subType + ", subTypeDescription=" + this.subTypeDescription + ", alertcCodes=" + this.alertcCodes + ", trafficCodes=" + this.trafficCodes + ", countryCodeAlpha2=" + this.countryCodeAlpha2 + ", countryCodeAlpha3=" + this.countryCodeAlpha3 + ", lanesBlocked=" + this.lanesBlocked + ", longDescription=" + this.longDescription + ", lanesClearDesc=" + this.lanesClearDesc + ", numLanesBlocked=" + this.numLanesBlocked + ", affectedRoadNames=" + this.affectedRoadNames + ", multilingualAffectedRoadNames=" + this.multilingualAffectedRoadNames + ", length=" + this.length + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!IncidentInfo.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        IncidentInfo incidentInfo = (IncidentInfo) obj;
        if (this.type != incidentInfo.type || !this.id.equals(incidentInfo.id) || !this.impact.equals(incidentInfo.impact)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.congestion, incidentInfo.congestion}, getCieXyz.write())).booleanValue() || this.isClosed != incidentInfo.isClosed) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.creationTime, incidentInfo.creationTime}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.startTime, incidentInfo.startTime}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.endTime, incidentInfo.endTime}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.description, incidentInfo.description}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.subType, incidentInfo.subType}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.subTypeDescription, incidentInfo.subTypeDescription}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.alertcCodes, incidentInfo.alertcCodes}, getCieXyz.write())).booleanValue() || !this.trafficCodes.equals(incidentInfo.trafficCodes)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.countryCodeAlpha2, incidentInfo.countryCodeAlpha2}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.countryCodeAlpha3, incidentInfo.countryCodeAlpha3}, getCieXyz.write())).booleanValue() || !this.lanesBlocked.equals(incidentInfo.lanesBlocked)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.longDescription, incidentInfo.longDescription}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.lanesClearDesc, incidentInfo.lanesClearDesc}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.numLanesBlocked, incidentInfo.numLanesBlocked}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.affectedRoadNames, incidentInfo.affectedRoadNames}, getCieXyz.write())).booleanValue() || !this.multilingualAffectedRoadNames.equals(incidentInfo.multilingualAffectedRoadNames)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.length, incidentInfo.length}, getCieXyz.write())).booleanValue();
    }
}

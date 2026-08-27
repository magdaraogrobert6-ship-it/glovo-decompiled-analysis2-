package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.navigator.match.openlr.OpenLR;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.MediaSessionCompatQueueItem;
import o.SweepGradientShader9KIMszodefault;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;

/* JADX INFO: loaded from: classes3.dex */
public class IncidentInfo implements Serializable {
    private final List<String> affectedRoadNames;
    private final List<Integer> alertcCodes;
    private final IncidentCongestion congestion;
    private final Date creationTime;
    private final String description;
    private final Date endTime;
    private final String id;
    private final IncidentImpact impact;
    private final String iso_3166_1_alpha2;
    private final String iso_3166_1_alpha3;
    private final List<String> lanesBlocked;
    private final String lanesClearDesc;
    private final Integer length;
    private final String longDescription;
    private final HashMap<String, List<String>> multiLingualAffectedRoadNames;
    private final Long numLanesBlocked;
    private final OpenLR openlr;
    private final boolean roadClosed;
    private final Date startTime;
    private final String subType;
    private final String subTypeDescription;
    private final HashMap<String, Integer> trafficCodes;
    private final IncidentType type;

    public List<String> getAffectedRoadNames() {
        return this.affectedRoadNames;
    }

    public List<Integer> getAlertcCodes() {
        return this.alertcCodes;
    }

    public IncidentCongestion getCongestion() {
        return this.congestion;
    }

    public Date getCreationTime() {
        return this.creationTime;
    }

    public String getDescription() {
        return this.description;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public String getId() {
        return this.id;
    }

    public IncidentImpact getImpact() {
        return this.impact;
    }

    public String getIso_3166_1_alpha2() {
        return this.iso_3166_1_alpha2;
    }

    public String getIso_3166_1_alpha3() {
        return this.iso_3166_1_alpha3;
    }

    public List<String> getLanesBlocked() {
        return this.lanesBlocked;
    }

    public String getLanesClearDesc() {
        return this.lanesClearDesc;
    }

    public Integer getLength() {
        return this.length;
    }

    public String getLongDescription() {
        return this.longDescription;
    }

    public HashMap<String, List<String>> getMultiLingualAffectedRoadNames() {
        return this.multiLingualAffectedRoadNames;
    }

    public Long getNumLanesBlocked() {
        return this.numLanesBlocked;
    }

    public OpenLR getOpenlr() {
        return this.openlr;
    }

    public boolean getRoadClosed() {
        return this.roadClosed;
    }

    public Date getStartTime() {
        return this.startTime;
    }

    public String getSubType() {
        return this.subType;
    }

    public String getSubTypeDescription() {
        return this.subTypeDescription;
    }

    public HashMap<String, Integer> getTrafficCodes() {
        return this.trafficCodes;
    }

    public IncidentType getType() {
        return this.type;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        String str = this.id;
        OpenLR openLR = this.openlr;
        IncidentType incidentType = this.type;
        Date date = this.startTime;
        Date date2 = this.endTime;
        Date date3 = this.creationTime;
        Integer num = this.length;
        String str2 = this.iso_3166_1_alpha2;
        String str3 = this.iso_3166_1_alpha3;
        List<String> list = this.lanesBlocked;
        boolean z = this.roadClosed;
        return Objects.hash(str, openLR, incidentType, date, date2, date3, num, str2, str3, list, Boolean.valueOf(z), this.congestion, this.impact, this.description, this.subType, this.subTypeDescription, this.alertcCodes, this.trafficCodes, this.longDescription, this.lanesClearDesc, this.numLanesBlocked, this.affectedRoadNames, this.multiLingualAffectedRoadNames);
    }

    public IncidentInfo(String str, OpenLR openLR, IncidentType incidentType, Date date, Date date2, Date date3, Integer num, String str2, String str3, List<String> list, boolean z, IncidentCongestion incidentCongestion, IncidentImpact incidentImpact, String str4, String str5, String str6, List<Integer> list2, HashMap<String, Integer> map, String str7, String str8, Long l, List<String> list3, HashMap<String, List<String>> map2) {
        this.id = str;
        this.openlr = openLR;
        this.type = incidentType;
        this.startTime = date;
        this.endTime = date2;
        this.creationTime = date3;
        this.length = num;
        this.iso_3166_1_alpha2 = str2;
        this.iso_3166_1_alpha3 = str3;
        this.lanesBlocked = list;
        this.roadClosed = z;
        this.congestion = incidentCongestion;
        this.impact = incidentImpact;
        this.description = str4;
        this.subType = str5;
        this.subTypeDescription = str6;
        this.alertcCodes = list2;
        this.trafficCodes = map;
        this.longDescription = str7;
        this.lanesClearDesc = str8;
        this.numLanesBlocked = l;
        this.affectedRoadNames = list3;
        this.multiLingualAffectedRoadNames = map2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[id: ");
        IconCompatParcelizer.read(sb, this.id, ", openlr: ");
        sb.append(RecordUtils.fieldToString(this.openlr));
        sb.append(", type: ");
        sb.append(RecordUtils.fieldToString(this.type));
        sb.append(", startTime: ");
        sb.append(RecordUtils.fieldToString(this.startTime));
        sb.append(", endTime: ");
        sb.append(RecordUtils.fieldToString(this.endTime));
        sb.append(", creationTime: ");
        sb.append(RecordUtils.fieldToString(this.creationTime));
        sb.append(", length: ");
        SweepGradientShader9KIMszodefault.read(this.length, ", iso_3166_1_alpha2: ", sb);
        IconCompatParcelizer.read(sb, this.iso_3166_1_alpha2, ", iso_3166_1_alpha3: ");
        IconCompatParcelizer.read(sb, this.iso_3166_1_alpha3, ", lanesBlocked: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.lanesBlocked, ", roadClosed: ");
        MediaSessionCompatQueueItem.write(sb, this.roadClosed, ", congestion: ");
        sb.append(RecordUtils.fieldToString(this.congestion));
        sb.append(", impact: ");
        sb.append(RecordUtils.fieldToString(this.impact));
        sb.append(", description: ");
        IconCompatParcelizer.read(sb, this.description, ", subType: ");
        IconCompatParcelizer.read(sb, this.subType, ", subTypeDescription: ");
        IconCompatParcelizer.read(sb, this.subTypeDescription, ", alertcCodes: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.alertcCodes, ", trafficCodes: ");
        sb.append(RecordUtils.fieldToString(this.trafficCodes));
        sb.append(", longDescription: ");
        IconCompatParcelizer.read(sb, this.longDescription, ", lanesClearDesc: ");
        IconCompatParcelizer.read(sb, this.lanesClearDesc, ", numLanesBlocked: ");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(this.numLanesBlocked, sb, ", affectedRoadNames: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.affectedRoadNames, ", multiLingualAffectedRoadNames: ");
        sb.append(RecordUtils.fieldToString(this.multiLingualAffectedRoadNames));
        sb.append("]");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IncidentInfo incidentInfo = (IncidentInfo) obj;
        return Objects.equals(this.id, incidentInfo.id) && Objects.equals(this.openlr, incidentInfo.openlr) && Objects.equals(this.type, incidentInfo.type) && Objects.equals(this.startTime, incidentInfo.startTime) && Objects.equals(this.endTime, incidentInfo.endTime) && Objects.equals(this.creationTime, incidentInfo.creationTime) && Objects.equals(this.length, incidentInfo.length) && Objects.equals(this.iso_3166_1_alpha2, incidentInfo.iso_3166_1_alpha2) && Objects.equals(this.iso_3166_1_alpha3, incidentInfo.iso_3166_1_alpha3) && Objects.equals(this.lanesBlocked, incidentInfo.lanesBlocked) && this.roadClosed == incidentInfo.roadClosed && Objects.equals(this.congestion, incidentInfo.congestion) && Objects.equals(this.impact, incidentInfo.impact) && Objects.equals(this.description, incidentInfo.description) && Objects.equals(this.subType, incidentInfo.subType) && Objects.equals(this.subTypeDescription, incidentInfo.subTypeDescription) && Objects.equals(this.alertcCodes, incidentInfo.alertcCodes) && Objects.equals(this.trafficCodes, incidentInfo.trafficCodes) && Objects.equals(this.longDescription, incidentInfo.longDescription) && Objects.equals(this.lanesClearDesc, incidentInfo.lanesClearDesc) && Objects.equals(this.numLanesBlocked, incidentInfo.numLanesBlocked) && Objects.equals(this.affectedRoadNames, incidentInfo.affectedRoadNames) && Objects.equals(this.multiLingualAffectedRoadNames, incidentInfo.multiLingualAffectedRoadNames);
    }
}

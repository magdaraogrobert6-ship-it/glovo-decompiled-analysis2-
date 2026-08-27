package com.mapbox.navigator;

import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes4.dex */
public class EdgeMetadata implements Serializable {
    private final boolean bridge;
    private final Double constrainedFlowSpeed;
    private final String countryCodeIso2;
    private final String countryCodeIso3;
    private final byte curvature;
    private final boolean ferry;
    private final FunctionalRoadClass frc;
    private final Double freeFlowSpeed;
    private final double heading;
    private final boolean isOneway;
    private final boolean isRightHandTraffic;
    private final boolean isUrban;
    private final Byte laneCount;
    private final double length;
    private final Double meanElevation;
    private final boolean motorway;
    private final List<RoadName> names;
    private final boolean ramp;
    private final boolean roundabout;
    private final SapaType sapaType;
    private final double speed;
    private final Double speedLimit;
    private final String stateCode;
    private final RoadSurface surface;
    private final boolean toll;
    private final boolean tunnel;

    public boolean getBridge() {
        return this.bridge;
    }

    public Double getConstrainedFlowSpeed() {
        return this.constrainedFlowSpeed;
    }

    public String getCountryCodeIso2() {
        return this.countryCodeIso2;
    }

    public String getCountryCodeIso3() {
        return this.countryCodeIso3;
    }

    public byte getCurvature() {
        return this.curvature;
    }

    public boolean getFerry() {
        return this.ferry;
    }

    public FunctionalRoadClass getFrc() {
        return this.frc;
    }

    public Double getFreeFlowSpeed() {
        return this.freeFlowSpeed;
    }

    public double getHeading() {
        return this.heading;
    }

    public boolean getIsOneway() {
        return this.isOneway;
    }

    public boolean getIsRightHandTraffic() {
        return this.isRightHandTraffic;
    }

    public boolean getIsUrban() {
        return this.isUrban;
    }

    public Byte getLaneCount() {
        return this.laneCount;
    }

    public double getLength() {
        return this.length;
    }

    public Double getMeanElevation() {
        return this.meanElevation;
    }

    public boolean getMotorway() {
        return this.motorway;
    }

    public List<RoadName> getNames() {
        return this.names;
    }

    public boolean getRamp() {
        return this.ramp;
    }

    public boolean getRoundabout() {
        return this.roundabout;
    }

    public SapaType getSapaType() {
        return this.sapaType;
    }

    public double getSpeed() {
        return this.speed;
    }

    public Double getSpeedLimit() {
        return this.speedLimit;
    }

    public String getStateCode() {
        return this.stateCode;
    }

    public RoadSurface getSurface() {
        return this.surface;
    }

    public boolean getToll() {
        return this.toll;
    }

    public boolean getTunnel() {
        return this.tunnel;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        double d = this.heading;
        double d2 = this.length;
        FunctionalRoadClass functionalRoadClass = this.frc;
        Double d3 = this.speedLimit;
        double d4 = this.speed;
        Double d5 = this.freeFlowSpeed;
        Double d6 = this.constrainedFlowSpeed;
        boolean z = this.ramp;
        boolean z2 = this.motorway;
        boolean z3 = this.bridge;
        boolean z4 = this.tunnel;
        boolean z5 = this.toll;
        boolean z6 = this.ferry;
        boolean z7 = this.roundabout;
        List<RoadName> list = this.names;
        Byte b = this.laneCount;
        Double d7 = this.meanElevation;
        byte b2 = this.curvature;
        String str = this.countryCodeIso3;
        String str2 = this.countryCodeIso2;
        String str3 = this.stateCode;
        boolean z8 = this.isRightHandTraffic;
        boolean z9 = this.isOneway;
        RoadSurface roadSurface = this.surface;
        boolean z10 = this.isUrban;
        return Objects.hash(Double.valueOf(d), Double.valueOf(d2), functionalRoadClass, d3, Double.valueOf(d4), d5, d6, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4), Boolean.valueOf(z5), Boolean.valueOf(z6), Boolean.valueOf(z7), list, b, d7, Byte.valueOf(b2), str, str2, str3, Boolean.valueOf(z8), Boolean.valueOf(z9), roadSurface, Boolean.valueOf(z10), this.sapaType);
    }

    public EdgeMetadata(double d, double d2, FunctionalRoadClass functionalRoadClass, Double d3, double d4, Double d5, Double d6, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, List<RoadName> list, Byte b, Double d7, byte b2, String str, String str2, String str3, boolean z8, boolean z9, RoadSurface roadSurface, boolean z10, SapaType sapaType) {
        this.heading = d;
        this.length = d2;
        this.frc = functionalRoadClass;
        this.speedLimit = d3;
        this.speed = d4;
        this.freeFlowSpeed = d5;
        this.constrainedFlowSpeed = d6;
        this.ramp = z;
        this.motorway = z2;
        this.bridge = z3;
        this.tunnel = z4;
        this.toll = z5;
        this.ferry = z6;
        this.roundabout = z7;
        this.names = list;
        this.laneCount = b;
        this.meanElevation = d7;
        this.curvature = b2;
        this.countryCodeIso3 = str;
        this.countryCodeIso2 = str2;
        this.stateCode = str3;
        this.isRightHandTraffic = z8;
        this.isOneway = z9;
        this.surface = roadSurface;
        this.isUrban = z10;
        this.sapaType = sapaType;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[heading: ");
        m1$$ExternalSyntheticOutline0.m(this.heading, ", length: ", sb);
        m1$$ExternalSyntheticOutline0.m(this.length, ", frc: ", sb);
        sb.append(RecordUtils.fieldToString(this.frc));
        sb.append(", speedLimit: ");
        af$$ExternalSyntheticOutline1.m(this.speedLimit, sb, ", speed: ");
        m1$$ExternalSyntheticOutline0.m(this.speed, ", freeFlowSpeed: ", sb);
        af$$ExternalSyntheticOutline1.m(this.freeFlowSpeed, sb, ", constrainedFlowSpeed: ");
        af$$ExternalSyntheticOutline1.m(this.constrainedFlowSpeed, sb, ", ramp: ");
        MediaSessionCompatQueueItem.write(sb, this.ramp, ", motorway: ");
        MediaSessionCompatQueueItem.write(sb, this.motorway, ", bridge: ");
        MediaSessionCompatQueueItem.write(sb, this.bridge, ", tunnel: ");
        MediaSessionCompatQueueItem.write(sb, this.tunnel, ", toll: ");
        MediaSessionCompatQueueItem.write(sb, this.toll, ", ferry: ");
        MediaSessionCompatQueueItem.write(sb, this.ferry, ", roundabout: ");
        MediaSessionCompatQueueItem.write(sb, this.roundabout, ", names: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.names, ", laneCount: ");
        sb.append(RecordUtils.fieldToString(this.laneCount));
        sb.append(", meanElevation: ");
        af$$ExternalSyntheticOutline1.m(this.meanElevation, sb, ", curvature: ");
        MediaSessionCompatQueueItem.serializer(this.curvature, sb, ", countryCodeIso3: ");
        IconCompatParcelizer.read(sb, this.countryCodeIso3, ", countryCodeIso2: ");
        IconCompatParcelizer.read(sb, this.countryCodeIso2, ", stateCode: ");
        IconCompatParcelizer.read(sb, this.stateCode, ", isRightHandTraffic: ");
        MediaSessionCompatQueueItem.write(sb, this.isRightHandTraffic, ", isOneway: ");
        MediaSessionCompatQueueItem.write(sb, this.isOneway, ", surface: ");
        sb.append(RecordUtils.fieldToString(this.surface));
        sb.append(", isUrban: ");
        MediaSessionCompatQueueItem.write(sb, this.isUrban, ", sapaType: ");
        sb.append(RecordUtils.fieldToString(this.sapaType));
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
        EdgeMetadata edgeMetadata = (EdgeMetadata) obj;
        return PartialEq.compare(this.heading, edgeMetadata.heading) && PartialEq.compare(this.length, edgeMetadata.length) && Objects.equals(this.frc, edgeMetadata.frc) && Objects.equals(this.speedLimit, edgeMetadata.speedLimit) && PartialEq.compare(this.speed, edgeMetadata.speed) && Objects.equals(this.freeFlowSpeed, edgeMetadata.freeFlowSpeed) && Objects.equals(this.constrainedFlowSpeed, edgeMetadata.constrainedFlowSpeed) && this.ramp == edgeMetadata.ramp && this.motorway == edgeMetadata.motorway && this.bridge == edgeMetadata.bridge && this.tunnel == edgeMetadata.tunnel && this.toll == edgeMetadata.toll && this.ferry == edgeMetadata.ferry && this.roundabout == edgeMetadata.roundabout && Objects.equals(this.names, edgeMetadata.names) && Objects.equals(this.laneCount, edgeMetadata.laneCount) && Objects.equals(this.meanElevation, edgeMetadata.meanElevation) && this.curvature == edgeMetadata.curvature && Objects.equals(this.countryCodeIso3, edgeMetadata.countryCodeIso3) && Objects.equals(this.countryCodeIso2, edgeMetadata.countryCodeIso2) && Objects.equals(this.stateCode, edgeMetadata.stateCode) && this.isRightHandTraffic == edgeMetadata.isRightHandTraffic && this.isOneway == edgeMetadata.isOneway && Objects.equals(this.surface, edgeMetadata.surface) && this.isUrban == edgeMetadata.isUrban && Objects.equals(this.sapaType, edgeMetadata.sapaType);
    }

    public EdgeMetadata(double d, double d2, FunctionalRoadClass functionalRoadClass, Double d3, double d4, Double d5, Double d6, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, List<RoadName> list, Byte b, Double d7, byte b2, String str, String str2, String str3, boolean z8, boolean z9, RoadSurface roadSurface, boolean z10) {
        this.heading = d;
        this.length = d2;
        this.frc = functionalRoadClass;
        this.speedLimit = d3;
        this.speed = d4;
        this.freeFlowSpeed = d5;
        this.constrainedFlowSpeed = d6;
        this.ramp = z;
        this.motorway = z2;
        this.bridge = z3;
        this.tunnel = z4;
        this.toll = z5;
        this.ferry = z6;
        this.roundabout = z7;
        this.names = list;
        this.laneCount = b;
        this.meanElevation = d7;
        this.curvature = b2;
        this.countryCodeIso3 = str;
        this.countryCodeIso2 = str2;
        this.stateCode = str3;
        this.isRightHandTraffic = z8;
        this.isOneway = z9;
        this.surface = roadSurface;
        this.isUrban = z10;
        this.sapaType = SapaType.NONE;
    }
}

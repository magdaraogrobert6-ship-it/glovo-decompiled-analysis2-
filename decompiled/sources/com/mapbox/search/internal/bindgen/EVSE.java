package com.mapbox.search.internal.bindgen;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes4.dex */
public class EVSE implements Serializable {
    private final List<EvseCapability> capabilities;
    private final List<Connector> connectors;
    private final Point coordinates;
    private final List<DisplayText> directions;
    private final String evseId;
    private final String floorLevel;
    private final List<ImageInfo> images;
    private final String lastUpdated;
    private final List<ParkingRestriction> parkingRestrictions;
    private final String physicalReference;
    private final ChargingStatus status;
    private final List<ChargingStatusSchedule> statusSchedule;
    private final String uid;

    public List<EvseCapability> getCapabilities() {
        return this.capabilities;
    }

    public List<Connector> getConnectors() {
        return this.connectors;
    }

    public Point getCoordinates() {
        return this.coordinates;
    }

    public List<DisplayText> getDirections() {
        return this.directions;
    }

    public String getEvseId() {
        return this.evseId;
    }

    public String getFloorLevel() {
        return this.floorLevel;
    }

    public List<ImageInfo> getImages() {
        return this.images;
    }

    public String getLastUpdated() {
        return this.lastUpdated;
    }

    public List<ParkingRestriction> getParkingRestrictions() {
        return this.parkingRestrictions;
    }

    public String getPhysicalReference() {
        return this.physicalReference;
    }

    public ChargingStatus getStatus() {
        return this.status;
    }

    public List<ChargingStatusSchedule> getStatusSchedule() {
        return this.statusSchedule;
    }

    public String getUid() {
        return this.uid;
    }

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.uid, this.evseId, this.status, this.statusSchedule, this.capabilities, this.connectors, this.floorLevel, this.coordinates, this.physicalReference, this.directions, this.parkingRestrictions, this.images, this.lastUpdated);
    }

    public EVSE(String str, String str2, ChargingStatus chargingStatus, List<ChargingStatusSchedule> list, List<EvseCapability> list2, List<Connector> list3, String str3, Point point, String str4, List<DisplayText> list4, List<ParkingRestriction> list5, List<ImageInfo> list6, String str5) {
        this.uid = str;
        this.evseId = str2;
        this.status = chargingStatus;
        this.statusSchedule = list;
        this.capabilities = list2;
        this.connectors = list3;
        this.floorLevel = str3;
        this.coordinates = point;
        this.physicalReference = str4;
        this.directions = list4;
        this.parkingRestrictions = list5;
        this.images = list6;
        this.lastUpdated = str5;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[uid: ");
        IconCompatParcelizer.read(sb, this.uid, ", evseId: ");
        IconCompatParcelizer.read(sb, this.evseId, ", status: ");
        sb.append(RecordUtils.fieldToString(this.status));
        sb.append(", statusSchedule: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.statusSchedule, ", capabilities: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.capabilities, ", connectors: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.connectors, ", floorLevel: ");
        IconCompatParcelizer.read(sb, this.floorLevel, ", coordinates: ");
        c8$$ExternalSyntheticOutline0.m(this.coordinates, sb, ", physicalReference: ");
        IconCompatParcelizer.read(sb, this.physicalReference, ", directions: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.directions, ", parkingRestrictions: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.parkingRestrictions, ", images: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.images, ", lastUpdated: ");
        return SweepGradientShader9KIMszodefault.read(sb, this.lastUpdated, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EVSE evse = (EVSE) obj;
        return Objects.equals(this.uid, evse.uid) && Objects.equals(this.evseId, evse.evseId) && Objects.equals(this.status, evse.status) && Objects.equals(this.statusSchedule, evse.statusSchedule) && Objects.equals(this.capabilities, evse.capabilities) && Objects.equals(this.connectors, evse.connectors) && Objects.equals(this.floorLevel, evse.floorLevel) && Objects.equals(this.coordinates, evse.coordinates) && Objects.equals(this.physicalReference, evse.physicalReference) && Objects.equals(this.directions, evse.directions) && Objects.equals(this.parkingRestrictions, evse.parkingRestrictions) && Objects.equals(this.images, evse.images) && Objects.equals(this.lastUpdated, evse.lastUpdated);
    }
}

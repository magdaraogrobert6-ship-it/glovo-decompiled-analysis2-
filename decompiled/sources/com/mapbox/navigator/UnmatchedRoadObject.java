package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes4.dex */
public class UnmatchedRoadObject implements Serializable {
    private final UnmatchedRoadObjectGeometry geometry;
    private final UnmatchedRoadObjectGeometryKind geometryKind;
    private final Double heading;
    private final String id;

    public UnmatchedRoadObjectGeometry getGeometry() {
        return this.geometry;
    }

    public UnmatchedRoadObjectGeometryKind getGeometryKind() {
        return this.geometryKind;
    }

    public Double getHeading() {
        return this.heading;
    }

    public String getId() {
        return this.id;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.id, this.geometry, this.geometryKind, this.heading);
    }

    public UnmatchedRoadObject(String str, UnmatchedRoadObjectGeometry unmatchedRoadObjectGeometry, UnmatchedRoadObjectGeometryKind unmatchedRoadObjectGeometryKind, Double d) {
        this.id = str;
        this.geometry = unmatchedRoadObjectGeometry;
        this.geometryKind = unmatchedRoadObjectGeometryKind;
        this.heading = d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[id: ");
        IconCompatParcelizer.read(sb, this.id, ", geometry: ");
        sb.append(RecordUtils.fieldToString(this.geometry));
        sb.append(", geometryKind: ");
        sb.append(RecordUtils.fieldToString(this.geometryKind));
        sb.append(", heading: ");
        sb.append(RecordUtils.fieldToString(this.heading));
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
        UnmatchedRoadObject unmatchedRoadObject = (UnmatchedRoadObject) obj;
        return Objects.equals(this.id, unmatchedRoadObject.id) && Objects.equals(this.geometry, unmatchedRoadObject.geometry) && Objects.equals(this.geometryKind, unmatchedRoadObject.geometryKind) && Objects.equals(this.heading, unmatchedRoadObject.heading);
    }
}

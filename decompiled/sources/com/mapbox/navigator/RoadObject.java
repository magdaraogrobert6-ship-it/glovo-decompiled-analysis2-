package com.mapbox.navigator;

import bo.app.af$$ExternalSyntheticOutline1;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes3.dex */
public class RoadObject implements Serializable {
    private final String id;
    private final Boolean isUrban;
    private final Double length;
    private final MatchedRoadObjectLocation location;
    private final RoadObjectMetadata metadata;
    private final RoadObjectProvider provider;
    private final RoadObjectType type;

    public String getId() {
        return this.id;
    }

    public Boolean getIsUrban() {
        return this.isUrban;
    }

    public Double getLength() {
        return this.length;
    }

    public MatchedRoadObjectLocation getLocation() {
        return this.location;
    }

    public RoadObjectMetadata getMetadata() {
        return this.metadata;
    }

    public RoadObjectProvider getProvider() {
        return this.provider;
    }

    public RoadObjectType getType() {
        return this.type;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.id, this.length, this.location, this.type, this.provider, this.metadata, this.isUrban);
    }

    public RoadObject(String str, Double d, MatchedRoadObjectLocation matchedRoadObjectLocation, RoadObjectType roadObjectType, RoadObjectProvider roadObjectProvider, RoadObjectMetadata roadObjectMetadata, Boolean bool) {
        this.id = str;
        this.length = d;
        this.location = matchedRoadObjectLocation;
        this.type = roadObjectType;
        this.provider = roadObjectProvider;
        this.metadata = roadObjectMetadata;
        this.isUrban = bool;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[id: ");
        IconCompatParcelizer.read(sb, this.id, ", length: ");
        af$$ExternalSyntheticOutline1.m(this.length, sb, ", location: ");
        sb.append(RecordUtils.fieldToString(this.location));
        sb.append(", type: ");
        sb.append(RecordUtils.fieldToString(this.type));
        sb.append(", provider: ");
        sb.append(RecordUtils.fieldToString(this.provider));
        sb.append(", metadata: ");
        sb.append(RecordUtils.fieldToString(this.metadata));
        sb.append(", isUrban: ");
        sb.append(RecordUtils.fieldToString(this.isUrban));
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
        RoadObject roadObject = (RoadObject) obj;
        return Objects.equals(this.id, roadObject.id) && Objects.equals(this.length, roadObject.length) && Objects.equals(this.location, roadObject.location) && Objects.equals(this.type, roadObject.type) && Objects.equals(this.provider, roadObject.provider) && Objects.equals(this.metadata, roadObject.metadata) && Objects.equals(this.isUrban, roadObject.isUrban);
    }
}

package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes3.dex */
public class RoadObjectPassInfo implements Serializable {
    private final String roadObjectId;
    private final RoadObjectType type;

    public String getRoadObjectId() {
        return this.roadObjectId;
    }

    public RoadObjectType getType() {
        return this.type;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.roadObjectId, this.type);
    }

    public RoadObjectPassInfo(String str, RoadObjectType roadObjectType) {
        this.roadObjectId = str;
        this.type = roadObjectType;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[roadObjectId: ");
        IconCompatParcelizer.read(sb, this.roadObjectId, ", type: ");
        sb.append(RecordUtils.fieldToString(this.type));
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
        RoadObjectPassInfo roadObjectPassInfo = (RoadObjectPassInfo) obj;
        return Objects.equals(this.roadObjectId, roadObjectPassInfo.roadObjectId) && Objects.equals(this.type, roadObjectPassInfo.type);
    }
}

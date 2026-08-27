package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes5.dex */
public class RoadItem implements Serializable {
    private final List<Byte> lanes;
    private final RoadItemLocation location;
    private final RoadItemType type;
    private final Integer value;

    public List<Byte> getLanes() {
        return this.lanes;
    }

    public RoadItemLocation getLocation() {
        return this.location;
    }

    public RoadItemType getType() {
        return this.type;
    }

    public Integer getValue() {
        return this.value;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.type, this.location, this.lanes, this.value);
    }

    public RoadItem(RoadItemType roadItemType, RoadItemLocation roadItemLocation, List<Byte> list, Integer num) {
        this.type = roadItemType;
        this.location = roadItemLocation;
        this.lanes = list;
        this.value = num;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[type: ");
        sb.append(RecordUtils.fieldToString(this.type));
        sb.append(", location: ");
        sb.append(RecordUtils.fieldToString(this.location));
        sb.append(", lanes: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.lanes, ", value: ");
        sb.append(RecordUtils.fieldToString(this.value));
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
        RoadItem roadItem = (RoadItem) obj;
        return Objects.equals(this.type, roadItem.type) && Objects.equals(this.location, roadItem.location) && Objects.equals(this.lanes, roadItem.lanes) && Objects.equals(this.value, roadItem.value);
    }
}

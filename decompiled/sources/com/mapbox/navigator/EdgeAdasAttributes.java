package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.MediaSessionCompatQueueItem;
import o.getBitmapFromCache;

/* JADX INFO: loaded from: classes4.dex */
public class EdgeAdasAttributes implements Serializable {
    private final List<ValueOnEdge> curvatures;
    private final List<ValueOnEdge> elevations;
    private final ETC2RoadType etc2;
    private final FormOfWay formOfWay;
    private final Boolean isBuiltUpArea;
    private final Boolean isDividedRoad;
    private final List<RoadItemOnEdge> roadItems;
    private final List<ValueOnEdge> slopes;
    private final List<SpeedLimitInfo> speedLimit;

    public List<ValueOnEdge> getCurvatures() {
        return this.curvatures;
    }

    public List<ValueOnEdge> getElevations() {
        return this.elevations;
    }

    public ETC2RoadType getEtc2() {
        return this.etc2;
    }

    public FormOfWay getFormOfWay() {
        return this.formOfWay;
    }

    public Boolean getIsBuiltUpArea() {
        return this.isBuiltUpArea;
    }

    public Boolean getIsDividedRoad() {
        return this.isDividedRoad;
    }

    public List<RoadItemOnEdge> getRoadItems() {
        return this.roadItems;
    }

    public List<ValueOnEdge> getSlopes() {
        return this.slopes;
    }

    public List<SpeedLimitInfo> getSpeedLimit() {
        return this.speedLimit;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.speedLimit, this.slopes, this.elevations, this.curvatures, this.isDividedRoad, this.isBuiltUpArea, this.formOfWay, this.etc2, this.roadItems);
    }

    public EdgeAdasAttributes(List<SpeedLimitInfo> list, List<ValueOnEdge> list2, List<ValueOnEdge> list3, List<ValueOnEdge> list4, Boolean bool, Boolean bool2, FormOfWay formOfWay, ETC2RoadType eTC2RoadType, List<RoadItemOnEdge> list5) {
        this.speedLimit = list;
        this.slopes = list2;
        this.elevations = list3;
        this.curvatures = list4;
        this.isDividedRoad = bool;
        this.isBuiltUpArea = bool2;
        this.formOfWay = formOfWay;
        this.etc2 = eTC2RoadType;
        this.roadItems = list5;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[speedLimit: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.speedLimit, ", slopes: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.slopes, ", elevations: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.elevations, ", curvatures: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.curvatures, ", isDividedRoad: ");
        getBitmapFromCache.write(sb, ", isBuiltUpArea: ", this.isDividedRoad);
        getBitmapFromCache.write(sb, ", formOfWay: ", this.isBuiltUpArea);
        sb.append(RecordUtils.fieldToString(this.formOfWay));
        sb.append(", etc2: ");
        sb.append(RecordUtils.fieldToString(this.etc2));
        sb.append(", roadItems: ");
        return MediaSessionCompatQueueItem.read(this.roadItems, sb, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EdgeAdasAttributes edgeAdasAttributes = (EdgeAdasAttributes) obj;
        return Objects.equals(this.speedLimit, edgeAdasAttributes.speedLimit) && Objects.equals(this.slopes, edgeAdasAttributes.slopes) && Objects.equals(this.elevations, edgeAdasAttributes.elevations) && Objects.equals(this.curvatures, edgeAdasAttributes.curvatures) && Objects.equals(this.isDividedRoad, edgeAdasAttributes.isDividedRoad) && Objects.equals(this.isBuiltUpArea, edgeAdasAttributes.isBuiltUpArea) && Objects.equals(this.formOfWay, edgeAdasAttributes.formOfWay) && Objects.equals(this.etc2, edgeAdasAttributes.etc2) && Objects.equals(this.roadItems, edgeAdasAttributes.roadItems);
    }
}

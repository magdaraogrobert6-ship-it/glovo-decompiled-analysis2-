package com.mapbox.navigator;

import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes5.dex */
public class SpeedLimitRestriction implements Serializable {
    private final String dateTimeCondition;
    private final List<Byte> lanes;
    private final List<VehicleType> vehicleTypes;
    private final List<Weather> weather;

    public String getDateTimeCondition() {
        return this.dateTimeCondition;
    }

    public List<Byte> getLanes() {
        return this.lanes;
    }

    public List<VehicleType> getVehicleTypes() {
        return this.vehicleTypes;
    }

    public List<Weather> getWeather() {
        return this.weather;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.weather, this.dateTimeCondition, this.vehicleTypes, this.lanes);
    }

    public SpeedLimitRestriction(List<Weather> list, String str, List<VehicleType> list2, List<Byte> list3) {
        this.weather = list;
        this.dateTimeCondition = str;
        this.vehicleTypes = list2;
        this.lanes = list3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[weather: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.weather, ", dateTimeCondition: ");
        IconCompatParcelizer.read(sb, this.dateTimeCondition, ", vehicleTypes: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.vehicleTypes, ", lanes: ");
        return MediaSessionCompatQueueItem.read(this.lanes, sb, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SpeedLimitRestriction speedLimitRestriction = (SpeedLimitRestriction) obj;
        return Objects.equals(this.weather, speedLimitRestriction.weather) && Objects.equals(this.dateTimeCondition, speedLimitRestriction.dateTimeCondition) && Objects.equals(this.vehicleTypes, speedLimitRestriction.vehicleTypes) && Objects.equals(this.lanes, speedLimitRestriction.lanes);
    }
}

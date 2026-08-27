package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes5.dex */
public class SpeedLimitCondition implements Serializable {
    private final byte lane;
    private final VehicleType vehicleType;
    private final List<Weather> weather;

    public byte getLane() {
        return this.lane;
    }

    public VehicleType getVehicleType() {
        return this.vehicleType;
    }

    public List<Weather> getWeather() {
        return this.weather;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        List<Weather> list = this.weather;
        byte b = this.lane;
        return Objects.hash(list, Byte.valueOf(b), this.vehicleType);
    }

    public SpeedLimitCondition(List<Weather> list, byte b, VehicleType vehicleType) {
        this.weather = list;
        this.lane = b;
        this.vehicleType = vehicleType;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[weather: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.weather, ", lane: ");
        MediaSessionCompatQueueItem.serializer(this.lane, sb, ", vehicleType: ");
        sb.append(RecordUtils.fieldToString(this.vehicleType));
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
        SpeedLimitCondition speedLimitCondition = (SpeedLimitCondition) obj;
        return Objects.equals(this.weather, speedLimitCondition.weather) && this.lane == speedLimitCondition.lane && Objects.equals(this.vehicleType, speedLimitCondition.vehicleType);
    }
}

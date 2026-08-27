package com.mapbox.search.internal.bindgen;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes3.dex */
public class ParkingRateTime implements Serializable {
    private final List<Byte> days;
    private final Byte fromHour;
    private final Byte fromMinute;
    private final Byte toHour;
    private final Byte toMinute;

    public List<Byte> getDays() {
        return this.days;
    }

    public Byte getFromHour() {
        return this.fromHour;
    }

    public Byte getFromMinute() {
        return this.fromMinute;
    }

    public Byte getToHour() {
        return this.toHour;
    }

    public Byte getToMinute() {
        return this.toMinute;
    }

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.days, this.fromHour, this.fromMinute, this.toHour, this.toMinute);
    }

    public ParkingRateTime(List<Byte> list, Byte b, Byte b2, Byte b3, Byte b4) {
        this.days = list;
        this.fromHour = b;
        this.fromMinute = b2;
        this.toHour = b3;
        this.toMinute = b4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[days: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.days, ", fromHour: ");
        sb.append(RecordUtils.fieldToString(this.fromHour));
        sb.append(", fromMinute: ");
        sb.append(RecordUtils.fieldToString(this.fromMinute));
        sb.append(", toHour: ");
        sb.append(RecordUtils.fieldToString(this.toHour));
        sb.append(", toMinute: ");
        sb.append(RecordUtils.fieldToString(this.toMinute));
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
        ParkingRateTime parkingRateTime = (ParkingRateTime) obj;
        return Objects.equals(this.days, parkingRateTime.days) && Objects.equals(this.fromHour, parkingRateTime.fromHour) && Objects.equals(this.fromMinute, parkingRateTime.fromMinute) && Objects.equals(this.toHour, parkingRateTime.toHour) && Objects.equals(this.toMinute, parkingRateTime.toMinute);
    }
}

package com.mapbox.search.internal.bindgen;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.MediaSessionCompatQueueItem;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes3.dex */
public class ParkingInfo implements Serializable {
    private final Integer availability;
    private final String availabilityAt;
    private final ParkingAvailabilityLevel availabilityLevel;
    private final Integer capacity;
    private final List<ParkingPaymentMethod> paymentMethods;
    private final List<ParkingPaymentType> paymentTypes;
    private final ParkingRateInfo rateInfo;
    private final List<ParkingRestriction> restrictions;
    private final ParkingTrend trend;

    public Integer getAvailability() {
        return this.availability;
    }

    public String getAvailabilityAt() {
        return this.availabilityAt;
    }

    public ParkingAvailabilityLevel getAvailabilityLevel() {
        return this.availabilityLevel;
    }

    public Integer getCapacity() {
        return this.capacity;
    }

    public List<ParkingPaymentMethod> getPaymentMethods() {
        return this.paymentMethods;
    }

    public List<ParkingPaymentType> getPaymentTypes() {
        return this.paymentTypes;
    }

    public ParkingRateInfo getRateInfo() {
        return this.rateInfo;
    }

    public List<ParkingRestriction> getRestrictions() {
        return this.restrictions;
    }

    public ParkingTrend getTrend() {
        return this.trend;
    }

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.capacity, this.rateInfo, this.availability, this.availabilityLevel, this.availabilityAt, this.trend, this.paymentMethods, this.paymentTypes, this.restrictions);
    }

    public ParkingInfo(Integer num, ParkingRateInfo parkingRateInfo, Integer num2, ParkingAvailabilityLevel parkingAvailabilityLevel, String str, ParkingTrend parkingTrend, List<ParkingPaymentMethod> list, List<ParkingPaymentType> list2, List<ParkingRestriction> list3) {
        this.capacity = num;
        this.rateInfo = parkingRateInfo;
        this.availability = num2;
        this.availabilityLevel = parkingAvailabilityLevel;
        this.availabilityAt = str;
        this.trend = parkingTrend;
        this.paymentMethods = list;
        this.paymentTypes = list2;
        this.restrictions = list3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[capacity: ");
        SweepGradientShader9KIMszodefault.read(this.capacity, ", rateInfo: ", sb);
        sb.append(RecordUtils.fieldToString(this.rateInfo));
        sb.append(", availability: ");
        SweepGradientShader9KIMszodefault.read(this.availability, ", availabilityLevel: ", sb);
        sb.append(RecordUtils.fieldToString(this.availabilityLevel));
        sb.append(", availabilityAt: ");
        IconCompatParcelizer.read(sb, this.availabilityAt, ", trend: ");
        sb.append(RecordUtils.fieldToString(this.trend));
        sb.append(", paymentMethods: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.paymentMethods, ", paymentTypes: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.paymentTypes, ", restrictions: ");
        return MediaSessionCompatQueueItem.read(this.restrictions, sb, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ParkingInfo parkingInfo = (ParkingInfo) obj;
        return Objects.equals(this.capacity, parkingInfo.capacity) && Objects.equals(this.rateInfo, parkingInfo.rateInfo) && Objects.equals(this.availability, parkingInfo.availability) && Objects.equals(this.availabilityLevel, parkingInfo.availabilityLevel) && Objects.equals(this.availabilityAt, parkingInfo.availabilityAt) && Objects.equals(this.trend, parkingInfo.trend) && Objects.equals(this.paymentMethods, parkingInfo.paymentMethods) && Objects.equals(this.paymentTypes, parkingInfo.paymentTypes) && Objects.equals(this.restrictions, parkingInfo.restrictions);
    }
}

package com.mapbox.search.internal.bindgen;

import bo.app.af$$ExternalSyntheticOutline1;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class ParkingRatePrice implements Serializable {
    private final Double amount;
    private final ParkingPriceType type;
    private final ParkingRateValue value;

    public Double getAmount() {
        return this.amount;
    }

    public ParkingPriceType getType() {
        return this.type;
    }

    public ParkingRateValue getValue() {
        return this.value;
    }

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.type, this.amount, this.value);
    }

    public ParkingRatePrice(ParkingPriceType parkingPriceType, Double d, ParkingRateValue parkingRateValue) {
        this.type = parkingPriceType;
        this.amount = d;
        this.value = parkingRateValue;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[type: ");
        sb.append(RecordUtils.fieldToString(this.type));
        sb.append(", amount: ");
        af$$ExternalSyntheticOutline1.m(this.amount, sb, ", value: ");
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
        ParkingRatePrice parkingRatePrice = (ParkingRatePrice) obj;
        return Objects.equals(this.type, parkingRatePrice.type) && Objects.equals(this.amount, parkingRatePrice.amount) && Objects.equals(this.value, parkingRatePrice.value);
    }
}

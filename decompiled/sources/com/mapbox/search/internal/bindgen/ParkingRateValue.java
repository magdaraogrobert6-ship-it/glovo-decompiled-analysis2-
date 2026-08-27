package com.mapbox.search.internal.bindgen;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public class ParkingRateValue {
    private Type type;
    private Object value;

    public enum Type {
        STRING,
        PARKING_RATE_CUSTOM_VALUE
    }

    public Type getTypeInfo() {
        return this.type;
    }

    public static ParkingRateValue valueOf(String str) {
        return new ParkingRateValue(str);
    }

    public boolean isParkingRateCustomValue() {
        return this.type == Type.PARKING_RATE_CUSTOM_VALUE;
    }

    public boolean isString() {
        return this.type == Type.STRING;
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public ParkingRateValue(String str) {
        this.type = Type.STRING;
        this.value = str;
    }

    public static ParkingRateValue valueOf(ParkingRateCustomValue parkingRateCustomValue) {
        return new ParkingRateValue(parkingRateCustomValue);
    }

    public ParkingRateCustomValue getParkingRateCustomValue() {
        if (isParkingRateCustomValue()) {
            return (ParkingRateCustomValue) this.value;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("The content of the variant does not have type (ParkingRateCustomValue)");
        return null;
    }

    public String getString() {
        if (isString()) {
            return (String) this.value;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("The content of the variant does not have type (String)");
        return null;
    }

    public ParkingRateValue(ParkingRateCustomValue parkingRateCustomValue) {
        this.type = Type.PARKING_RATE_CUSTOM_VALUE;
        this.value = parkingRateCustomValue;
    }
}

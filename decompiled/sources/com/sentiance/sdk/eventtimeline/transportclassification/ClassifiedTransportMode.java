package com.sentiance.sdk.eventtimeline.transportclassification;

import com.sentiance.sdk.ondevice.api.event.TransportMode;
import o.AttributionData;

/* JADX INFO: loaded from: classes3.dex */
public enum ClassifiedTransportMode {
    IDLE,
    ON_FOOT,
    WALKING,
    RUNNING,
    BIKING,
    VEHICLE,
    TRAIN,
    TRAM,
    CAR,
    BUS,
    RAIL,
    MOTORCYCLE,
    UNKNOWN;

    public static ClassifiedTransportMode fromTestMode(String str) {
        try {
            switch (AttributionData.read[TransportMode.valueOf(str).ordinal()]) {
                case 1:
                    return BIKING;
                case 2:
                    return WALKING;
                case 3:
                    return RUNNING;
                case 4:
                    return TRAM;
                case 5:
                    return TRAIN;
                case 6:
                    return CAR;
                case 7:
                    return BUS;
                case 8:
                    return MOTORCYCLE;
                case 9:
                    return IDLE;
                default:
                    return null;
            }
        } catch (Exception unused) {
            return null;
        }
    }

    public static ClassifiedTransportMode fromModelOutput(int i, boolean z) {
        return z ? fromModelOutputGigMode(i) : fromModelOutputIndex(i);
    }

    public static ClassifiedTransportMode fromThriftSchemaMode(byte b) {
        if (b == 0) {
            return IDLE;
        }
        if (b == 9) {
            return BUS;
        }
        if (b == 2) {
            return WALKING;
        }
        if (b == 4) {
            return BIKING;
        }
        if (b == 6) {
            return TRAIN;
        }
        if (b == 7) {
            return TRAM;
        }
        if (b == 8) {
            return CAR;
        }
        if (b == 3) {
            return RUNNING;
        }
        if (b == 5) {
            return VEHICLE;
        }
        if (b == 1) {
            return ON_FOOT;
        }
        if (b == 10) {
            return RAIL;
        }
        if (b == 11) {
            return MOTORCYCLE;
        }
        if (b == 12) {
            return UNKNOWN;
        }
        return null;
    }

    public boolean isMotorizedVehicle() {
        switch (AttributionData.IconCompatParcelizer[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                return false;
        }
    }

    public Integer toModelOutput() {
        switch (AttributionData.IconCompatParcelizer[ordinal()]) {
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
            default:
                return null;
            case 7:
                return 8;
            case 8:
                return 0;
            case 9:
                return 1;
            case 10:
                return 3;
            case 11:
                return 2;
            case 12:
                return 9;
        }
    }

    public Integer toModelOutputGigMode() {
        int i = AttributionData.IconCompatParcelizer[ordinal()];
        if (i == 4) {
            return 4;
        }
        switch (i) {
            case 7:
                return 2;
            case 8:
                return 0;
            case 9:
                return 1;
            case 10:
                return 3;
            default:
                return null;
        }
    }

    public static ClassifiedTransportMode fromEventConstant(Byte b) {
        if (b == null) {
            return null;
        }
        if (b.byteValue() == 3) {
            return BIKING;
        }
        if (b.byteValue() == 6) {
            return TRAM;
        }
        if (b.byteValue() == 11) {
            return RUNNING;
        }
        if (b.byteValue() == 2) {
            return CAR;
        }
        if (b.byteValue() == 5) {
            return TRAIN;
        }
        if (b.byteValue() == 4) {
            return ON_FOOT;
        }
        if (b.byteValue() == 12) {
            return IDLE;
        }
        if (b.byteValue() == 7) {
            return BUS;
        }
        if (b.byteValue() == 13) {
            return WALKING;
        }
        if (b.byteValue() == 14) {
            return VEHICLE;
        }
        if (b.byteValue() == 15) {
            return RAIL;
        }
        if (b.byteValue() == 16) {
            return MOTORCYCLE;
        }
        if (b.byteValue() == 1) {
            return UNKNOWN;
        }
        return null;
    }

    public TransportMode toExternalTransportMode() {
        if (this == BUS) {
            return TransportMode.BUS;
        }
        if (this == WALKING) {
            return TransportMode.WALKING;
        }
        if (this == BIKING) {
            return TransportMode.BICYCLE;
        }
        if (this == TRAIN) {
            return TransportMode.TRAIN;
        }
        if (this == TRAM) {
            return TransportMode.TRAM;
        }
        if (this == CAR) {
            return TransportMode.CAR;
        }
        if (this == RUNNING) {
            return TransportMode.RUNNING;
        }
        if (this == VEHICLE) {
            return TransportMode.CAR;
        }
        if (this == ON_FOOT) {
            return TransportMode.WALKING;
        }
        if (this == RAIL) {
            return TransportMode.TRAIN;
        }
        if (this == MOTORCYCLE) {
            return TransportMode.MOTORCYCLE;
        }
        if (this == UNKNOWN) {
            return TransportMode.UNKNOWN;
        }
        return this == IDLE ? TransportMode.IDLE : TransportMode.UNKNOWN;
    }

    private static ClassifiedTransportMode fromModelOutputIndex(int i) {
        switch (i) {
            case 0:
                return IDLE;
            case 1:
                return WALKING;
            case 2:
                return RUNNING;
            case 3:
                return BIKING;
            case 4:
                return TRAIN;
            case 5:
                return TRAM;
            case 6:
                return CAR;
            case 7:
                return BUS;
            case 8:
                return MOTORCYCLE;
            case 9:
                return UNKNOWN;
            default:
                return null;
        }
    }

    public Byte toEventConstant() {
        if (this == IDLE) {
            return (byte) 12;
        }
        if (this == BUS) {
            return (byte) 7;
        }
        if (this == WALKING) {
            return (byte) 13;
        }
        if (this == BIKING) {
            return (byte) 3;
        }
        if (this == TRAIN) {
            return (byte) 5;
        }
        if (this == TRAM) {
            return (byte) 6;
        }
        if (this == CAR) {
            return (byte) 2;
        }
        if (this == RUNNING) {
            return (byte) 11;
        }
        if (this == VEHICLE) {
            return (byte) 14;
        }
        if (this == ON_FOOT) {
            return (byte) 4;
        }
        if (this == RAIL) {
            return (byte) 15;
        }
        if (this == MOTORCYCLE) {
            return (byte) 16;
        }
        return (byte) 1;
    }

    public Byte toThriftSchemaMode() {
        if (this == IDLE) {
            return (byte) 0;
        }
        if (this == BUS) {
            return (byte) 9;
        }
        if (this == WALKING) {
            return (byte) 2;
        }
        if (this == BIKING) {
            return (byte) 4;
        }
        if (this == TRAIN) {
            return (byte) 6;
        }
        if (this == TRAM) {
            return (byte) 7;
        }
        if (this == CAR) {
            return (byte) 8;
        }
        if (this == RUNNING) {
            return (byte) 3;
        }
        if (this == VEHICLE) {
            return (byte) 5;
        }
        if (this == ON_FOOT) {
            return (byte) 1;
        }
        if (this == RAIL) {
            return (byte) 10;
        }
        if (this == MOTORCYCLE) {
            return (byte) 11;
        }
        return this == UNKNOWN ? (byte) 12 : null;
    }

    private static ClassifiedTransportMode fromModelOutputGigMode(int i) {
        if (i == 0) {
            return IDLE;
        }
        if (i == 1) {
            return WALKING;
        }
        if (i == 2) {
            return MOTORCYCLE;
        }
        if (i == 3) {
            return BIKING;
        }
        if (i != 4) {
            return null;
        }
        return CAR;
    }
}

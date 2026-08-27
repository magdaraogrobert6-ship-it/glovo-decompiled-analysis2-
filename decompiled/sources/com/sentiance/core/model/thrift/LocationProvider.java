package com.sentiance.core.model.thrift;

/* JADX INFO: loaded from: classes3.dex */
public enum LocationProvider {
    GPS(1),
    NETWORK(2),
    PASSIVE(3),
    FUSED(4),
    CORE_LOCATION(5),
    STATIONARY(6),
    EXTERNAL(7),
    OTHER(8);

    public final int value;

    LocationProvider(int i) {
        this.value = i;
    }

    public static LocationProvider findByValue(int i) {
        switch (i) {
            case 1:
                return GPS;
            case 2:
                return NETWORK;
            case 3:
                return PASSIVE;
            case 4:
                return FUSED;
            case 5:
                return CORE_LOCATION;
            case 6:
                return STATIONARY;
            case 7:
                return EXTERNAL;
            case 8:
                return OTHER;
            default:
                return null;
        }
    }
}

package com.sentiance.core.model.thrift;

/* JADX INFO: loaded from: classes3.dex */
public enum TransportMode {
    UNKNOWN(1),
    CAR(2),
    BICYCLE(3),
    ON_FOOT(4),
    TRAIN(5),
    TRAM(6),
    BUS(7),
    PLANE(8),
    BOAT(9),
    METRO(10),
    RUNNING(11);

    public final int value;

    TransportMode(int i) {
        this.value = i;
    }

    public static TransportMode findByValue(int i) {
        switch (i) {
            case 1:
                return UNKNOWN;
            case 2:
                return CAR;
            case 3:
                return BICYCLE;
            case 4:
                return ON_FOOT;
            case 5:
                return TRAIN;
            case 6:
                return TRAM;
            case 7:
                return BUS;
            case 8:
                return PLANE;
            case 9:
                return BOAT;
            case 10:
                return METRO;
            case 11:
                return RUNNING;
            default:
                return null;
        }
    }
}

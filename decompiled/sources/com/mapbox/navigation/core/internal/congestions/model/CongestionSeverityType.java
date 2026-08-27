package com.mapbox.navigation.core.internal.congestions.model;

/* JADX INFO: loaded from: classes2.dex */
public enum CongestionSeverityType {
    LOW(1),
    MODERATE(2),
    HEAVY(3),
    SEVERE(4);

    public static final Companion Companion = new Companion();
    private final int weight;

    public final int getWeight() {
        return this.weight;
    }

    public final class Companion {
        public static CongestionSeverityType fromWeightValue(int i) {
            CongestionSeverityType congestionSeverityType;
            CongestionSeverityType[] congestionSeverityTypeArrValues = CongestionSeverityType.values();
            int length = congestionSeverityTypeArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    congestionSeverityType = null;
                    break;
                }
                congestionSeverityType = congestionSeverityTypeArrValues[i2];
                if (congestionSeverityType.getWeight() == i) {
                    break;
                }
                i2++;
            }
            if (congestionSeverityType == null) {
                return i < 1 ? CongestionSeverityType.LOW : CongestionSeverityType.SEVERE;
            }
            return congestionSeverityType;
        }
    }

    CongestionSeverityType(int i) {
        this.weight = i;
    }
}

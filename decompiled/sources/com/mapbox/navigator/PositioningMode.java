package com.mapbox.navigator;

/* JADX INFO: loaded from: classes5.dex */
public enum PositioningMode {
    UNKNOWN(0, "Unknown"),
    NO_FIX(1, "NoFix"),
    DEAD_RECKONING_ONLY(2, "DeadReckoningOnly"),
    GNSS_STANDARD(10, "GnssStandard"),
    GNSS_DIFFERENTIAL(11, "GnssDifferential"),
    GNSS_HIGH_PRECISION_FLOAT(12, "GnssHighPrecisionFloat"),
    GNSS_HIGH_PRECISION_FIXED(13, "GnssHighPrecisionFixed"),
    FUSED_STANDARD(20, "FusedStandard"),
    FUSED_DIFFERENTIAL(21, "FusedDifferential"),
    FUSED_HIGH_PRECISION_FLOAT(22, "FusedHighPrecisionFloat"),
    FUSED_HIGH_PRECISION_FIXED(23, "FusedHighPrecisionFixed");

    private String str;
    public final int value;

    private int getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    PositioningMode(int i, String str) {
        this.value = i;
        this.str = str;
    }
}

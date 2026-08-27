package com.sentiance.sdk.tile;

/* JADX INFO: loaded from: classes3.dex */
public enum SpeedLimit {
    LIMITED,
    UNLIMITED,
    NO_DATA,
    UNKNOWN;

    private int kmph = 0;

    public int kmph() {
        return this.kmph;
    }

    public double mps() {
        return ((double) this.kmph) / 3.6d;
    }

    SpeedLimit() {
    }

    public static SpeedLimit fromTileSpeedLimitValue(int i) {
        if (i == -1) {
            return NO_DATA;
        }
        if (i == 0) {
            return UNKNOWN;
        }
        if (i != 255) {
            SpeedLimit speedLimit = LIMITED;
            speedLimit.kmph = i;
            return speedLimit;
        }
        return UNLIMITED;
    }
}

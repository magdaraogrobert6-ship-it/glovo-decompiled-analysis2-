package com.sentiance.core.model.thrift;

/* JADX INFO: loaded from: classes3.dex */
public enum CMMotionActivityConfidence {
    LOW(1),
    MEDIUM(2),
    HIGH(3),
    UNKNOWN(4);

    public final int value;

    CMMotionActivityConfidence(int i) {
        this.value = i;
    }

    public static CMMotionActivityConfidence findByValue(int i) {
        if (i == 1) {
            return LOW;
        }
        if (i == 2) {
            return MEDIUM;
        }
        if (i == 3) {
            return HIGH;
        }
        if (i != 4) {
            return null;
        }
        return UNKNOWN;
    }
}

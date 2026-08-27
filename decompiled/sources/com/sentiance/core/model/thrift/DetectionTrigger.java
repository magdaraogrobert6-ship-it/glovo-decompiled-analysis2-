package com.sentiance.core.model.thrift;

/* JADX INFO: loaded from: classes3.dex */
public enum DetectionTrigger {
    SDK(0),
    EXTERNAL(1);

    public final int value;

    DetectionTrigger(int i) {
        this.value = i;
    }

    public static DetectionTrigger findByValue(int i) {
        if (i == 0) {
            return SDK;
        }
        if (i != 1) {
            return null;
        }
        return EXTERNAL;
    }
}

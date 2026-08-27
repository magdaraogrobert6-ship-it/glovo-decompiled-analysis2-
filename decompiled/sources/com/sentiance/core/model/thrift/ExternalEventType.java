package com.sentiance.core.model.thrift;

/* JADX INFO: loaded from: classes3.dex */
public enum ExternalEventType {
    OTHER(1),
    BEACON(2),
    CUSTOM_REGION(3);

    public final int value;

    ExternalEventType(int i) {
        this.value = i;
    }

    public static ExternalEventType findByValue(int i) {
        if (i == 1) {
            return OTHER;
        }
        if (i == 2) {
            return BEACON;
        }
        if (i != 3) {
            return null;
        }
        return CUSTOM_REGION;
    }
}

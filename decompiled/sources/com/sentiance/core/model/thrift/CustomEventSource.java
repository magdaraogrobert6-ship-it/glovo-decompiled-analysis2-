package com.sentiance.core.model.thrift;

/* JADX INFO: loaded from: classes3.dex */
public enum CustomEventSource {
    SDK(1),
    ENCLOSING_APP(2),
    CUSTOMER(3);

    public final int value;

    CustomEventSource(int i) {
        this.value = i;
    }

    public static CustomEventSource findByValue(int i) {
        if (i == 1) {
            return SDK;
        }
        if (i == 2) {
            return ENCLOSING_APP;
        }
        if (i != 3) {
            return null;
        }
        return CUSTOMER;
    }
}

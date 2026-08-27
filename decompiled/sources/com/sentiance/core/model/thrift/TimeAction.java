package com.sentiance.core.model.thrift;

/* JADX INFO: loaded from: classes3.dex */
public enum TimeAction {
    START(1),
    STOP(2);

    public final int value;

    TimeAction(int i) {
        this.value = i;
    }

    public static TimeAction findByValue(int i) {
        if (i == 1) {
            return START;
        }
        if (i != 2) {
            return null;
        }
        return STOP;
    }
}

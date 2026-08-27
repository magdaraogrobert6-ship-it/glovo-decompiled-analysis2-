package com.sentiance.sdk.eventtimeline.timelines.creators;

/* JADX INFO: loaded from: classes3.dex */
public enum ScreenState {
    UNKNOWN(0),
    ON(1),
    OFF(2);

    public final int value;

    ScreenState(int i) {
        this.value = i;
    }

    public static ScreenState findByValue(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return ON;
        }
        if (i != 2) {
            return null;
        }
        return OFF;
    }
}

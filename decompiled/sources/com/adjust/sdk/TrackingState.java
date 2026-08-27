package com.adjust.sdk;

/* JADX INFO: loaded from: classes.dex */
public enum TrackingState {
    OPTED_OUT(1);

    private int value;

    public int getValue() {
        return this.value;
    }

    TrackingState(int i) {
        this.value = i;
    }
}

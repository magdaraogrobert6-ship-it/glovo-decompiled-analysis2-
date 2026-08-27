package com.sentiance.core.model.thrift;

/* JADX INFO: loaded from: classes3.dex */
public enum OS {
    ANDROID(1),
    IOS(2),
    NA(3);

    public final int value;

    OS(int i) {
        this.value = i;
    }

    public static OS findByValue(int i) {
        if (i == 1) {
            return ANDROID;
        }
        if (i == 2) {
            return IOS;
        }
        if (i != 3) {
            return null;
        }
        return NA;
    }
}

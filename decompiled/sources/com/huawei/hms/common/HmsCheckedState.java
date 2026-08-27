package com.huawei.hms.common;

/* JADX INFO: loaded from: classes2.dex */
public enum HmsCheckedState {
    UNCHECKED(0),
    NOT_NEED_UPDATE(1),
    NEED_UPDATE(2);

    private final int a;

    public int getState() {
        return this.a;
    }

    HmsCheckedState(int i) {
        this.a = i;
    }
}

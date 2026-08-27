package com.sentiance.core.model.thrift;

/* JADX INFO: loaded from: classes3.dex */
public enum DataAction {
    ADD(1),
    REMOVE(2);

    public final int value;

    DataAction(int i) {
        this.value = i;
    }

    public static DataAction findByValue(int i) {
        if (i == 1) {
            return ADD;
        }
        if (i != 2) {
            return null;
        }
        return REMOVE;
    }
}

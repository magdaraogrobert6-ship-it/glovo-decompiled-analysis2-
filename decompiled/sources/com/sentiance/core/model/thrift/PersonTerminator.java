package com.sentiance.core.model.thrift;

/* JADX INFO: loaded from: classes3.dex */
public enum PersonTerminator {
    SELF(1),
    APPLICATION(2);

    public final int value;

    PersonTerminator(int i) {
        this.value = i;
    }

    public static PersonTerminator findByValue(int i) {
        if (i == 1) {
            return SELF;
        }
        if (i != 2) {
            return null;
        }
        return APPLICATION;
    }
}

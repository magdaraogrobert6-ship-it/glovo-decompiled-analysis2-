package com.sentiance.core.model.events;

/* JADX INFO: loaded from: classes3.dex */
public enum ThriftBool {
    UNSET(-1),
    TRUE(1),
    FALSE(0);

    public final int value;

    ThriftBool(int i) {
        this.value = i;
    }

    public static ThriftBool findByValue(int i) {
        if (i == -1) {
            return UNSET;
        }
        if (i == 0) {
            return FALSE;
        }
        if (i != 1) {
            return null;
        }
        return TRUE;
    }
}

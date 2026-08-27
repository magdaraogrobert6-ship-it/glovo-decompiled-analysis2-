package com.mapbox.search.internal.bindgen;

/* JADX INFO: loaded from: classes5.dex */
public enum PowerType {
    UNKNOWN,
    AC_1_PHASE,
    AC_2_PHASE,
    AC_2_PHASE_SPLIT,
    AC_3_PHASE,
    DC;

    private int getValue() {
        return ordinal();
    }
}

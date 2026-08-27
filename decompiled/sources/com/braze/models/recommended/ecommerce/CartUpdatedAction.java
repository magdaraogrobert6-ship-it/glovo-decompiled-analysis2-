package com.braze.models.recommended.ecommerce;

import coil3.util.UtilsKt;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;

/* JADX INFO: loaded from: classes.dex */
public enum CartUpdatedAction {
    REPLACE("replace"),
    ADD("add"),
    REMOVE("remove");

    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = UtilsKt.read((Enum[]) values());
    private final String wireValue;

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        return $ENTRIES;
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    CartUpdatedAction(String str) {
        this.wireValue = str;
    }
}

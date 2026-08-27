package com.deliveryhero.perseus;

import coil3.util.UtilsKt;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;

/* JADX INFO: loaded from: classes2.dex */
public enum Consent {
    ESSENTIAL("essential"),
    ESSENTIAL_FUNCTIONAL("essential_functional"),
    ESSENTIAL_MARKETING("essential_marketing"),
    ESSENTIAL_FUNCTIONAL_MARKETING("essential_functional_marketing");

    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = UtilsKt.read((Enum[]) values());
    private final String stringRepresentation;

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        return $ENTRIES;
    }

    public final String getStringRepresentation() {
        return this.stringRepresentation;
    }

    Consent(String str) {
        this.stringRepresentation = str;
    }
}

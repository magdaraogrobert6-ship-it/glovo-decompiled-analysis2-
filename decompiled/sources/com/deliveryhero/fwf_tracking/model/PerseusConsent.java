package com.deliveryhero.fwf_tracking.model;

import coil3.util.UtilsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;

/* JADX INFO: loaded from: classes2.dex */
public enum PerseusConsent {
    ESSENTIAL("essential"),
    ESSENTIAL_FUNCTIONAL("essential_functional"),
    ESSENTIAL_MARKETING("essential_marketing"),
    ESSENTIAL_FUNCTIONAL_MARKETING("essential_functional_marketing"),
    UNDEFINED(null, 1, null);

    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = UtilsKt.read((Enum[]) values());
    private final String value;

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        return $ENTRIES;
    }

    public final String getValue$fwf_client_release() {
        return this.value;
    }

    /* synthetic */ PerseusConsent(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    PerseusConsent(String str) {
        this.value = str;
    }
}

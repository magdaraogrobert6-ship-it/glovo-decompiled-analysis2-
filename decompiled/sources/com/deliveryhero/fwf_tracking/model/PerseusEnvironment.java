package com.deliveryhero.fwf_tracking.model;

import coil3.util.UtilsKt;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;

/* JADX INFO: loaded from: classes4.dex */
public enum PerseusEnvironment {
    STAGING("perseus-stg.deliveryhero.net"),
    PRODUCTION("perseus-productanalytics.deliveryhero.net");

    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = UtilsKt.read((Enum[]) values());
    private final String value;

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        return $ENTRIES;
    }

    public final String getValue$fwf_client_release() {
        return this.value;
    }

    PerseusEnvironment(String str) {
        this.value = str;
    }
}

package com.deliveryhero.fwf_http;

import coil3.util.UtilsKt;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;

/* JADX INFO: loaded from: classes2.dex */
public enum Region {
    EU("eu-client"),
    AP("ap-client"),
    SG("sg-client"),
    ME("me-client"),
    US("us-client"),
    GLB("client-api"),
    STG("stg-client");

    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = UtilsKt.read((Enum[]) values());
    private final String value;

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }

    Region(String str) {
        this.value = str;
    }
}

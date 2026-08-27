package com.sentiance.sdk.status;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public enum ApplicationStartType {
    START_TYPE_UNSET(0),
    START_TYPE_COLD(1),
    START_TYPE_WARM(2),
    START_TYPE_HOT(3);

    public static final read Companion = new read(null);
    private final int code;

    public static final class read {
        public read(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public final int getCode() {
        return this.code;
    }

    ApplicationStartType(int i) {
        this.code = i;
    }
}

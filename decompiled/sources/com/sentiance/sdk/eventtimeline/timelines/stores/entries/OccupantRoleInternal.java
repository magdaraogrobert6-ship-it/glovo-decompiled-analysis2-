package com.sentiance.sdk.eventtimeline.timelines.stores.entries;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public enum OccupantRoleInternal {
    DRIVER("driver"),
    PASSENGER("passenger"),
    UNAVAILABLE("unavailable");

    public static final IconCompatParcelizer Companion = new IconCompatParcelizer(null);
    private final String value;

    public static final class IconCompatParcelizer {
        public IconCompatParcelizer(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public final String getValue() {
        return this.value;
    }

    OccupantRoleInternal(String str) {
        this.value = str;
    }
}

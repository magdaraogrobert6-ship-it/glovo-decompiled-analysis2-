package com.sentiance.sdk.ondevice.datasyncing;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public enum DataSyncPayloadType {
    TRANSPORT_INFO(1),
    SMART_GEOFENCES(2),
    OCCUPANT_ROLE_FEEDBACK(3),
    VEHICLE_CRASH_FEEDBACK(4);

    public static final IconCompatParcelizer Companion = new IconCompatParcelizer(null);
    private final int value;

    public static final class IconCompatParcelizer {
        public IconCompatParcelizer(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public final int getValue() {
        return this.value;
    }

    DataSyncPayloadType(int i) {
        this.value = i;
    }
}

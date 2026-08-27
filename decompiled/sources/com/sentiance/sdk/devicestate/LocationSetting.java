package com.sentiance.sdk.devicestate;

import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes3.dex */
public class LocationSetting {
    private final boolean serializer;
    private final boolean write;

    public enum LocationMode {
        HIGH_ACCURACY,
        DEVICE_ONLY,
        BATTERY_SAVING,
        OFF,
        UNKNOWN
    }

    public final boolean IconCompatParcelizer() {
        return this.write;
    }

    public final boolean write() {
        return this.serializer;
    }

    public final LocationMode serializer() {
        boolean z = this.serializer;
        boolean z2 = this.write;
        if (z2 && z) {
            return LocationMode.HIGH_ACCURACY;
        }
        if (z2) {
            return LocationMode.DEVICE_ONLY;
        }
        return z ? LocationMode.BATTERY_SAVING : LocationMode.OFF;
    }

    public LocationSetting(boolean z, boolean z2) {
        this.write = z;
        this.serializer = z2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocationSetting{isGpsEnabled=");
        sb.append(this.write);
        sb.append(", isNetworkEnabled=");
        return IconCompatParcelizer.IconCompatParcelizer(sb, this.serializer, '}');
    }

    public LocationSetting() {
    }
}

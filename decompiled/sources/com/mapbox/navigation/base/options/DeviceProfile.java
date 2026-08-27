package com.mapbox.navigation.base.options;

/* JADX INFO: loaded from: classes2.dex */
public final class DeviceProfile {
    public final DeviceType deviceType;

    public final int hashCode() {
        return this.deviceType.hashCode();
    }

    public DeviceProfile(DeviceType deviceType) {
        this.deviceType = deviceType;
    }

    public final String toString() {
        return "DeviceProfile(customConfig='', deviceType=" + this.deviceType + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!DeviceProfile.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.deviceType == ((DeviceProfile) obj).deviceType;
    }
}

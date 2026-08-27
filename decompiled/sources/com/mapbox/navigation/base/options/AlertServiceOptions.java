package com.mapbox.navigation.base.options;

import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class AlertServiceOptions {
    public final int hashCode() {
        return Boolean.hashCode(false) + d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(Boolean.hashCode(true) * 31, 31, true), 31, false), 31, false);
    }

    public final String toString() {
        return "AlertServiceOptions(collectTunnels='true', collectBridges='true', collectRestrictedAreas='false', collectMergingAreas='false', collectServiceAreas='false')";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AlertServiceOptions.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return true;
    }
}

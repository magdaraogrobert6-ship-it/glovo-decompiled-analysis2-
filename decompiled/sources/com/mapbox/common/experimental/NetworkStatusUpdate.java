package com.mapbox.common.experimental;

import com.mapbox.annotation.MapboxExperimental;

/* JADX INFO: loaded from: classes5.dex */
@MapboxExperimental
public enum NetworkStatusUpdate {
    NOT_REACHABLE("NotReachable"),
    REACHABLE_VIA_WI_FI("ReachableViaWiFi"),
    REACHABLE_VIA_ETHERNET("ReachableViaEthernet"),
    REACHABLE_VIA_WWAN("ReachableViaWWAN");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    NetworkStatusUpdate(String str) {
        this.str = str;
    }
}

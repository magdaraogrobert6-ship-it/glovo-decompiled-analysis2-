package com.mapbox.navigator;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class AdasisConfigLonLat implements Serializable {
    private final boolean enabled;

    public boolean getEnabled() {
        return this.enabled;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public AdasisConfigLonLat() {
        this.enabled = false;
    }

    public String toString() {
        return ff$$ExternalSyntheticOutline0.m(this.enabled, new StringBuilder("[enabled: "), "]");
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.enabled));
    }

    public AdasisConfigLonLat(boolean z) {
        this.enabled = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.enabled == ((AdasisConfigLonLat) obj).enabled;
    }
}

package com.mapbox.search.internal.bindgen;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class EvMetadata implements Serializable {
    private final EvLocation evLocation;

    public EvLocation getEvLocation() {
        return this.evLocation;
    }

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.evLocation);
    }

    public EvMetadata(EvLocation evLocation) {
        this.evLocation = evLocation;
    }

    public String toString() {
        return "[evLocation: " + RecordUtils.fieldToString(this.evLocation) + "]";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Objects.equals(this.evLocation, ((EvMetadata) obj).evLocation);
    }
}

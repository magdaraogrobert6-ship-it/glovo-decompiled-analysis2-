package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class ElectronicHorizon implements Serializable {
    private final ElectronicHorizonEdge start;

    public ElectronicHorizonEdge getStart() {
        return this.start;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.start);
    }

    public ElectronicHorizon(ElectronicHorizonEdge electronicHorizonEdge) {
        this.start = electronicHorizonEdge;
    }

    public String toString() {
        return "[start: " + RecordUtils.fieldToString(this.start) + "]";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Objects.equals(this.start, ((ElectronicHorizon) obj).start);
    }
}

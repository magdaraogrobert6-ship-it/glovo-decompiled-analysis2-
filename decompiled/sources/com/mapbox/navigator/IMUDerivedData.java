package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class IMUDerivedData implements Serializable {
    private final Double bearing;

    public Double getBearing() {
        return this.bearing;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.bearing);
    }

    public IMUDerivedData(Double d) {
        this.bearing = d;
    }

    public String toString() {
        return "[bearing: " + RecordUtils.fieldToString(this.bearing) + "]";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Objects.equals(this.bearing, ((IMUDerivedData) obj).bearing);
    }
}

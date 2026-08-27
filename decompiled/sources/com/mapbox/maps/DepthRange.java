package com.mapbox.maps;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.getBitmapFromCache;

/* JADX INFO: loaded from: classes5.dex */
public final class DepthRange implements Serializable {
    private final float max;
    private final float min;

    public float getMax() {
        return this.max;
    }

    public float getMin() {
        return this.min;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public DepthRange(float f, float f2) {
        this.min = f;
        this.max = f2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[min: ");
        getBitmapFromCache.write(this.min, ", max: ", sb);
        sb.append(RecordUtils.fieldToString(Float.valueOf(this.max)));
        sb.append("]");
        return sb.toString();
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(this.min), Float.valueOf(this.max));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DepthRange.class != obj.getClass()) {
            return false;
        }
        DepthRange depthRange = (DepthRange) obj;
        return PartialEq.compare(this.min, depthRange.min) && PartialEq.compare(this.max, depthRange.max);
    }
}

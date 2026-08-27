package com.mapbox.navigator;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.getBitmapFromCache;

/* JADX INFO: loaded from: classes5.dex */
public class CurveElement implements Serializable {
    private final float first;
    private final float second;

    public float getFirst() {
        return this.first;
    }

    public float getSecond() {
        return this.second;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public CurveElement(float f, float f2) {
        this.first = f;
        this.second = f2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[first: ");
        getBitmapFromCache.write(this.first, ", second: ", sb);
        sb.append(RecordUtils.fieldToString(Float.valueOf(this.second)));
        sb.append("]");
        return sb.toString();
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(this.first), Float.valueOf(this.second));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CurveElement curveElement = (CurveElement) obj;
        return PartialEq.compare(this.first, curveElement.first) && PartialEq.compare(this.second, curveElement.second);
    }
}

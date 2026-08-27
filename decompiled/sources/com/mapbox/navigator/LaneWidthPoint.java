package com.mapbox.navigator;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.getBitmapFromCache;

/* JADX INFO: loaded from: classes5.dex */
public class LaneWidthPoint implements Serializable {
    private final float leftWidth;
    private final float percentAlong;
    private final float rightWidth;

    public float getLeftWidth() {
        return this.leftWidth;
    }

    public float getPercentAlong() {
        return this.percentAlong;
    }

    public float getRightWidth() {
        return this.rightWidth;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public LaneWidthPoint(float f, float f2, float f3) {
        this.percentAlong = f;
        this.leftWidth = f2;
        this.rightWidth = f3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[percentAlong: ");
        getBitmapFromCache.write(this.percentAlong, ", leftWidth: ", sb);
        getBitmapFromCache.write(this.leftWidth, ", rightWidth: ", sb);
        sb.append(RecordUtils.fieldToString(Float.valueOf(this.rightWidth)));
        sb.append("]");
        return sb.toString();
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(this.percentAlong), Float.valueOf(this.leftWidth), Float.valueOf(this.rightWidth));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LaneWidthPoint laneWidthPoint = (LaneWidthPoint) obj;
        return PartialEq.compare(this.percentAlong, laneWidthPoint.percentAlong) && PartialEq.compare(this.leftWidth, laneWidthPoint.leftWidth) && PartialEq.compare(this.rightWidth, laneWidthPoint.rightWidth);
    }
}

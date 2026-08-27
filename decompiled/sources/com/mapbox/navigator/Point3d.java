package com.mapbox.navigator;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.getBitmapFromCache;

/* JADX INFO: loaded from: classes4.dex */
public class Point3d implements Serializable {
    private final float x;
    private final float y;
    private final float z;

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public float getZ() {
        return this.z;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public Point3d(float f, float f2, float f3) {
        this.x = f;
        this.y = f2;
        this.z = f3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[x: ");
        getBitmapFromCache.write(this.x, ", y: ", sb);
        getBitmapFromCache.write(this.y, ", z: ", sb);
        sb.append(RecordUtils.fieldToString(Float.valueOf(this.z)));
        sb.append("]");
        return sb.toString();
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(this.x), Float.valueOf(this.y), Float.valueOf(this.z));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Point3d point3d = (Point3d) obj;
        return PartialEq.compare(this.x, point3d.x) && PartialEq.compare(this.y, point3d.y) && PartialEq.compare(this.z, point3d.z);
    }
}

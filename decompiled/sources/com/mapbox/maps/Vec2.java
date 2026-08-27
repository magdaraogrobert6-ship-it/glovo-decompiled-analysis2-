package com.mapbox.maps;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes4.dex */
public final class Vec2 implements Serializable {
    private final double x;
    private final double y;

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public Vec2(double d, double d2) {
        this.x = d;
        this.y = d2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[x: ");
        m1$$ExternalSyntheticOutline0.m(this.x, ", y: ", sb);
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(this.y, "]", sb);
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.x), Double.valueOf(this.y));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Vec2.class != obj.getClass()) {
            return false;
        }
        Vec2 vec2 = (Vec2) obj;
        return PartialEq.compare(this.x, vec2.x) && PartialEq.compare(this.y, vec2.y);
    }
}

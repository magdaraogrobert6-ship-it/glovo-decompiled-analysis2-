package com.mapbox.navigator.route_data;

import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes5.dex */
public class RdLegClosure implements Serializable {
    private final int geometryIndexEnd;
    private final int geometryIndexStart;

    public int getGeometryIndexEnd() {
        return this.geometryIndexEnd;
    }

    public int getGeometryIndexStart() {
        return this.geometryIndexStart;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RdLegClosure(int i, int i2) {
        this.geometryIndexStart = i;
        this.geometryIndexEnd = i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[geometryIndexStart: ");
        IconCompatParcelizer.write(this.geometryIndexStart, ", geometryIndexEnd: ", sb);
        return SweepGradientShader9KIMszodefault.serializer(this.geometryIndexEnd, "]", sb);
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.geometryIndexStart), Integer.valueOf(this.geometryIndexEnd));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RdLegClosure rdLegClosure = (RdLegClosure) obj;
        return this.geometryIndexStart == rdLegClosure.geometryIndexStart && this.geometryIndexEnd == rdLegClosure.geometryIndexEnd;
    }
}

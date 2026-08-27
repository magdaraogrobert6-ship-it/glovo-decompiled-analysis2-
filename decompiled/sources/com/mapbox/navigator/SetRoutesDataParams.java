package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes4.dex */
public class SetRoutesDataParams implements Serializable {
    private final int legIndex;
    private final RoutesData routes;

    public int getLegIndex() {
        return this.legIndex;
    }

    public RoutesData getRoutes() {
        return this.routes;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.routes, Integer.valueOf(this.legIndex));
    }

    public SetRoutesDataParams(RoutesData routesData, int i) {
        this.routes = routesData;
        this.legIndex = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[routes: ");
        sb.append(RecordUtils.fieldToString(this.routes));
        sb.append(", legIndex: ");
        return SweepGradientShader9KIMszodefault.serializer(this.legIndex, "]", sb);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetRoutesDataParams setRoutesDataParams = (SetRoutesDataParams) obj;
        return Objects.equals(this.routes, setRoutesDataParams.routes) && this.legIndex == setRoutesDataParams.legIndex;
    }
}

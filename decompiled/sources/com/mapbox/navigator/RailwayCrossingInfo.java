package com.mapbox.navigator;

import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes3.dex */
public class RailwayCrossingInfo implements Serializable {
    private final String id;

    public String getId() {
        return this.id;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.id);
    }

    public RailwayCrossingInfo(String str) {
        this.id = str;
    }

    public String toString() {
        return SweepGradientShader9KIMszodefault.read(new StringBuilder("[id: "), this.id, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Objects.equals(this.id, ((RailwayCrossingInfo) obj).id);
    }
}

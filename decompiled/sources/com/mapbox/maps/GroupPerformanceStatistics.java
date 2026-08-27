package com.mapbox.maps;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes5.dex */
public final class GroupPerformanceStatistics implements Serializable {
    private final double durationMillis;
    private final String name;

    public double getDurationMillis() {
        return this.durationMillis;
    }

    public String getName() {
        return this.name;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public GroupPerformanceStatistics(double d, String str) {
        this.durationMillis = d;
        this.name = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[durationMillis: ");
        m1$$ExternalSyntheticOutline0.m(this.durationMillis, ", name: ", sb);
        return SweepGradientShader9KIMszodefault.read(sb, this.name, "]");
    }

    public int hashCode() {
        double d = this.durationMillis;
        return Objects.hash(Double.valueOf(d), this.name);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GroupPerformanceStatistics.class != obj.getClass()) {
            return false;
        }
        GroupPerformanceStatistics groupPerformanceStatistics = (GroupPerformanceStatistics) obj;
        return PartialEq.compare(this.durationMillis, groupPerformanceStatistics.durationMillis) && Objects.equals(this.name, groupPerformanceStatistics.name);
    }
}

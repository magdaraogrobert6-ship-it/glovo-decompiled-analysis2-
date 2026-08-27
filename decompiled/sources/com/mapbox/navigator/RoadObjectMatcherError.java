package com.mapbox.navigator;

import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes4.dex */
public class RoadObjectMatcherError implements Serializable {
    private final String description;
    private final String roadObjectId;

    public String getDescription() {
        return this.description;
    }

    public String getRoadObjectId() {
        return this.roadObjectId;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.description, this.roadObjectId);
    }

    public RoadObjectMatcherError(String str, String str2) {
        this.description = str;
        this.roadObjectId = str2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[description: ");
        IconCompatParcelizer.read(sb, this.description, ", roadObjectId: ");
        return SweepGradientShader9KIMszodefault.read(sb, this.roadObjectId, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RoadObjectMatcherError roadObjectMatcherError = (RoadObjectMatcherError) obj;
        return Objects.equals(this.description, roadObjectMatcherError.description) && Objects.equals(this.roadObjectId, roadObjectMatcherError.roadObjectId);
    }
}

package com.mapbox.maps;

import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes2.dex */
public final class FeaturesetFeatureId implements Serializable {
    private final String featureId;
    private final String featureNamespace;

    public String getFeatureId() {
        return this.featureId;
    }

    public String getFeatureNamespace() {
        return this.featureNamespace;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.featureId, this.featureNamespace);
    }

    public FeaturesetFeatureId(String str, String str2) {
        this.featureId = str;
        this.featureNamespace = str2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[featureId: ");
        IconCompatParcelizer.read(sb, this.featureId, ", featureNamespace: ");
        return SweepGradientShader9KIMszodefault.read(sb, this.featureNamespace, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FeaturesetFeatureId.class != obj.getClass()) {
            return false;
        }
        FeaturesetFeatureId featuresetFeatureId = (FeaturesetFeatureId) obj;
        return Objects.equals(this.featureId, featuresetFeatureId.featureId) && Objects.equals(this.featureNamespace, featuresetFeatureId.featureNamespace);
    }
}

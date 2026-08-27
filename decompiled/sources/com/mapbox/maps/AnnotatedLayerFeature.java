package com.mapbox.maps;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes2.dex */
public final class AnnotatedLayerFeature implements Serializable {
    private final String featureId;
    private final String layerId;

    public String getFeatureId() {
        return this.featureId;
    }

    public String getLayerId() {
        return this.layerId;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.layerId, this.featureId);
    }

    public Builder toBuilder() {
        return new Builder().layerId(this.layerId).featureId(this.featureId);
    }

    private AnnotatedLayerFeature(String str, String str2) {
        this.layerId = str;
        this.featureId = str2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[layerId: ");
        IconCompatParcelizer.read(sb, this.layerId, ", featureId: ");
        return SweepGradientShader9KIMszodefault.read(sb, this.featureId, "]");
    }

    public static final class Builder {
        private String featureId;
        private String layerId;

        public Builder featureId(String str) {
            this.featureId = str;
            return this;
        }

        public Builder layerId(String str) {
            this.layerId = str;
            return this;
        }

        public AnnotatedLayerFeature build() {
            String str = this.layerId;
            if (str != null) {
                return new AnnotatedLayerFeature(str, this.featureId);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("layerId shouldn't be null");
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnnotatedLayerFeature.class != obj.getClass()) {
            return false;
        }
        AnnotatedLayerFeature annotatedLayerFeature = (AnnotatedLayerFeature) obj;
        return Objects.equals(this.layerId, annotatedLayerFeature.layerId) && Objects.equals(this.featureId, annotatedLayerFeature.featureId);
    }
}

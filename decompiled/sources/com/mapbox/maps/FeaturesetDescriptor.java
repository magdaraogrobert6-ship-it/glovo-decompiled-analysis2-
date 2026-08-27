package com.mapbox.maps;

import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes2.dex */
public final class FeaturesetDescriptor implements Serializable {
    private final String featuresetId;
    private final String importId;
    private final String layerId;

    public String getFeaturesetId() {
        return this.featuresetId;
    }

    public String getImportId() {
        return this.importId;
    }

    public String getLayerId() {
        return this.layerId;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.featuresetId, this.importId, this.layerId);
    }

    public FeaturesetDescriptor(String str, String str2, String str3) {
        this.featuresetId = str;
        this.importId = str2;
        this.layerId = str3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[featuresetId: ");
        IconCompatParcelizer.read(sb, this.featuresetId, ", importId: ");
        IconCompatParcelizer.read(sb, this.importId, ", layerId: ");
        return SweepGradientShader9KIMszodefault.read(sb, this.layerId, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FeaturesetDescriptor.class != obj.getClass()) {
            return false;
        }
        FeaturesetDescriptor featuresetDescriptor = (FeaturesetDescriptor) obj;
        return Objects.equals(this.featuresetId, featuresetDescriptor.featuresetId) && Objects.equals(this.importId, featuresetDescriptor.importId) && Objects.equals(this.layerId, featuresetDescriptor.layerId);
    }
}

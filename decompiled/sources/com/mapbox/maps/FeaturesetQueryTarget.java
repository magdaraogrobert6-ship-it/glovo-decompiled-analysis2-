package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class FeaturesetQueryTarget implements Serializable {
    private final FeaturesetDescriptor featureset;
    private final Value filter;
    private final Long id;

    public FeaturesetDescriptor getFeatureset() {
        return this.featureset;
    }

    public Value getFilter() {
        return this.filter;
    }

    public Long getId() {
        return this.id;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.featureset, this.filter, this.id);
    }

    public FeaturesetQueryTarget(FeaturesetDescriptor featuresetDescriptor, Value value, Long l) {
        this.featureset = featuresetDescriptor;
        this.filter = value;
        this.id = l;
    }

    public String toString() {
        return "[featureset: " + RecordUtils.fieldToString(this.featureset) + ", filter: " + RecordUtils.fieldToString(this.filter) + ", id: " + RecordUtils.fieldToString(this.id) + "]";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FeaturesetQueryTarget.class != obj.getClass()) {
            return false;
        }
        FeaturesetQueryTarget featuresetQueryTarget = (FeaturesetQueryTarget) obj;
        return Objects.equals(this.featureset, featuresetQueryTarget.featureset) && Objects.equals(this.filter, featuresetQueryTarget.filter) && Objects.equals(this.id, featuresetQueryTarget.id);
    }
}

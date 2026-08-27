package com.mapbox.maps.interactions.standard.generated;

import com.mapbox.bindgen.Value;
import com.mapbox.geojson.Feature;
import com.mapbox.maps.FeaturesetDescriptor;
import com.mapbox.maps.FeaturesetFeatureId;
import com.mapbox.maps.interactions.TypedFeaturesetDescriptor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes5.dex */
public final class StandardPoi extends TypedFeaturesetDescriptor<StandardPoiState, StandardPoiFeature> {
    public static final Companion Companion = new Companion(null);
    public static final String FEATURESET_ID = "poi";
    private final String importId;

    public final String getImportId() {
        return this.importId;
    }

    @Override // com.mapbox.maps.interactions.TypedFeaturesetDescriptor
    public FeaturesetDescriptor toFeaturesetDescriptor() {
        String str = this.importId;
        if (str == null) {
            str = TypedFeaturesetDescriptor.DEFAULT_IMPORT_ID;
        }
        return new FeaturesetDescriptor(FEATURESET_ID, str, null);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // com.mapbox.maps.interactions.TypedFeaturesetDescriptor
    public StandardPoiFeature getFeaturesetFeature(Feature feature, String str, Value value) {
        feature.getClass();
        value.getClass();
        String strId = feature.id();
        return strId != null ? new StandardPoiFeature(new FeaturesetFeatureId(strId, str), this.importId, feature, getFeatureState(value)) : new StandardPoiFeature(null, this.importId, feature, getFeatureState(value));
    }

    public int hashCode() {
        String str = this.importId;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public /* synthetic */ StandardPoi(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    @Override // com.mapbox.maps.interactions.TypedFeaturesetDescriptor
    public StandardPoiState getFeatureState(Value value) {
        value.getClass();
        return new StandardPoiState(value);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!StandardPoi.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.importId, ((StandardPoi) obj).importId}, getCieXyz.write())).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StandardPoi() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public StandardPoi(String str) {
        this.importId = str;
    }
}

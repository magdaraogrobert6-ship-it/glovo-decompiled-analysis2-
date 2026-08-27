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
public final class StandardIndoorLabels extends TypedFeaturesetDescriptor<StandardIndoorLabelsState, StandardIndoorLabelsFeature> {
    public static final Companion Companion = new Companion(null);
    public static final String FEATURESET_ID = "indoor-labels";
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
    public StandardIndoorLabelsFeature getFeaturesetFeature(Feature feature, String str, Value value) {
        feature.getClass();
        value.getClass();
        String strId = feature.id();
        return strId != null ? new StandardIndoorLabelsFeature(new FeaturesetFeatureId(strId, str), this.importId, feature, getFeatureState(value)) : new StandardIndoorLabelsFeature(null, this.importId, feature, getFeatureState(value));
    }

    public int hashCode() {
        String str = this.importId;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public /* synthetic */ StandardIndoorLabels(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    @Override // com.mapbox.maps.interactions.TypedFeaturesetDescriptor
    public StandardIndoorLabelsState getFeatureState(Value value) {
        value.getClass();
        return new StandardIndoorLabelsState(value);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!StandardIndoorLabels.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.importId, ((StandardIndoorLabels) obj).importId}, getCieXyz.write())).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StandardIndoorLabels() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public StandardIndoorLabels(String str) {
        this.importId = str;
    }
}

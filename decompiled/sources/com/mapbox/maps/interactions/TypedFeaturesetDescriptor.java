package com.mapbox.maps.interactions;

import com.mapbox.bindgen.Value;
import com.mapbox.geojson.Feature;
import com.mapbox.maps.FeaturesetDescriptor;
import com.mapbox.maps.FeaturesetFeatureId;
import com.mapbox.maps.interactions.FeatureState;
import com.mapbox.maps.interactions.FeaturesetFeature;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TypedFeaturesetDescriptor<FS extends FeatureState, FF extends FeaturesetFeature<FS>> {
    public static final Companion Companion = new Companion(null);
    public static final String DEFAULT_IMPORT_ID = "basemap";

    /* JADX INFO: loaded from: classes4.dex */
    public static final class Featureset extends TypedFeaturesetDescriptor<FeatureState, FeaturesetFeature<FeatureState>> {
        private final String featuresetId;
        private final String importId;

        public final String getFeaturesetId() {
            return this.featuresetId;
        }

        public final String getImportId() {
            return this.importId;
        }

        public int hashCode() {
            return Objects.hash(this.featuresetId, this.importId);
        }

        @Override // com.mapbox.maps.interactions.TypedFeaturesetDescriptor
        public FeaturesetDescriptor toFeaturesetDescriptor() {
            return new FeaturesetDescriptor(this.featuresetId, this.importId, null);
        }

        public Featureset(String str, String str2) {
            str.getClass();
            this.featuresetId = str;
            this.importId = str2;
        }

        @Override // com.mapbox.maps.interactions.TypedFeaturesetDescriptor
        public FeaturesetFeature<FeatureState> getFeaturesetFeature(Feature feature, String str, Value value) {
            feature.getClass();
            value.getClass();
            String strId = feature.id();
            return strId != null ? new FeaturesetFeature<>(new FeaturesetFeatureId(strId, str), this, getFeatureState(value), feature) : new FeaturesetFeature<>(null, this, getFeatureState(value), feature);
        }

        @Override // com.mapbox.maps.interactions.TypedFeaturesetDescriptor
        public FeatureState getFeatureState(Value value) {
            value.getClass();
            return new FeatureState(value);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!Featureset.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            obj.getClass();
            Featureset featureset = (Featureset) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.featuresetId, featureset.featuresetId}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.importId, featureset.importId}, getCieXyz.write())).booleanValue();
        }

        public /* synthetic */ Featureset(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Featureset(String str) {
            this(str, null, 2, 0 == true ? 1 : 0);
            str.getClass();
        }
    }

    public static final class Layer extends TypedFeaturesetDescriptor<FeatureState, FeaturesetFeature<FeatureState>> {
        private final String layerId;

        public final String getLayerId() {
            return this.layerId;
        }

        public int hashCode() {
            return this.layerId.hashCode();
        }

        public Layer(String str) {
            str.getClass();
            this.layerId = str;
        }

        @Override // com.mapbox.maps.interactions.TypedFeaturesetDescriptor
        public FeaturesetFeature<FeatureState> getFeaturesetFeature(Feature feature, String str, Value value) {
            feature.getClass();
            value.getClass();
            String strId = feature.id();
            return strId != null ? new FeaturesetFeature<>(new FeaturesetFeatureId(strId, str), this, getFeatureState(value), feature) : new FeaturesetFeature<>(null, this, getFeatureState(value), feature);
        }

        @Override // com.mapbox.maps.interactions.TypedFeaturesetDescriptor
        public FeaturesetDescriptor toFeaturesetDescriptor() {
            return new FeaturesetDescriptor(null, null, this.layerId);
        }

        @Override // com.mapbox.maps.interactions.TypedFeaturesetDescriptor
        public FeatureState getFeatureState(Value value) {
            value.getClass();
            return new FeatureState(value);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!Layer.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            obj.getClass();
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.layerId, ((Layer) obj).layerId}, getCieXyz.write())).booleanValue();
        }
    }

    public abstract FS getFeatureState(Value value);

    public abstract FF getFeaturesetFeature(Feature feature, String str, Value value);

    public abstract FeaturesetDescriptor toFeaturesetDescriptor();

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}

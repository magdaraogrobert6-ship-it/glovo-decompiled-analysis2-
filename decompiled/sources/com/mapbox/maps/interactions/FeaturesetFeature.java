package com.mapbox.maps.interactions;

import com.google.gson.JsonObject;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.Geometry;
import com.mapbox.maps.FeaturesetFeatureId;
import com.mapbox.maps.interactions.FeatureState;
import java.util.Objects;
import o.getCieXyz;
import o.isAdapterPositionOnScreen;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeNodeAtDepth;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class FeaturesetFeature<FS extends FeatureState> {
    private final TypedFeaturesetDescriptor<FS, ?> descriptor;
    private final Geometry geometry;
    private final FeaturesetFeatureId id;
    private final Feature originalFeature;
    private final onViewDetachedFromWindowlambda1 properties$delegate;
    private final FS state;

    public final TypedFeaturesetDescriptor<FS, ?> getDescriptor() {
        return this.descriptor;
    }

    public Geometry getGeometry() {
        return this.geometry;
    }

    public final FeaturesetFeatureId getId() {
        return this.id;
    }

    public final Feature getOriginalFeature() {
        return this.originalFeature;
    }

    public final FS getState() {
        return this.state;
    }

    public final JSONObject getProperties() {
        return (JSONObject) this.properties$delegate.MediaSessionCompatResultReceiverWrapper();
    }

    public int hashCode() {
        return Objects.hash(this.descriptor, this.originalFeature, this.state, this.id);
    }

    public FeaturesetFeature(FeaturesetFeatureId featuresetFeatureId, TypedFeaturesetDescriptor<FS, ?> typedFeaturesetDescriptor, FS fs, Feature feature) {
        typedFeaturesetDescriptor.getClass();
        fs.getClass();
        feature.getClass();
        this.id = featuresetFeatureId;
        this.descriptor = typedFeaturesetDescriptor;
        this.state = fs;
        this.originalFeature = feature;
        Geometry geometry = feature.geometry();
        geometry.getClass();
        this.geometry = geometry;
        this.properties$delegate = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: com.mapbox.maps.interactions.FeaturesetFeature$properties$2
            final /* synthetic */ FeaturesetFeature<FS> this$0;

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final JSONObject invoke() {
                JsonObject jsonObjectProperties = this.this$0.getOriginalFeature().properties();
                return jsonObjectProperties != null ? new JSONObject(jsonObjectProperties.toString()) : new JSONObject();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }
        });
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        FeaturesetFeature featuresetFeature = (FeaturesetFeature) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.descriptor, featuresetFeature.descriptor}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.originalFeature, featuresetFeature.originalFeature}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.state, featuresetFeature.state}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, featuresetFeature.id}, getCieXyz.write())).booleanValue();
    }
}

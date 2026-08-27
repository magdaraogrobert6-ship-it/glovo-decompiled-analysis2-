package com.mapbox.geojson;

import androidx.annotation.Keep;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.geojson.gson.BoundingBoxTypeAdapter;
import com.mapbox.geojson.gson.GeoJsonAdapterFactory;
import fwfd.com.fwfsdk.util.FWFHelper;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class FeatureCollection implements GeoJson {
    private static final String TYPE = "FeatureCollection";

    @JsonAdapter(BoundingBoxTypeAdapter.class)
    private final BoundingBox bbox;
    private final List<Feature> features;
    private final String type;

    public static final class GsonTypeAdapter extends TypeAdapter<FeatureCollection> {
        private volatile TypeAdapter<BoundingBox> boundingBoxAdapter;
        private final Gson gson;
        private volatile TypeAdapter<List<Feature>> listFeatureAdapter;
        private volatile TypeAdapter<String> stringAdapter;

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, FeatureCollection featureCollection) throws IOException {
            if (featureCollection == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("type");
            if (featureCollection.type() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter = this.stringAdapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(String.class);
                    this.stringAdapter = adapter;
                }
                adapter.write(jsonWriter, featureCollection.type());
            }
            jsonWriter.name("bbox");
            if (featureCollection.bbox() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<BoundingBox> adapter2 = this.boundingBoxAdapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(BoundingBox.class);
                    this.boundingBoxAdapter = adapter2;
                }
                adapter2.write(jsonWriter, featureCollection.bbox());
            }
            jsonWriter.name(FWFHelper.ENDPOINT_FEATURES);
            if (featureCollection.features() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<Feature>> adapter3 = this.listFeatureAdapter;
                if (adapter3 == null) {
                    adapter3 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Feature.class));
                    this.listFeatureAdapter = adapter3;
                }
                adapter3.write(jsonWriter, featureCollection.features());
            }
            jsonWriter.endObject();
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code duplicated, block: B:29:0x0060  */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public FeatureCollection read2(JsonReader jsonReader) throws IOException {
            byte b;
            String str = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            BoundingBox boundingBox = null;
            List<Feature> list = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    int iHashCode = strNextName.hashCode();
                    if (iHashCode != -290659267) {
                        if (iHashCode != 3017257) {
                            if (iHashCode == 3575610 && strNextName.equals("type")) {
                                b = 2;
                            } else {
                                b = -1;
                            }
                        } else if (strNextName.equals("bbox")) {
                            b = 1;
                        } else {
                            b = -1;
                        }
                    } else if (strNextName.equals(FWFHelper.ENDPOINT_FEATURES)) {
                        b = 0;
                    } else {
                        b = -1;
                    }
                    if (b == 0) {
                        TypeAdapter<List<Feature>> adapter = this.listFeatureAdapter;
                        if (adapter == null) {
                            adapter = this.gson.getAdapter(TypeToken.getParameterized(List.class, Feature.class));
                            this.listFeatureAdapter = adapter;
                        }
                        list = adapter.read2(jsonReader);
                    } else if (b == 1) {
                        TypeAdapter<BoundingBox> adapter2 = this.boundingBoxAdapter;
                        if (adapter2 == null) {
                            adapter2 = this.gson.getAdapter(BoundingBox.class);
                            this.boundingBoxAdapter = adapter2;
                        }
                        boundingBox = adapter2.read2(jsonReader);
                    } else if (b != 2) {
                        jsonReader.skipValue();
                    } else {
                        TypeAdapter<String> adapter3 = this.stringAdapter;
                        if (adapter3 == null) {
                            adapter3 = this.gson.getAdapter(String.class);
                            this.stringAdapter = adapter3;
                        }
                        str = adapter3.read2(jsonReader);
                    }
                }
            }
            jsonReader.endObject();
            return new FeatureCollection(str, boundingBox, list);
        }
    }

    @Override // com.mapbox.geojson.GeoJson
    public BoundingBox bbox() {
        return this.bbox;
    }

    public List<Feature> features() {
        return this.features;
    }

    @Override // com.mapbox.geojson.GeoJson
    public String type() {
        return this.type;
    }

    public static FeatureCollection fromJson(String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(GeoJsonAdapterFactory.create());
        gsonBuilder.registerTypeAdapterFactory(GeometryAdapterFactory.create());
        return (FeatureCollection) gsonBuilder.create().fromJson(str, FeatureCollection.class);
    }

    public static TypeAdapter<FeatureCollection> typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode();
        BoundingBox boundingBox = this.bbox;
        int iHashCode2 = boundingBox == null ? 0 : boundingBox.hashCode();
        List<Feature> list = this.features;
        return ((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ (list != null ? list.hashCode() : 0);
    }

    @Override // com.mapbox.geojson.GeoJson
    public String toJson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(GeoJsonAdapterFactory.create());
        gsonBuilder.registerTypeAdapterFactory(GeometryAdapterFactory.create());
        return gsonBuilder.create().toJson(this);
    }

    public static FeatureCollection fromFeatures(Feature[] featureArr) {
        return new FeatureCollection(TYPE, null, Arrays.asList(featureArr));
    }

    public static FeatureCollection fromFeature(Feature feature) {
        return new FeatureCollection(TYPE, null, Arrays.asList(feature));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FeatureCollection)) {
            return false;
        }
        FeatureCollection featureCollection = (FeatureCollection) obj;
        if (!this.type.equals(featureCollection.type())) {
            return false;
        }
        BoundingBox boundingBox = this.bbox;
        if (boundingBox == null) {
            if (featureCollection.bbox() != null) {
                return false;
            }
        } else if (!boundingBox.equals(featureCollection.bbox())) {
            return false;
        }
        List<Feature> list = this.features;
        if (list == null) {
            if (featureCollection.features() != null) {
                return false;
            }
        } else if (!list.equals(featureCollection.features())) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FeatureCollection{type=");
        sb.append(this.type);
        sb.append(", bbox=");
        sb.append(this.bbox);
        sb.append(", features=");
        return MediaSessionCompatQueueItem.read(sb, this.features, "}");
    }

    public FeatureCollection(String str, BoundingBox boundingBox, List<Feature> list) {
        if (str == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null type");
            throw null;
        }
        this.type = str;
        this.bbox = boundingBox;
        this.features = list;
    }

    public static FeatureCollection fromFeatures(List<Feature> list) {
        return new FeatureCollection(TYPE, null, list);
    }

    public static FeatureCollection fromFeatures(Feature[] featureArr, BoundingBox boundingBox) {
        return new FeatureCollection(TYPE, boundingBox, Arrays.asList(featureArr));
    }

    public static FeatureCollection fromFeatures(List<Feature> list, BoundingBox boundingBox) {
        return new FeatureCollection(TYPE, boundingBox, list);
    }

    public static FeatureCollection fromFeature(Feature feature, BoundingBox boundingBox) {
        return new FeatureCollection(TYPE, boundingBox, Arrays.asList(feature));
    }
}

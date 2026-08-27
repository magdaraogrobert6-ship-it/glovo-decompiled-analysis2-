package com.mapbox.api.geocoding.v5.models;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.huawei.hms.actions.SearchIntents;
import fwfd.com.fwfsdk.util.FWFHelper;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class AutoValue_GeocodingResponse implements Serializable {
    public final String attribution;
    public final List features;
    public final List query;
    public final String type;

    final class GsonTypeAdapter extends TypeAdapter<AutoValue_GeocodingResponse> {
        public final Gson gson;
        public volatile TypeAdapter list__carmenFeature_adapter;
        public volatile TypeAdapter list__string_adapter;
        public volatile TypeAdapter string_adapter;

        public final String toString() {
            return "TypeAdapter(GeocodingResponse)";
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public final AutoValue_GeocodingResponse read2(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str = "FeatureCollection";
            List list = null;
            List list2 = null;
            String str2 = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    if ("type".equals(strNextName)) {
                        TypeAdapter adapter = this.string_adapter;
                        if (adapter == null) {
                            adapter = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter;
                        }
                        str = (String) adapter.read2(jsonReader);
                        if (str == null) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null type");
                            return null;
                        }
                    } else if (SearchIntents.EXTRA_QUERY.equals(strNextName)) {
                        TypeAdapter adapter2 = this.list__string_adapter;
                        if (adapter2 == null) {
                            adapter2 = this.gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
                            this.list__string_adapter = adapter2;
                        }
                        list = (List) adapter2.read2(jsonReader);
                        if (list == null) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null query");
                            return null;
                        }
                    } else if (FWFHelper.ENDPOINT_FEATURES.equals(strNextName)) {
                        TypeAdapter adapter3 = this.list__carmenFeature_adapter;
                        if (adapter3 == null) {
                            adapter3 = this.gson.getAdapter(TypeToken.getParameterized(List.class, AutoValue_CarmenFeature.class));
                            this.list__carmenFeature_adapter = adapter3;
                        }
                        list2 = (List) adapter3.read2(jsonReader);
                        if (list2 == null) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null features");
                            return null;
                        }
                    } else if ("attribution".equals(strNextName)) {
                        TypeAdapter adapter4 = this.string_adapter;
                        if (adapter4 == null) {
                            adapter4 = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter4;
                        }
                        str2 = (String) adapter4.read2(jsonReader);
                        if (str2 == null) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null attribution");
                            return null;
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            String strConcat = list == null ? "".concat(" query") : "";
            if (list2 == null) {
                strConcat = strConcat.concat(" features");
            }
            if (str2 == null) {
                strConcat = strConcat.concat(" attribution");
            }
            if (strConcat.isEmpty()) {
                return new AutoValue_GeocodingResponse(list, str, list2, str2);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties:".concat(strConcat));
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, AutoValue_GeocodingResponse autoValue_GeocodingResponse) throws IOException {
            AutoValue_GeocodingResponse autoValue_GeocodingResponse2 = autoValue_GeocodingResponse;
            if (autoValue_GeocodingResponse2 == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("type");
            TypeAdapter adapter = this.string_adapter;
            if (adapter == null) {
                adapter = this.gson.getAdapter(String.class);
                this.string_adapter = adapter;
            }
            adapter.write(jsonWriter, autoValue_GeocodingResponse2.type);
            jsonWriter.name(SearchIntents.EXTRA_QUERY);
            if (autoValue_GeocodingResponse2.query == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter2 = this.list__string_adapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
                    this.list__string_adapter = adapter2;
                }
                adapter2.write(jsonWriter, autoValue_GeocodingResponse2.query);
            }
            jsonWriter.name(FWFHelper.ENDPOINT_FEATURES);
            if (autoValue_GeocodingResponse2.features == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter3 = this.list__carmenFeature_adapter;
                if (adapter3 == null) {
                    adapter3 = this.gson.getAdapter(TypeToken.getParameterized(List.class, AutoValue_CarmenFeature.class));
                    this.list__carmenFeature_adapter = adapter3;
                }
                adapter3.write(jsonWriter, autoValue_GeocodingResponse2.features);
            }
            jsonWriter.name("attribution");
            if (autoValue_GeocodingResponse2.attribution == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter4 = this.string_adapter;
                if (adapter4 == null) {
                    adapter4 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter4;
                }
                adapter4.write(jsonWriter, autoValue_GeocodingResponse2.attribution);
            }
            jsonWriter.endObject();
        }
    }

    public static TypeAdapter typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
    }

    public final int hashCode() {
        int iHashCode = this.type.hashCode();
        int iHashCode2 = this.query.hashCode();
        return ((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ this.features.hashCode()) * 1000003) ^ this.attribution.hashCode();
    }

    public AutoValue_GeocodingResponse(List list, String str, List list2, String str2) {
        this.type = str;
        if (list == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null query");
            throw null;
        }
        this.query = list;
        if (list2 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null features");
            throw null;
        }
        this.features = list2;
        if (str2 != null) {
            this.attribution = str2;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null attribution");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoValue_GeocodingResponse)) {
            return false;
        }
        AutoValue_GeocodingResponse autoValue_GeocodingResponse = (AutoValue_GeocodingResponse) obj;
        return this.type.equals(autoValue_GeocodingResponse.type) && this.query.equals(autoValue_GeocodingResponse.query) && this.features.equals(autoValue_GeocodingResponse.features) && this.attribution.equals(autoValue_GeocodingResponse.attribution);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GeocodingResponse{type=");
        sb.append(this.type);
        sb.append(", query=");
        sb.append(this.query);
        sb.append(", features=");
        sb.append(this.features);
        sb.append(", attribution=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.attribution, "}");
    }
}

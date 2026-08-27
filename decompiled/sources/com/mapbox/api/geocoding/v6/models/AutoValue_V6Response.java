package com.mapbox.api.geocoding.v6.models;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import fwfd.com.fwfsdk.util.FWFHelper;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class AutoValue_V6Response implements Serializable {
    public final String attribution;
    public final List features;
    public final String type;

    final class GsonTypeAdapter extends TypeAdapter<AutoValue_V6Response> {
        public final Gson gson;
        public volatile TypeAdapter list__v6Feature_adapter;
        public volatile TypeAdapter string_adapter;

        public final String toString() {
            return "TypeAdapter(V6Response)";
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public final AutoValue_V6Response read2(JsonReader jsonReader) throws IOException {
            String str = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str2 = null;
            List list = null;
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
                    } else if (FWFHelper.ENDPOINT_FEATURES.equals(strNextName)) {
                        TypeAdapter adapter2 = this.list__v6Feature_adapter;
                        if (adapter2 == null) {
                            adapter2 = this.gson.getAdapter(TypeToken.getParameterized(List.class, AutoValue_V6Feature.class));
                            this.list__v6Feature_adapter = adapter2;
                        }
                        list = (List) adapter2.read2(jsonReader);
                    } else if ("attribution".equals(strNextName)) {
                        TypeAdapter adapter3 = this.string_adapter;
                        if (adapter3 == null) {
                            adapter3 = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter3;
                        }
                        str2 = (String) adapter3.read2(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_V6Response(str, str2, list);
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, AutoValue_V6Response autoValue_V6Response) throws IOException {
            AutoValue_V6Response autoValue_V6Response2 = autoValue_V6Response;
            if (autoValue_V6Response2 == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("type");
            if (autoValue_V6Response2.type == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter = this.string_adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter;
                }
                adapter.write(jsonWriter, autoValue_V6Response2.type);
            }
            jsonWriter.name(FWFHelper.ENDPOINT_FEATURES);
            if (autoValue_V6Response2.features == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter2 = this.list__v6Feature_adapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(TypeToken.getParameterized(List.class, AutoValue_V6Feature.class));
                    this.list__v6Feature_adapter = adapter2;
                }
                adapter2.write(jsonWriter, autoValue_V6Response2.features);
            }
            jsonWriter.name("attribution");
            if (autoValue_V6Response2.attribution == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter3 = this.string_adapter;
                if (adapter3 == null) {
                    adapter3 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter3;
                }
                adapter3.write(jsonWriter, autoValue_V6Response2.attribution);
            }
            jsonWriter.endObject();
        }
    }

    public static TypeAdapter typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
    }

    public final int hashCode() {
        int iHashCode = this.type.hashCode();
        return ((((iHashCode ^ 1000003) * 1000003) ^ this.features.hashCode()) * 1000003) ^ this.attribution.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoValue_V6Response)) {
            return false;
        }
        AutoValue_V6Response autoValue_V6Response = (AutoValue_V6Response) obj;
        return this.type.equals(autoValue_V6Response.type) && this.features.equals(autoValue_V6Response.features) && this.attribution.equals(autoValue_V6Response.attribution);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("V6Response{type=");
        sb.append(this.type);
        sb.append(", features=");
        sb.append(this.features);
        sb.append(", attribution=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.attribution, "}");
    }

    public AutoValue_V6Response(String str, String str2, List list) {
        if (str == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null type");
            throw null;
        }
        this.type = str;
        if (list == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null features");
            throw null;
        }
        this.features = list;
        if (str2 != null) {
            this.attribution = str2;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null attribution");
            throw null;
        }
    }
}

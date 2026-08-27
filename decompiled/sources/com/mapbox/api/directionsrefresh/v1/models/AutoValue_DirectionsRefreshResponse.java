package com.mapbox.api.directionsrefresh.v1.models;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.auto.value.gson.SerializableJsonElement;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import o.SweepGradientShader9KIMszodefault;
import o.getReverseScrolling;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;

/* JADX INFO: loaded from: classes2.dex */
public final class AutoValue_DirectionsRefreshResponse extends getReverseScrolling {
    public final String code;
    public final String message;
    public final AutoValue_DirectionsRouteRefresh route;
    public final Map unrecognized;

    final class GsonTypeAdapter extends TypeAdapter<AutoValue_DirectionsRefreshResponse> {
        public volatile TypeAdapter directionsRouteRefresh_adapter;
        public final Gson gson;
        public volatile TypeAdapter string_adapter;

        public final String toString() {
            return "TypeAdapter(DirectionsRefreshResponse)";
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public final AutoValue_DirectionsRefreshResponse read2(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str = null;
            LinkedHashMap linkedHashMap = null;
            String str2 = null;
            AutoValue_DirectionsRouteRefresh autoValue_DirectionsRouteRefresh = null;
            LinkedHashMap linkedHashMap2 = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    if ("code".equals(strNextName)) {
                        TypeAdapter adapter = this.string_adapter;
                        if (adapter == null) {
                            adapter = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter;
                        }
                        str = (String) adapter.read2(jsonReader);
                        if (str == null) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null code");
                            return null;
                        }
                    } else if ("message".equals(strNextName)) {
                        TypeAdapter adapter2 = this.string_adapter;
                        if (adapter2 == null) {
                            adapter2 = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter2;
                        }
                        str2 = (String) adapter2.read2(jsonReader);
                    } else if ("route".equals(strNextName)) {
                        TypeAdapter adapter3 = this.directionsRouteRefresh_adapter;
                        if (adapter3 == null) {
                            adapter3 = this.gson.getAdapter(AutoValue_DirectionsRouteRefresh.class);
                            this.directionsRouteRefresh_adapter = adapter3;
                        }
                        autoValue_DirectionsRouteRefresh = (AutoValue_DirectionsRouteRefresh) adapter3.read2(jsonReader);
                    } else {
                        if (linkedHashMap2 == null) {
                            linkedHashMap = new LinkedHashMap();
                            linkedHashMap2 = linkedHashMap;
                        }
                        SweepGradientShader9KIMszodefault.serializer((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap2, strNextName);
                    }
                }
            }
            jsonReader.endObject();
            String str3 = str == null ? " code" : "";
            if (str3.isEmpty()) {
                return new AutoValue_DirectionsRefreshResponse(linkedHashMap, str, str2, autoValue_DirectionsRouteRefresh);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties:".concat(str3));
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, AutoValue_DirectionsRefreshResponse autoValue_DirectionsRefreshResponse) throws IOException {
            AutoValue_DirectionsRefreshResponse autoValue_DirectionsRefreshResponse2 = autoValue_DirectionsRefreshResponse;
            if (autoValue_DirectionsRefreshResponse2 == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            Map map = autoValue_DirectionsRefreshResponse2.unrecognized;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    jsonWriter.name((String) entry.getKey());
                    JsonElement jsonElement = ((SerializableJsonElement) entry.getValue()).element;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name("code");
            if (autoValue_DirectionsRefreshResponse2.code == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter = this.string_adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter;
                }
                adapter.write(jsonWriter, autoValue_DirectionsRefreshResponse2.code);
            }
            jsonWriter.name("message");
            if (autoValue_DirectionsRefreshResponse2.message == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter2 = this.string_adapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter2;
                }
                adapter2.write(jsonWriter, autoValue_DirectionsRefreshResponse2.message);
            }
            jsonWriter.name("route");
            if (autoValue_DirectionsRefreshResponse2.route == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter3 = this.directionsRouteRefresh_adapter;
                if (adapter3 == null) {
                    adapter3 = this.gson.getAdapter(AutoValue_DirectionsRouteRefresh.class);
                    this.directionsRouteRefresh_adapter = adapter3;
                }
                adapter3.write(jsonWriter, autoValue_DirectionsRefreshResponse2.route);
            }
            jsonWriter.endObject();
        }
    }

    public final int hashCode() {
        Map map = this.unrecognized;
        int iHashCode = map == null ? 0 : map.hashCode();
        int iHashCode2 = this.code.hashCode();
        String str = this.message;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        AutoValue_DirectionsRouteRefresh autoValue_DirectionsRouteRefresh = this.route;
        return ((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ (autoValue_DirectionsRouteRefresh != null ? autoValue_DirectionsRouteRefresh.hashCode() : 0);
    }

    public static TypeAdapter typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
    }

    public AutoValue_DirectionsRefreshResponse(Map map, String str, String str2, AutoValue_DirectionsRouteRefresh autoValue_DirectionsRouteRefresh) {
        this.unrecognized = map;
        if (str == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null code");
            throw null;
        }
        this.code = str;
        this.message = str2;
        this.route = autoValue_DirectionsRouteRefresh;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoValue_DirectionsRefreshResponse)) {
            return false;
        }
        AutoValue_DirectionsRefreshResponse autoValue_DirectionsRefreshResponse = (AutoValue_DirectionsRefreshResponse) obj;
        Map map = this.unrecognized;
        if (map == null) {
            if (autoValue_DirectionsRefreshResponse.unrecognized != null) {
                return false;
            }
        } else if (!map.equals(autoValue_DirectionsRefreshResponse.unrecognized)) {
            return false;
        }
        if (!this.code.equals(autoValue_DirectionsRefreshResponse.code)) {
            return false;
        }
        String str = autoValue_DirectionsRefreshResponse.message;
        String str2 = this.message;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        AutoValue_DirectionsRouteRefresh autoValue_DirectionsRouteRefresh = autoValue_DirectionsRefreshResponse.route;
        AutoValue_DirectionsRouteRefresh autoValue_DirectionsRouteRefresh2 = this.route;
        if (autoValue_DirectionsRouteRefresh2 == null) {
            if (autoValue_DirectionsRouteRefresh != null) {
                return false;
            }
        } else if (!autoValue_DirectionsRouteRefresh2.equals(autoValue_DirectionsRouteRefresh)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return "DirectionsRefreshResponse{unrecognized=" + this.unrecognized + ", code=" + this.code + ", message=" + this.message + ", route=" + this.route + "}";
    }
}

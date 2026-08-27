package com.mapbox.api.directions.v5.models;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.auto.value.gson.SerializableJsonElement;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.SweepGradientShader9KIMszodefault;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_DirectionsResponse extends C$AutoValue_DirectionsResponse {

    public static final class GsonTypeAdapter extends TypeAdapter<DirectionsResponse> {
        private final Gson gson;
        private volatile TypeAdapter<List<DirectionsRoute>> list__directionsRoute_adapter;
        private volatile TypeAdapter<List<DirectionsWaypoint>> list__directionsWaypoint_adapter;
        private volatile TypeAdapter<Metadata> metadata_adapter;
        private volatile TypeAdapter<String> string_adapter;

        public String toString() {
            return "TypeAdapter(DirectionsResponse)";
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, DirectionsResponse directionsResponse) throws IOException {
            if (directionsResponse == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (directionsResponse.unrecognized() != null) {
                for (Map.Entry<String, SerializableJsonElement> entry : directionsResponse.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().element;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name("code");
            if (directionsResponse.code() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter = this.string_adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter;
                }
                adapter.write(jsonWriter, directionsResponse.code());
            }
            jsonWriter.name("message");
            if (directionsResponse.message() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter2 = this.string_adapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter2;
                }
                adapter2.write(jsonWriter, directionsResponse.message());
            }
            jsonWriter.name("waypoints");
            if (directionsResponse.waypoints() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<DirectionsWaypoint>> adapter3 = this.list__directionsWaypoint_adapter;
                if (adapter3 == null) {
                    adapter3 = this.gson.getAdapter(TypeToken.getParameterized(List.class, DirectionsWaypoint.class));
                    this.list__directionsWaypoint_adapter = adapter3;
                }
                adapter3.write(jsonWriter, directionsResponse.waypoints());
            }
            jsonWriter.name("routes");
            if (directionsResponse.routes() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<DirectionsRoute>> adapter4 = this.list__directionsRoute_adapter;
                if (adapter4 == null) {
                    adapter4 = this.gson.getAdapter(TypeToken.getParameterized(List.class, DirectionsRoute.class));
                    this.list__directionsRoute_adapter = adapter4;
                }
                adapter4.write(jsonWriter, directionsResponse.routes());
            }
            jsonWriter.name("uuid");
            if (directionsResponse.uuid() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter5 = this.string_adapter;
                if (adapter5 == null) {
                    adapter5 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter5;
                }
                adapter5.write(jsonWriter, directionsResponse.uuid());
            }
            jsonWriter.name("metadata");
            if (directionsResponse.metadata() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Metadata> adapter6 = this.metadata_adapter;
                if (adapter6 == null) {
                    adapter6 = this.gson.getAdapter(Metadata.class);
                    this.metadata_adapter = adapter6;
                }
                adapter6.write(jsonWriter, directionsResponse.metadata());
            }
            jsonWriter.endObject();
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public DirectionsResponse read2(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            LinkedHashMap linkedHashMap = null;
            String str = null;
            String str2 = null;
            List<DirectionsWaypoint> list = null;
            List<DirectionsRoute> list2 = null;
            String str3 = null;
            Metadata metadata = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    if ("code".equals(strNextName)) {
                        TypeAdapter<String> adapter = this.string_adapter;
                        if (adapter == null) {
                            adapter = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter;
                        }
                        str = adapter.read2(jsonReader);
                    } else if ("message".equals(strNextName)) {
                        TypeAdapter<String> adapter2 = this.string_adapter;
                        if (adapter2 == null) {
                            adapter2 = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter2;
                        }
                        str2 = adapter2.read2(jsonReader);
                    } else if ("waypoints".equals(strNextName)) {
                        TypeAdapter<List<DirectionsWaypoint>> adapter3 = this.list__directionsWaypoint_adapter;
                        if (adapter3 == null) {
                            adapter3 = this.gson.getAdapter(TypeToken.getParameterized(List.class, DirectionsWaypoint.class));
                            this.list__directionsWaypoint_adapter = adapter3;
                        }
                        list = adapter3.read2(jsonReader);
                    } else if ("routes".equals(strNextName)) {
                        TypeAdapter<List<DirectionsRoute>> adapter4 = this.list__directionsRoute_adapter;
                        if (adapter4 == null) {
                            adapter4 = this.gson.getAdapter(TypeToken.getParameterized(List.class, DirectionsRoute.class));
                            this.list__directionsRoute_adapter = adapter4;
                        }
                        list2 = adapter4.read2(jsonReader);
                    } else if ("uuid".equals(strNextName)) {
                        TypeAdapter<String> adapter5 = this.string_adapter;
                        if (adapter5 == null) {
                            adapter5 = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter5;
                        }
                        str3 = adapter5.read2(jsonReader);
                    } else if ("metadata".equals(strNextName)) {
                        TypeAdapter<Metadata> adapter6 = this.metadata_adapter;
                        if (adapter6 == null) {
                            adapter6 = this.gson.getAdapter(Metadata.class);
                            this.metadata_adapter = adapter6;
                        }
                        metadata = adapter6.read2(jsonReader);
                    } else {
                        if (linkedHashMap == null) {
                            linkedHashMap = new LinkedHashMap();
                        }
                        SweepGradientShader9KIMszodefault.serializer((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap, strNextName);
                    }
                }
            }
            jsonReader.endObject();
            String strConcat = str == null ? " code" : "";
            if (list2 == null) {
                strConcat = strConcat.concat(" routes");
            }
            if (strConcat.isEmpty()) {
                return new AutoValue_DirectionsResponse(linkedHashMap, str, str2, list, list2, str3, metadata);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties: ".concat(strConcat));
            return null;
        }
    }

    public AutoValue_DirectionsResponse(final Map<String, SerializableJsonElement> map, final String str, final String str2, final List<DirectionsWaypoint> list, final List<DirectionsRoute> list2, final String str3, final Metadata metadata) {
        new DirectionsResponse(map, str, str2, list, list2, str3, metadata) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_DirectionsResponse
            private final String code;
            private final String message;
            private final Metadata metadata;
            private final List<DirectionsRoute> routes;
            private final Map<String, SerializableJsonElement> unrecognized;
            private final String uuid;
            private final List<DirectionsWaypoint> waypoints;

            /* JADX INFO: renamed from: com.mapbox.api.directions.v5.models.$AutoValue_DirectionsResponse$Builder */
            public static class Builder extends DirectionsResponse.Builder {
                private String code;
                private String message;
                private Metadata metadata;
                private List<DirectionsRoute> routes;
                private Map<String, SerializableJsonElement> unrecognized;
                private String uuid;
                private List<DirectionsWaypoint> waypoints;

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public /* bridge */ /* synthetic */ DirectionsJsonObject.Builder unrecognized(Map map) {
                    return unrecognized((Map<String, SerializableJsonElement>) map);
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsResponse.Builder
                public String uuid() {
                    return this.uuid;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsResponse.Builder
                public DirectionsResponse.Builder routes(List<DirectionsRoute> list) {
                    if (list != null) {
                        this.routes = list;
                        return this;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null routes");
                    return null;
                }

                private Builder(DirectionsResponse directionsResponse) {
                    this.unrecognized = directionsResponse.unrecognized();
                    this.code = directionsResponse.code();
                    this.message = directionsResponse.message();
                    this.waypoints = directionsResponse.waypoints();
                    this.routes = directionsResponse.routes();
                    this.uuid = directionsResponse.uuid();
                    this.metadata = directionsResponse.metadata();
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public DirectionsResponse.Builder unrecognized(Map<String, SerializableJsonElement> map) {
                    this.unrecognized = map;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsResponse.Builder
                public DirectionsResponse autoBuild() {
                    String strConcat = this.code == null ? " code" : "";
                    if (this.routes == null) {
                        strConcat = strConcat.concat(" routes");
                    }
                    if (strConcat.isEmpty()) {
                        return new AutoValue_DirectionsResponse(this.unrecognized, this.code, this.message, this.waypoints, this.routes, this.uuid, this.metadata);
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties:".concat(strConcat));
                    return null;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsResponse.Builder
                public List<DirectionsRoute> routes() {
                    List<DirectionsRoute> list = this.routes;
                    if (list != null) {
                        return list;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Property \"routes\" has not been set");
                    return null;
                }
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsResponse
            public String code() {
                return this.code;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsResponse
            public String message() {
                return this.message;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsResponse
            public Metadata metadata() {
                return this.metadata;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsResponse
            public List<DirectionsRoute> routes() {
                return this.routes;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, SerializableJsonElement> unrecognized() {
                return this.unrecognized;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsResponse
            public String uuid() {
                return this.uuid;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsResponse
            public List<DirectionsWaypoint> waypoints() {
                return this.waypoints;
            }

            {
                this.unrecognized = map;
                if (str == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null code");
                    throw null;
                }
                this.code = str;
                this.message = str2;
                this.waypoints = list;
                if (list2 == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null routes");
                    throw null;
                }
                this.routes = list2;
                this.uuid = str3;
                this.metadata = metadata;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsResponse
            public DirectionsResponse.Builder toBuilder() {
                return new Builder(this);
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof DirectionsResponse)) {
                    return false;
                }
                DirectionsResponse directionsResponse = (DirectionsResponse) obj;
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                if (map2 == null) {
                    if (directionsResponse.unrecognized() != null) {
                        return false;
                    }
                } else if (!map2.equals(directionsResponse.unrecognized())) {
                    return false;
                }
                if (!this.code.equals(directionsResponse.code())) {
                    return false;
                }
                String str4 = this.message;
                if (str4 == null) {
                    if (directionsResponse.message() != null) {
                        return false;
                    }
                } else if (!str4.equals(directionsResponse.message())) {
                    return false;
                }
                List<DirectionsWaypoint> list3 = this.waypoints;
                if (list3 == null) {
                    if (directionsResponse.waypoints() != null) {
                        return false;
                    }
                } else if (!list3.equals(directionsResponse.waypoints())) {
                    return false;
                }
                if (!this.routes.equals(directionsResponse.routes())) {
                    return false;
                }
                String str5 = this.uuid;
                if (str5 == null) {
                    if (directionsResponse.uuid() != null) {
                        return false;
                    }
                } else if (!str5.equals(directionsResponse.uuid())) {
                    return false;
                }
                Metadata metadata2 = this.metadata;
                if (metadata2 == null) {
                    if (directionsResponse.metadata() != null) {
                        return false;
                    }
                } else if (!metadata2.equals(directionsResponse.metadata())) {
                    return false;
                }
                return true;
            }

            public String toString() {
                return "DirectionsResponse{unrecognized=" + this.unrecognized + ", code=" + this.code + ", message=" + this.message + ", waypoints=" + this.waypoints + ", routes=" + this.routes + ", uuid=" + this.uuid + ", metadata=" + this.metadata + "}";
            }

            public int hashCode() {
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                int iHashCode = map2 == null ? 0 : map2.hashCode();
                int iHashCode2 = this.code.hashCode();
                String str4 = this.message;
                int iHashCode3 = str4 == null ? 0 : str4.hashCode();
                List<DirectionsWaypoint> list3 = this.waypoints;
                int iHashCode4 = list3 == null ? 0 : list3.hashCode();
                int iHashCode5 = this.routes.hashCode();
                String str5 = this.uuid;
                int iHashCode6 = str5 == null ? 0 : str5.hashCode();
                Metadata metadata2 = this.metadata;
                return ((((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ iHashCode5) * 1000003) ^ iHashCode6) * 1000003) ^ (metadata2 != null ? metadata2.hashCode() : 0);
            }
        };
    }
}

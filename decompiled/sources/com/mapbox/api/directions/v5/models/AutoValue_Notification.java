package com.mapbox.api.directions.v5.models;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.api.directions.v5.DirectionsCriteria$NotificationsEvStationUnavailableReasonCriteria;
import com.mapbox.api.directions.v5.DirectionsCriteria$NotificationsRefreshTypeCriteria;
import com.mapbox.api.directions.v5.DirectionsCriteria$NotificationsSubtypeCriteria;
import com.mapbox.api.directions.v5.DirectionsCriteria$NotificationsTypeCriteria;
import com.mapbox.auto.value.gson.SerializableJsonElement;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import o.SweepGradientShader9KIMszodefault;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_Notification extends C$AutoValue_Notification {

    public static final class GsonTypeAdapter extends TypeAdapter<Notification> {
        private final Gson gson;
        private volatile TypeAdapter<Integer> integer_adapter;
        private volatile TypeAdapter<NotificationDetails> notificationDetails_adapter;
        private volatile TypeAdapter<String> string_adapter;

        public String toString() {
            return "TypeAdapter(Notification)";
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, Notification notification) throws IOException {
            if (notification == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (notification.unrecognized() != null) {
                for (Map.Entry<String, SerializableJsonElement> entry : notification.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().element;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name("type");
            if (notification.type() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter = this.string_adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter;
                }
                adapter.write(jsonWriter, notification.type());
            }
            jsonWriter.name("refresh_type");
            if (notification.refreshType() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter2 = this.string_adapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter2;
                }
                adapter2.write(jsonWriter, notification.refreshType());
            }
            jsonWriter.name("subtype");
            if (notification.subtype() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter3 = this.string_adapter;
                if (adapter3 == null) {
                    adapter3 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter3;
                }
                adapter3.write(jsonWriter, notification.subtype());
            }
            jsonWriter.name("geometry_index_start");
            if (notification.geometryIndexStart() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> adapter4 = this.integer_adapter;
                if (adapter4 == null) {
                    adapter4 = this.gson.getAdapter(Integer.class);
                    this.integer_adapter = adapter4;
                }
                adapter4.write(jsonWriter, notification.geometryIndexStart());
            }
            jsonWriter.name("geometry_index");
            if (notification.geometryIndex() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> adapter5 = this.integer_adapter;
                if (adapter5 == null) {
                    adapter5 = this.gson.getAdapter(Integer.class);
                    this.integer_adapter = adapter5;
                }
                adapter5.write(jsonWriter, notification.geometryIndex());
            }
            jsonWriter.name("geometry_index_end");
            if (notification.geometryIndexEnd() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> adapter6 = this.integer_adapter;
                if (adapter6 == null) {
                    adapter6 = this.gson.getAdapter(Integer.class);
                    this.integer_adapter = adapter6;
                }
                adapter6.write(jsonWriter, notification.geometryIndexEnd());
            }
            jsonWriter.name("details");
            if (notification.details() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<NotificationDetails> adapter7 = this.notificationDetails_adapter;
                if (adapter7 == null) {
                    adapter7 = this.gson.getAdapter(NotificationDetails.class);
                    this.notificationDetails_adapter = adapter7;
                }
                adapter7.write(jsonWriter, notification.details());
            }
            jsonWriter.name("reason");
            if (notification.reason() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter8 = this.string_adapter;
                if (adapter8 == null) {
                    adapter8 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter8;
                }
                adapter8.write(jsonWriter, notification.reason());
            }
            jsonWriter.name("station_id");
            if (notification.chargingStationId() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter9 = this.string_adapter;
                if (adapter9 == null) {
                    adapter9 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter9;
                }
                adapter9.write(jsonWriter, notification.chargingStationId());
            }
            jsonWriter.endObject();
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code duplicated, block: B:35:0x0078  */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public Notification read2(JsonReader jsonReader) throws IOException {
            String strConcat;
            byte b;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            LinkedHashMap linkedHashMap = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            NotificationDetails notificationDetails = null;
            String str4 = null;
            String str5 = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    switch (strNextName) {
                        case "station_id":
                            b = 0;
                            break;
                        case "refresh_type":
                            b = 1;
                            break;
                        case "geometry_index_start":
                            b = 2;
                            break;
                        case "geometry_index":
                            b = 3;
                            break;
                        case "geometry_index_end":
                            b = 4;
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    if (b == 0) {
                        TypeAdapter<String> adapter = this.string_adapter;
                        if (adapter == null) {
                            adapter = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter;
                        }
                        str5 = adapter.read2(jsonReader);
                    } else if (b == 1) {
                        TypeAdapter<String> adapter2 = this.string_adapter;
                        if (adapter2 == null) {
                            adapter2 = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter2;
                        }
                        str2 = adapter2.read2(jsonReader);
                    } else if (b == 2) {
                        TypeAdapter<Integer> adapter3 = this.integer_adapter;
                        if (adapter3 == null) {
                            adapter3 = this.gson.getAdapter(Integer.class);
                            this.integer_adapter = adapter3;
                        }
                        num = adapter3.read2(jsonReader);
                    } else if (b == 3) {
                        TypeAdapter<Integer> adapter4 = this.integer_adapter;
                        if (adapter4 == null) {
                            adapter4 = this.gson.getAdapter(Integer.class);
                            this.integer_adapter = adapter4;
                        }
                        num2 = adapter4.read2(jsonReader);
                    } else if (b != 4) {
                        if ("type".equals(strNextName)) {
                            TypeAdapter<String> adapter5 = this.string_adapter;
                            if (adapter5 == null) {
                                adapter5 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter5;
                            }
                            str = adapter5.read2(jsonReader);
                        } else if ("subtype".equals(strNextName)) {
                            TypeAdapter<String> adapter6 = this.string_adapter;
                            if (adapter6 == null) {
                                adapter6 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter6;
                            }
                            str3 = adapter6.read2(jsonReader);
                        } else if ("details".equals(strNextName)) {
                            TypeAdapter<NotificationDetails> adapter7 = this.notificationDetails_adapter;
                            if (adapter7 == null) {
                                adapter7 = this.gson.getAdapter(NotificationDetails.class);
                                this.notificationDetails_adapter = adapter7;
                            }
                            notificationDetails = adapter7.read2(jsonReader);
                        } else if ("reason".equals(strNextName)) {
                            TypeAdapter<String> adapter8 = this.string_adapter;
                            if (adapter8 == null) {
                                adapter8 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter8;
                            }
                            str4 = adapter8.read2(jsonReader);
                        } else {
                            if (linkedHashMap == null) {
                                linkedHashMap = new LinkedHashMap();
                            }
                            SweepGradientShader9KIMszodefault.serializer((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap, strNextName);
                        }
                    } else {
                        TypeAdapter<Integer> adapter9 = this.integer_adapter;
                        if (adapter9 == null) {
                            adapter9 = this.gson.getAdapter(Integer.class);
                            this.integer_adapter = adapter9;
                        }
                        num3 = adapter9.read2(jsonReader);
                    }
                }
            }
            jsonReader.endObject();
            if (str == null) {
                strConcat = " type";
            } else {
                strConcat = "";
            }
            if (str2 == null) {
                strConcat = strConcat.concat(" refreshType");
            }
            if (strConcat.isEmpty()) {
                return new AutoValue_Notification(linkedHashMap, str, str2, str3, num, num2, num3, notificationDetails, str4, str5);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties: ".concat(strConcat));
            return null;
        }
    }

    public AutoValue_Notification(final Map<String, SerializableJsonElement> map, final String str, final String str2, final String str3, final Integer num, final Integer num2, final Integer num3, final NotificationDetails notificationDetails, final String str4, final String str5) {
        new Notification(map, str, str2, str3, num, num2, num3, notificationDetails, str4, str5) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_Notification
            private final String chargingStationId;
            private final NotificationDetails details;
            private final Integer geometryIndex;
            private final Integer geometryIndexEnd;
            private final Integer geometryIndexStart;
            private final String reason;
            private final String refreshType;
            private final String subtype;
            private final String type;
            private final Map<String, SerializableJsonElement> unrecognized;

            @Override // com.mapbox.api.directions.v5.models.Notification
            @SerializedName("station_id")
            public String chargingStationId() {
                return this.chargingStationId;
            }

            @Override // com.mapbox.api.directions.v5.models.Notification
            public NotificationDetails details() {
                return this.details;
            }

            @Override // com.mapbox.api.directions.v5.models.Notification
            @SerializedName("geometry_index")
            public Integer geometryIndex() {
                return this.geometryIndex;
            }

            @Override // com.mapbox.api.directions.v5.models.Notification
            @SerializedName("geometry_index_end")
            public Integer geometryIndexEnd() {
                return this.geometryIndexEnd;
            }

            @Override // com.mapbox.api.directions.v5.models.Notification
            @SerializedName("geometry_index_start")
            public Integer geometryIndexStart() {
                return this.geometryIndexStart;
            }

            @Override // com.mapbox.api.directions.v5.models.Notification
            @DirectionsCriteria$NotificationsEvStationUnavailableReasonCriteria
            public String reason() {
                return this.reason;
            }

            @Override // com.mapbox.api.directions.v5.models.Notification
            @SerializedName("refresh_type")
            @DirectionsCriteria$NotificationsRefreshTypeCriteria
            public String refreshType() {
                return this.refreshType;
            }

            @Override // com.mapbox.api.directions.v5.models.Notification
            @DirectionsCriteria$NotificationsSubtypeCriteria
            public String subtype() {
                return this.subtype;
            }

            @Override // com.mapbox.api.directions.v5.models.Notification
            @DirectionsCriteria$NotificationsTypeCriteria
            public String type() {
                return this.type;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, SerializableJsonElement> unrecognized() {
                return this.unrecognized;
            }

            /* JADX INFO: renamed from: com.mapbox.api.directions.v5.models.$AutoValue_Notification$Builder */
            public static class Builder extends Notification.Builder {
                private String chargingStationId;
                private NotificationDetails details;
                private Integer geometryIndex;
                private Integer geometryIndexEnd;
                private Integer geometryIndexStart;
                private String reason;
                private String refreshType;
                private String subtype;
                private String type;
                private Map<String, SerializableJsonElement> unrecognized;

                @Override // com.mapbox.api.directions.v5.models.Notification.Builder
                public Notification.Builder geometryIndex(Integer num) {
                    this.geometryIndex = num;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.Notification.Builder
                public Notification.Builder geometryIndexEnd(Integer num) {
                    this.geometryIndexEnd = num;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.Notification.Builder
                public Notification.Builder geometryIndexStart(Integer num) {
                    this.geometryIndexStart = num;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public /* bridge */ /* synthetic */ DirectionsJsonObject.Builder unrecognized(Map map) {
                    return unrecognized((Map<String, SerializableJsonElement>) map);
                }

                private Builder(Notification notification) {
                    this.unrecognized = notification.unrecognized();
                    this.type = notification.type();
                    this.refreshType = notification.refreshType();
                    this.subtype = notification.subtype();
                    this.geometryIndexStart = notification.geometryIndexStart();
                    this.geometryIndex = notification.geometryIndex();
                    this.geometryIndexEnd = notification.geometryIndexEnd();
                    this.details = notification.details();
                    this.reason = notification.reason();
                    this.chargingStationId = notification.chargingStationId();
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public Notification.Builder unrecognized(Map<String, SerializableJsonElement> map) {
                    this.unrecognized = map;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.Notification.Builder
                public Notification build() {
                    String strConcat = this.type == null ? " type" : "";
                    if (this.refreshType == null) {
                        strConcat = strConcat.concat(" refreshType");
                    }
                    if (strConcat.isEmpty()) {
                        return new AutoValue_Notification(this.unrecognized, this.type, this.refreshType, this.subtype, this.geometryIndexStart, this.geometryIndex, this.geometryIndexEnd, this.details, this.reason, this.chargingStationId);
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties:".concat(strConcat));
                    return null;
                }
            }

            {
                this.unrecognized = map;
                if (str == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null type");
                    throw null;
                }
                this.type = str;
                if (str2 == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null refreshType");
                    throw null;
                }
                this.refreshType = str2;
                this.subtype = str3;
                this.geometryIndexStart = num;
                this.geometryIndex = num2;
                this.geometryIndexEnd = num3;
                this.details = notificationDetails;
                this.reason = str4;
                this.chargingStationId = str5;
            }

            @Override // com.mapbox.api.directions.v5.models.Notification
            public Notification.Builder toBuilder() {
                return new Builder(this);
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Notification)) {
                    return false;
                }
                Notification notification = (Notification) obj;
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                if (map2 == null) {
                    if (notification.unrecognized() != null) {
                        return false;
                    }
                } else if (!map2.equals(notification.unrecognized())) {
                    return false;
                }
                if (!this.type.equals(notification.type()) || !this.refreshType.equals(notification.refreshType())) {
                    return false;
                }
                String str6 = this.subtype;
                if (str6 == null) {
                    if (notification.subtype() != null) {
                        return false;
                    }
                } else if (!str6.equals(notification.subtype())) {
                    return false;
                }
                Integer num4 = this.geometryIndexStart;
                if (num4 == null) {
                    if (notification.geometryIndexStart() != null) {
                        return false;
                    }
                } else if (!num4.equals(notification.geometryIndexStart())) {
                    return false;
                }
                Integer num5 = this.geometryIndex;
                if (num5 == null) {
                    if (notification.geometryIndex() != null) {
                        return false;
                    }
                } else if (!num5.equals(notification.geometryIndex())) {
                    return false;
                }
                Integer num6 = this.geometryIndexEnd;
                if (num6 == null) {
                    if (notification.geometryIndexEnd() != null) {
                        return false;
                    }
                } else if (!num6.equals(notification.geometryIndexEnd())) {
                    return false;
                }
                NotificationDetails notificationDetails2 = this.details;
                if (notificationDetails2 == null) {
                    if (notification.details() != null) {
                        return false;
                    }
                } else if (!notificationDetails2.equals(notification.details())) {
                    return false;
                }
                String str7 = this.reason;
                if (str7 == null) {
                    if (notification.reason() != null) {
                        return false;
                    }
                } else if (!str7.equals(notification.reason())) {
                    return false;
                }
                String str8 = this.chargingStationId;
                if (str8 == null) {
                    if (notification.chargingStationId() != null) {
                        return false;
                    }
                } else if (!str8.equals(notification.chargingStationId())) {
                    return false;
                }
                return true;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("Notification{unrecognized=");
                sb.append(this.unrecognized);
                sb.append(", type=");
                sb.append(this.type);
                sb.append(", refreshType=");
                sb.append(this.refreshType);
                sb.append(", subtype=");
                sb.append(this.subtype);
                sb.append(", geometryIndexStart=");
                sb.append(this.geometryIndexStart);
                sb.append(", geometryIndex=");
                sb.append(this.geometryIndex);
                sb.append(", geometryIndexEnd=");
                sb.append(this.geometryIndexEnd);
                sb.append(", details=");
                sb.append(this.details);
                sb.append(", reason=");
                sb.append(this.reason);
                sb.append(", chargingStationId=");
                return ff$$ExternalSyntheticOutline0.m(sb, this.chargingStationId, "}");
            }

            public int hashCode() {
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                int iHashCode = map2 == null ? 0 : map2.hashCode();
                int iHashCode2 = this.type.hashCode();
                int iHashCode3 = this.refreshType.hashCode();
                String str6 = this.subtype;
                int iHashCode4 = str6 == null ? 0 : str6.hashCode();
                Integer num4 = this.geometryIndexStart;
                int iHashCode5 = num4 == null ? 0 : num4.hashCode();
                Integer num5 = this.geometryIndex;
                int iHashCode6 = num5 == null ? 0 : num5.hashCode();
                Integer num6 = this.geometryIndexEnd;
                int iHashCode7 = num6 == null ? 0 : num6.hashCode();
                NotificationDetails notificationDetails2 = this.details;
                int iHashCode8 = notificationDetails2 == null ? 0 : notificationDetails2.hashCode();
                String str7 = this.reason;
                int iHashCode9 = str7 == null ? 0 : str7.hashCode();
                String str8 = this.chargingStationId;
                return ((((((((((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ iHashCode5) * 1000003) ^ iHashCode6) * 1000003) ^ iHashCode7) * 1000003) ^ iHashCode8) * 1000003) ^ iHashCode9) * 1000003) ^ (str8 != null ? str8.hashCode() : 0);
            }
        };
    }
}

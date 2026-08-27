package com.mapbox.api.directions.v5.models;

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
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_BannerInstructions extends C$AutoValue_BannerInstructions {

    public static final class GsonTypeAdapter extends TypeAdapter<BannerInstructions> {
        private volatile TypeAdapter<BannerText> bannerText_adapter;
        private volatile TypeAdapter<BannerView> bannerView_adapter;
        private volatile TypeAdapter<Double> double__adapter;
        private final Gson gson;

        public String toString() {
            return "TypeAdapter(BannerInstructions)";
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, BannerInstructions bannerInstructions) throws IOException {
            if (bannerInstructions == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (bannerInstructions.unrecognized() != null) {
                for (Map.Entry<String, SerializableJsonElement> entry : bannerInstructions.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().element;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name("distanceAlongGeometry");
            TypeAdapter<Double> adapter = this.double__adapter;
            if (adapter == null) {
                adapter = this.gson.getAdapter(Double.class);
                this.double__adapter = adapter;
            }
            adapter.write(jsonWriter, Double.valueOf(bannerInstructions.distanceAlongGeometry()));
            jsonWriter.name("primary");
            if (bannerInstructions.primary() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<BannerText> adapter2 = this.bannerText_adapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(BannerText.class);
                    this.bannerText_adapter = adapter2;
                }
                adapter2.write(jsonWriter, bannerInstructions.primary());
            }
            jsonWriter.name("secondary");
            if (bannerInstructions.secondary() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<BannerText> adapter3 = this.bannerText_adapter;
                if (adapter3 == null) {
                    adapter3 = this.gson.getAdapter(BannerText.class);
                    this.bannerText_adapter = adapter3;
                }
                adapter3.write(jsonWriter, bannerInstructions.secondary());
            }
            jsonWriter.name("sub");
            if (bannerInstructions.sub() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<BannerText> adapter4 = this.bannerText_adapter;
                if (adapter4 == null) {
                    adapter4 = this.gson.getAdapter(BannerText.class);
                    this.bannerText_adapter = adapter4;
                }
                adapter4.write(jsonWriter, bannerInstructions.sub());
            }
            jsonWriter.name("view");
            if (bannerInstructions.view() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<BannerView> adapter5 = this.bannerView_adapter;
                if (adapter5 == null) {
                    adapter5 = this.gson.getAdapter(BannerView.class);
                    this.bannerView_adapter = adapter5;
                }
                adapter5.write(jsonWriter, bannerInstructions.view());
            }
            jsonWriter.endObject();
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public BannerInstructions read2(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            boolean z = true;
            BannerText bannerText = null;
            BannerText bannerText2 = null;
            BannerText bannerText3 = null;
            BannerView bannerView = null;
            double dDoubleValue = 0.0d;
            LinkedHashMap linkedHashMap = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    if ("distanceAlongGeometry".equals(strNextName)) {
                        TypeAdapter<Double> adapter = this.double__adapter;
                        if (adapter == null) {
                            adapter = this.gson.getAdapter(Double.class);
                            this.double__adapter = adapter;
                        }
                        dDoubleValue = adapter.read2(jsonReader).doubleValue();
                        z = false;
                    } else if ("primary".equals(strNextName)) {
                        TypeAdapter<BannerText> adapter2 = this.bannerText_adapter;
                        if (adapter2 == null) {
                            adapter2 = this.gson.getAdapter(BannerText.class);
                            this.bannerText_adapter = adapter2;
                        }
                        bannerText = adapter2.read2(jsonReader);
                    } else if ("secondary".equals(strNextName)) {
                        TypeAdapter<BannerText> adapter3 = this.bannerText_adapter;
                        if (adapter3 == null) {
                            adapter3 = this.gson.getAdapter(BannerText.class);
                            this.bannerText_adapter = adapter3;
                        }
                        bannerText2 = adapter3.read2(jsonReader);
                    } else if ("sub".equals(strNextName)) {
                        TypeAdapter<BannerText> adapter4 = this.bannerText_adapter;
                        if (adapter4 == null) {
                            adapter4 = this.gson.getAdapter(BannerText.class);
                            this.bannerText_adapter = adapter4;
                        }
                        bannerText3 = adapter4.read2(jsonReader);
                    } else if ("view".equals(strNextName)) {
                        TypeAdapter<BannerView> adapter5 = this.bannerView_adapter;
                        if (adapter5 == null) {
                            adapter5 = this.gson.getAdapter(BannerView.class);
                            this.bannerView_adapter = adapter5;
                        }
                        bannerView = adapter5.read2(jsonReader);
                    } else {
                        if (linkedHashMap == null) {
                            linkedHashMap = new LinkedHashMap();
                        }
                        SweepGradientShader9KIMszodefault.serializer((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap, strNextName);
                    }
                }
            }
            jsonReader.endObject();
            String strConcat = z ? " distanceAlongGeometry" : "";
            if (bannerText == null) {
                strConcat = strConcat.concat(" primary");
            }
            if (strConcat.isEmpty()) {
                return new AutoValue_BannerInstructions(linkedHashMap, dDoubleValue, bannerText, bannerText2, bannerText3, bannerView);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties: ".concat(strConcat));
            return null;
        }
    }

    public AutoValue_BannerInstructions(Map<String, SerializableJsonElement> map, double d, BannerText bannerText, BannerText bannerText2, BannerText bannerText3, BannerView bannerView) {
        new BannerInstructions(map, d, bannerText, bannerText2, bannerText3, bannerView) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_BannerInstructions
            private final double distanceAlongGeometry;
            private final BannerText primary;
            private final BannerText secondary;
            private final BannerText sub;
            private final Map<String, SerializableJsonElement> unrecognized;
            private final BannerView view;

            /* JADX INFO: renamed from: com.mapbox.api.directions.v5.models.$AutoValue_BannerInstructions$Builder */
            /* JADX INFO: loaded from: classes4.dex */
            public static class Builder extends BannerInstructions.Builder {
                private Double distanceAlongGeometry;
                private BannerText primary;
                private BannerText secondary;
                private BannerText sub;
                private Map<String, SerializableJsonElement> unrecognized;
                private BannerView view;

                @Override // com.mapbox.api.directions.v5.models.BannerInstructions.Builder
                public BannerInstructions.Builder secondary(BannerText bannerText) {
                    this.secondary = bannerText;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.BannerInstructions.Builder
                public BannerInstructions.Builder sub(BannerText bannerText) {
                    this.sub = bannerText;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public /* bridge */ /* synthetic */ DirectionsJsonObject.Builder unrecognized(Map map) {
                    return unrecognized((Map<String, SerializableJsonElement>) map);
                }

                @Override // com.mapbox.api.directions.v5.models.BannerInstructions.Builder
                public BannerInstructions.Builder view(BannerView bannerView) {
                    this.view = bannerView;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.BannerInstructions.Builder
                public BannerInstructions.Builder primary(BannerText bannerText) {
                    if (bannerText != null) {
                        this.primary = bannerText;
                        return this;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null primary");
                    return null;
                }

                private Builder(BannerInstructions bannerInstructions) {
                    this.unrecognized = bannerInstructions.unrecognized();
                    this.distanceAlongGeometry = Double.valueOf(bannerInstructions.distanceAlongGeometry());
                    this.primary = bannerInstructions.primary();
                    this.secondary = bannerInstructions.secondary();
                    this.sub = bannerInstructions.sub();
                    this.view = bannerInstructions.view();
                }

                @Override // com.mapbox.api.directions.v5.models.BannerInstructions.Builder
                public BannerInstructions.Builder distanceAlongGeometry(double d) {
                    this.distanceAlongGeometry = Double.valueOf(d);
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public BannerInstructions.Builder unrecognized(Map<String, SerializableJsonElement> map) {
                    this.unrecognized = map;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.BannerInstructions.Builder
                public BannerInstructions build() {
                    String strConcat = this.distanceAlongGeometry == null ? " distanceAlongGeometry" : "";
                    if (this.primary == null) {
                        strConcat = strConcat.concat(" primary");
                    }
                    if (strConcat.isEmpty()) {
                        return new AutoValue_BannerInstructions(this.unrecognized, this.distanceAlongGeometry.doubleValue(), this.primary, this.secondary, this.sub, this.view);
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties:".concat(strConcat));
                    return null;
                }

                public Builder() {
                }
            }

            @Override // com.mapbox.api.directions.v5.models.BannerInstructions
            public double distanceAlongGeometry() {
                return this.distanceAlongGeometry;
            }

            @Override // com.mapbox.api.directions.v5.models.BannerInstructions
            public BannerText primary() {
                return this.primary;
            }

            @Override // com.mapbox.api.directions.v5.models.BannerInstructions
            public BannerText secondary() {
                return this.secondary;
            }

            @Override // com.mapbox.api.directions.v5.models.BannerInstructions
            public BannerText sub() {
                return this.sub;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, SerializableJsonElement> unrecognized() {
                return this.unrecognized;
            }

            @Override // com.mapbox.api.directions.v5.models.BannerInstructions
            public BannerView view() {
                return this.view;
            }

            {
                this.unrecognized = map;
                this.distanceAlongGeometry = d;
                if (bannerText == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null primary");
                    throw null;
                }
                this.primary = bannerText;
                this.secondary = bannerText2;
                this.sub = bannerText3;
                this.view = bannerView;
            }

            @Override // com.mapbox.api.directions.v5.models.BannerInstructions
            public BannerInstructions.Builder toBuilder() {
                return new Builder(this);
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof BannerInstructions)) {
                    return false;
                }
                BannerInstructions bannerInstructions = (BannerInstructions) obj;
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                if (map2 == null) {
                    if (bannerInstructions.unrecognized() != null) {
                        return false;
                    }
                } else if (!map2.equals(bannerInstructions.unrecognized())) {
                    return false;
                }
                if (Double.doubleToLongBits(this.distanceAlongGeometry) != Double.doubleToLongBits(bannerInstructions.distanceAlongGeometry()) || !this.primary.equals(bannerInstructions.primary())) {
                    return false;
                }
                BannerText bannerText4 = this.secondary;
                if (bannerText4 == null) {
                    if (bannerInstructions.secondary() != null) {
                        return false;
                    }
                } else if (!bannerText4.equals(bannerInstructions.secondary())) {
                    return false;
                }
                BannerText bannerText5 = this.sub;
                if (bannerText5 == null) {
                    if (bannerInstructions.sub() != null) {
                        return false;
                    }
                } else if (!bannerText5.equals(bannerInstructions.sub())) {
                    return false;
                }
                BannerView bannerView2 = this.view;
                if (bannerView2 == null) {
                    if (bannerInstructions.view() != null) {
                        return false;
                    }
                } else if (!bannerView2.equals(bannerInstructions.view())) {
                    return false;
                }
                return true;
            }

            public String toString() {
                return "BannerInstructions{unrecognized=" + this.unrecognized + ", distanceAlongGeometry=" + this.distanceAlongGeometry + ", primary=" + this.primary + ", secondary=" + this.secondary + ", sub=" + this.sub + ", view=" + this.view + "}";
            }

            public int hashCode() {
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                int iHashCode = map2 == null ? 0 : map2.hashCode();
                int iDoubleToLongBits = (int) ((Double.doubleToLongBits(this.distanceAlongGeometry) >>> 32) ^ Double.doubleToLongBits(this.distanceAlongGeometry));
                int iHashCode2 = this.primary.hashCode();
                BannerText bannerText4 = this.secondary;
                int iHashCode3 = bannerText4 == null ? 0 : bannerText4.hashCode();
                BannerText bannerText5 = this.sub;
                int iHashCode4 = bannerText5 == null ? 0 : bannerText5.hashCode();
                BannerView bannerView2 = this.view;
                return ((((((((((iHashCode ^ 1000003) * 1000003) ^ iDoubleToLongBits) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ (bannerView2 != null ? bannerView2.hashCode() : 0);
            }
        };
    }
}

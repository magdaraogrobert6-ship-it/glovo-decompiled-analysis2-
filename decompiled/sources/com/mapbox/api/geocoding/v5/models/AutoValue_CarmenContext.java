package com.mapbox.api.geocoding.v5.models;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class AutoValue_CarmenContext implements Serializable {
    public final String category;
    public final String id;
    public final String maki;
    public final String shortCode;
    public final String text;
    public final String wikidata;

    final class GsonTypeAdapter extends TypeAdapter<AutoValue_CarmenContext> {
        public final Gson gson;
        public volatile TypeAdapter string_adapter;

        public final String toString() {
            return "TypeAdapter(CarmenContext)";
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public final AutoValue_CarmenContext read2(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    if (strNextName.equals("short_code")) {
                        TypeAdapter adapter = this.string_adapter;
                        if (adapter == null) {
                            adapter = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter;
                        }
                        str3 = (String) adapter.read2(jsonReader);
                    } else if ("id".equals(strNextName)) {
                        TypeAdapter adapter2 = this.string_adapter;
                        if (adapter2 == null) {
                            adapter2 = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter2;
                        }
                        str = (String) adapter2.read2(jsonReader);
                    } else if ("text".equals(strNextName)) {
                        TypeAdapter adapter3 = this.string_adapter;
                        if (adapter3 == null) {
                            adapter3 = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter3;
                        }
                        str2 = (String) adapter3.read2(jsonReader);
                    } else if ("wikidata".equals(strNextName)) {
                        TypeAdapter adapter4 = this.string_adapter;
                        if (adapter4 == null) {
                            adapter4 = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter4;
                        }
                        str4 = (String) adapter4.read2(jsonReader);
                    } else if ("category".equals(strNextName)) {
                        TypeAdapter adapter5 = this.string_adapter;
                        if (adapter5 == null) {
                            adapter5 = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter5;
                        }
                        str5 = (String) adapter5.read2(jsonReader);
                    } else if ("maki".equals(strNextName)) {
                        TypeAdapter adapter6 = this.string_adapter;
                        if (adapter6 == null) {
                            adapter6 = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter6;
                        }
                        str6 = (String) adapter6.read2(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_CarmenContext(str, str2, str3, str4, str5, str6);
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, AutoValue_CarmenContext autoValue_CarmenContext) throws IOException {
            AutoValue_CarmenContext autoValue_CarmenContext2 = autoValue_CarmenContext;
            if (autoValue_CarmenContext2 == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("id");
            if (autoValue_CarmenContext2.id == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter = this.string_adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter;
                }
                adapter.write(jsonWriter, autoValue_CarmenContext2.id);
            }
            jsonWriter.name("text");
            if (autoValue_CarmenContext2.text == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter2 = this.string_adapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter2;
                }
                adapter2.write(jsonWriter, autoValue_CarmenContext2.text);
            }
            jsonWriter.name("short_code");
            if (autoValue_CarmenContext2.shortCode == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter3 = this.string_adapter;
                if (adapter3 == null) {
                    adapter3 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter3;
                }
                adapter3.write(jsonWriter, autoValue_CarmenContext2.shortCode);
            }
            jsonWriter.name("wikidata");
            if (autoValue_CarmenContext2.wikidata == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter4 = this.string_adapter;
                if (adapter4 == null) {
                    adapter4 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter4;
                }
                adapter4.write(jsonWriter, autoValue_CarmenContext2.wikidata);
            }
            jsonWriter.name("category");
            if (autoValue_CarmenContext2.category == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter5 = this.string_adapter;
                if (adapter5 == null) {
                    adapter5 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter5;
                }
                adapter5.write(jsonWriter, autoValue_CarmenContext2.category);
            }
            jsonWriter.name("maki");
            if (autoValue_CarmenContext2.maki == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter6 = this.string_adapter;
                if (adapter6 == null) {
                    adapter6 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter6;
                }
                adapter6.write(jsonWriter, autoValue_CarmenContext2.maki);
            }
            jsonWriter.endObject();
        }
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.text;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.shortCode;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.wikidata;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.category;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.maki;
        return ((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ iHashCode5) * 1000003) ^ (str6 != null ? str6.hashCode() : 0);
    }

    public static TypeAdapter typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
    }

    public AutoValue_CarmenContext(String str, String str2, String str3, String str4, String str5, String str6) {
        this.id = str;
        this.text = str2;
        this.shortCode = str3;
        this.wikidata = str4;
        this.category = str5;
        this.maki = str6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoValue_CarmenContext)) {
            return false;
        }
        AutoValue_CarmenContext autoValue_CarmenContext = (AutoValue_CarmenContext) obj;
        String str = this.id;
        if (str == null) {
            if (autoValue_CarmenContext.id != null) {
                return false;
            }
        } else if (!str.equals(autoValue_CarmenContext.id)) {
            return false;
        }
        String str2 = this.text;
        if (str2 == null) {
            if (autoValue_CarmenContext.text != null) {
                return false;
            }
        } else if (!str2.equals(autoValue_CarmenContext.text)) {
            return false;
        }
        String str3 = this.shortCode;
        if (str3 == null) {
            if (autoValue_CarmenContext.shortCode != null) {
                return false;
            }
        } else if (!str3.equals(autoValue_CarmenContext.shortCode)) {
            return false;
        }
        String str4 = this.wikidata;
        if (str4 == null) {
            if (autoValue_CarmenContext.wikidata != null) {
                return false;
            }
        } else if (!str4.equals(autoValue_CarmenContext.wikidata)) {
            return false;
        }
        String str5 = this.category;
        if (str5 == null) {
            if (autoValue_CarmenContext.category != null) {
                return false;
            }
        } else if (!str5.equals(autoValue_CarmenContext.category)) {
            return false;
        }
        String str6 = this.maki;
        if (str6 == null) {
            if (autoValue_CarmenContext.maki != null) {
                return false;
            }
        } else if (!str6.equals(autoValue_CarmenContext.maki)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CarmenContext{id=");
        sb.append(this.id);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", shortCode=");
        sb.append(this.shortCode);
        sb.append(", wikidata=");
        sb.append(this.wikidata);
        sb.append(", category=");
        sb.append(this.category);
        sb.append(", maki=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.maki, "}");
    }
}

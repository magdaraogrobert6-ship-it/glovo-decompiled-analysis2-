package com.mapbox.api.matching.v5.models;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class AutoValue_MapMatchingError implements Serializable {
    public final String code;
    public final String message;

    final class GsonTypeAdapter extends TypeAdapter<AutoValue_MapMatchingError> {
        public final Gson gson;
        public volatile TypeAdapter string_adapter;

        public final String toString() {
            return "TypeAdapter(MapMatchingError)";
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public final AutoValue_MapMatchingError read2(JsonReader jsonReader) throws IOException {
            String str = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str2 = null;
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
                    } else if ("message".equals(strNextName)) {
                        TypeAdapter adapter2 = this.string_adapter;
                        if (adapter2 == null) {
                            adapter2 = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter2;
                        }
                        str2 = (String) adapter2.read2(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_MapMatchingError(str, str2);
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, AutoValue_MapMatchingError autoValue_MapMatchingError) throws IOException {
            AutoValue_MapMatchingError autoValue_MapMatchingError2 = autoValue_MapMatchingError;
            if (autoValue_MapMatchingError2 == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("code");
            if (autoValue_MapMatchingError2.code == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter = this.string_adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter;
                }
                adapter.write(jsonWriter, autoValue_MapMatchingError2.code);
            }
            jsonWriter.name("message");
            if (autoValue_MapMatchingError2.message == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter2 = this.string_adapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter2;
                }
                adapter2.write(jsonWriter, autoValue_MapMatchingError2.message);
            }
            jsonWriter.endObject();
        }
    }

    public final int hashCode() {
        String str = this.code;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.message;
        return ((iHashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public static TypeAdapter typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
    }

    public AutoValue_MapMatchingError(String str, String str2) {
        this.code = str;
        this.message = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoValue_MapMatchingError)) {
            return false;
        }
        AutoValue_MapMatchingError autoValue_MapMatchingError = (AutoValue_MapMatchingError) obj;
        String str = this.code;
        if (str == null) {
            if (autoValue_MapMatchingError.code != null) {
                return false;
            }
        } else if (!str.equals(autoValue_MapMatchingError.code)) {
            return false;
        }
        String str2 = this.message;
        if (str2 == null) {
            if (autoValue_MapMatchingError.message != null) {
                return false;
            }
        } else if (!str2.equals(autoValue_MapMatchingError.message)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MapMatchingError{code=");
        sb.append(this.code);
        sb.append(", message=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.message, "}");
    }
}

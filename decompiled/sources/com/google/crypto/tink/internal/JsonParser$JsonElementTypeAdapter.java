package com.google.crypto.tink.internal;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayDeque;
import o.LayerPositionalProperties;
import o.LayoutAwareModifierNode;
import o.copyFrom;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;

/* JADX INFO: loaded from: classes4.dex */
public final class JsonParser$JsonElementTypeAdapter extends TypeAdapter<JsonElement> {
    private JsonParser$JsonElementTypeAdapter() {
    }

    public static JsonElement IconCompatParcelizer(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
        int i = copyFrom.IconCompatParcelizer[jsonToken.ordinal()];
        if (i == 1) {
            jsonReader.beginArray();
            return new JsonArray();
        }
        if (i != 2) {
            return null;
        }
        jsonReader.beginObject();
        return new JsonObject();
    }

    public static JsonElement serializer(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
        int i = copyFrom.IconCompatParcelizer[jsonToken.ordinal()];
        if (i == 3) {
            String strNextString = jsonReader.nextString();
            if (LayerPositionalProperties.serializer(strNextString)) {
                return new JsonPrimitive(strNextString);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("illegal characters in string");
            return null;
        }
        if (i == 4) {
            return new JsonPrimitive(new LayoutAwareModifierNode(jsonReader.nextString()));
        }
        if (i == 5) {
            return new JsonPrimitive(Boolean.valueOf(jsonReader.nextBoolean()));
        }
        if (i == 6) {
            jsonReader.nextNull();
            return JsonNull.INSTANCE;
        }
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(jsonToken, "Unexpected token: ");
        return null;
    }

    public /* synthetic */ JsonParser$JsonElementTypeAdapter(int i) {
        this();
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: read */
    public final JsonElement read2(JsonReader jsonReader) throws IOException {
        String strNextName;
        JsonToken jsonTokenPeek = jsonReader.peek();
        JsonElement jsonElementIconCompatParcelizer = IconCompatParcelizer(jsonReader, jsonTokenPeek);
        if (jsonElementIconCompatParcelizer == null) {
            return serializer(jsonReader, jsonTokenPeek);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (jsonReader.hasNext()) {
                if (jsonElementIconCompatParcelizer instanceof JsonObject) {
                    strNextName = jsonReader.nextName();
                    if (!LayerPositionalProperties.serializer(strNextName)) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("illegal characters in string");
                        return null;
                    }
                } else {
                    strNextName = null;
                }
                JsonToken jsonTokenPeek2 = jsonReader.peek();
                JsonElement jsonElementIconCompatParcelizer2 = IconCompatParcelizer(jsonReader, jsonTokenPeek2);
                boolean z = jsonElementIconCompatParcelizer2 != null;
                JsonElement jsonElementSerializer = jsonElementIconCompatParcelizer2 == null ? serializer(jsonReader, jsonTokenPeek2) : jsonElementIconCompatParcelizer2;
                if (jsonElementIconCompatParcelizer instanceof JsonArray) {
                    ((JsonArray) jsonElementIconCompatParcelizer).add(jsonElementSerializer);
                } else {
                    JsonObject jsonObject = (JsonObject) jsonElementIconCompatParcelizer;
                    if (jsonObject.has(strNextName)) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("duplicate key: ", strNextName));
                        return null;
                    }
                    jsonObject.add(strNextName, jsonElementSerializer);
                }
                if (z) {
                    arrayDeque.addLast(jsonElementIconCompatParcelizer);
                    if (arrayDeque.size() > 100) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("too many recursions");
                        return null;
                    }
                    jsonElementIconCompatParcelizer = jsonElementSerializer;
                } else {
                    continue;
                }
            } else {
                if (jsonElementIconCompatParcelizer instanceof JsonArray) {
                    jsonReader.endArray();
                } else {
                    jsonReader.endObject();
                }
                if (arrayDeque.isEmpty()) {
                    return jsonElementIconCompatParcelizer;
                }
                jsonElementIconCompatParcelizer = (JsonElement) arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, JsonElement jsonElement) {
        throw new UnsupportedOperationException("write is not supported");
    }
}

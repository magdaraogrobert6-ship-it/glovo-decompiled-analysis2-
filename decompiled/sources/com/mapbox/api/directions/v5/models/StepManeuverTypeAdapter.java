package com.mapbox.api.directions.v5.models;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class StepManeuverTypeAdapter extends TypeAdapter<StepManeuver> {
    private final TypeAdapter<StepManeuver> defaultAdapter;

    public StepManeuverTypeAdapter(TypeAdapter<StepManeuver> typeAdapter) {
        this.defaultAdapter = typeAdapter;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Code duplicated, block: B:43:0x0099  */
    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: read */
    public StepManeuver read2(JsonReader jsonReader) throws IOException {
        LinkedHashMap linkedHashMap = null;
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        JsonObject asJsonObject = JsonParser.parseReader(jsonReader).getAsJsonObject();
        StepManeuver.Builder builder = StepManeuver.builder();
        for (Map.Entry<String, JsonElement> entry : asJsonObject.entrySet()) {
            String key = entry.getKey();
            JsonElement value = entry.getValue();
            if (!value.isJsonNull()) {
                key.getClass();
                switch (key) {
                    case "bearing_before":
                        builder.bearingBefore(Double.valueOf(value.getAsDouble()));
                        break;
                    case "modifier":
                        builder.modifier(value.getAsString().intern());
                        break;
                    case "bearing_after":
                        builder.bearingAfter(Double.valueOf(value.getAsDouble()));
                        break;
                    case "exit":
                        builder.exit(Integer.valueOf(value.getAsInt()));
                        break;
                    case "type":
                        builder.type(value.getAsString().intern());
                        break;
                    case "instruction":
                        builder.instruction(value.getAsString());
                        break;
                    case "location":
                        JsonArray asJsonArray = value.getAsJsonArray();
                        double[] dArr = new double[asJsonArray.size()];
                        for (int i = 0; i < asJsonArray.size(); i++) {
                            dArr[i] = asJsonArray.get(i).getAsDouble();
                        }
                        builder.rawLocation(dArr);
                        break;
                    default:
                        if (linkedHashMap == null) {
                            linkedHashMap = new LinkedHashMap();
                        }
                        linkedHashMap.put(key, value);
                        break;
                }
            }
        }
        return builder.unrecognizedJsonProperties(linkedHashMap).build();
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, StepManeuver stepManeuver) throws IOException {
        this.defaultAdapter.write(jsonWriter, stepManeuver);
    }
}

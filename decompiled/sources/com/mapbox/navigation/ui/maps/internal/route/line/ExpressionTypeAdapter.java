package com.mapbox.navigation.ui.maps.internal.route.line;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxStyleException;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.utils.TypeUtilsKt;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class ExpressionTypeAdapter extends TypeAdapter<Expression> {
    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Expression expression) throws IOException {
        Expression expression2 = expression;
        jsonWriter.getClass();
        jsonWriter.value(expression2 != null ? expression2.toJson() : null);
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: read */
    public final Expression read2(JsonReader jsonReader) throws IOException {
        jsonReader.getClass();
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        String strNextString = jsonReader.nextString();
        strNextString.getClass();
        Expected<String, Value> expectedFromJson = Value.fromJson(strNextString);
        if (expectedFromJson != null) {
            String error = expectedFromJson.getError();
            if (error != null) {
                throw new MapboxStyleException(error);
            }
            Value value = expectedFromJson.getValue();
            if (value != null) {
                return TypeUtilsKt.unwrapToExpression(value);
            }
        }
        throw new MapboxStyleException("Plugin is not added to Style yet.");
    }
}

package com.data.data.serialization;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import org.joda.time.DateTime;
import org.joda.time.format.ISODateTimeFormat;

/* JADX INFO: loaded from: classes.dex */
public final class DateTimeConverter implements JsonSerializer<DateTime>, JsonDeserializer<DateTime> {
    @Override // com.google.gson.JsonSerializer
    public final JsonElement serialize(DateTime dateTime, Type type, JsonSerializationContext jsonSerializationContext) {
        return new JsonPrimitive(ISODateTimeFormat.dateTime().print(dateTime));
    }

    @Override // com.google.gson.JsonDeserializer
    public final DateTime deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        jsonElement.getClass();
        type.getClass();
        jsonDeserializationContext.getClass();
        if (jsonElement.getAsString() == null) {
            return null;
        }
        String asString = jsonElement.getAsString();
        asString.getClass();
        if (asString.length() == 0) {
            return null;
        }
        return ISODateTimeFormat.dateTimeParser().withOffsetParsed().parseDateTime(jsonElement.getAsString());
    }
}

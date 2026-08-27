package com.qualtrics.digital;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
abstract class BaseCollectionDeserializer {
    public void createCollection(JsonObject jsonObject, ArrayList arrayList, GsonBuilder gsonBuilder, Class cls) {
        int i = 0;
        while (true) {
            if (!jsonObject.has("" + i)) {
                return;
            }
            arrayList.add(gsonBuilder.create().fromJson((JsonElement) jsonObject.getAsJsonObject("" + i), cls));
            i++;
        }
    }
}

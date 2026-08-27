package com.qualtrics.digital;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import o.getHoldoutVariationName;

/* JADX INFO: loaded from: classes3.dex */
public class DecoderUtils {
    public static String getCreativeType(getHoldoutVariationName<JsonObject> getholdoutvariationname) {
        JsonObject jsonObject = (JsonObject) getholdoutvariationname.body;
        JsonObject asJsonObject = jsonObject.getAsJsonObject("CreativeDefinition");
        if (asJsonObject == null || asJsonObject.get("Type") == null) {
            return null;
        }
        return jsonObject.getAsJsonObject("CreativeDefinition").get("Type").getAsString();
    }

    public static Creative getDecodedCreativeDefinition(getHoldoutVariationName<JsonObject> getholdoutvariationname) {
        Object obj;
        Gson gson = new Gson();
        if (getholdoutvariationname != null && (obj = getholdoutvariationname.body) != null) {
            JsonObject jsonObject = (JsonObject) obj;
            String creativeType = getCreativeType(getholdoutvariationname);
            if (creativeType == null) {
                return null;
            }
            try {
                int iHashCode = creativeType.hashCode();
                if (iHashCode != -1037615855) {
                    if (iHashCode != -555333939) {
                        if (iHashCode == 427650979 && creativeType.equals("MobilePopOver")) {
                            return (Creative) gson.fromJson((JsonElement) jsonObject, PopOverCreative.class);
                        }
                    } else if (creativeType.equals("MobileNotification")) {
                        return (Creative) gson.fromJson((JsonElement) jsonObject, NotificationCreative.class);
                    }
                } else if (creativeType.equals("MobileEmbeddedFeedback")) {
                    return (Creative) gson.fromJson((JsonElement) jsonObject, EmbeddedFeedbackCreative.class);
                }
                return null;
            } catch (JsonSyntaxException unused) {
                QualtricsLog.logError("Error decoding creative");
            }
        }
        return null;
    }
}

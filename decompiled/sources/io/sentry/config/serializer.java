package io.sentry.config;

import androidx.compose.ui.graphics.Fields;
import java.util.LinkedHashMap;
import java.util.Map;
import o.AndroidView_androidKtupdateViewHolderParams2;
import o.onMove;

/* JADX INFO: loaded from: classes4.dex */
public abstract class serializer {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;

    public static final AndroidView_androidKtupdateViewHolderParams2 write(AndroidView_androidKtupdateViewHolderParams2 androidView_androidKtupdateViewHolderParams2, String str) {
        Map map;
        int i = 2 % 2;
        LinkedHashMap linkedHashMapWrite = onMove.write(androidView_androidKtupdateViewHolderParams2.acceptData);
        if (str != null) {
            int i2 = serializer + 51;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            Object obj = linkedHashMapWrite.get("issues");
            if (obj instanceof Map) {
                map = (Map) obj;
            } else {
                int i4 = serializer + 1;
                IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                map = null;
            }
            LinkedHashMap linkedHashMap = map != null ? new LinkedHashMap(map) : new LinkedHashMap();
            linkedHashMap.put("pickup_payment_type", str);
            linkedHashMapWrite.put("issues", linkedHashMap);
        }
        String str2 = androidView_androidKtupdateViewHolderParams2.url;
        str2.getClass();
        return new AndroidView_androidKtupdateViewHolderParams2(str2, linkedHashMapWrite);
    }
}

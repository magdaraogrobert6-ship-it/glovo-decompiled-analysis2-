package fwfd.com.fwfsdk.util;

import com.google.gson.reflect.TypeToken;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class FWFMapConverter {
    public static Map<String, Boolean> fromString(String str) {
        return (Map) FWFGson.getInstance().fromJson(str, new TypeToken<Map<String, Boolean>>() { // from class: fwfd.com.fwfsdk.util.FWFMapConverter.1
        }.getType());
    }

    public static String fromMap(Map<String, Boolean> map) {
        return FWFGson.getInstance().toJson(map);
    }
}

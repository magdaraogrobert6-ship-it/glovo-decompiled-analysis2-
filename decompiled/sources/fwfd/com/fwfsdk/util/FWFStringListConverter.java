package fwfd.com.fwfsdk.util;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class FWFStringListConverter {
    public static List<String> fromString(String str) {
        return (List) FWFGson.getInstance().fromJson(str, new TypeToken<List<String>>() { // from class: fwfd.com.fwfsdk.util.FWFStringListConverter.1
        }.getType());
    }

    public static String fromArrayList(List<String> list) {
        return FWFGson.getInstance().toJson(list);
    }
}

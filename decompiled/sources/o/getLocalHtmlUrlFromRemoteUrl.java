package o;

import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.logging.Level;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getLocalHtmlUrlFromRemoteUrl {
    public static final java.util.logging.Logger IconCompatParcelizer = java.util.logging.Logger.getLogger(getLocalHtmlUrlFromRemoteUrl.class.getName());

    public static Object RemoteActionCompatParcelizer(String str) {
        java.util.logging.Logger logger = IconCompatParcelizer;
        com.google.gson.stream.JsonReader jsonReader = new com.google.gson.stream.JsonReader(new StringReader(str));
        try {
            Object objWrite = write(jsonReader);
            try {
                return objWrite;
            } catch (IOException e) {
                return objWrite;
            }
        } finally {
            try {
                jsonReader.close();
            } catch (IOException e2) {
                logger.log(Level.WARNING, "Failed to close", (Throwable) e2);
            }
        }
    }

    public static Object write(com.google.gson.stream.JsonReader jsonReader) throws IOException {
        TextStreamsKt.RemoteActionCompatParcelizer("unexpected end of JSON", jsonReader.hasNext());
        switch (getHtmlInAppMessageAssetCacheDirectory.RemoteActionCompatParcelizer[jsonReader.peek().ordinal()]) {
            case 1:
                jsonReader.beginArray();
                ArrayList arrayList = new ArrayList();
                while (jsonReader.hasNext()) {
                    arrayList.add(write(jsonReader));
                }
                TextStreamsKt.RemoteActionCompatParcelizer("Bad token: " + jsonReader.getPath(), jsonReader.peek() == JsonToken.END_ARRAY);
                jsonReader.endArray();
                return Collections.unmodifiableList(arrayList);
            case 2:
                jsonReader.beginObject();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (jsonReader.hasNext()) {
                    linkedHashMap.put(jsonReader.nextName(), write(jsonReader));
                }
                TextStreamsKt.RemoteActionCompatParcelizer("Bad token: " + jsonReader.getPath(), jsonReader.peek() == JsonToken.END_OBJECT);
                jsonReader.endObject();
                return Collections.unmodifiableMap(linkedHashMap);
            case 3:
                return jsonReader.nextString();
            case 4:
                return Double.valueOf(jsonReader.nextDouble());
            case 5:
                return Boolean.valueOf(jsonReader.nextBoolean());
            case 6:
                jsonReader.nextNull();
                return null;
            default:
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(jsonReader.getPath(), "Bad token: ");
                return null;
        }
    }
}

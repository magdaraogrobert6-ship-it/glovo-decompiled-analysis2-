package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ContentCardsFragmentonViewStateRestored1 {
    public static final java.util.logging.Logger RemoteActionCompatParcelizer = java.util.logging.Logger.getLogger(ContentCardsFragmentonViewStateRestored1.class.getName());

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [org.json.JSONObject] */
    public static Object serializer(Object obj, byte[][] bArr) {
        boolean z = obj instanceof JSONArray;
        java.util.logging.Logger logger = RemoteActionCompatParcelizer;
        if (z) {
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    jSONArray.put(i, serializer(jSONArray.get(i), bArr));
                } catch (JSONException e) {
                    logger.log(Level.WARNING, "An error occured while putting packet data to JSONObject", (Throwable) e);
                    return null;
                }
            }
            return jSONArray;
        }
        if (obj instanceof JSONObject) {
            obj = (JSONObject) obj;
            if (obj.optBoolean("_placeholder")) {
                int iOptInt = obj.optInt("num", -1);
                if (iOptInt < 0 || iOptInt >= bArr.length) {
                    return null;
                }
                return bArr[iOptInt];
            }
            Iterator<String> itKeys = obj.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    obj.put(next, serializer(obj.get(next), bArr));
                } catch (JSONException e2) {
                    logger.log(Level.WARNING, "An error occured while putting data to JSONObject", (Throwable) e2);
                    return null;
                }
            }
        }
        return obj;
    }

    public static Object serializer(ArrayList arrayList, Object obj) {
        if (obj == null) {
            return null;
        }
        boolean z = obj instanceof byte[];
        java.util.logging.Logger logger = RemoteActionCompatParcelizer;
        if (z) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("_placeholder", true);
                jSONObject.put("num", arrayList.size());
                arrayList.add((byte[]) obj);
                return jSONObject;
            } catch (JSONException e) {
                logger.log(Level.WARNING, "An error occured while putting data to JSONObject", (Throwable) e);
                return null;
            }
        }
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = (JSONArray) obj;
            int length = jSONArray2.length();
            for (int i = 0; i < length; i++) {
                try {
                    jSONArray.put(i, serializer(arrayList, jSONArray2.get(i)));
                } catch (JSONException e2) {
                    logger.log(Level.WARNING, "An error occured while putting packet data to JSONObject", (Throwable) e2);
                    return null;
                }
            }
            return jSONArray;
        }
        if (!(obj instanceof JSONObject)) {
            return obj;
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = (JSONObject) obj;
        Iterator<String> itKeys = jSONObject3.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                jSONObject2.put(next, serializer(arrayList, jSONObject3.get(next)));
            } catch (JSONException e3) {
                logger.log(Level.WARNING, "An error occured while putting data to JSONObject", (Throwable) e3);
                return null;
            }
        }
        return jSONObject2;
    }
}

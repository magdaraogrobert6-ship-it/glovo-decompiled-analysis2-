package o;

import java.util.Iterator;
import java.util.logging.Level;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ContentCardAdapter {
    public static final java.util.logging.Logger write = java.util.logging.Logger.getLogger(ContentCardAdapter.class.getName());

    public static boolean RemoteActionCompatParcelizer(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof byte[]) {
            return true;
        }
        boolean z = obj instanceof JSONArray;
        java.util.logging.Logger logger = write;
        if (z) {
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    if (RemoteActionCompatParcelizer(jSONArray.isNull(i) ? null : jSONArray.get(i))) {
                        return true;
                    }
                } catch (JSONException e) {
                    logger.log(Level.WARNING, "An error occured while retrieving data from JSONArray", (Throwable) e);
                    return false;
                }
            }
        } else if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                try {
                    if (RemoteActionCompatParcelizer(jSONObject.get(itKeys.next()))) {
                        return true;
                    }
                } catch (JSONException e2) {
                    logger.log(Level.WARNING, "An error occured while retrieving data from JSONObject", (Throwable) e2);
                }
            }
        }
        return false;
    }
}

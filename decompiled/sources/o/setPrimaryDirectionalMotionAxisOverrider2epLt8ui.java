package o;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class setPrimaryDirectionalMotionAxisOverrider2epLt8ui {
    public static final Date serializer = new Date(0);
    public final JSONObject IconCompatParcelizer;
    public final long MediaBrowserCompatMediaItem;
    public final JSONObject MediaMetadataCompat;
    public final JSONArray MediaSessionCompatQueueItem;
    public final JSONArray RemoteActionCompatParcelizer;
    public final Date read;
    public final JSONObject write;

    public static setCoroutineContext RemoteActionCompatParcelizer() {
        setCoroutineContext setcoroutinecontext = new setCoroutineContext();
        setcoroutinecontext.serializer = new JSONObject();
        setcoroutinecontext.IconCompatParcelizer = serializer;
        setcoroutinecontext.write = new JSONArray();
        setcoroutinecontext.read = new JSONObject();
        setcoroutinecontext.RatingCompat = 0L;
        setcoroutinecontext.RemoteActionCompatParcelizer = new JSONArray();
        return setcoroutinecontext;
    }

    public static setPrimaryDirectionalMotionAxisOverrider2epLt8ui write(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rollout_metadata_key");
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        return new setPrimaryDirectionalMotionAxisOverrider2epLt8ui(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObject2, jSONObject.optLong("template_version_number_key"), jSONArrayOptJSONArray);
    }

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode();
    }

    public final String toString() {
        return this.IconCompatParcelizer.toString();
    }

    public final HashMap write() throws JSONException {
        HashMap map = new HashMap();
        int i = 0;
        while (true) {
            JSONArray jSONArray = this.MediaSessionCompatQueueItem;
            if (i >= jSONArray.length()) {
                return map;
            }
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String string = jSONObject.getString("rolloutId");
            String string2 = jSONObject.getString("variantId");
            JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                String string3 = jSONArray2.getString(i2);
                if (!map.containsKey(string3)) {
                    map.put(string3, new HashMap());
                }
                Map map2 = (Map) map.get(string3);
                if (map2 != null) {
                    map2.put(string, string2);
                }
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof setPrimaryDirectionalMotionAxisOverrider2epLt8ui) {
            return this.IconCompatParcelizer.toString().equals(((setPrimaryDirectionalMotionAxisOverrider2epLt8ui) obj).IconCompatParcelizer.toString());
        }
        return false;
    }

    public setPrimaryDirectionalMotionAxisOverrider2epLt8ui(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j, JSONArray jSONArray2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j);
        jSONObject3.put("rollout_metadata_key", jSONArray2);
        this.write = jSONObject;
        this.read = date;
        this.RemoteActionCompatParcelizer = jSONArray;
        this.MediaMetadataCompat = jSONObject2;
        this.MediaBrowserCompatMediaItem = j;
        this.MediaSessionCompatQueueItem = jSONArray2;
        this.IconCompatParcelizer = jSONObject3;
    }
}

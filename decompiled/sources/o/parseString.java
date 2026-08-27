package o;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class parseString implements migrateTriggersReeligibilityToJsonlambda0, r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU {
    private long write = -1;
    private Map<String, String> RemoteActionCompatParcelizer = SimpleItemTouchHelperCallback.serializer;

    public static final class write {
        public write(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public final long IconCompatParcelizer() {
        return this.write;
    }

    public final Map<String, String> read() {
        return this.RemoteActionCompatParcelizer;
    }

    static {
        new write(null);
    }

    @Override // o.r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU
    public final void RemoteActionCompatParcelizer(String str) {
        str.getClass();
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.write = jSONObject.getLong("timestamp");
            JSONObject jSONObject2 = jSONObject.getJSONObject("tags");
            HashMap map = new HashMap();
            if (jSONObject2 != null && jSONObject2.names() != null) {
                JSONArray jSONArrayNames = jSONObject2.names();
                for (int i = 0; i < jSONArrayNames.length(); i++) {
                    try {
                        String str2 = (String) jSONArrayNames.get(i);
                        map.put(str2, jSONObject2.getString(str2));
                    } catch (JSONException unused) {
                    }
                }
            }
            this.RemoteActionCompatParcelizer = map;
        } catch (JSONException unused2) {
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransportTags(timestamp=");
        sb.append(this.write);
        sb.append(", tags=");
        return r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(sb, (Map) this.RemoteActionCompatParcelizer, ')');
    }

    public final void RemoteActionCompatParcelizer(Map<String, String> map) {
        map.getClass();
        this.RemoteActionCompatParcelizer = map;
    }

    @Override // o.migrateTriggersReeligibilityToJsonlambda0
    public final String write() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("timestamp", this.write);
            jSONObject.put("tags", new JSONObject(this.RemoteActionCompatParcelizer));
        } catch (JSONException unused) {
        }
        String string = jSONObject.toString();
        string.getClass();
        return string;
    }

    public final void RemoteActionCompatParcelizer(long j) {
        this.write = j;
    }
}

package o;

import com.sentiance.sdk.semantictime.api.SemanticTime;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class handlePushNotificationPayloadlambda5 implements migrateTriggersReeligibilityToJsonlambda0, r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU {
    private Map<SemanticTime, handlePushNotificationPayloadlambda7> IconCompatParcelizer;

    public final Map<SemanticTime, handlePushNotificationPayloadlambda7> IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // o.r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU
    public final void RemoteActionCompatParcelizer(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        this.IconCompatParcelizer = new HashMap();
        for (SemanticTime semanticTime : SemanticTime.values()) {
            if (!jSONObject.isNull(semanticTime.asString())) {
                int i = jSONObject.getInt(semanticTime.asString());
                Map<SemanticTime, handlePushNotificationPayloadlambda7> map = this.IconCompatParcelizer;
                handlePushNotificationPayloadlambda7.IconCompatParcelizer.getClass();
                map.put(semanticTime, new handlePushNotificationPayloadlambda7(i / handlePushNotificationPayloadlambda7.serializer, (i % handlePushNotificationPayloadlambda7.serializer) / handlePushNotificationPayloadlambda7.write));
            }
        }
    }

    public final TreeMap<handlePushNotificationPayloadlambda7, SemanticTime> read() {
        HashMap map = new HashMap(this.IconCompatParcelizer);
        TreeMap<handlePushNotificationPayloadlambda7, SemanticTime> treeMap = new TreeMap<>(new io.sentry.cache.write(1));
        for (Map.Entry entry : map.entrySet()) {
            treeMap.put((handlePushNotificationPayloadlambda7) entry.getValue(), (SemanticTime) entry.getKey());
        }
        return treeMap;
    }

    public handlePushNotificationPayloadlambda5(Map<SemanticTime, handlePushNotificationPayloadlambda7> map) {
        this.IconCompatParcelizer = map;
    }

    public final String toString() {
        return r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(new StringBuilder("SemanticTimeData{mMap="), (Map) this.IconCompatParcelizer, '}');
    }

    @Override // o.migrateTriggersReeligibilityToJsonlambda0
    public final String write() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<SemanticTime, handlePushNotificationPayloadlambda7> entry : this.IconCompatParcelizer.entrySet()) {
            jSONObject.put(entry.getKey().asString(), entry.getValue().RatingCompat());
        }
        return jSONObject.toString();
    }

    public handlePushNotificationPayloadlambda5() {
    }
}

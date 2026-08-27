package bo.app;

import com.braze.models.IPutIntoJson;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class tb implements IPutIntoJson, t9 {
    public final String a;
    public final Boolean b;
    public final rb c;

    public final boolean b() {
        return this.b != null;
    }

    @Override // com.braze.models.IPutIntoJson
    public final JSONObject forJsonPut() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.a;
        if (str != null && str.length() != 0) {
            jSONObject.put("user_id", this.a);
        }
        Boolean bool = this.b;
        if (bool != null) {
            jSONObject.put("triggers", bool.booleanValue());
        }
        rb rbVar = this.c;
        if (rbVar != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("config_time", rbVar.a);
            jSONObject.put("config", jSONObject2);
        }
        return jSONObject;
    }

    public tb(String str, Boolean bool, rb rbVar) {
        this.a = str;
        this.b = bool;
        this.c = rbVar;
    }

    @Override // bo.app.t9
    public final boolean isEmpty() throws JSONException {
        rb rbVar;
        JSONObject jSONObjectForJsonPut = forJsonPut();
        if (jSONObjectForJsonPut.length() == 0) {
            return true;
        }
        if (this.b == null && (rbVar = this.c) != null) {
            return !rbVar.b;
        }
        if (jSONObjectForJsonPut.length() == 1) {
            return jSONObjectForJsonPut.has("user_id");
        }
        return false;
    }
}

package o;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class r8lambdaBwHsy7Qo6OwJ1PFjcbN2fatjzM implements migrateTriggersReeligibilityToJsonlambda0, r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU {
    public String IconCompatParcelizer;

    @Override // o.migrateTriggersReeligibilityToJsonlambda0
    public final String write() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("request_id", this.IconCompatParcelizer);
        return jSONObject.toString();
    }

    public r8lambdaBwHsy7Qo6OwJ1PFjcbN2fatjzM(String str) {
        this.IconCompatParcelizer = str;
    }

    @Override // o.r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU
    public final void RemoteActionCompatParcelizer(String str) throws JSONException {
        this.IconCompatParcelizer = new JSONObject(str).getString("request_id");
    }
}

package o;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class r8lambda0CqsV9PzHXzu3fvW17nz6eF0Wk implements migrateTriggersReeligibilityToJsonlambda0, r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU {
    public String IconCompatParcelizer;
    public String RemoteActionCompatParcelizer;
    public String serializer;
    public String write;

    @Override // o.migrateTriggersReeligibilityToJsonlambda0
    public final String write() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("grant_type", this.RemoteActionCompatParcelizer);
        jSONObject.put("token_type", this.serializer);
        jSONObject.put("code", this.write);
        jSONObject.put("refresh_token", this.IconCompatParcelizer);
        return jSONObject.toString();
    }

    @Override // o.r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU
    public final void RemoteActionCompatParcelizer(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        this.RemoteActionCompatParcelizer = jSONObject.getString("grant_type");
        this.serializer = jSONObject.getString("token_type");
        this.write = jSONObject.getString("code");
        this.IconCompatParcelizer = jSONObject.getString("refresh_token");
    }
}

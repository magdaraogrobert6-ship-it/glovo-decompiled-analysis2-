package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class r8lambdaDmZMDlQYQyj8miQcPejJSRaQtLA implements r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU, migrateTriggersReeligibilityToJsonlambda0 {
    public String IconCompatParcelizer;
    public String RemoteActionCompatParcelizer;
    public String read;
    public String serializer;
    public String write;

    @Override // o.r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU
    public final void RemoteActionCompatParcelizer(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        this.serializer = jSONObject.getString("user_id");
        this.read = jSONObject.getString("token");
        this.IconCompatParcelizer = jSONObject.getString("refresh_token");
        this.write = jSONObject.getString(com.braze.models.Banner.EXPIRATION);
        this.RemoteActionCompatParcelizer = jSONObject.getString("refresh_expires_at");
    }

    public final String toString() {
        String strSubstring;
        StringBuilder sb = new StringBuilder("AuthTokenResponse{userId='");
        sb.append(this.serializer);
        sb.append("', token='");
        String str = this.read;
        String strSubstring2 = "null";
        if (str == null) {
            strSubstring = "null";
        } else {
            strSubstring = str.substring(0, Math.min(7, str.length()));
        }
        sb.append(strSubstring);
        sb.append("', refreshToken='");
        String str2 = this.IconCompatParcelizer;
        if (str2 != null) {
            strSubstring2 = str2.substring(0, Math.min(7, str2.length()));
        }
        sb.append(strSubstring2);
        sb.append("', expiresAt='");
        sb.append(this.write);
        sb.append("', refreshExpiresAt='");
        return ff$$ExternalSyntheticOutline0.m(sb, this.RemoteActionCompatParcelizer, "'}");
    }

    @Override // o.migrateTriggersReeligibilityToJsonlambda0
    public final String write() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("user_id", this.serializer);
        jSONObject.put("token", this.read);
        jSONObject.put("refresh_token", this.IconCompatParcelizer);
        jSONObject.put(com.braze.models.Banner.EXPIRATION, this.write);
        jSONObject.put("refresh_expires_at", this.RemoteActionCompatParcelizer);
        return jSONObject.toString();
    }
}

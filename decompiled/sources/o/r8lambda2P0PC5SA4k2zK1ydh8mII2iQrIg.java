package o;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class r8lambda2P0PC5SA4k2zK1ydh8mII2iQrIg implements r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU {
    private String read;

    @Override // o.r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU
    public final void RemoteActionCompatParcelizer(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has("signed_url")) {
            this.read = jSONObject.getString("signed_url");
        }
    }

    public final String read() {
        return this.read;
    }
}

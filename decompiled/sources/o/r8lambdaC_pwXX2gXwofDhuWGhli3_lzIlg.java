package o;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class r8lambdaC_pwXX2gXwofDhuWGhli3_lzIlg implements r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU, migrateTriggersReeligibilityToJsonlambda0 {
    public String IconCompatParcelizer;
    public long RemoteActionCompatParcelizer;
    public String read;

    @Override // o.migrateTriggersReeligibilityToJsonlambda0
    public final String write() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("tile_id", this.IconCompatParcelizer);
        jSONObject.put("state", this.read);
        jSONObject.put("check_again_in", this.RemoteActionCompatParcelizer);
        return jSONObject.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GeneratingTileResponse{quadKey='");
        sb.append(this.IconCompatParcelizer);
        sb.append("', state='");
        sb.append(this.read);
        sb.append("', checkAgainInSeconds=");
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(sb, this.RemoteActionCompatParcelizer, '}');
    }

    @Override // o.r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU
    public final void RemoteActionCompatParcelizer(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        this.IconCompatParcelizer = jSONObject.getString("tile_id");
        this.read = jSONObject.getString("state");
        this.RemoteActionCompatParcelizer = jSONObject.getLong("check_again_in");
    }
}

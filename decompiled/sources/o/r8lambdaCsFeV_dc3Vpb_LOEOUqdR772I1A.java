package o;

import android.os.Process;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class r8lambdaCsFeV_dc3Vpb_LOEOUqdR772I1A implements r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU, migrateTriggersReeligibilityToJsonlambda0 {
    public static int IconCompatParcelizer;
    public static int write;
    public String RemoteActionCompatParcelizer;
    public long serializer;

    @Override // o.migrateTriggersReeligibilityToJsonlambda0
    public final String write() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("tile_id", this.RemoteActionCompatParcelizer);
        jSONObject.put("last_modified_time", this.serializer);
        return jSONObject.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TileFoundResponse{quadKey='");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append("', lastModifiedTime=");
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(sb, this.serializer, '}');
    }

    @Override // o.r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU
    public final void RemoteActionCompatParcelizer(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        this.RemoteActionCompatParcelizer = jSONObject.getString("tile_id");
        this.serializer = jSONObject.getLong("last_modified_time");
    }

    public static int read() {
        int i = write;
        int i2 = i % 7631531;
        write = i + 1;
        if (i2 != 0) {
            return IconCompatParcelizer;
        }
        int iMyUid = Process.myUid();
        IconCompatParcelizer = iMyUid;
        return iMyUid;
    }
}

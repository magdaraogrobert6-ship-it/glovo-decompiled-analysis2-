package bo.app;

import com.braze.models.IPutIntoJson;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class rb implements IPutIntoJson, t9 {
    public final long a;
    public final boolean b;

    @Override // bo.app.t9
    public final boolean isEmpty() {
        return !this.b;
    }

    @Override // com.braze.models.IPutIntoJson
    public final Object forJsonPut() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("config_time", this.a);
        return jSONObject;
    }

    public rb(long j, boolean z) {
        this.a = j;
        this.b = z;
    }
}

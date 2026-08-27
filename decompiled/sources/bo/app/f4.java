package bo.app;

import com.braze.support.StringUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class f4 implements ca {
    public final String a;

    @Override // com.braze.models.IPutIntoJson
    public final Object forJsonPut() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "custom_event");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("event_name", this.a);
            jSONObject.put(RemoteMessageConst.DATA, jSONObject2);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // bo.app.n9
    public final boolean a(da daVar) {
        if (!(daVar instanceof g4)) {
            return false;
        }
        g4 g4Var = (g4) daVar;
        return !StringUtils.isNullOrBlank(g4Var.f) && g4Var.f.equals(this.a);
    }

    public f4(JSONObject jSONObject) {
        this.a = jSONObject.getJSONObject(RemoteMessageConst.DATA).getString("event_name");
    }
}

package bo.app;

import com.braze.support.StringUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ic implements ca {
    public final String a;

    @Override // com.braze.models.IPutIntoJson
    public final Object forJsonPut() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "push_click");
            if (this.a != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("campaign_id", this.a);
                jSONObject.putOpt(RemoteMessageConst.DATA, jSONObject2);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // bo.app.n9
    public final boolean a(da daVar) {
        if (!(daVar instanceof jc)) {
            return false;
        }
        if (StringUtils.isNullOrBlank(this.a)) {
            return true;
        }
        jc jcVar = (jc) daVar;
        return !StringUtils.isNullOrBlank(jcVar.e) && jcVar.e.equals(this.a);
    }

    public ic(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(RemoteMessageConst.DATA);
        if (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject.isNull("campaign_id")) {
            return;
        }
        this.a = jSONObjectOptJSONObject.optString("campaign_id", null);
    }
}

package bo.app;

import com.braze.support.BrazeLogger;
import com.braze.support.StringUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class h4 extends jg {
    public static final String d = BrazeLogger.getBrazeLogTag((Class<?>) h4.class);
    public final String c;

    @Override // com.braze.models.IPutIntoJson
    public final Object forJsonPut() {
        JSONObject jSONObjectB = super.b();
        try {
            jSONObjectB.put("type", "custom_event_property");
            JSONObject jSONObject = jSONObjectB.getJSONObject(RemoteMessageConst.DATA);
            jSONObject.put("event_name", this.c);
            jSONObjectB.put(RemoteMessageConst.DATA, jSONObject);
            return jSONObjectB;
        } catch (JSONException e) {
            BrazeLogger.e(d, "Caught exception creating CustomEventWithPropertiesTriggerCondition Json.", e);
            return jSONObjectB;
        }
    }

    public h4(JSONObject jSONObject) {
        super(jSONObject);
        this.c = jSONObject.getJSONObject(RemoteMessageConst.DATA).getString("event_name");
    }

    @Override // bo.app.n9
    public final boolean a(da daVar) {
        if (!(daVar instanceof g4)) {
            return false;
        }
        g4 g4Var = (g4) daVar;
        if (StringUtils.isNullOrBlank(g4Var.f) || !g4Var.f.equals(this.c)) {
            return false;
        }
        return this.a.a(daVar);
    }
}

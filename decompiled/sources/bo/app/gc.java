package bo.app;

import com.braze.support.BrazeLogger;
import com.braze.support.StringUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class gc extends jg {
    public static final String d = BrazeLogger.getBrazeLogTag((Class<?>) gc.class);
    public final String c;

    @Override // com.braze.models.IPutIntoJson
    public final Object forJsonPut() {
        JSONObject jSONObjectB = super.b();
        try {
            jSONObjectB.put("type", "purchase_property");
            JSONObject jSONObject = jSONObjectB.getJSONObject(RemoteMessageConst.DATA);
            jSONObject.put("product_id", this.c);
            jSONObjectB.put(RemoteMessageConst.DATA, jSONObject);
            return jSONObjectB;
        } catch (JSONException e) {
            BrazeLogger.e(d, "Caught exception creating Json.", e);
            return jSONObjectB;
        }
    }

    public gc(JSONObject jSONObject) {
        super(jSONObject);
        this.c = jSONObject.getJSONObject(RemoteMessageConst.DATA).getString("product_id");
    }

    @Override // bo.app.n9
    public final boolean a(da daVar) {
        if (!(daVar instanceof fc) || StringUtils.isNullOrBlank(this.c)) {
            return false;
        }
        fc fcVar = (fc) daVar;
        if (!StringUtils.isNullOrBlank(fcVar.f) && fcVar.f.equals(this.c)) {
            return this.a.a(daVar);
        }
        return false;
    }
}

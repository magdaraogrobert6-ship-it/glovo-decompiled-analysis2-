package bo.app;

import com.braze.support.BrazeLogger;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class jg implements ca {
    public static final String b = BrazeLogger.getBrazeLogTag((Class<?>) jg.class);
    public final i a;

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("property_filters", this.a.forJsonPut());
            jSONObject.put(RemoteMessageConst.DATA, jSONObject2);
            return jSONObject;
        } catch (JSONException e) {
            BrazeLogger.e(b, "Caught exception creating Json.", e);
            return jSONObject;
        }
    }

    public jg(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONObject(RemoteMessageConst.DATA).getJSONArray("property_filters");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i);
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                arrayList2.add(new cc(jSONArray2.getJSONObject(i2)));
            }
            arrayList.add(new qb(arrayList2));
        }
        this.a = new i(arrayList);
    }
}

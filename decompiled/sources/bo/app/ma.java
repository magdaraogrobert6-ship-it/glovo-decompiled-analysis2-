package bo.app;

import com.braze.support.StringUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ma implements ca {
    public final String a;
    public final HashSet b = new HashSet();

    @Override // com.braze.models.IPutIntoJson
    public final Object forJsonPut() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "iam_click");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", this.a);
            if (this.b.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
                jSONObject2.put("buttons", jSONArray);
            }
            jSONObject.put(RemoteMessageConst.DATA, jSONObject2);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public ma(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject.getJSONObject(RemoteMessageConst.DATA);
        this.a = jSONObject2.getString("id");
        JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("buttons");
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                this.b.add(jSONArrayOptJSONArray.getString(i));
            }
        }
    }

    @Override // bo.app.n9
    public final boolean a(da daVar) {
        if (daVar instanceof na) {
            na naVar = (na) daVar;
            if (!StringUtils.isNullOrBlank(naVar.e) && naVar.e.equals(this.a)) {
                int size = this.b.size();
                String str = naVar.f;
                if (size > 0) {
                    return !StringUtils.isNullOrBlank(str) && this.b.contains(naVar.f);
                }
                return StringUtils.isNullOrBlank(str);
            }
        }
        return false;
    }
}

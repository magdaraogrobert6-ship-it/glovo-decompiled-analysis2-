package o;

import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class r8lambda7_6uuySr2Pfu4FrsMBeetrQwiRc implements r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU, migrateTriggersReeligibilityToJsonlambda0 {
    public String IconCompatParcelizer;
    public List<Integer> RemoteActionCompatParcelizer = Collections.EMPTY_LIST;
    public String read;
    public String serializer;
    public boolean write;

    @Override // o.r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU
    public final void RemoteActionCompatParcelizer(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        this.IconCompatParcelizer = jSONObject.getString("request_id");
        if (jSONObject.has(RemoteMessageConst.FROM)) {
            this.read = jSONObject.getString(RemoteMessageConst.FROM);
        }
        if (jSONObject.has(RemoteMessageConst.TO)) {
            this.serializer = jSONObject.getString(RemoteMessageConst.TO);
        }
        if (jSONObject.has("text_logs") && !jSONObject.isNull("text_logs")) {
            this.write = jSONObject.getBoolean("text_logs");
        }
        if (!jSONObject.has("event_types") || jSONObject.isNull("event_types")) {
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("event_types");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(Integer.valueOf(jSONArray.getInt(i)));
        }
        this.RemoteActionCompatParcelizer = arrayList;
    }

    @Override // o.migrateTriggersReeligibilityToJsonlambda0
    public final String write() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("request_id", this.IconCompatParcelizer);
        String str = this.read;
        if (str != null) {
            jSONObject.put(RemoteMessageConst.FROM, str);
        }
        String str2 = this.serializer;
        if (str2 != null) {
            jSONObject.put(RemoteMessageConst.TO, str2);
        }
        jSONObject.put("text_logs", this.write);
        JSONArray jSONArray = new JSONArray();
        Iterator<Integer> it = this.RemoteActionCompatParcelizer.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        jSONObject.put("event_types", jSONArray);
        return jSONObject.toString();
    }
}

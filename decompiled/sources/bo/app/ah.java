package bo.app;

import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class ah implements ga {
    public final String a;
    public final wd b;
    public final boolean c;
    public wg d;
    public final ArrayList e;

    @Override // com.braze.models.IPutIntoJson
    public JSONObject forJsonPut() {
        try {
            JSONObject jSONObjectForJsonPut = this.b.forJsonPut();
            if (jSONObjectForJsonPut == null) {
                return null;
            }
            jSONObjectForJsonPut.put("id", this.a);
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = this.e;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                jSONArray.put(((ca) obj).forJsonPut());
            }
            jSONObjectForJsonPut.put("trigger_condition", jSONArray);
            jSONObjectForJsonPut.put("prefetch", this.c);
            return jSONObjectForJsonPut;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static final String a(ah ahVar, da daVar) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Triggered action ", ahVar.a, " not eligible to be triggered by ", daVar.a(), " event. Current device time outside triggered action time window.");
    }

    public ah(JSONObject jSONObject) throws JSONException {
        jSONObject.getClass();
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        String string = jSONObject.getString("id");
        string.getClass();
        this.a = string;
        this.b = new wd(jSONObject);
        JSONArray jSONArray = jSONObject.getJSONArray("trigger_condition");
        if (jSONArray.length() > 0) {
            arrayList.addAll(xg.a(jSONArray));
        }
        this.c = jSONObject.optBoolean("prefetch", true);
    }

    public final boolean b(da daVar) {
        daVar.getClass();
        int i = 0;
        if ((this.b.a != -1 && DateTimeUtils.nowInSeconds() <= this.b.a) || (this.b.b != -1 && DateTimeUtils.nowInSeconds() >= this.b.b)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ah$$ExternalSyntheticLambda0(this, i, daVar), 7, (Object) null);
            return false;
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (!((ca) obj).a(daVar)) {
                i3++;
            } else if (i3 != -1) {
                return true;
            }
        }
        return false;
    }
}

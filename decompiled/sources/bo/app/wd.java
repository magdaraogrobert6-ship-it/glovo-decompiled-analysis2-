package bo.app;

import com.braze.models.IPutIntoJson;
import com.braze.support.BrazeLogger;
import com.huawei.hms.push.constant.RemoteMessageConst;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class wd implements IPutIntoJson {
    public final long a;
    public final long b;
    public final int c;
    public final int d;
    public final int e;
    public final ed f;
    public final int g;

    @Override // com.braze.models.IPutIntoJson
    public final JSONObject forJsonPut() {
        try {
            JSONObject jSONObjectForJsonPut = this.f.forJsonPut();
            if (jSONObjectForJsonPut == null) {
                return null;
            }
            jSONObjectForJsonPut.put("start_time", this.a);
            jSONObjectForJsonPut.put("end_time", this.b);
            jSONObjectForJsonPut.put(RemoteMessageConst.Notification.PRIORITY, this.c);
            jSONObjectForJsonPut.put("min_seconds_since_last_trigger", this.g);
            jSONObjectForJsonPut.put("timeout", this.e);
            jSONObjectForJsonPut.put("delay", this.d);
            return jSONObjectForJsonPut;
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new wa$$ExternalSyntheticLambda3(3), 4, (Object) null);
            return null;
        }
    }

    public static final String b() {
        return "Could not convert ScheduleConfig to JSON";
    }

    public wd(JSONObject jSONObject) {
        jSONObject.getClass();
        this.a = jSONObject.optLong("start_time", -1L);
        this.b = jSONObject.optLong("end_time", -1L);
        this.c = jSONObject.optInt(RemoteMessageConst.Notification.PRIORITY, 0);
        this.g = jSONObject.optInt("min_seconds_since_last_trigger", -1);
        this.d = jSONObject.optInt("delay", 0);
        this.e = jSONObject.optInt("timeout", -1);
        this.f = new ed(jSONObject);
    }
}

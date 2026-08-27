package bo.app;

import com.braze.models.IPutIntoJson;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import java.util.UUID;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ff implements IPutIntoJson {
    public final hf a;
    public final double b;
    public Double c;
    public boolean d;

    public Double d() {
        return this.c;
    }

    public static final String b() {
        return "Caught exception creating Session Json.";
    }

    @Override // com.braze.models.IPutIntoJson
    public final JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("session_id", this.a);
            jSONObject.put("start_time", this.b);
            jSONObject.put("is_sealed", this.d);
            if (d() != null) {
                jSONObject.put("end_time", d());
            }
            return jSONObject;
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c8$$ExternalSyntheticLambda1(8), 4, (Object) null);
            return jSONObject;
        }
    }

    public String toString() {
        return "\nSession(sessionId=" + this.a + ", startTime=" + this.b + ", endTime=" + d() + ", isSealed=" + this.d + ", duration=" + c() + ")";
    }

    public ff(JSONObject jSONObject) throws JSONException {
        jSONObject.getClass();
        String string = jSONObject.getString("session_id");
        string.getClass();
        UUID uuidFromString = UUID.fromString(string);
        uuidFromString.getClass();
        this.a = new hf(uuidFromString);
        this.b = jSONObject.getDouble("start_time");
        this.d = jSONObject.getBoolean("is_sealed");
        this.c = JsonUtils.getDoubleOrNull(jSONObject, "end_time");
    }

    public static final String a(double d, ff ffVar) {
        return ff$$ExternalSyntheticOutline0.m(ffVar.b, "' for this session.", af$$ExternalSyntheticOutline0.m(d, "End time '", "' for session is less than the start time '"));
    }

    public final long c() {
        Double d = d();
        if (d == null) {
            return -1L;
        }
        final double dDoubleValue = d.doubleValue();
        long j = (long) (dDoubleValue - this.b);
        if (j < 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: bo.app.ff$$ExternalSyntheticLambda2
                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public final Object invoke() {
                    return ff.a(dDoubleValue, this);
                }
            }, 6, (Object) null);
        }
        return j;
    }

    public ff(hf hfVar, double d, Double d2, boolean z) {
        hfVar.getClass();
        this.a = hfVar;
        this.b = d;
        ((hb) this).c = d2;
        this.d = z;
    }
}

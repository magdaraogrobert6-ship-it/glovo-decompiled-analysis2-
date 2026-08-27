package bo.app;

import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import fwfd.com.fwfsdk.constant.FWFConstants;
import java.util.ArrayList;
import java.util.List;
import o.getCieXyz;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class vb extends j {
    public final JSONObject c;
    public final ba d;
    public final te e;
    public final a4 f;
    public final InAppMessageBase g;
    public final List h;
    public final List i;
    public final fh j;
    public final af k;
    public final ArrayList l;
    public final JSONArray m;
    public final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f25o;
    public final String p;
    public final Long q;
    public final long r;
    public final JSONObject s;
    public final Long t;
    public final ArrayList u;
    public final ce v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:28:0x00eb  */
    public vb(l9 l9Var, v9 v9Var, h2 h2Var) {
        ba abVar;
        ArrayList arrayListA;
        a4 a4Var;
        Exception exc;
        af afVar;
        JSONArray jSONArrayOptJSONArray;
        super(l9Var, v9Var);
        l9Var.getClass();
        v9Var.getClass();
        h2Var.getClass();
        JSONObject jSONObject = v9Var.c;
        jSONObject = jSONObject == null ? new JSONObject() : jSONObject;
        this.c = jSONObject;
        String optionalString = JsonUtils.getOptionalString(jSONObject, FWFConstants.EXPLANATION_TYPE_ERROR);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("auth_error");
        Long lValueOf = null;
        if (jSONObjectOptJSONObject != null) {
            abVar = new yd(l9Var, jSONObjectOptJSONObject.optInt("error_code", -1), JsonUtils.getOptionalString(jSONObjectOptJSONObject, "reason"), optionalString);
        } else {
            abVar = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{optionalString, "invalid_api_key"}, getCieXyz.write())).booleanValue() ? new ab(optionalString, l9Var) : optionalString != null ? new l0(optionalString, l9Var) : null;
        }
        this.d = abVar;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("optional_auth_error");
        this.e = jSONObjectOptJSONObject2 != null ? new te(l9Var, jSONObjectOptJSONObject2.optInt("error_code", -1), JsonUtils.getOptionalString(jSONObjectOptJSONObject2, "reason")) : null;
        this.j = fh.f.a(jSONObject.optJSONObject("triggers_checksums"));
        this.m = jSONObject.optJSONArray("feature_flags");
        this.r = jSONObject.optLong("last_sync_at", -1L);
        this.s = jSONObject.optJSONObject("banners");
        this.t = jSONObject.has("request_time") ? Long.valueOf(jSONObject.optLong("request_time")) : null;
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("dismissals");
        if (jSONObjectOptJSONObject3 != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject3.optJSONArray("acknowledged")) != null) {
            arrayListA = d.c.a(jSONArrayOptJSONArray);
            arrayListA = arrayListA.isEmpty() ? null : arrayListA;
        }
        this.u = arrayListA;
        this.v = l9Var instanceof je ? ge.k.a(jSONObject, true) : null;
        if (abVar == null && (l9Var instanceof e4)) {
            try {
                a4Var = new a4(jSONObject);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new a5$$ExternalSyntheticLambda0(24, this), 4, (Object) null);
                a4Var = null;
            }
        } else {
            a4Var = null;
        }
        this.f = a4Var;
        wb wbVarA = xg.a.a(this.c.optJSONArray("triggers"), h2Var);
        this.h = wbVarA != null ? wbVarA.a : null;
        this.i = wbVarA != null ? wbVarA.b : null;
        if (wbVarA != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new a5$$ExternalSyntheticLambda0(25, wbVarA), 6, (Object) null);
        }
        JSONObject jSONObjectOptJSONObject4 = this.c.optJSONObject("config");
        if (jSONObjectOptJSONObject4 != null) {
            try {
                afVar = new af(jSONObjectOptJSONObject4);
                try {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new eh$$ExternalSyntheticLambda0(jSONObjectOptJSONObject4, 3), 6, (Object) null);
                } catch (Exception e2) {
                    exc = e2;
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) exc, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new eh$$ExternalSyntheticLambda0(jSONObjectOptJSONObject4, 4), 4, (Object) null);
                }
            } catch (Exception e3) {
                exc = e3;
                afVar = null;
            }
        } else {
            afVar = null;
        }
        this.k = afVar;
        this.g = xg.a(this.c.optJSONObject("templated_message"), h2Var);
        JSONArray jSONArrayOptJSONArray2 = this.c.optJSONArray("geofences");
        this.l = jSONArrayOptJSONArray2 != null ? com.braze.support.f.a(jSONArrayOptJSONArray2) : null;
        if (!(l9Var instanceof c6)) {
            this.n = null;
            this.f25o = null;
            this.p = null;
            this.q = null;
            return;
        }
        this.n = JsonUtils.getOptionalString(this.c, "mite");
        this.f25o = JsonUtils.getOptionalString(this.c, "host");
        this.p = JsonUtils.getOptionalString(this.c, "auth");
        if (this.c.has("expiration")) {
            long jOptLong = this.c.optLong("expiration");
            if (jOptLong > 0) {
                lValueOf = Long.valueOf(jOptLong);
            }
        }
        this.q = lValueOf;
    }

    public static final String a(wb wbVar) {
        return "Found " + wbVar.a.size() + " triggered actions and " + wbVar.b + " reuse-by-id references in server response.";
    }

    public static final String b(JSONObject jSONObject) {
        return af$$ExternalSyntheticOutline1.m("Encountered Exception processing server config: ", jSONObject);
    }

    public static final String a(vb vbVar) {
        return af$$ExternalSyntheticOutline1.m("Encountered Exception processing Content Cards response: ", vbVar.c);
    }

    public static final String a(JSONObject jSONObject) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Got server config: ", JsonUtils.getPrettyPrintedString(jSONObject));
    }
}

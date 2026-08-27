package bo.app;

import com.braze.support.BrazeLogger;
import o.hideCurrentlyDisplayingInAppMessage;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class eh {
    public static final String b(JSONObject jSONObject) {
        return af$$ExternalSyntheticOutline1.m("Failed to parse TriggersChecksum from JSON: ", jSONObject);
    }

    public final fh a(String str) {
        if (str == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
            return null;
        }
        try {
            return a(new JSONObject(str));
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new a7$$ExternalSyntheticLambda3(str, 20), 4, (Object) null);
            return null;
        }
    }

    public static final String b(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to parse TriggersChecksum from string: ", str);
    }

    public final fh a(JSONObject jSONObject) {
        t3 t3VarA = s3.d.a(jSONObject);
        if (t3VarA == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.D, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new eh$$ExternalSyntheticLambda0(jSONObject, 0), 6, (Object) null);
            return null;
        }
        return new fh(t3VarA.a, t3VarA.b, t3VarA.c);
    }
}

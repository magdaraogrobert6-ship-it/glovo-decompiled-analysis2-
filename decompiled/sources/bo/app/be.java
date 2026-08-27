package bo.app;

import com.braze.models.FeatureFlag;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class be {
    public static final String b() {
        return "Error getting required SDK debugging fields in SdkDebugManager. Disabling SDK debugging.";
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0028 A[Catch: JSONException -> 0x001b, TryCatch #0 {JSONException -> 0x001b, blocks: (B:4:0x0010, B:11:0x0020, B:13:0x0028, B:14:0x002e, B:16:0x0034, B:17:0x003e, B:19:0x0064, B:26:0x0082, B:28:0x0086, B:30:0x0092, B:25:0x0071), top: B:37:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0034 A[Catch: JSONException -> 0x001b, TryCatch #0 {JSONException -> 0x001b, blocks: (B:4:0x0010, B:11:0x0020, B:13:0x0028, B:14:0x002e, B:16:0x0034, B:17:0x003e, B:19:0x0064, B:26:0x0082, B:28:0x0086, B:30:0x0092, B:25:0x0071), top: B:37:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0071 A[Catch: JSONException -> 0x001b, TryCatch #0 {JSONException -> 0x001b, blocks: (B:4:0x0010, B:11:0x0020, B:13:0x0028, B:14:0x002e, B:16:0x0034, B:17:0x003e, B:19:0x0064, B:26:0x0082, B:28:0x0086, B:30:0x0092, B:25:0x0071), top: B:37:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    public final ce a(JSONObject jSONObject, boolean z) {
        Long l;
        jSONObject.getClass();
        ce ceVar = new ce();
        boolean z2 = true;
        if (z) {
            ceVar.a = z;
            if (jSONObject.has("authorization_code")) {
                ceVar.c = jSONObject.getString("authorization_code");
            }
            if (jSONObject.has("expiration_time")) {
                ceVar.b = Long.valueOf(jSONObject.getLong("expiration_time"));
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("batching_config");
            ceVar.d = jSONObject2.getLong("flush_interval_size");
            ceVar.e = jSONObject2.getLong("flush_interval_seconds");
            long j = jSONObject2.getLong("max_payload_size");
            ceVar.f = j;
            if (ceVar.d > 0) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new l$$ExternalSyntheticLambda2(jSONObject, 2), 7, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new l$$ExternalSyntheticLambda2(jSONObject, 2), 7, (Object) null);
            }
            l = ceVar.b;
            if (l == null) {
                if (!z2) {
                    return ceVar;
                }
            } else if (!z2) {
                return ceVar;
            }
        } else {
            try {
                boolean z3 = jSONObject.getBoolean(FeatureFlag.ENABLED);
                ceVar.a = z3;
                if (jSONObject.has("authorization_code")) {
                    ceVar.c = jSONObject.getString("authorization_code");
                }
                if (jSONObject.has("expiration_time")) {
                    ceVar.b = Long.valueOf(jSONObject.getLong("expiration_time"));
                }
                JSONObject jSONObject3 = jSONObject.getJSONObject("batching_config");
                ceVar.d = jSONObject3.getLong("flush_interval_size");
                ceVar.e = jSONObject3.getLong("flush_interval_seconds");
                long j2 = jSONObject3.getLong("max_payload_size");
                ceVar.f = j2;
                if (ceVar.d > 0 || ceVar.e <= 0 || j2 <= 0) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new l$$ExternalSyntheticLambda2(jSONObject, 2), 7, (Object) null);
                } else {
                    z2 = false;
                }
                l = ceVar.b;
                if (l == null && l.longValue() < DateTimeUtils.nowInSeconds()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda3(25), 7, (Object) null);
                } else if (!z2) {
                    return ceVar;
                }
            } catch (JSONException e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda3(26), 4, (Object) null);
            }
        }
        return new ce();
    }

    public static final String a(JSONObject jSONObject) {
        return af$$ExternalSyntheticOutline1.m("sdkDebuggerObject contains invalid values. Disabling SDK debugging. ", jSONObject);
    }

    public static final String a() {
        return "SDK Debugger expiration time is in the past. Disabling SDK debugging.";
    }
}

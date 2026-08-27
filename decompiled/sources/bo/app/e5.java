package bo.app;

import com.braze.enums.DeviceKey;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import java.util.Iterator;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class e5 {
    public static final String d() {
        return "Returning false for shouldReportPushPermissionsAsGranted.";
    }

    public static final String b() {
        return "shouldReportPushPermissionsAsGranted: Returning true given that push is permissible now and notifications enabled transitioned to true.";
    }

    public static final String c() {
        return "shouldReportPushPermissionsAsGranted: Returning true since notifications enabled is true and device has upgraded to Tiramisu or beyond.";
    }

    public final boolean a(JSONObject jSONObject, JSONObject jSONObject2, int i, int i2) {
        jSONObject.getClass();
        jSONObject2.getClass();
        boolean z = i2 >= 33;
        boolean z2 = i < 33 && z;
        DeviceKey deviceKey = DeviceKey.NOTIFICATIONS_ENABLED;
        boolean zOptBoolean = jSONObject2.optBoolean(deviceKey.getKey(), false);
        boolean z3 = zOptBoolean && !jSONObject.optBoolean(deviceKey.getKey(), false);
        if (z && z3) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new g$$ExternalSyntheticLambda0(13), 7, (Object) null);
            return true;
        }
        if (zOptBoolean && z2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new g$$ExternalSyntheticLambda0(14), 7, (Object) null);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new g$$ExternalSyntheticLambda0(15), 6, (Object) null);
        return false;
    }

    public static final String a() {
        return "Caught json exception while creating the diff. Returning null";
    }

    public final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject2.opt(next);
            Object objOpt2 = jSONObject.opt(next);
            if (objOpt != null) {
                try {
                    if (objOpt instanceof JSONObject) {
                        if (objOpt2 == null || !JsonUtils.areJsonObjectsEqual((JSONObject) objOpt, (JSONObject) objOpt2)) {
                            jSONObject3.put(next, objOpt);
                        }
                    } else if (!objOpt.equals(objOpt2)) {
                        jSONObject3.put(next, objOpt);
                    }
                } catch (JSONException e) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new g$$ExternalSyntheticLambda0(16), 4, (Object) null);
                    return null;
                }
            }
        }
        return jSONObject3;
    }
}

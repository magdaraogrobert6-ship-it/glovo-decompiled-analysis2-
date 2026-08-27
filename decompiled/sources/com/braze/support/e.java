package com.braze.support;

import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.l$$ExternalSyntheticLambda2;
import com.braze.models.FeatureFlag;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final e a = new e();

    public static final String b(JSONObject jSONObject) {
        return af$$ExternalSyntheticOutline1.m("Failed to deserialize feature flag Json: ", jSONObject);
    }

    public final FeatureFlag a(JSONObject jSONObject) {
        jSONObject.getClass();
        try {
            String string = jSONObject.getString("id");
            string.getClass();
            boolean z = jSONObject.getBoolean(FeatureFlag.ENABLED);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("properties");
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            return new FeatureFlag(string, z, jSONObjectOptJSONObject, JsonUtils.getOptionalString(jSONObject, FeatureFlag.TRACKING_STRING));
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new l$$ExternalSyntheticLambda2(jSONObject, 14), 4, (Object) null);
            return null;
        }
    }
}

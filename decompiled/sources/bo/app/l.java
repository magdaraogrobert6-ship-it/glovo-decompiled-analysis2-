package bo.app;

import com.braze.models.Banner;
import com.braze.support.BrazeLogger;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class l {
    public static final String b(JSONObject jSONObject) {
        return af$$ExternalSyntheticOutline1.m("Failed to deserialize banner Json: ", jSONObject);
    }

    public static final String b() {
        return "Received null inner banner object. Not parsing.";
    }

    public final Banner a(JSONObject jSONObject) {
        String str;
        if (jSONObject == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new l$$ExternalSyntheticLambda0(0), 6, (Object) null);
            return null;
        }
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(Banner.BANNER_KEY);
            if (jSONObjectOptJSONObject == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new l$$ExternalSyntheticLambda0(19), 6, (Object) null);
                return null;
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("properties");
            if (jSONObjectOptJSONObject2 == null) {
                jSONObjectOptJSONObject2 = new JSONObject();
            }
            JSONObject jSONObject2 = jSONObjectOptJSONObject2;
            if (!jSONObjectOptJSONObject.isNull(Banner.STABLE_KEY)) {
                String strOptString = jSONObjectOptJSONObject.optString(Banner.STABLE_KEY);
                if (strOptString.length() != 0) {
                    str = strOptString;
                }
                String string = jSONObjectOptJSONObject.getString("id");
                string.getClass();
                String string2 = jSONObjectOptJSONObject.getString(Banner.PLACEMENT_ID);
                string2.getClass();
                String string3 = jSONObjectOptJSONObject.getString(Banner.HTML);
                string3.getClass();
                return new Banner(string, string2, string3, jSONObjectOptJSONObject.getBoolean("is_control"), jSONObjectOptJSONObject.getLong(Banner.EXPIRATION), jSONObjectOptJSONObject.getBoolean("is_test_send"), str, jSONObject2);
            }
            str = null;
            String string4 = jSONObjectOptJSONObject.getString("id");
            string4.getClass();
            String string5 = jSONObjectOptJSONObject.getString(Banner.PLACEMENT_ID);
            string5.getClass();
            String string6 = jSONObjectOptJSONObject.getString(Banner.HTML);
            string6.getClass();
            return new Banner(string4, string5, string6, jSONObjectOptJSONObject.getBoolean("is_control"), jSONObjectOptJSONObject.getLong(Banner.EXPIRATION), jSONObjectOptJSONObject.getBoolean("is_test_send"), str, jSONObject2);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new l$$ExternalSyntheticLambda2(jSONObject, 0), 4, (Object) null);
            return null;
        }
    }

    public static final String a() {
        return "Received null banner object. Not parsing.";
    }
}

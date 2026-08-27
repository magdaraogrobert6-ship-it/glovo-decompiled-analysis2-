package bo.app;

import com.braze.support.BrazeLogger;
import java.util.Iterator;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.safeSetClipToOutline;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class r3 {
    public static final String b(JSONObject jSONObject) {
        return af$$ExternalSyntheticOutline1.m("Failed to parse ChecksumObject fields from: ", jSONObject);
    }

    public final t3 a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            int i = jSONObject.getInt("version");
            long j = jSONObject.getLong("generated_at");
            JSONObject jSONObject2 = jSONObject.getJSONObject("id");
            safeSetClipToOutline safesetcliptooutline = new safeSetClipToOutline();
            Iterator<String> itKeys = jSONObject2.keys();
            itKeys.getClass();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject(next);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("xxhash64");
                    strOptString.getClass();
                    if (strOptString.length() <= 0) {
                        strOptString = null;
                    }
                    if (strOptString != null) {
                        safesetcliptooutline.put(next, strOptString);
                    }
                }
            }
            return new t3(i, j, safesetcliptooutline.IconCompatParcelizer());
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new eh$$ExternalSyntheticLambda0(jSONObject, 2), 4, (Object) null);
            return null;
        }
    }
}

package bo.app;

import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final ArrayList a(JSONArray jSONArray) {
        jSONArray.getClass();
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string = jSONObject.getString("banner_id");
                long j = jSONObject.getLong("dismissal_time");
                string.getClass();
                arrayList.add(new d(string, j));
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c$$ExternalSyntheticLambda0(i, jSONArray, 0), 4, (Object) null);
            }
        }
        return arrayList;
    }

    public static final String a(int i, JSONArray jSONArray) {
        return "Skipping malformed acknowledged dismissal at index " + i + " in array " + jSONArray;
    }
}

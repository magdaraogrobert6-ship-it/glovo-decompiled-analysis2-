package bo.app;

import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import o.hideCurrentlyDisplayingInAppMessage;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class rc extends l2 {
    public final ArrayList l;
    public final boolean m;
    public final k9 n;

    @Override // bo.app.l9
    public final k9 b() {
        return this.n;
    }

    @Override // bo.app.l9
    public final boolean c() {
        return this.m;
    }

    public static final String d() {
        return "Experienced JSONException while creating PushDeliverySendRequest. Returning null.";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc(df dfVar, String str, String str2, ArrayList arrayList) {
        super(new td(str.concat("push/delivery_events"), false), str2, dfVar, 8);
        dfVar.getClass();
        str.getClass();
        arrayList.getClass();
        this.l = arrayList;
        this.m = arrayList.isEmpty();
        this.n = k9.PUSH_DELIVERY_EVENTS;
    }

    @Override // bo.app.l2, bo.app.l9
    public final JSONObject a() {
        JSONObject jSONObjectA = super.a();
        if (jSONObjectA == null) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = this.l;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                mc mcVar = (mc) obj;
                mcVar.e.setValue(mcVar, n1.h[0], this.b);
                jSONArray.put(mcVar.forJsonPut());
            }
            jSONObjectA.put("events", jSONArray);
            String str = this.b;
            if (str != null && !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                jSONObjectA.put("user_id", this.b);
            }
            return jSONObjectA;
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n4$$ExternalSyntheticLambda0(27), 4, (Object) null);
            return null;
        }
    }
}

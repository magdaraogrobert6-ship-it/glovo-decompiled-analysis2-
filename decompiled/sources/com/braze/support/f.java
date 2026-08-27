package com.braze.support;

import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.l$$ExternalSyntheticLambda2;
import com.braze.models.BrazeGeofence;
import java.util.ArrayList;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static final f a = new f();

    public static final String b(JSONObject jSONObject) {
        return af$$ExternalSyntheticOutline1.m("Failed to deserialize geofence Json:", jSONObject);
    }

    public static final ArrayList a(JSONArray jSONArray) {
        jSONArray.getClass();
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject == null) {
                try {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) a, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda0(27), 6, (Object) null);
                } catch (JSONException e) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) a, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new l$$ExternalSyntheticLambda2(jSONObjectOptJSONObject, 16), 4, (Object) null);
                } catch (Exception e2) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) a, BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new l$$ExternalSyntheticLambda2(jSONObjectOptJSONObject, 15), 4, (Object) null);
                }
            } else {
                arrayList.add(new BrazeGeofence(jSONObjectOptJSONObject));
            }
        }
        return arrayList;
    }

    public static final String a() {
        return "Received null or blank geofence Json. Not parsing.";
    }

    public static final String a(JSONObject jSONObject) {
        return af$$ExternalSyntheticOutline1.m("Failed to deserialize geofence Json due to JSONException: ", jSONObject);
    }
}

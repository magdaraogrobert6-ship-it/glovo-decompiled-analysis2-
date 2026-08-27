package bo.app;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.braze.support.StringUtils;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ih extends b {
    public final x9 b;
    public final qe c;
    public final a5 d;
    public final jh e;
    public String f;

    public final void j() {
        synchronized (this) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new l$$ExternalSyntheticLambda0(1), 6, (Object) null);
            this.e.clearData(DataStoreKey.PUSH_TOKEN);
        }
    }

    public static final String e() {
        return "No push token available to add to attributes object.";
    }

    public static final String f() {
        return "Couldn't add push token to outbound json";
    }

    public static final String i() {
        return "Failed to add merged custom attributes back to user object.";
    }

    public static final String k() {
        return "Push token cache cleared via sendPushTokenOnNextExport.";
    }

    public final boolean c(JSONObject jSONObject) {
        if (this.c.a() || this.d.c()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new a5$$ExternalSyntheticLambda0(16, this), 6, (Object) null);
            return false;
        }
        jh jhVar = this.e;
        DataStoreKey dataStoreKey = DataStoreKey.SERIALIZED_USER_OBJECT;
        String string = jSONObject.toString();
        string.getClass();
        jhVar.writeData(dataStoreKey, string);
        return true;
    }

    public final JSONObject h() {
        String string = this.e.readString(DataStoreKey.SERIALIZED_USER_OBJECT, null);
        if (string == null) {
            return new JSONObject();
        }
        try {
            return new JSONObject(string);
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new d4$$ExternalSyntheticLambda6(string, 6), 4, (Object) null);
            return new JSONObject();
        }
    }

    public ih(Context context, x9 x9Var, qe qeVar, a5 a5Var, String str, String str2) {
        context.getClass();
        x9Var.getClass();
        qeVar.getClass();
        a5Var.getClass();
        this.b = x9Var;
        this.c = qeVar;
        this.d = a5Var;
        this.e = new jh(context, str, str2);
        this.f = str;
    }

    @Override // bo.app.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void c(ub ubVar, boolean z) {
        ubVar.getClass();
        JSONObject jSONObject = ubVar.a;
        if (z) {
            DataStoreKey dataStoreKey = DataStoreKey.PUSH_TOKEN;
            if (jSONObject.has(dataStoreKey.getKey())) {
                jh jhVar = this.e;
                String strOptString = jSONObject.optString("push_token");
                strOptString.getClass();
                jhVar.writeData(dataStoreKey, strOptString);
                return;
            }
            return;
        }
        JSONObject jSONObjectH = h();
        JSONObject jSONObjectPlus = JsonUtils.plus(jSONObject, jSONObjectH);
        jSONObjectPlus.remove("push_token");
        JSONObject jSONObjectOptJSONObject = jSONObjectH.optJSONObject("custom");
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("custom");
        try {
            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject2 != null) {
                jSONObjectPlus.put("custom", JsonUtils.plus(jSONObjectOptJSONObject2, jSONObjectOptJSONObject));
            } else {
                if (jSONObjectOptJSONObject == null) {
                    if (jSONObjectOptJSONObject2 != null) {
                        jSONObjectPlus.put("custom", jSONObjectOptJSONObject2);
                    }
                    jh jhVar2 = this.e;
                    DataStoreKey dataStoreKey2 = DataStoreKey.SERIALIZED_USER_OBJECT;
                    String string = jSONObjectPlus.toString();
                    string.getClass();
                    jhVar2.writeData(dataStoreKey2, string);
                }
                jSONObjectPlus.put("custom", jSONObjectOptJSONObject);
            }
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new l$$ExternalSyntheticLambda0(3), 4, (Object) null);
        }
        jh jhVar3 = this.e;
        DataStoreKey dataStoreKey3 = DataStoreKey.SERIALIZED_USER_OBJECT;
        String string2 = jSONObjectPlus.toString();
        string2.getClass();
        jhVar3.writeData(dataStoreKey3, string2);
    }

    public static final String d(String str, Object obj) {
        return "Failed to write to user object json from DataStore with key: [" + str + "] value: [" + obj + "]";
    }

    @Override // bo.app.b
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final ub c() {
        StringUtils.ifNonEmpty(this.f, new f2$$ExternalSyntheticLambda4(6, this));
        JSONObject jSONObjectH = h();
        a(jSONObjectH);
        this.e.clearData(DataStoreKey.SERIALIZED_USER_OBJECT);
        return new ub(jSONObjectH);
    }

    public final void b(JSONObject jSONObject) {
        JSONObject jSONObjectH = h();
        try {
            if (jSONObject == null) {
                jSONObjectH.put("ab_install_attribution", JSONObject.NULL);
            } else {
                JSONObject jSONObjectOptJSONObject = jSONObjectH.optJSONObject("ab_install_attribution");
                if (jSONObjectOptJSONObject != null) {
                    jSONObjectH.put("ab_install_attribution", JsonUtils.plus(jSONObjectOptJSONObject, jSONObject));
                } else {
                    jSONObjectH.put("ab_install_attribution", jSONObject);
                }
            }
            c(jSONObjectH);
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new l$$ExternalSyntheticLambda2(jSONObject, 8), 4, (Object) null);
        }
    }

    public final JSONObject g() {
        JSONObject jSONObjectH = h();
        if (jSONObjectH.has("custom")) {
            try {
                JSONObject jSONObject = jSONObjectH.getJSONObject("custom");
                jSONObject.getClass();
                return jSONObject;
            } catch (JSONException e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new l$$ExternalSyntheticLambda0(2), 4, (Object) null);
            }
        }
        return new JSONObject();
    }

    public static final String d() {
        return "Could not create custom attributes json object from DataStore.";
    }

    public final boolean c(String str, Object obj) {
        Object obj2;
        str.getClass();
        JSONObject jSONObjectH = h();
        if (obj == null) {
            try {
                obj2 = JSONObject.NULL;
            } catch (JSONException e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ih$$ExternalSyntheticLambda2(0, str, obj), 4, (Object) null);
                return false;
            }
        } else {
            obj2 = obj;
        }
        jSONObjectH.put(str, obj2);
        return c(jSONObjectH);
    }

    public static final String b(String str, Object obj) {
        return "Could not write to custom attributes json object with key: [" + str + "] value: [" + obj + "]";
    }

    public static final String a(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to load user object json from DataStore with json string: ", str);
    }

    public final void a(JSONObject jSONObject) {
        jSONObject.getClass();
        try {
            String strB = ((cd) this.b).b();
            if (strB == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new l$$ExternalSyntheticLambda0(4), 7, (Object) null);
            } else {
                if (strB.equals(this.e.readString(DataStoreKey.PUSH_TOKEN, null))) {
                    return;
                }
                jSONObject.put("push_token", strB);
            }
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new l$$ExternalSyntheticLambda0(5), 4, (Object) null);
        }
    }

    public static final createFromParcel a(ih ihVar, String str) {
        str.getClass();
        ihVar.c("user_id", str);
        return createFromParcel.INSTANCE;
    }

    public static final String a(ih ihVar) {
        return "SDK delayed initialization mode: " + ihVar.d.c() + " and GDPR disabled mode: " + ihVar.c.a() + ". Not writing to user cache.";
    }

    public static final String a(String str, JSONObject jSONObject) {
        return "Failed to write to user object json from DataStore with key: [" + str + "] value: [" + jSONObject + "] ";
    }

    public final boolean a(String str, Object obj) {
        Object obj2;
        str.getClass();
        JSONObject jSONObjectG = g();
        if (obj == null) {
            try {
                obj2 = JSONObject.NULL;
            } catch (JSONException e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ih$$ExternalSyntheticLambda9(0, str, obj), 4, (Object) null);
                return false;
            }
        } else {
            obj2 = obj;
        }
        jSONObjectG.put(str, obj2);
        return c("custom", jSONObjectG);
    }
}

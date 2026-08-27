package com.braze.support;

import androidx.sqlite.SQLite;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.d4$$ExternalSyntheticLambda6;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import bo.app.o7$$ExternalSyntheticLambda2;
import com.braze.enums.BrazeDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o.hideCurrentlyDisplayingInAppMessage;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final c a = new c();
    public static final List b = SQLite.read("$add", "$remove", "$update", "$identifier_key", "$identifier_value", "$new_object");

    public static final String b(Object obj) {
        return d$$ExternalSyntheticOutline0.m(((JSONObject) obj).toString().length(), "JSON Object size (", " bytes) exceeds 76800");
    }

    public static final boolean c(String str) {
        if (str != null) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) a, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda0(26), 6, (Object) null);
        return false;
    }

    public static final String d(Object obj) {
        return m1$$ExternalSyntheticOutline0.m(obj, "Could not add unsupported custom attribute type with value: ");
    }

    public final Object a(Object obj, int i) {
        obj.getClass();
        if ((obj instanceof Boolean) || (obj instanceof Integer) || (obj instanceof Float) || (obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof String) {
            return ValidationUtils.ensureBrazeFieldLength((String) obj);
        }
        if (obj instanceof Date) {
            try {
                return DateTimeUtils.formatDate$default((Date) obj, BrazeDateFormat.LONG, null, 2, null);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new o7$$ExternalSyntheticLambda2(2, obj), 4, (Object) null);
                return null;
            }
        }
        if (obj instanceof JSONObject) {
            if (i != 0 || ((JSONObject) obj).toString().length() <= 76800) {
                return a((JSONObject) obj, i + 1);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new o7$$ExternalSyntheticLambda2(3, obj), 6, (Object) null);
            return null;
        }
        if (!(obj instanceof JSONArray)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new o7$$ExternalSyntheticLambda2(5, obj), 6, (Object) null);
            return null;
        }
        if (i != 0 || ((JSONArray) obj).toString().length() <= 76800) {
            return a((JSONArray) obj, i + 1);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new o7$$ExternalSyntheticLambda2(4, obj), 6, (Object) null);
        return null;
    }

    public static final String d() {
        return "Custom attribute value cannot be null.";
    }

    public static final String b() {
        return "JSON Object nested too deep (limit 50). Returning null.";
    }

    public static final String b(String str) {
        return ff$$ExternalSyntheticOutline0.m("Custom attribute key cannot be blocklisted attribute: ", str, ".");
    }

    public static final String c() {
        return "Custom attribute key cannot be null.";
    }

    public static final String c(Object obj) {
        return d$$ExternalSyntheticOutline0.m(((JSONArray) obj).toString().length(), "JSON Array size (", " bytes) exceeds 76800");
    }

    public final JSONObject a(JSONObject jSONObject, int i) throws JSONException {
        if (i > 50) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda0(24), 7, (Object) null);
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        itKeys.getClass();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strEnsureBrazeFieldLength = ValidationUtils.ensureBrazeFieldLength(next);
            c cVar = a;
            if ((hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) strEnsureBrazeFieldLength) | hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) strEnsureBrazeFieldLength, (CharSequence) "$", false) | hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) strEnsureBrazeFieldLength, (CharSequence) ".", false)) & (!b.contains(strEnsureBrazeFieldLength))) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) cVar, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda1(next, 28), 6, (Object) null);
            }
            if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) strEnsureBrazeFieldLength)) {
                if (jSONObject.isNull(next)) {
                    jSONObject2.put(next, JSONObject.NULL);
                } else {
                    Object obj = jSONObject.get(next);
                    obj.getClass();
                    Object objA = cVar.a(obj, i);
                    if (objA == null) {
                        return null;
                    }
                    jSONObject2.put(strEnsureBrazeFieldLength, objA);
                }
            }
        }
        return jSONObject2;
    }

    public static final String a(String str) {
        return ff$$ExternalSyntheticOutline0.m("Nested Custom Attribute Key '", str, "' is invalid.");
    }

    public final JSONArray a(JSONArray jSONArray, int i) throws JSONException {
        if (i > 50) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda0(25), 7, (Object) null);
            return null;
        }
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = jSONArray.get(i2);
            obj.getClass();
            Object objA = a(obj, i);
            if (objA == null) {
                return null;
            }
            jSONArray2.put(objA);
        }
        return jSONArray2;
    }

    public static final String a() {
        return "JSON Object nested too deep (limit 50). Returning null.";
    }

    public static final boolean a(String str, Set set) {
        set.getClass();
        if (str == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) a, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c$$ExternalSyntheticLambda7(0), 6, (Object) null);
            return false;
        }
        if (!set.contains(str)) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) a, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new d4$$ExternalSyntheticLambda6(str, 22), 6, (Object) null);
        return false;
    }

    public static final String a(Object obj) {
        return m1$$ExternalSyntheticOutline0.m(obj, "Error parsing date ");
    }
}

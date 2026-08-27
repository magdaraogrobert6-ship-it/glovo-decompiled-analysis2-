package com.braze.models.outgoing;

import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.j2;
import bo.app.k2;
import com.braze.Constants;
import com.braze.enums.BrazeDateFormat;
import com.braze.models.IPutIntoJson;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.JsonUtils$$ExternalSyntheticLambda1;
import com.braze.support.StringUtils;
import com.braze.support.ValidationUtils;
import com.braze.support.b$$ExternalSyntheticLambda1;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class BrazeProperties implements IPutIntoJson<JSONObject> {
    public static final j2 Companion = new j2();
    private JSONObject propertiesJSONObject;

    public final boolean isInvalid() {
        return getByteSize() > Constants.EVENT_PROPERTIES_MAX_SIZE_BYTES;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addProperty$lambda$1() {
        return "Caught json exception trying to add property.";
    }

    private final JSONObject clean(JSONObject jSONObject, boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            next.getClass();
            arrayList.add(next);
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            if (!z || Companion.a(str)) {
                Object obj2 = jSONObject.get(str);
                if (obj2 instanceof Date) {
                    jSONObject.put(str, DateTimeUtils.formatDate$default((Date) obj2, BrazeDateFormat.LONG, null, 2, null));
                }
                if (obj2 instanceof JSONArray) {
                    jSONObject.put(str, k2.a((JSONArray) obj2));
                }
                if (obj2 instanceof JSONObject) {
                    jSONObject.put(str, clean((JSONObject) obj2, false));
                }
            } else {
                jSONObject.remove(str);
            }
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String clone$lambda$0() {
        return "Failed to clone BrazeProperties";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String get$lambda$0() {
        return "Caught json exception trying to get property.";
    }

    public static final boolean isValidKey(String str) {
        return Companion.a(str);
    }

    public final BrazeProperties clone() {
        try {
            return new BrazeProperties(new JSONObject(forJsonPut().toString()));
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new JsonUtils$$ExternalSyntheticLambda1(11), 4, (Object) null);
            return null;
        }
    }

    public final long getByteSize() {
        String string = this.propertiesJSONObject.toString();
        string.getClass();
        return StringUtils.getByteSize(string);
    }

    public final int getSize() {
        return this.propertiesJSONObject.length();
    }

    public BrazeProperties(Map<String, ?> map) {
        map.getClass();
        this.propertiesJSONObject = new JSONObject();
        this.propertiesJSONObject = clean$default(this, new JSONObject(k2.a(map)), false, 2, null);
    }

    public final BrazeProperties addProperty(String str, Object obj) {
        str.getClass();
        if (!Companion.a(str)) {
            return this;
        }
        try {
            if (obj instanceof Long) {
                this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(str), ((Number) obj).longValue());
                return this;
            }
            if (obj instanceof Integer) {
                this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(str), ((Number) obj).intValue());
                return this;
            }
            if (obj instanceof Double) {
                this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(str), ((Number) obj).doubleValue());
                return this;
            }
            if (obj instanceof Boolean) {
                this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(str), ((Boolean) obj).booleanValue());
                return this;
            }
            if (obj instanceof Date) {
                this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(str), DateTimeUtils.formatDate$default((Date) obj, BrazeDateFormat.LONG, null, 2, null));
                return this;
            }
            if (obj instanceof String) {
                this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(str), ValidationUtils.ensureBrazeFieldLength((String) obj));
                return this;
            }
            if (obj instanceof JSONArray) {
                this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(str), k2.a((JSONArray) obj));
                return this;
            }
            if (obj instanceof JSONObject) {
                this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(str), clean$default(this, (JSONObject) obj, false, 2, null));
                return this;
            }
            if (obj instanceof Map) {
                this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(str), clean$default(this, new JSONObject(k2.a((Map) obj)), false, 2, null));
                return this;
            }
            if (obj == null) {
                this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(str), JSONObject.NULL);
                return this;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda1(str, 8), 6, (Object) null);
            return this;
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new JsonUtils$$ExternalSyntheticLambda1(10), 4, (Object) null);
            return this;
        }
    }

    public final boolean containsProperty(String str) {
        str.getClass();
        return this.propertiesJSONObject.has(str);
    }

    public final Object get(String str) {
        str.getClass();
        try {
            return this.propertiesJSONObject.get(str);
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new JsonUtils$$ExternalSyntheticLambda1(12), 4, (Object) null);
            return null;
        }
    }

    public final Object removeProperty(String str) {
        str.getClass();
        return this.propertiesJSONObject.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addProperty$lambda$0(String str) {
        return ff$$ExternalSyntheticOutline0.m("Value type is not supported. Cannot add property ", str, ".");
    }

    public static /* synthetic */ JSONObject clean$default(BrazeProperties brazeProperties, JSONObject jSONObject, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return brazeProperties.clean(jSONObject, z);
    }

    @Override // com.braze.models.IPutIntoJson
    public JSONObject forJsonPut() {
        return this.propertiesJSONObject;
    }

    public BrazeProperties(JSONObject jSONObject) {
        jSONObject.getClass();
        this.propertiesJSONObject = new JSONObject();
        this.propertiesJSONObject = clean$default(this, jSONObject, false, 2, null);
    }

    public BrazeProperties() {
        this.propertiesJSONObject = new JSONObject();
    }
}

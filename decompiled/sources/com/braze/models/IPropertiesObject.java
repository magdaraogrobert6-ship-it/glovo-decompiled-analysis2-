package com.braze.models;

import bo.app.ih$$ExternalSyntheticLambda9;
import bo.app.n$$ExternalSyntheticLambda2;
import com.braze.support.BrazeLogger;
import o.getCieXyz;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeNodeAtDepth;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public interface IPropertiesObject {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final String PROPERTIES = "properties";
    public static final String PROPERTIES_TYPE = "type";
    public static final String PROPERTIES_TYPE_BOOLEAN = "boolean";
    public static final String PROPERTIES_TYPE_DATETIME = "datetime";
    public static final String PROPERTIES_TYPE_IMAGE = "image";
    public static final String PROPERTIES_TYPE_JSON = "jsonobject";
    public static final String PROPERTIES_TYPE_NUMBER = "number";
    public static final String PROPERTIES_TYPE_STRING = "string";
    public static final String PROPERTIES_VALUE = "value";

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String PROPERTIES = "properties";
        public static final String PROPERTIES_TYPE = "type";
        public static final String PROPERTIES_TYPE_BOOLEAN = "boolean";
        public static final String PROPERTIES_TYPE_DATETIME = "datetime";
        public static final String PROPERTIES_TYPE_IMAGE = "image";
        public static final String PROPERTIES_TYPE_JSON = "jsonobject";
        public static final String PROPERTIES_TYPE_NUMBER = "number";
        public static final String PROPERTIES_TYPE_STRING = "string";
        public static final String PROPERTIES_VALUE = "value";

        private Companion() {
        }
    }

    JSONObject getProperties();

    private default boolean doesKeyExist(String str) {
        if (getProperties().has(str)) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda2(str, 21, this), 6, (Object) null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static String getValue$lambda$0(String str, Object obj) {
        return "Property is not of type " + str + ". It is " + obj + ".";
    }

    default Boolean getBooleanProperty(String str) throws JSONException {
        str.getClass();
        Object value = getValue(str, "boolean");
        if (value instanceof Boolean) {
            return (Boolean) value;
        }
        return null;
    }

    default String getImageProperty(String str) throws JSONException {
        str.getClass();
        Object value = getValue(str, "image");
        if (value instanceof String) {
            return (String) value;
        }
        return null;
    }

    default JSONObject getJSONProperty(String str) throws JSONException {
        str.getClass();
        Object value = getValue(str, "jsonobject");
        if (value instanceof JSONObject) {
            return (JSONObject) value;
        }
        return null;
    }

    default Long getTimestampProperty(String str) throws JSONException {
        str.getClass();
        Object value = getValue(str, "datetime");
        if (value instanceof Long) {
            return (Long) value;
        }
        return null;
    }

    default Number getNumberProperty(String str) throws JSONException {
        str.getClass();
        Object value = getValue(str, "number");
        if (value instanceof Number) {
            return (Number) value;
        }
        return null;
    }

    default String getStringProperty(String str) throws JSONException {
        str.getClass();
        Object value = getValue(str, "string");
        if (value instanceof String) {
            return (String) value;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static String doesKeyExist$lambda$0(String str, IPropertiesObject iPropertiesObject) {
        return "Key " + str + " does not exist in properties " + iPropertiesObject.getProperties() + ".";
    }

    private default Object getValue(String str, String str2) throws JSONException {
        if (!doesKeyExist(str)) {
            return null;
        }
        Object obj = getProperties().get(str);
        obj.getClass();
        JSONObject jSONObject = (JSONObject) obj;
        Object obj2 = jSONObject.get("type");
        int iWrite = getCieXyz.write();
        int iWrite2 = getCieXyz.write();
        int iWrite3 = getCieXyz.write();
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{obj2, str2}, iWrite3)).booleanValue()) {
            return jSONObject.get("value");
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ih$$ExternalSyntheticLambda9(4, str2, obj2), 6, (Object) null);
        return null;
    }
}

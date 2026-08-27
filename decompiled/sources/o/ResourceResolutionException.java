package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import com.huawei.secure.android.common.util.SafeBase64;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ResourceResolutionException {
    public static HashMap read(Type type, JSONObject jSONObject) throws IllegalAccessException, InstantiationException {
        Class cls = (Class) ((ParameterizedType) type).getActualTypeArguments()[1];
        JSONArray jSONArray = new JSONArray(jSONObject.getString("_map_"));
        HashMap map = new HashMap();
        for (int i = 0; i < jSONArray.length(); i += 2) {
            Object objNewInstance = cls.newInstance();
            if (objNewInstance instanceof IMessageEntity) {
                IMessageEntity iMessageEntity = (IMessageEntity) objNewInstance;
                IconCompatParcelizer(jSONArray.getString(i + 1), iMessageEntity);
                map.put(jSONArray.get(i), iMessageEntity);
            } else {
                map.put(jSONArray.get(i), jSONArray.get(i + 1));
            }
        }
        return map;
    }

    public static void read(String str, Object obj, JSONObject jSONObject) throws JSONException, IllegalAccessException {
        if (!(obj instanceof String)) {
            if (obj instanceof Integer) {
                jSONObject.put(str, ((Integer) obj).intValue());
                return;
            }
            if (!(obj instanceof Short) && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Double) && !(obj instanceof Boolean) && !(obj instanceof JSONObject)) {
                if (obj instanceof byte[]) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("_val_type_", 2);
                    jSONObject2.put("_byte_", SafeBase64.encode((byte[]) obj, 2));
                    jSONObject.put(str, jSONObject2);
                    return;
                }
                if (obj instanceof List) {
                    List list = (List) obj;
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("_val_type_", 1);
                    jSONObject3.put("_list_size_", list.size());
                    for (int i = 0; i < list.size(); i++) {
                        read(c8$$ExternalSyntheticOutline0.m(i, "_list_item_"), list.get(i), jSONObject3);
                        if (list.get(i) instanceof IMessageEntity) {
                            jSONObject3.put("_val_type_", 0);
                        }
                    }
                    jSONObject.put(str, jSONObject3);
                    return;
                }
                if (!(obj instanceof Map)) {
                    if (obj instanceof IMessageEntity) {
                        try {
                            jSONObject.put(str, write((IMessageEntity) obj));
                            return;
                        } catch (IllegalAccessException unused) {
                            WrappedCompositionsetContent1211.read("JsonUtil", "IllegalAccessException ");
                            return;
                        }
                    }
                    return;
                }
                JSONArray jSONArray = new JSONArray();
                for (Object obj2 : ((Map) obj).entrySet()) {
                    if (obj2 instanceof Map.Entry) {
                        Object key = ((Map.Entry) obj2).getKey();
                        if (key instanceof IMessageEntity) {
                            key = write((IMessageEntity) key);
                        }
                        jSONArray.put(key);
                    }
                }
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("_val_type_", 3);
                jSONObject4.put("_map_", jSONArray.toString());
                jSONObject.put(str, jSONObject4);
                return;
            }
        }
        jSONObject.put(str, obj);
    }

    public static String write(IMessageEntity iMessageEntity) throws IllegalAccessException, JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Class<?> superclass = iMessageEntity.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            for (Field field : superclass.getDeclaredFields()) {
                if (field.isAnnotationPresent(Packed.class)) {
                    boolean zIsAccessible = field.isAccessible();
                    field.setAccessible(true);
                    String name = field.getName();
                    Object obj = field.get(iMessageEntity);
                    field.setAccessible(zIsAccessible);
                    read(name, obj, jSONObject);
                }
            }
        }
        return jSONObject.toString();
    }

    public static IMessageEntity IconCompatParcelizer(String str, IMessageEntity iMessageEntity) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            for (Class<?> superclass = iMessageEntity.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                for (Field field : superclass.getDeclaredFields()) {
                    if (field.isAnnotationPresent(Packed.class)) {
                        try {
                            serializer(iMessageEntity, field, jSONObject);
                        } catch (IllegalAccessException unused) {
                            WrappedCompositionsetContent1211.read("JsonUtil", "jsonToEntity, set value of the field exception, field name:" + field.getName());
                        }
                    }
                }
            }
        } catch (Exception unused2) {
            WrappedCompositionsetContent1211.read("JsonUtil", "catch Exception when parse jsonString");
        }
        return iMessageEntity;
    }

    public static void serializer(IMessageEntity iMessageEntity, Field field, JSONObject jSONObject) throws JSONException, IllegalAccessException {
        Object obj;
        String name = field.getName();
        Object objRemoteActionCompatParcelizer = null;
        if (jSONObject.has(name)) {
            obj = jSONObject.get(name);
        } else {
            String str = "header";
            if (!jSONObject.has("header") || !jSONObject.getJSONObject("header").has(name)) {
                str = com.deliveryhero.chatsdk.util.PushNotificationParserObj.BODY_KEY;
                if (!jSONObject.has(com.deliveryhero.chatsdk.util.PushNotificationParserObj.BODY_KEY) || !jSONObject.getJSONObject(com.deliveryhero.chatsdk.util.PushNotificationParserObj.BODY_KEY).has(name)) {
                    obj = null;
                }
            }
            jSONObject = jSONObject.getJSONObject(str);
            obj = jSONObject.get(name);
        }
        if (obj != null) {
            try {
                if (field.getType().getName().startsWith("com.huawei") && (field.getType().newInstance() instanceof IMessageEntity) && (obj instanceof String)) {
                    IMessageEntity iMessageEntity2 = (IMessageEntity) field.getType().newInstance();
                    IconCompatParcelizer((String) obj, iMessageEntity2);
                    objRemoteActionCompatParcelizer = iMessageEntity2;
                } else if ((obj instanceof JSONObject) && ((JSONObject) obj).has("_val_type_")) {
                    int i = ((JSONObject) obj).getInt("_val_type_");
                    if (i == 1 || i == 0) {
                        objRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(field.getGenericType(), (JSONObject) obj);
                    } else if (i == 2) {
                        objRemoteActionCompatParcelizer = SafeBase64.decode(((JSONObject) obj).getString("_byte_"), 2);
                    } else if (i == 3) {
                        objRemoteActionCompatParcelizer = read(field.getGenericType(), (JSONObject) obj);
                    } else {
                        WrappedCompositionsetContent1211.read("JsonUtil", "cannot support type : " + i);
                    }
                } else {
                    objRemoteActionCompatParcelizer = obj;
                }
            } catch (InstantiationException unused) {
                WrappedCompositionsetContent1211.read("JsonUtil", "catch InstantiationException");
            }
        }
        if (objRemoteActionCompatParcelizer != null) {
            boolean zIsAccessible = field.isAccessible();
            field.setAccessible(true);
            field.set(iMessageEntity, objRemoteActionCompatParcelizer);
            field.setAccessible(zIsAccessible);
        }
    }

    public static ArrayList RemoteActionCompatParcelizer(Type type, JSONObject jSONObject) throws JSONException, IllegalAccessException, InstantiationException {
        int i = jSONObject.getInt("_list_size_");
        int i2 = jSONObject.getInt("_val_type_");
        ArrayList arrayList = new ArrayList(i);
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = jSONObject.get("_list_item_" + i3);
            if (i2 == 0 && (type instanceof ParameterizedType)) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    Object objNewInstance = ((Class) type2).newInstance();
                    if ((objNewInstance instanceof IMessageEntity) && (obj instanceof String)) {
                        IMessageEntity iMessageEntity = (IMessageEntity) objNewInstance;
                        IconCompatParcelizer((String) obj, iMessageEntity);
                        arrayList.add(iMessageEntity);
                    }
                }
            } else if (i2 == 1) {
                arrayList.add(obj);
            } else {
                WrappedCompositionsetContent1211.read();
            }
        }
        return arrayList;
    }
}

package com.huawei.location.lite.common.util;

import android.text.TextUtils;
import androidx.sqlite.SQLite;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.mapbox.api.directions.v5.models.LegAnnotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.WrappedCompositionsetContent1211;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SystemPropertiesUtil {
    public static volatile String RemoteActionCompatParcelizer;
    public static HashMap read;
    public static volatile String serializer;
    public static volatile String write;

    /* JADX WARN: Code duplicated, block: B:16:0x003c A[Catch: Exception -> 0x0052, TryCatch #1 {Exception -> 0x0052, blocks: (B:2:0x0000, B:4:0x0016, B:7:0x001f, B:11:0x002e, B:13:0x0034, B:14:0x0038, B:16:0x003c, B:19:0x004c, B:20:0x0051, B:17:0x003f, B:18:0x004b, B:9:0x0026), top: B:42:0x0000, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x004c A[Catch: Exception -> 0x0052, TryCatch #1 {Exception -> 0x0052, blocks: (B:2:0x0000, B:4:0x0016, B:7:0x001f, B:11:0x002e, B:13:0x0034, B:14:0x0038, B:16:0x003c, B:19:0x004c, B:20:0x0051, B:17:0x003f, B:18:0x004b, B:9:0x0026), top: B:42:0x0000, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0034 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static String get(String str, String str2) {
        String str3;
        String str4;
        Method method;
        Object[] objArr;
        Object objInvoke;
        try {
            Class cls = ReflectionUtils.getClass("android.os.SystemProperties");
            Class<?>[] clsArr = {String.class, String.class};
            if (cls == null || TextUtils.isEmpty("get")) {
                method = null;
                objArr = new Object[]{str, str2};
                if (method != null) {
                    throw new UnsupportedOperationException();
                }
                try {
                    objInvoke = method.invoke(null, objArr);
                    if (objInvoke instanceof String) {
                        str3 = (String) objInvoke;
                    }
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                    WrappedCompositionsetContent1211.read("ReflectionUtils", "invoke Exception");
                    throw new UnsupportedOperationException();
                }
                str3 = str2;
            } else {
                try {
                    method = cls.getMethod("get", clsArr);
                } catch (NoSuchMethodException unused2) {
                    WrappedCompositionsetContent1211.read("ReflectionUtils", "getMethod NoSuchMethodException");
                    method = null;
                }
                objArr = new Object[]{str, str2};
                if (method != null) {
                    throw new UnsupportedOperationException();
                }
                objInvoke = method.invoke(null, objArr);
                if (objInvoke instanceof String) {
                    str3 = (String) objInvoke;
                }
                str3 = str2;
            }
        } catch (Exception unused3) {
            WrappedCompositionsetContent1211.read("SystemPropertiesUtil", "get SystemProperties Exception");
        }
        if (TextUtils.equals(str3, str2)) {
            synchronized (SystemPropertiesUtil.class) {
                if (read == null) {
                    read();
                }
                str4 = (String) read.get(str);
            }
            if (!TextUtils.isEmpty(str4)) {
                return get(str4, str2);
            }
        }
        return str3;
    }

    public static String serializer() {
        if (!TextUtils.isEmpty(serializer)) {
            return serializer;
        }
        serializer = get("ro.board.platform", "");
        return serializer;
    }

    public static void read() {
        HashMap map = new HashMap(4);
        read = map;
        map.put("ro.hw.country", "msc.sys.country");
        read.put("ro.build.hw_emui_api_level", "ro.build.magic_api_level");
        read.put("ro.build.version.emui", "ro.build.version.magic");
        read.put("ro.config.hw_nlp", "msc.config.nlp");
    }

    public static final int size(LegAnnotation legAnnotation) {
        if (legAnnotation != null) {
            for (List list : SQLite.read(legAnnotation.duration(), legAnnotation.speed(), legAnnotation.distance(), legAnnotation.congestion(), legAnnotation.congestionNumeric(), legAnnotation.maxspeed(), legAnnotation.freeflowSpeed(), legAnnotation.currentSpeed(), legAnnotation.trafficTendency())) {
                if (list != null) {
                    return list.size();
                }
            }
            Map<String, JsonElement> unrecognizedJsonProperties = legAnnotation.getUnrecognizedJsonProperties();
            if (unrecognizedJsonProperties != null) {
                for (Map.Entry<String, JsonElement> entry : unrecognizedJsonProperties.entrySet()) {
                    if (entry.getValue().isJsonArray()) {
                        return entry.getValue().getAsJsonArray().size();
                    }
                }
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("LegAnnotation is empty");
            return 0;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("LegAnnotation is null");
        return 0;
    }
}

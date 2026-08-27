package com.mapbox.auto.value.gson;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.huawei.hms.framework.common.BundleUtil;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;

/* JADX INFO: loaded from: classes4.dex */
@Inherited
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface GenerateTypeAdapter {

    /* JADX INFO: renamed from: com.mapbox.auto.value.gson.GenerateTypeAdapter$1, reason: invalid class name */
    public static final class AnonymousClass1 implements TypeAdapterFactory {
        public final Class typeArrayClass = Array.newInstance((Class<?>) Type.class, 0).getClass();
        public final Map adapters = Collections.synchronizedMap(new LinkedHashMap());

        @Override // com.google.gson.TypeAdapterFactory
        public final TypeAdapter create(Gson gson, TypeToken typeToken) {
            Class rawType = typeToken.getRawType();
            if (!rawType.isAnnotationPresent(GenerateTypeAdapter.class)) {
                return null;
            }
            Class superclass = rawType.getSuperclass();
            if (superclass.isAnnotationPresent(GenerateTypeAdapter.class)) {
                return gson.getAdapter(superclass);
            }
            Constructor constructorFindConstructorForClass = findConstructorForClass(rawType);
            if (constructorFindConstructorForClass == null) {
                return null;
            }
            try {
                return constructorFindConstructorForClass.getParameterTypes().length == 1 ? (TypeAdapter) constructorFindConstructorForClass.newInstance(gson) : (TypeAdapter) constructorFindConstructorForClass.newInstance(gson, ((ParameterizedType) typeToken.getType()).getActualTypeArguments());
            } catch (IllegalAccessException e) {
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.RemoteActionCompatParcelizer("Unable to invoke ", constructorFindConstructorForClass, e);
                return null;
            } catch (InstantiationException e2) {
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.RemoteActionCompatParcelizer("Unable to invoke ", constructorFindConstructorForClass, e2);
                return null;
            } catch (InvocationTargetException e3) {
                Throwable cause = e3.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(c8$$ExternalSyntheticOutline0.m(rawType, "Could not create generated TypeAdapter instance for type "), cause);
                return null;
            }
        }

        public final Constructor findConstructorForClass(Class cls) {
            Constructor<?> constructorFindConstructorForClass;
            Map map = this.adapters;
            Constructor constructor = (Constructor) map.get(cls);
            if (constructor != null) {
                return constructor;
            }
            String name = cls.getName();
            if (name.startsWith("android.") || name.startsWith("java.") || name.startsWith("kotlin.")) {
                return null;
            }
            try {
                try {
                    String strReplace = cls.getName().replace("$", BundleUtil.UNDERLINE_TAG);
                    Class<?> clsLoadClass = cls.getClassLoader().loadClass(strReplace + "_GsonTypeAdapter");
                    try {
                        constructorFindConstructorForClass = clsLoadClass.getDeclaredConstructor(Gson.class);
                        constructorFindConstructorForClass.setAccessible(true);
                    } catch (NoSuchMethodException unused) {
                        constructorFindConstructorForClass = clsLoadClass.getDeclaredConstructor(Gson.class, this.typeArrayClass);
                        constructorFindConstructorForClass.setAccessible(true);
                    }
                } catch (NoSuchMethodException e) {
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("Unable to find binding constructor for ".concat(name), e);
                    return null;
                }
            } catch (ClassNotFoundException unused2) {
                constructorFindConstructorForClass = findConstructorForClass(cls.getSuperclass());
                if (constructorFindConstructorForClass != null) {
                    constructorFindConstructorForClass.setAccessible(true);
                }
            }
            map.put(cls, constructorFindConstructorForClass);
            return constructorFindConstructorForClass;
        }
    }
}

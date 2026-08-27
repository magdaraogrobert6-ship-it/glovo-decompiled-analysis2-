package o;

import com.huawei.hms.framework.common.BundleUtil;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class AndroidGraphicsContext {
    public static final HashMap RemoteActionCompatParcelizer = new HashMap();
    public static final HashMap IconCompatParcelizer = new HashMap();

    /* JADX WARN: Code duplicated, block: B:55:0x010e A[PHI: r1
  0x010e: PHI (r1v6 java.util.ArrayList) = (r1v4 java.util.ArrayList), (r1v4 java.util.ArrayList), (r1v14 java.util.ArrayList) binds: [B:48:0x00eb, B:50:0x00f3, B:54:0x00ff] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x0118  */
    /* JADX WARN: Code duplicated, block: B:59:0x011c  */
    /* JADX WARN: Code duplicated, block: B:69:0x0146  */
    /* JADX WARN: Code duplicated, block: B:83:0x0141 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public static int write(Class cls) {
        Constructor<?> declaredConstructor;
        Class superclass;
        Class<?>[] interfaces;
        int length;
        Class<?> cls2;
        HashMap map = RemoteActionCompatParcelizer;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r4 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r4 != null ? r4.getName() : "";
                name.getClass();
                if (name.length() != 0) {
                    canonicalName.getClass();
                    canonicalName = canonicalName.substring(name.length() + 1);
                }
                canonicalName.getClass();
                String strConcat = setCarryoverInAppMessage.write(canonicalName, ".", BundleUtil.UNDERLINE_TAG).concat("_LifecycleAdapter");
                if (name.length() != 0) {
                    strConcat = name + '.' + strConcat;
                }
                declaredConstructor = Class.forName(strConcat).getDeclaredConstructor(cls);
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                declaredConstructor = null;
            } catch (NoSuchMethodException e) {
                DrawableTransformation.read((Throwable) e);
                return 0;
            }
            HashMap map2 = IconCompatParcelizer;
            if (declaredConstructor != null) {
                map2.put(cls, (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{declaredConstructor}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer()));
            } else {
                skew skewVar = skew.IconCompatParcelizer;
                HashMap map3 = skewVar.write;
                Boolean bool = (Boolean) map3.get(cls);
                if (bool == null) {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        for (Method method : declaredMethods) {
                            if (((AndroidGraphicsContext_androidKt) method.getAnnotation(AndroidGraphicsContext_androidKt.class)) != null) {
                                skewVar.serializer(cls, declaredMethods);
                            }
                        }
                        map3.put(cls, Boolean.FALSE);
                        superclass = cls.getSuperclass();
                        if (superclass == null) {
                            interfaces = cls.getInterfaces();
                            interfaces.getClass();
                            length = interfaces.length;
                            for (int i2 = 0; i2 < length; i2++) {
                                cls2 = interfaces[i2];
                                if (cls2 == null) {
                                }
                            }
                            if (arrayList != null) {
                                map2.put(cls, arrayList);
                            }
                        } else {
                            interfaces = cls.getInterfaces();
                            interfaces.getClass();
                            length = interfaces.length;
                            while (i2 < length) {
                                cls2 = interfaces[i2];
                                if (cls2 == null) {
                                }
                            }
                            if (arrayList != null) {
                                map2.put(cls, arrayList);
                            }
                        }
                    } catch (NoClassDefFoundError e2) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
                    }
                } else if (!bool.booleanValue()) {
                    superclass = cls.getSuperclass();
                    if (superclass == null && accessclearShadowCache.class.isAssignableFrom(superclass)) {
                        superclass.getClass();
                        if (write(superclass) != 1) {
                            Object obj = map2.get(superclass);
                            obj.getClass();
                            arrayList = new ArrayList((Collection) obj);
                            interfaces = cls.getInterfaces();
                            interfaces.getClass();
                            length = interfaces.length;
                            while (i2 < length) {
                                cls2 = interfaces[i2];
                                if (cls2 == null) {
                                }
                            }
                            if (arrayList != null) {
                                map2.put(cls, arrayList);
                            }
                        }
                    } else {
                        interfaces = cls.getInterfaces();
                        interfaces.getClass();
                        length = interfaces.length;
                        while (i2 < length) {
                            cls2 = interfaces[i2];
                            if (cls2 == null && accessclearShadowCache.class.isAssignableFrom(cls2)) {
                                cls2.getClass();
                                if (write(cls2) != 1) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    Object obj2 = map2.get(cls2);
                                    obj2.getClass();
                                    arrayList.addAll((Collection) obj2);
                                }
                            }
                        }
                        if (arrayList != null) {
                            map2.put(cls, arrayList);
                        }
                    }
                }
            }
            i = 2;
        }
        map.put(cls, Integer.valueOf(i));
        return i;
    }

    public static void RemoteActionCompatParcelizer(Constructor constructor, accessclearShadowCache accessclearshadowcache) {
        try {
            Object objNewInstance = constructor.newInstance(accessclearshadowcache);
            objNewInstance.getClass();
            MediaSessionCompatQueueItem.serializer(objNewInstance);
            throw null;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }
}

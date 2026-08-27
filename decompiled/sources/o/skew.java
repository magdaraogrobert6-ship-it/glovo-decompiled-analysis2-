package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class skew {
    public static final skew IconCompatParcelizer = new skew();
    public final HashMap serializer = new HashMap();
    public final HashMap write = new HashMap();

    public static void write(HashMap map, getNativeCanvas getnativecanvas, AndroidColorSpace_androidKt androidColorSpace_androidKt, Class cls) {
        AndroidColorSpace_androidKt androidColorSpace_androidKt2 = (AndroidColorSpace_androidKt) map.get(getnativecanvas);
        if (androidColorSpace_androidKt2 != null && androidColorSpace_androidKt != androidColorSpace_androidKt2) {
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("Method ", getnativecanvas.RemoteActionCompatParcelizer.getName(), " in ", cls.getName(), " already declared with different @OnLifecycleEvent value: previous value ", androidColorSpace_androidKt2, ", new value ", androidColorSpace_androidKt);
        } else if (androidColorSpace_androidKt2 == null) {
            map.put(getnativecanvas, androidColorSpace_androidKt);
        }
    }

    public final setInternalCanvas serializer(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.serializer;
        if (superclass != null) {
            setInternalCanvas setinternalcanvasSerializer = (setInternalCanvas) map2.get(superclass);
            if (setinternalcanvasSerializer == null) {
                setinternalcanvasSerializer = serializer(superclass, null);
            }
            map.putAll(setinternalcanvasSerializer.serializer);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            setInternalCanvas setinternalcanvasSerializer2 = (setInternalCanvas) map2.get(cls2);
            if (setinternalcanvasSerializer2 == null) {
                setinternalcanvasSerializer2 = serializer(cls2, null);
            }
            for (Map.Entry entry : setinternalcanvasSerializer2.serializer.entrySet()) {
                write(map, (getNativeCanvas) entry.getKey(), (AndroidColorSpace_androidKt) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            AndroidGraphicsContext_androidKt androidGraphicsContext_androidKt = (AndroidGraphicsContext_androidKt) method.getAnnotation(AndroidGraphicsContext_androidKt.class);
            if (androidGraphicsContext_androidKt != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!accessisRenderNodeCompatiblecp.class.isAssignableFrom(parameterTypes[0])) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                AndroidColorSpace_androidKt androidColorSpace_androidKtWrite = androidGraphicsContext_androidKt.write();
                if (parameterTypes.length > 1) {
                    if (!AndroidColorSpace_androidKt.class.isAssignableFrom(parameterTypes[1])) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (androidColorSpace_androidKtWrite != AndroidColorSpace_androidKt.ON_ANY) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("cannot have more than 2 params");
                    return null;
                }
                write(map, new getNativeCanvas(method, i), androidColorSpace_androidKtWrite, cls);
                z = true;
            }
        }
        setInternalCanvas setinternalcanvas = new setInternalCanvas(map);
        map2.put(cls, setinternalcanvas);
        this.write.put(cls, Boolean.valueOf(z));
        return setinternalcanvas;
    }
}

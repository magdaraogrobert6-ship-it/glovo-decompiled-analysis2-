package com.braze.support;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.hg$$ExternalSyntheticLambda9;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import o.createInAppMessageEventSubscriber;
import o.instance_delegatelambda0;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class ReflectionUtils {
    public static final ReflectionUtils INSTANCE = new ReflectionUtils();

    private ReflectionUtils() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object constructObjectQuietly$default(ReflectionUtils reflectionUtils, String str, List list, List list2, int i, Object obj) {
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        if ((i & 2) != 0) {
            list = instance_delegatelambda0Var;
        }
        if ((i & 4) != 0) {
            list2 = instance_delegatelambda0Var;
        }
        return reflectionUtils.constructObjectQuietly(str, list, list2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String constructObjectQuietly$lambda$0() {
        return "Failed constructObjectQuietly";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getDeclaredMethodQuietly$lambda$0(String str, createInAppMessageEventSubscriber createinappmessageeventsubscriber) {
        Class cls = (Class) createinappmessageeventsubscriber.IconCompatParcelizer;
        return af$$ExternalSyntheticOutline0.m("Could not find ", str, " on ", cls != null ? cls.getName() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getDeclaredMethodQuietly$lambda$2() {
        return "Failed getDeclaredMethodQuietly";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getMethodQuietly$lambda$0() {
        return "Failed getMethodQuietly";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getMethodQuietly$lambda$1() {
        return "Failed getMethodQuietly";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invokeMethodQuietly$lambda$0() {
        return "Failed invokeMethodQuietly";
    }

    public static final boolean doesMethodExist(String str, String str2, Class<?>... clsArr) {
        str.getClass();
        str2.getClass();
        clsArr.getClass();
        return getMethodQuietly(str, str2, (Class<?>[]) Arrays.copyOf(clsArr, clsArr.length)) != null;
    }

    public static final Method getMethodQuietly(String str, String str2, Class<?>... clsArr) {
        str.getClass();
        str2.getClass();
        clsArr.getClass();
        try {
            return getMethodQuietly(Class.forName(str), str2, (Class<?>[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.D, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda0(10), 4, (Object) null);
            return null;
        }
    }

    public static final onViewAttachedToWindowlambda0 invokeMethodQuietly(Object obj, Method method, Object... objArr) {
        method.getClass();
        objArr.getClass();
        try {
            return new onViewAttachedToWindowlambda0(Boolean.TRUE, method.invoke(obj, Arrays.copyOf(objArr, objArr.length)));
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.D, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda0(9), 4, (Object) null);
            return new onViewAttachedToWindowlambda0(Boolean.FALSE, null);
        }
    }

    public final Object constructObjectQuietly(String str, List<? extends Class<?>> list, List<? extends Object> list2) {
        str.getClass();
        list.getClass();
        list2.getClass();
        try {
            Class<?> cls = Class.forName(str);
            Class[] clsArr = (Class[]) list.toArray(new Class[0]);
            Constructor<?> constructor = cls.getConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
            Object[] array = list2.toArray(new Object[0]);
            return constructor.newInstance(Arrays.copyOf(array, array.length));
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda0(13), 4, (Object) null);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getDeclaredMethodQuietly$lambda$1(String str) {
        return ff$$ExternalSyntheticOutline0.m("Failed to find ", str, " on ${clazz.name} or any parent classes");
    }

    private final Method getDeclaredMethodQuietly(Class<?> cls, String str, Class<?>... clsArr) {
        createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
        createinappmessageeventsubscriber.IconCompatParcelizer = cls;
        while (true) {
            Object obj = createinappmessageeventsubscriber.IconCompatParcelizer;
            if (obj != null) {
                try {
                    return ((Class) obj).getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
                } catch (Exception unused) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.D, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new hg$$ExternalSyntheticLambda9(str, createinappmessageeventsubscriber), 6, (Object) null);
                    createinappmessageeventsubscriber.IconCompatParcelizer = ((Class) createinappmessageeventsubscriber.IconCompatParcelizer).getSuperclass();
                }
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.D, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda1(str, 21), 6, (Object) null);
                return null;
            }
        }
    }

    public static final Method getMethodQuietly(Class<?> cls, String str, Class<?>... clsArr) {
        cls.getClass();
        str.getClass();
        clsArr.getClass();
        try {
            return cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.D, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda0(11), 4, (Object) null);
            return null;
        }
    }

    public final Method getDeclaredMethodQuietly(String str, String str2, Class<?>... clsArr) {
        str.getClass();
        str2.getClass();
        clsArr.getClass();
        try {
            return getDeclaredMethodQuietly(Class.forName(str), str2, (Class<?>[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.D, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda0(12), 4, (Object) null);
            return null;
        }
    }
}

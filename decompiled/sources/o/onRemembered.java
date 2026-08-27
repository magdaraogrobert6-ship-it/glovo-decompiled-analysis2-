package o;

import android.app.Activity;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import okio.Options;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class onRemembered implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ copycp5nf6Adefault RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ onRemembered(copycp5nf6Adefault copycp5nf6adefault, int i) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = copycp5nf6adefault;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002e  */
    /* JADX WARN: Code duplicated, block: B:28:0x009c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0113  */
    /* JADX WARN: Code duplicated, block: B:54:0x0160  */
    /* JADX WARN: Code duplicated, block: B:70:0x01e1  */
    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() throws NoSuchMethodException, ClassNotFoundException {
        boolean z;
        int i = this.serializer;
        Class cls = Integer.TYPE;
        copycp5nf6Adefault copycp5nf6adefault = this.RemoteActionCompatParcelizer;
        Class<?> cls2 = null;
        if (i == 0) {
            Class<?> clsLoadClass = copycp5nf6adefault.read.RemoteActionCompatParcelizer.loadClass("androidx.window.extensions.WindowExtensions");
            clsLoadClass.getClass();
            Method method = clsLoadClass.getMethod("getWindowLayoutComponent", null);
            Class<?> clsLoadClass2 = copycp5nf6adefault.serializer.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
            clsLoadClass2.getClass();
            method.getClass();
            return Boolean.valueOf(java.lang.reflect.Modifier.isPublic(method.getModifiers()) && method.getReturnType().equals(clsLoadClass2));
        }
        if (i == 1) {
            Class<?> clsLoadClass3 = copycp5nf6adefault.serializer.loadClass("androidx.window.extensions.layout.FoldingFeature");
            clsLoadClass3.getClass();
            Method method2 = clsLoadClass3.getMethod("getBounds", null);
            Method method3 = clsLoadClass3.getMethod("getType", null);
            Method method4 = clsLoadClass3.getMethod("getState", null);
            method2.getClass();
            if (method2.getReturnType().equals(Options.Companion.read(displayInAppMessagelambda1.serializer(android.graphics.Rect.class))) && java.lang.reflect.Modifier.isPublic(method2.getModifiers())) {
                method3.getClass();
                if (method3.getReturnType().equals(Options.Companion.read(displayInAppMessagelambda1.serializer(cls))) && java.lang.reflect.Modifier.isPublic(method3.getModifiers())) {
                    method4.getClass();
                    z = method4.getReturnType().equals(Options.Companion.read(displayInAppMessagelambda1.serializer(cls))) && java.lang.reflect.Modifier.isPublic(method4.getModifiers());
                }
            }
            return Boolean.valueOf(z);
        }
        if (i == 2) {
            ClassLoader classLoader = copycp5nf6adefault.serializer;
            Class<?> clsLoadClass4 = classLoader.loadClass("androidx.window.extensions.layout.SupportedWindowFeatures");
            clsLoadClass4.getClass();
            Method method5 = clsLoadClass4.getMethod("getDisplayFoldFeatures", null);
            Type genericReturnType = method5.getGenericReturnType();
            genericReturnType.getClass();
            Type type = ((ParameterizedType) genericReturnType).getActualTypeArguments()[0];
            type.getClass();
            Class cls3 = (Class) type;
            if (java.lang.reflect.Modifier.isPublic(method5.getModifiers()) && method5.getReturnType().equals(List.class)) {
                Class<?> clsLoadClass5 = classLoader.loadClass("androidx.window.extensions.layout.DisplayFoldFeature");
                clsLoadClass5.getClass();
                z = cls3.equals(clsLoadClass5);
            }
            return Boolean.valueOf(z);
        }
        if (i == 3) {
            Class<?> clsLoadClass6 = copycp5nf6adefault.serializer.loadClass("androidx.window.extensions.layout.DisplayFoldFeature");
            clsLoadClass6.getClass();
            Method method6 = clsLoadClass6.getMethod("getType", null);
            Method method7 = clsLoadClass6.getMethod("hasProperty", cls);
            Method method8 = clsLoadClass6.getMethod("hasProperties", int[].class);
            method6.getClass();
            if (java.lang.reflect.Modifier.isPublic(method6.getModifiers())) {
                cls.getClass();
                if (method6.getReturnType().equals(cls)) {
                    method7.getClass();
                    if (java.lang.reflect.Modifier.isPublic(method7.getModifiers())) {
                        Class cls4 = Boolean.TYPE;
                        cls4.getClass();
                        if (method7.getReturnType().equals(cls4)) {
                            method8.getClass();
                            z = java.lang.reflect.Modifier.isPublic(method8.getModifiers()) && method8.getReturnType().equals(cls4);
                        }
                    }
                }
            }
            return Boolean.valueOf(z);
        }
        if (i == 4) {
            ClassLoader classLoader2 = copycp5nf6adefault.serializer;
            Class<?> clsLoadClass7 = classLoader2.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
            clsLoadClass7.getClass();
            Method method9 = clsLoadClass7.getMethod("getSupportedWindowFeatures", null);
            method9.getClass();
            if (java.lang.reflect.Modifier.isPublic(method9.getModifiers())) {
                Class<?> clsLoadClass8 = classLoader2.loadClass("androidx.window.extensions.layout.SupportedWindowFeatures");
                clsLoadClass8.getClass();
                z = method9.getReturnType().equals(clsLoadClass8);
            }
            return Boolean.valueOf(z);
        }
        try {
            Class<?> clsLoadClass9 = copycp5nf6adefault.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.loadClass("java.util.function.Consumer");
            clsLoadClass9.getClass();
            cls2 = clsLoadClass9;
        } catch (ClassNotFoundException unused) {
        }
        if (cls2 != null) {
            Class<?> clsLoadClass10 = copycp5nf6adefault.serializer.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
            clsLoadClass10.getClass();
            Method method10 = clsLoadClass10.getMethod("addWindowLayoutInfoListener", Activity.class, cls2);
            Method method11 = clsLoadClass10.getMethod("removeWindowLayoutInfoListener", cls2);
            method10.getClass();
            if (java.lang.reflect.Modifier.isPublic(method10.getModifiers())) {
                method11.getClass();
                z = java.lang.reflect.Modifier.isPublic(method11.getModifiers());
            }
        }
        return Boolean.valueOf(z);
    }
}

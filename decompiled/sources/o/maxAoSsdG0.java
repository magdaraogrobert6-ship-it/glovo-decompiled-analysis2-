package o;

import android.app.Activity;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes.dex */
public final class maxAoSsdG0 {
    public final ClassLoader RemoteActionCompatParcelizer;

    public maxAoSsdG0(ClassLoader classLoader, int i) {
        if (i != 1) {
            classLoader.getClass();
            this.RemoteActionCompatParcelizer = classLoader;
        } else {
            this.RemoteActionCompatParcelizer = classLoader;
        }
    }

    public halfToFloat RemoteActionCompatParcelizer(Object obj, r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedk, Activity activity, getAmbientShadowColor0d7_KjU getambientshadowcolor0d7_kju) throws IllegalAccessException, ClassNotFoundException, InvocationTargetException {
        activity.getClass();
        floatToHalf floattohalf = new floatToHalf(r8lambdaucgighn8fiyv_vccodeafjfpedk, getambientshadowcolor0d7_kju);
        ClassLoader classLoader = this.RemoteActionCompatParcelizer;
        Class<?> clsLoadClass = classLoader.loadClass("java.util.function.Consumer");
        clsLoadClass.getClass();
        Object objNewProxyInstance = Proxy.newProxyInstance(classLoader, new Class[]{clsLoadClass}, floattohalf);
        objNewProxyInstance.getClass();
        Class<?> cls = obj.getClass();
        Class<?> clsLoadClass2 = classLoader.loadClass("java.util.function.Consumer");
        clsLoadClass2.getClass();
        cls.getMethod("addWindowLayoutInfoListener", Activity.class, clsLoadClass2).invoke(obj, activity, objNewProxyInstance);
        Class<?> cls2 = obj.getClass();
        Class<?> clsLoadClass3 = classLoader.loadClass("java.util.function.Consumer");
        clsLoadClass3.getClass();
        return new halfToFloat(cls2.getMethod("removeWindowLayoutInfoListener", clsLoadClass3), obj, objNewProxyInstance);
    }
}

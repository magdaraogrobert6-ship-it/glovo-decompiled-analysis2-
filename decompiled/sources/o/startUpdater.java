package o;

import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class startUpdater implements InvocationHandler {
    public final Object RemoteActionCompatParcelizer;

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        Object obj2 = this.RemoteActionCompatParcelizer;
        try {
            return Class.forName(method.getDeclaringClass().getName(), true, obj2.getClass().getClassLoader()).getDeclaredMethod(method.getName(), method.getParameterTypes()).invoke(obj2, objArr);
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        } catch (ReflectiveOperationException e2) {
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.RemoteActionCompatParcelizer("Reflection failed for method ", method, e2);
            return null;
        }
    }

    public startUpdater(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
    }
}

package androidx.compose.ui.graphics.layer;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.view.Surface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class SurfaceUtils {
    private static boolean hasRetrievedMethod;
    private static Method lockHardwareCanvasMethod;
    public static final SurfaceUtils INSTANCE = new SurfaceUtils();
    public static final int $stable = 8;

    private SurfaceUtils() {
    }

    public final boolean isLockHardwareCanvasAvailable() {
        return true;
    }

    @SuppressLint
    private final Method resolveLockHardwareCanvasMethod() {
        Method method;
        synchronized (this) {
            method = null;
            try {
                Method method2 = lockHardwareCanvasMethod;
                if (hasRetrievedMethod) {
                    method = method2;
                } else {
                    hasRetrievedMethod = true;
                    Method declaredMethod = Surface.class.getDeclaredMethod("lockHardwareCanvas", null);
                    declaredMethod.setAccessible(true);
                    lockHardwareCanvasMethod = declaredMethod;
                    method = declaredMethod;
                }
            } catch (Throwable unused) {
                lockHardwareCanvasMethod = null;
            }
        }
        return method;
    }

    public final Canvas lockCanvas(Surface surface) {
        return SurfaceVerificationHelper.INSTANCE.lockHardwareCanvas(surface);
    }

    @SuppressLint
    private final Canvas lockCanvasFallback(Surface surface) throws IllegalAccessException, InvocationTargetException {
        Method methodResolveLockHardwareCanvasMethod = resolveLockHardwareCanvasMethod();
        if (methodResolveLockHardwareCanvasMethod == null) {
            return surface.lockCanvas(null);
        }
        Object objInvoke = methodResolveLockHardwareCanvasMethod.invoke(surface, null);
        objInvoke.getClass();
        return (Canvas) objInvoke;
    }
}

package o;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
public final class onRenderProcessGonelambda1 implements replacePrefetchedUrlsWithLocalAssetslambda0 {
    public static final Object[] IconCompatParcelizer;
    public static final Method RemoteActionCompatParcelizer;
    public static final java.util.logging.Logger read = java.util.logging.Logger.getLogger(onRenderProcessGonelambda1.class.getName());
    public static final Constructor serializer;
    public static final RuntimeException write;
    public final Object MediaSessionCompatQueueItem;

    static {
        Method method;
        Constructor<?> constructor;
        try {
            Class<?> cls = Class.forName("java.util.concurrent.atomic.LongAdder");
            method = cls.getMethod("add", Long.TYPE);
            try {
                cls.getMethod("sum", null);
                Constructor<?>[] constructors = cls.getConstructors();
                int length = constructors.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        constructor = null;
                        break;
                    }
                    constructor = constructors[i];
                    if (constructor.getParameterTypes().length == 0) {
                        break;
                    } else {
                        i++;
                    }
                }
                th = null;
            } catch (Throwable th) {
                th = th;
                read.log(Level.FINE, "LongAdder can not be found via reflection, this is normal for JDK7 and below", th);
                constructor = null;
            }
        } catch (Throwable th2) {
            th = th2;
            method = null;
        }
        if (th != null || constructor == null) {
            serializer = null;
            RemoteActionCompatParcelizer = null;
            write = new RuntimeException(th);
        } else {
            serializer = constructor;
            RemoteActionCompatParcelizer = method;
            write = null;
        }
        IconCompatParcelizer = new Object[]{1L};
    }

    @Override // o.replacePrefetchedUrlsWithLocalAssetslambda0
    public final void read() {
        try {
            RemoteActionCompatParcelizer.invoke(this.MediaSessionCompatQueueItem, IconCompatParcelizer);
        } catch (IllegalAccessException e) {
            DrawableTransformation.read((Throwable) e);
        } catch (InvocationTargetException e2) {
            DrawableTransformation.read((Throwable) e2);
        }
    }

    public onRenderProcessGonelambda1() {
        RuntimeException runtimeException = write;
        if (runtimeException != null) {
            throw runtimeException;
        }
        try {
            this.MediaSessionCompatQueueItem = serializer.newInstance(null);
        } catch (IllegalAccessException e) {
            DrawableTransformation.read((Throwable) e);
            throw null;
        } catch (InstantiationException e2) {
            DrawableTransformation.read((Throwable) e2);
            throw null;
        } catch (InvocationTargetException e3) {
            DrawableTransformation.read((Throwable) e3);
            throw null;
        }
    }
}

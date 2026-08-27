package o;

/* JADX INFO: loaded from: classes4.dex */
public abstract class executelambda2 {
    public static final executelambda1 serializer;

    public static void read() {
        serializer.getClass();
    }

    public static void serializer() {
        serializer.getClass();
    }

    public static void write() {
        serializer.getClass();
    }

    static {
        Class<?> cls;
        executelambda1 executelambda1Var;
        try {
            cls = Class.forName("io.perfmark.impl.SecretPerfMarkImpl$PerfMarkImpl");
            th = null;
        } catch (Throwable th) {
            th = th;
            cls = null;
        }
        if (cls != null) {
            try {
                executelambda1Var = (executelambda1) cls.asSubclass(executelambda1.class).getConstructor(getIntentArrayWithConfiguredBackStacklambda4.class).newInstance(executelambda1.read);
            } catch (Throwable th2) {
                th = th2;
                executelambda1Var = null;
            }
        } else {
            executelambda1Var = null;
        }
        if (executelambda1Var != null) {
            serializer = executelambda1Var;
        } else {
            serializer = new executelambda1();
        }
        if (th != null) {
            try {
                if (Boolean.getBoolean("io.perfmark.PerfMark.debug")) {
                    Class<?> cls2 = Class.forName("java.util.logging.Logger");
                    Object objInvoke = cls2.getMethod("getLogger", String.class).invoke(null, executelambda2.class.getName());
                    Class<?> cls3 = Class.forName("java.util.logging.Level");
                    cls2.getMethod("log", cls3, String.class, Throwable.class).invoke(objInvoke, cls3.getField("FINE").get(null), "Error during PerfMark.<clinit>", th);
                }
            } catch (Throwable unused) {
            }
        }
    }
}

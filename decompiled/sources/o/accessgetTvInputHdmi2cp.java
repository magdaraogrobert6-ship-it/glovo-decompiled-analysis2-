package o;

import android.os.Process;
import android.os.WorkSource;
import io.sentry.android.core.SentryLogcatAdapter;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public abstract class accessgetTvInputHdmi2cp {
    public static final Method IconCompatParcelizer;
    public static final Method RemoteActionCompatParcelizer;
    public static final Method read;
    public static Boolean serializer;
    public static final Method write;

    public static boolean RemoteActionCompatParcelizer(WorkSource workSource) {
        Method method = IconCompatParcelizer;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(workSource, null);
                accessgetSystemNavigationDowncp.IconCompatParcelizer(objInvoke);
                return ((Boolean) objInvoke).booleanValue();
            } catch (Exception e) {
                SentryLogcatAdapter.read("WorkSourceUtil", "Unable to check WorkSource emptiness", e);
            }
        }
        Method method2 = RemoteActionCompatParcelizer;
        if (method2 == null) {
            return true;
        }
        try {
            Object objInvoke2 = method2.invoke(workSource, null);
            accessgetSystemNavigationDowncp.IconCompatParcelizer(objInvoke2);
            return ((Integer) objInvoke2).intValue() == 0;
        } catch (Exception e2) {
            SentryLogcatAdapter.IconCompatParcelizer("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            return true;
        }
    }

    public static void serializer(WorkSource workSource, int i, String str) {
        Method method = write;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i), str);
                return;
            } catch (Exception e) {
                SentryLogcatAdapter.IconCompatParcelizer("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                return;
            }
        }
        Method method2 = read;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i));
            } catch (Exception e2) {
                SentryLogcatAdapter.IconCompatParcelizer("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            }
        }
    }

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Class<?> cls = Integer.TYPE;
        Process.myUid();
        try {
            method = WorkSource.class.getMethod("add", cls);
        } catch (Exception unused) {
            method = null;
        }
        read = method;
        try {
            method2 = WorkSource.class.getMethod("add", cls, String.class);
        } catch (Exception unused2) {
            method2 = null;
        }
        write = method2;
        try {
            method3 = WorkSource.class.getMethod("size", null);
        } catch (Exception unused3) {
            method3 = null;
        }
        RemoteActionCompatParcelizer = method3;
        try {
            WorkSource.class.getMethod("get", cls);
        } catch (Exception unused4) {
        }
        try {
            WorkSource.class.getMethod("getName", cls);
        } catch (Exception unused5) {
        }
        try {
            WorkSource.class.getMethod("createWorkChain", null);
        } catch (Exception e) {
            SentryLogcatAdapter.write("WorkSourceUtil", "Missing WorkChain API createWorkChain", e);
        }
        try {
            Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", cls, String.class);
        } catch (Exception e2) {
            SentryLogcatAdapter.write("WorkSourceUtil", "Missing WorkChain class", e2);
        }
        try {
            method4 = WorkSource.class.getMethod("isEmpty", null);
            try {
                method4.setAccessible(true);
            } catch (Exception unused6) {
            }
        } catch (Exception unused7) {
            method4 = null;
        }
        IconCompatParcelizer = method4;
        serializer = null;
    }
}

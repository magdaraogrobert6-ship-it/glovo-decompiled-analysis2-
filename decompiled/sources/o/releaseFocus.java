package o;

import android.os.Build;
import android.os.Trace;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class releaseFocus {
    public static final Method serializer;
    public static final long write;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                write = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                serializer = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception unused) {
            }
        }
    }

    public static boolean serializer() {
        if (Build.VERSION.SDK_INT >= 29) {
            return hasFocusableContent.IconCompatParcelizer();
        }
        try {
            return ((Boolean) serializer.invoke(null, Long.valueOf(write))).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }
}

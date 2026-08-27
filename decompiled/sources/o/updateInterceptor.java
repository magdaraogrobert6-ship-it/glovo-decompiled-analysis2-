package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class updateInterceptor {
    public static final boolean read;
    public static final Class write;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        write = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        read = cls2 != null;
    }

    public static boolean RemoteActionCompatParcelizer() {
        return (write == null || read) ? false : true;
    }
}

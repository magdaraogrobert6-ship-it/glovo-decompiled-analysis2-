package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class pickChildForForwardSearch {
    public static final boolean RemoteActionCompatParcelizer;
    public static final Class serializer;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        serializer = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        RemoteActionCompatParcelizer = cls2 != null;
    }

    public static boolean write() {
        return (serializer == null || RemoteActionCompatParcelizer) ? false : true;
    }
}

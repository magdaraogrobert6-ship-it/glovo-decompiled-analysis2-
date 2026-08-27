package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract class onError {
    public static final Class IconCompatParcelizer;
    public static final boolean read;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        IconCompatParcelizer = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        read = cls2 != null;
    }

    public static boolean IconCompatParcelizer() {
        return (IconCompatParcelizer == null || read) ? false : true;
    }
}

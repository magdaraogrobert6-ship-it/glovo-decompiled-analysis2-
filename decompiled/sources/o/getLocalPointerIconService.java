package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getLocalPointerIconService {
    public static final Class IconCompatParcelizer;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        IconCompatParcelizer = cls;
    }
}

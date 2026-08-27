package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DataStoreKey {
    public static final Class RemoteActionCompatParcelizer;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.sentiance.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        RemoteActionCompatParcelizer = cls;
    }
}

package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class beamBeatsI7lrPNg {
    public static final activeNode IconCompatParcelizer = new activeNode();
    public static final activeNode write;

    static {
        activeNode activenode = null;
        try {
            activenode = (activeNode) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        write = activenode;
    }
}

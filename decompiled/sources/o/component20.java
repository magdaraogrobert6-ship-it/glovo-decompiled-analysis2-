package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class component20 {
    public static final setHasOverlappingRendering RemoteActionCompatParcelizer;
    public static final setHasOverlappingRendering write;

    static {
        setHasOverlappingRendering sethasoverlappingrendering = null;
        try {
            sethasoverlappingrendering = (setHasOverlappingRendering) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        write = sethasoverlappingrendering;
        RemoteActionCompatParcelizer = new setHasOverlappingRendering();
    }
}

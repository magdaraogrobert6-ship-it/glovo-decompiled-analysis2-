package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ensureLookaheadDelegateCreatedui {
    public static final accessgetDefaultDensityp IconCompatParcelizer;
    public static final accessgetDefaultDensityp serializer;

    static {
        accessgetDefaultDensityp accessgetdefaultdensityp = null;
        try {
            accessgetdefaultdensityp = (accessgetDefaultDensityp) Class.forName("com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        IconCompatParcelizer = accessgetdefaultdensityp;
        serializer = new accessgetDefaultDensityp();
    }
}

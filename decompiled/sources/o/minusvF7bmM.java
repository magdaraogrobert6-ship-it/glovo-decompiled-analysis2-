package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class minusvF7bmM {
    public static final getYimpl RemoteActionCompatParcelizer;
    public static final getYimpl serializer;

    static {
        getYimpl getyimpl = null;
        try {
            getyimpl = (getYimpl) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        RemoteActionCompatParcelizer = getyimpl;
        serializer = new getYimpl();
    }
}

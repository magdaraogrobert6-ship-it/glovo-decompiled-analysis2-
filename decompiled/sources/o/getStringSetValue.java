package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract class getStringSetValue {
    public static final getDrawableValue RemoteActionCompatParcelizer;
    public static final getDrawableValue write;

    static {
        getDrawableValue getdrawablevalue = null;
        try {
            getdrawablevalue = (getDrawableValue) Class.forName("com.sentiance.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        RemoteActionCompatParcelizer = getdrawablevalue;
        write = new getDrawableValue();
    }
}

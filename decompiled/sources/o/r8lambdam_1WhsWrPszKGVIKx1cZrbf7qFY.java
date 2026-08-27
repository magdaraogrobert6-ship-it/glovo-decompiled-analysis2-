package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r8lambdam_1WhsWrPszKGVIKx1cZrbf7qFY {
    public static final com.sentiance.protobuf.n0 read;
    public static final com.sentiance.protobuf.n0 serializer;

    static {
        com.sentiance.protobuf.n0 n0Var = null;
        try {
            n0Var = (com.sentiance.protobuf.n0) Class.forName("com.sentiance.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        read = n0Var;
        serializer = new com.sentiance.protobuf.n0();
    }
}

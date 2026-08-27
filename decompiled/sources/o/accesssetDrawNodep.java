package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class accesssetDrawNodep {
    public static final drawDirecteZhPAX0ui read;
    public static final drawDirecteZhPAX0ui write;

    static {
        drawDirecteZhPAX0ui drawdirectezhpax0ui = null;
        try {
            drawdirectezhpax0ui = (drawDirecteZhPAX0ui) Class.forName("com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        read = drawdirectezhpax0ui;
        write = new drawDirecteZhPAX0ui();
    }
}

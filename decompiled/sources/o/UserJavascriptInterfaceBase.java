package o;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class UserJavascriptInterfaceBase {
    public static final /* synthetic */ int[] serializer;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[Rdrawable.values().length];
        write = iArr;
        try {
            iArr[Rdrawable.PLAINTEXT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            write[Rdrawable.TLS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[Rdimen.values().length];
        serializer = iArr2;
        try {
            iArr2[Rdimen.TLS.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            serializer[Rdimen.PLAINTEXT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
    }
}

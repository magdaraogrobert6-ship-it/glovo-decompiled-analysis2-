package o;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class FwFClientevaluateFeatures1 {
    public static final /* synthetic */ int[] serializer;

    static {
        int[] iArr = new int[FwFClientcache2.values().length];
        serializer = iArr;
        try {
            iArr[FwFClientcache2.FLOAT32.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            serializer[FwFClientcache2.INT32.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            serializer[FwFClientcache2.INT16.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            serializer[FwFClientcache2.INT8.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            serializer[FwFClientcache2.UINT8.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            serializer[FwFClientcache2.INT64.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            serializer[FwFClientcache2.BOOL.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            serializer[FwFClientcache2.STRING.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
    }
}

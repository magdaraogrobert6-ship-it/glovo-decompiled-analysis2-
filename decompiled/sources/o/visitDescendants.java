package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class visitDescendants {
    public static final /* synthetic */ int[] serializer;

    static {
        int[] iArr = new int[visitScrollCaptureCandidatesdefault.values().length];
        serializer = iArr;
        try {
            iArr[visitScrollCaptureCandidatesdefault.ECDSA.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            serializer[visitScrollCaptureCandidatesdefault.RSA_SHA256.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            serializer[visitScrollCaptureCandidatesdefault.RSA_SHA256_PSS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            serializer[visitScrollCaptureCandidatesdefault.HMAC_SHA256.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}

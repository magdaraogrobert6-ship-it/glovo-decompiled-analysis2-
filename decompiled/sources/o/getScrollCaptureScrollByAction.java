package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class getScrollCaptureScrollByAction {
    public static final /* synthetic */ int[] read;

    static {
        int[] iArr = new int[visitScrollCaptureCandidatesdefault.values().length];
        read = iArr;
        try {
            iArr[visitScrollCaptureCandidatesdefault.ECDSA.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            read[visitScrollCaptureCandidatesdefault.RSA_SHA256.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            read[visitScrollCaptureCandidatesdefault.RSA_SHA256_PSS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            read[visitScrollCaptureCandidatesdefault.HMAC_SHA256.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}

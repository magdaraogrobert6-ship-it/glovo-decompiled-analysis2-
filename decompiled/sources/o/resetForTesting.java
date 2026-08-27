package o;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class resetForTesting {
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[ilambda0.values().length];
        try {
            iArr[ilambda0.Thin.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ilambda0.Medium.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ilambda0.Thick.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        write = iArr;
    }
}

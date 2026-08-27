package o;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class FwFClientConfig {
    public static final /* synthetic */ int[] IconCompatParcelizer;

    static {
        int[] iArr = new int[FwFClientgetEvaluations1.values().length];
        IconCompatParcelizer = iArr;
        try {
            iArr[FwFClientgetEvaluations1.FROM_APPLICATION_ONLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            IconCompatParcelizer[FwFClientgetEvaluations1.FROM_SYSTEM_ONLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}

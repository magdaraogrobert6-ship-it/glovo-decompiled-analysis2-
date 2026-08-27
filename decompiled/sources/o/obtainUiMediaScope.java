package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class obtainUiMediaScope {
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[AutofillTree.values().length];
        try {
            iArr[AutofillTree.DefaultSpatial.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AutofillTree.FastSpatial.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AutofillTree.SlowSpatial.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[AutofillTree.DefaultEffects.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[AutofillTree.FastEffects.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[AutofillTree.SlowEffects.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        write = iArr;
    }
}

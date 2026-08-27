package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class LayoutModifierNodeminIntrinsicHeight1 {
    public static final /* synthetic */ int[] read;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[invalidateSemanticsui.values().length];
        write = iArr;
        try {
            iArr[invalidateSemanticsui.SYMMETRIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            write[invalidateSemanticsui.ASYMMETRIC_PRIVATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[requestRemeasureui.values().length];
        read = iArr2;
        try {
            iArr2[requestRemeasureui.TINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            read[requestRemeasureui.LEGACY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            read[requestRemeasureui.RAW.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            read[requestRemeasureui.CRUNCHY.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
    }
}

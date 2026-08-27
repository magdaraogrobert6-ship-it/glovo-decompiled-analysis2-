package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class getPolygonr_lszbg {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    public static final /* synthetic */ int[] read;

    static {
        int[] iArr = new int[getBlurRadius.values().length];
        try {
            iArr[getBlurRadius.FILL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[getBlurRadius.FIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        read = iArr;
        int[] iArr2 = new int[getNoneannotations.values().length];
        try {
            iArr2[getNoneannotations.EXACT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[getNoneannotations.INEXACT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        IconCompatParcelizer = iArr2;
    }
}

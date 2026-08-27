package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class h6 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[igExternalSyntheticLambda1.values().length];
        try {
            iArr[igExternalSyntheticLambda1.YIELD.ordinal()] = 1;
            int i = read + 77;
            RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[igExternalSyntheticLambda1.IO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[igExternalSyntheticLambda1.IO_YIELD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[igExternalSyntheticLambda1.COMPUTATION.ordinal()] = 4;
            int i4 = RemoteActionCompatParcelizer + 103;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 4 / 3;
            } else {
                int i6 = 2 % 2;
            }
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[igExternalSyntheticLambda1.NONE.ordinal()] = 5;
            int i7 = 2 % 2;
        } catch (NoSuchFieldError unused5) {
        }
        write = iArr;
    }
}

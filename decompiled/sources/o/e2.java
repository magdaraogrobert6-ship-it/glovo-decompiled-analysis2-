package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class e2 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public static final /* synthetic */ int[] read;

    static {
        int[] iArr = new int[igExternalSyntheticLambda1.values().length];
        try {
            iArr[igExternalSyntheticLambda1.YIELD.ordinal()] = 1;
            int i = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[igExternalSyntheticLambda1.IO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[igExternalSyntheticLambda1.IO_YIELD.ordinal()] = 3;
            int i2 = RemoteActionCompatParcelizer + 103;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[igExternalSyntheticLambda1.COMPUTATION.ordinal()] = 4;
            int i4 = IconCompatParcelizer + 17;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 4 % 4;
            } else {
                int i6 = 2 % 2;
            }
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[igExternalSyntheticLambda1.NONE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        read = iArr;
    }
}

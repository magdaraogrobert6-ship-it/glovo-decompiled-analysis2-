package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class UnsupportedComposeAnimationCompanion {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public static final /* synthetic */ int[] serializer;

    static {
        int[] iArr = new int[restrictConstraintsxF2OJ5Q.values().length];
        try {
            iArr[restrictConstraintsxF2OJ5Q.INITIATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[restrictConstraintsxF2OJ5Q.DISABLED.ordinal()] = 2;
            int i = IconCompatParcelizer + 43;
            RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[restrictConstraintsxF2OJ5Q.NOT_INITIATED.ordinal()] = 3;
            int i4 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[restrictConstraintsxF2OJ5Q.FAILED.ordinal()] = 4;
            int i5 = IconCompatParcelizer + 49;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = 3 % 2;
            } else {
                int i7 = 2 % 2;
            }
        } catch (NoSuchFieldError unused4) {
        }
        serializer = iArr;
    }
}

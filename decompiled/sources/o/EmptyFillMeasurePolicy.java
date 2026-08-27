package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class EmptyFillMeasurePolicy {
    private static int IconCompatParcelizer = 0;
    public static final /* synthetic */ int[] read;
    private static int serializer = 1;

    static {
        int[] iArr = new int[setToggleableState.values().length];
        try {
            iArr[setToggleableState.FACE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[setToggleableState.FINGERPRINT.ordinal()] = 2;
            int i = serializer + 111;
            IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[setToggleableState.BIOMETRICS.ordinal()] = 3;
            int i4 = serializer + 13;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        read = iArr;
    }
}

package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class getMovementFlags {
    private static int IconCompatParcelizer = 1;
    public static final /* synthetic */ int[] read;
    private static int serializer;

    static {
        int[] iArr = new int[MultiSelectListPreferenceSavedState.values().length];
        try {
            iArr[MultiSelectListPreferenceSavedState.NEUTRAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MultiSelectListPreferenceSavedState.SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MultiSelectListPreferenceSavedState.CRITICAL.ordinal()] = 3;
            int i = serializer + 5;
            IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[MultiSelectListPreferenceSavedState.ALERT.ordinal()] = 4;
            int i4 = serializer + 93;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 5 % 2;
            } else {
                int i6 = 2 % 2;
            }
        } catch (NoSuchFieldError unused4) {
        }
        read = iArr;
    }
}

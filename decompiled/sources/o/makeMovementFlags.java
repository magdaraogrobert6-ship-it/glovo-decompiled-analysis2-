package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class makeMovementFlags {
    private static int IconCompatParcelizer = 1;
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;
    private static int serializer;

    static {
        int[] iArr = new int[EditTextPreferenceSavedState.values().length];
        try {
            iArr[EditTextPreferenceSavedState.WEB_INTEGRATION.ordinal()] = 1;
            int i = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EditTextPreferenceSavedState.DEEP_LINK.ordinal()] = 2;
            int i2 = IconCompatParcelizer + 95;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EditTextPreferenceSavedState.EXTERNAL_URL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        RemoteActionCompatParcelizer = iArr;
        int i5 = IconCompatParcelizer + 17;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }
}

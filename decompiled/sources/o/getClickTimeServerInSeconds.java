package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class getClickTimeServerInSeconds {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[fromString.values().length];
        try {
            iArr[fromString.UnexpectedError.ordinal()] = 1;
            int i = serializer + 25;
            IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[fromString.PassVerificationFailed.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[fromString.BaeminAccountBlocked.ordinal()] = 3;
            int i4 = serializer + 55;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[fromString.BrmsAccountUnavailable.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[fromString.BaeminAccountNotFound.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        write = iArr;
    }
}

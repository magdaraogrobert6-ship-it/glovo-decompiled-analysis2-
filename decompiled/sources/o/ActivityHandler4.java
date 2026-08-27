package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class ActivityHandler4 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[fromString.values().length];
        try {
            iArr[fromString.BaeminAccountNotFound.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[fromString.UnexpectedError.ordinal()] = 2;
            int i = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[fromString.PassVerificationFailed.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[fromString.BaeminAccountBlocked.ordinal()] = 4;
            int i2 = 2 % 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[fromString.BrmsAccountUnavailable.ordinal()] = 5;
            int i3 = IconCompatParcelizer + 103;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        } catch (NoSuchFieldError unused5) {
        }
        write = iArr;
        int i6 = RemoteActionCompatParcelizer + 7;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
    }
}

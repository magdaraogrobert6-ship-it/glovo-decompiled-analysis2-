package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class awaitimpl {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;

    static {
        int[] iArr = new int[verifyPlayStorePurchaseI.values().length];
        try {
            iArr[verifyPlayStorePurchaseI.EMAIL.ordinal()] = 1;
            int i = write + 123;
            RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[verifyPlayStorePurchaseI.EMAIL_OR_PHONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[verifyPlayStorePurchaseI.PHONE.ordinal()] = 3;
            int i4 = RemoteActionCompatParcelizer + 125;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 3 % 2;
            } else {
                int i6 = 2 % 2;
            }
        } catch (NoSuchFieldError unused3) {
        }
        IconCompatParcelizer = iArr;
    }
}

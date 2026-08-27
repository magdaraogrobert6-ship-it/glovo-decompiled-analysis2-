package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class afExternalSyntheticOutline1 {
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;
    private static int read = 1;
    private static int write;

    static {
        int[] iArr = new int[verifyPlayStorePurchaseI.values().length];
        try {
            iArr[verifyPlayStorePurchaseI.EMAIL.ordinal()] = 1;
            int i = write + 51;
            read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[verifyPlayStorePurchaseI.PHONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[verifyPlayStorePurchaseI.EMAIL_OR_PHONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        RemoteActionCompatParcelizer = iArr;
        int i4 = read + 125;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 24 / 0;
        }
    }
}

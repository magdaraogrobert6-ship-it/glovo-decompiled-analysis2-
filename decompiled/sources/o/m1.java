package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class m1 {
    private static int read = 0;
    private static int serializer = 1;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[verifyPlayStorePurchaseI.values().length];
        try {
            iArr[verifyPlayStorePurchaseI.PHONE.ordinal()] = 1;
            int i = read + 107;
            serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[verifyPlayStorePurchaseI.EMAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[verifyPlayStorePurchaseI.EMAIL_OR_PHONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        write = iArr;
        int i4 = serializer + 85;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }
}

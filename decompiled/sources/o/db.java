package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class db {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public static final /* synthetic */ int[] serializer;

    static {
        int[] iArr = new int[verifyPlayStorePurchaseI.values().length];
        try {
            iArr[verifyPlayStorePurchaseI.PHONE.ordinal()] = 1;
            int i = read + 21;
            RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[verifyPlayStorePurchaseI.EMAIL.ordinal()] = 2;
            int i4 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[verifyPlayStorePurchaseI.EMAIL_OR_PHONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        serializer = iArr;
        int i5 = read + 67;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}

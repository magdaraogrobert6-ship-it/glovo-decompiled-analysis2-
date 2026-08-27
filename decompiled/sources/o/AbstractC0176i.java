package o;

/* JADX INFO: renamed from: o.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC0176i {
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;
    private static int serializer = 0;
    private static int write = 1;

    static {
        int[] iArr = new int[verifyPlayStorePurchaseI.values().length];
        try {
            iArr[verifyPlayStorePurchaseI.PHONE.ordinal()] = 1;
            int i = serializer + 29;
            write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (Exception e) {
            throw e;
        } catch (NoSuchFieldError unused) {
        }
        RemoteActionCompatParcelizer = iArr;
        int i4 = write + 83;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }
}

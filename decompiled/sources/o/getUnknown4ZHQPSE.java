package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class getUnknown4ZHQPSE {
    private static int RemoteActionCompatParcelizer = 0;
    public static final /* synthetic */ int[] serializer;
    private static int write = 1;

    static {
        int[] iArr = new int[setCurrentItemInternal.values().length];
        try {
            iArr[setCurrentItemInternal.ShowPushNotification.ordinal()] = 1;
            int i = RemoteActionCompatParcelizer + 11;
            write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[setCurrentItemInternal.IgnorePushNotification.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[setCurrentItemInternal.DuplicatePushForNewDelivery.ordinal()] = 3;
            int i3 = write + 5;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                int i4 = 2 % 2;
            }
        } catch (NoSuchFieldError unused3) {
        }
        serializer = iArr;
    }
}

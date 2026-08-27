package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class generateBridgeToken {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;

    static {
        int[] iArr = new int[enableBridgeSecurity.values().length];
        try {
            iArr[enableBridgeSecurity.PRIMARY_BIG.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[enableBridgeSecurity.PRIMARY_SMALL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[enableBridgeSecurity.SECONDARY_BIG.ordinal()] = 3;
            int i = write + 49;
            RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[enableBridgeSecurity.SECONDARY_SMALL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[enableBridgeSecurity.TERTIARY.ordinal()] = 5;
            int i4 = RemoteActionCompatParcelizer + 63;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        } catch (NoSuchFieldError unused5) {
        }
        IconCompatParcelizer = iArr;
    }
}

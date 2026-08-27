package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class lambda34 {
    private static int IconCompatParcelizer = 1;
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;
    private static int serializer;

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
            int i = serializer + 39;
            IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i2 = 3 / 2;
            } else {
                int i3 = 2 % 2;
            }
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[enableBridgeSecurity.SECONDARY_SMALL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[enableBridgeSecurity.TERTIARY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        RemoteActionCompatParcelizer = iArr;
        int i4 = serializer + 89;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }
}

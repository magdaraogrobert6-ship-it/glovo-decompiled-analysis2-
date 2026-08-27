package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class isIdentity {
    private static int IconCompatParcelizer = 1;
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;
    private static int serializer;

    static {
        int[] iArr = new int[LayerSnapshotV22.values().length];
        try {
            iArr[LayerSnapshotV22.ERROR.ordinal()] = 1;
            int i = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LayerSnapshotV22.INFO.ordinal()] = 2;
            int i2 = serializer + 101;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 5 / 3;
            } else {
                int i4 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        RemoteActionCompatParcelizer = iArr;
        int i5 = serializer + 9;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 99 / 0;
        }
    }
}

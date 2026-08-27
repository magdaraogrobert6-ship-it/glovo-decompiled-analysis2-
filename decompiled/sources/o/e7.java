package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class e7 {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 1;
    public static final /* synthetic */ int[] read;
    private static int serializer;

    static {
        int[] iArr = new int[updateHasCallbacks.values().length];
        try {
            iArr[updateHasCallbacks.Initial.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[updateHasCallbacks.CenterButton.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[updateHasCallbacks.MapVisibleAreaChange.ordinal()] = 3;
            int i = serializer + 91;
            RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        read = iArr;
        int[] iArr2 = new int[g5.values().length];
        try {
            iArr2[g5.IF_MAP_CENTERED_MANUALLY.ordinal()] = 1;
            int i4 = RemoteActionCompatParcelizer + 35;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[g5.ALWAYS.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[g5.NEVER.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        IconCompatParcelizer = iArr2;
    }
}

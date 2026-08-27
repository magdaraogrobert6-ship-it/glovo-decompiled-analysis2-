package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class onAmazonAdIdRead {
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;
    private static int read = 1;
    private static int serializer;

    static {
        int[] iArr = new int[onServiceConnected.values().length];
        try {
            iArr[onServiceConnected.WORK_NOW.ordinal()] = 1;
            int i = serializer + 25;
            read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[onServiceConnected.WORK_NOW_LOW_FILL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[onServiceConnected.GO_AND_START_NOW.ordinal()] = 3;
            int i4 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[onServiceConnected.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        RemoteActionCompatParcelizer = iArr;
        int i5 = serializer + 95;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            throw null;
        }
    }
}

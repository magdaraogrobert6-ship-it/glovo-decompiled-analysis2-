package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class forEachIntersection {
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;
    private static int read = 0;
    private static int serializer = 1;

    static {
        int[] iArr = new int[getMnc.values().length];
        try {
            iArr[getMnc.SESSION_STARTED.ordinal()] = 1;
            int i = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[getMnc.SESSION_ENDED.ordinal()] = 2;
            int i2 = serializer + 73;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        RemoteActionCompatParcelizer = iArr;
        int i4 = read + 89;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }
}

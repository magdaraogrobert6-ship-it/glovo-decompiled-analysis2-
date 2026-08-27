package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class jsonArrayToArray {
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;
    private static int serializer = 0;
    private static int write = 1;

    static {
        int[] iArr = new int[fieldToDouble.values().length];
        try {
            iArr[fieldToDouble.Complete.ordinal()] = 1;
            int i = write + 59;
            serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[fieldToDouble.Active.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[fieldToDouble.Inactive.ordinal()] = 3;
            int i3 = write + 11;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                int i4 = 2 % 2;
            }
        } catch (NoSuchFieldError unused3) {
        }
        RemoteActionCompatParcelizer = iArr;
    }
}

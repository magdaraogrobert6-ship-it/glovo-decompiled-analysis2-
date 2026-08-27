package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class getTextBeforeCursor {
    public static final /* synthetic */ int[] read;
    private static int serializer = 0;
    private static int write = 1;

    static {
        int[] iArr = new int[copywBHncE4.values().length];
        try {
            iArr[copywBHncE4.Alert.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[copywBHncE4.Success.ordinal()] = 2;
            int i = serializer + 121;
            write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        read = iArr;
        int i3 = write + 59;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }
}

package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class performLowMemory {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;

    static {
        int[] iArr = new int[performDestroyView.values().length];
        try {
            iArr[performDestroyView.DEFAULT.ordinal()] = 1;
            int i = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[performDestroyView.DF_ENABLED_WORKING.ordinal()] = 2;
            int i2 = serializer + 85;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[performDestroyView.DF_ENABLED_PAUSED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[performDestroyView.TURN_BY_TURN_NAVIGATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[performDestroyView.DF_ENABLED_STACKED_DELIVERY_LIST.ordinal()] = 5;
            int i5 = RemoteActionCompatParcelizer + 61;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[performDestroyView.LAST_STOP.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        IconCompatParcelizer = iArr;
    }
}

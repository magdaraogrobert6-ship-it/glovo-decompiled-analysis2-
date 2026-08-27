package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class tryToGetResponse {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;

    static {
        int[] iArr = new int[androidx.compose.ui.state.ToggleableState.values().length];
        try {
            iArr[androidx.compose.ui.state.ToggleableState.Off.ordinal()] = 1;
            int i = RemoteActionCompatParcelizer + 105;
            serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (Exception e) {
            throw e;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[androidx.compose.ui.state.ToggleableState.On.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[androidx.compose.ui.state.ToggleableState.Indeterminate.ordinal()] = 3;
            int i4 = serializer + 87;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        } catch (NoSuchFieldError unused3) {
        }
        IconCompatParcelizer = iArr;
    }
}

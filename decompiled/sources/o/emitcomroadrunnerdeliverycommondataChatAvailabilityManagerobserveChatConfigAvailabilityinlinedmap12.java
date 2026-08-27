package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class emitcomroadrunnerdeliverycommondataChatAvailabilityManagerobserveChatConfigAvailabilityinlinedmap12 {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;

    static {
        int[] iArr = new int[ActivityHandler.valuesCustom().length];
        try {
            iArr[ActivityHandler.ALREADY_AVAILABLE_NOT_REQUESTED.ordinal()] = 1;
            int i = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ActivityHandler.REQUESTED.ordinal()] = 2;
            int i2 = write + 51;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        IconCompatParcelizer = iArr;
        int i5 = write + 105;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }
}

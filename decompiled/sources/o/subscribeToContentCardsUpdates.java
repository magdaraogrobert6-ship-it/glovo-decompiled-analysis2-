package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class subscribeToContentCardsUpdates {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    private static int serializer = 0;
    private static int write = 1;

    static {
        int[] iArr = new int[subscribeToChangeUserEvents.values().length];
        try {
            iArr[subscribeToChangeUserEvents.RIDER.ordinal()] = 1;
            int i = write + 51;
            serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[subscribeToChangeUserEvents.APPLICANT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        IconCompatParcelizer = iArr;
        int i4 = write + 61;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }
}

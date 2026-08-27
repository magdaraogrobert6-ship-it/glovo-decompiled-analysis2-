package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class unsubscribeFromBannersDismissedEventandroid_sdk_base_release {
    private static int RemoteActionCompatParcelizer = 1;
    public static final /* synthetic */ int[] serializer;
    private static int write;

    static {
        int[] iArr = new int[subscribeToChangeUserEvents.values().length];
        try {
            iArr[subscribeToChangeUserEvents.RIDER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[subscribeToChangeUserEvents.APPLICANT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[subscribeToChangeUserEvents.SKIP.ordinal()] = 3;
            int i = RemoteActionCompatParcelizer + 61;
            write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        serializer = iArr;
        int i4 = write + 83;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }
}

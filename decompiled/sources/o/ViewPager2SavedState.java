package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class ViewPager2SavedState {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[deleteEventMetadata.values().length];
        try {
            iArr[deleteEventMetadata.Firestore.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[deleteEventMetadata.Remote.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[deleteEventMetadata.Local.ordinal()] = 3;
            int i = RemoteActionCompatParcelizer + 87;
            serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i2 = 3 % 3;
            } else {
                int i3 = 2 % 2;
            }
        } catch (NoSuchFieldError unused3) {
        }
        write = iArr;
        int i4 = RemoteActionCompatParcelizer + 69;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }
}

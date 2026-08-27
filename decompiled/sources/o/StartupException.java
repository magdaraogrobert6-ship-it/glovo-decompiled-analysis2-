package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class StartupException {
    private static int RemoteActionCompatParcelizer = 0;
    public static final /* synthetic */ int[] read;
    private static int serializer = 1;

    static {
        int[] iArr = new int[RoomOpenHelperDelegate.values().length];
        try {
            iArr[RoomOpenHelperDelegate.HeadLeft.ordinal()] = 1;
            int i = 2 % 2;
        } catch (Exception e) {
            throw e;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RoomOpenHelperDelegate.HeadRight.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RoomOpenHelperDelegate.Smile.ordinal()] = 3;
            int i2 = serializer + 47;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 4 / 5;
            } else {
                int i4 = 2 % 2;
            }
        } catch (NoSuchFieldError unused3) {
        }
        read = iArr;
        int i5 = serializer + 21;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }
}

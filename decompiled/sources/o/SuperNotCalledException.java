package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class SuperNotCalledException {
    private static int RemoteActionCompatParcelizer = 0;
    public static final /* synthetic */ int[] read;
    private static int write = 1;

    static {
        int[] iArr = new int[FragmentManagerSaveBackStackState.values().length];
        try {
            iArr[FragmentManagerSaveBackStackState.DEFAULT.ordinal()] = 1;
        } catch (Exception e) {
            throw e;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FragmentManagerSaveBackStackState.ACCEPTING_DELIVERIES.ordinal()] = 2;
            int i = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[FragmentManagerSaveBackStackState.ACCEPTING_DELIVERIES_NO_HELP_CENTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[FragmentManagerSaveBackStackState.TURN_BY_TURN_NAVIGATION.ordinal()] = 4;
            int i2 = RemoteActionCompatParcelizer + 13;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[FragmentManagerSaveBackStackState.LAST_STOP.ordinal()] = 5;
            int i4 = write + 125;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } catch (NoSuchFieldError unused5) {
        }
        read = iArr;
    }
}

package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class FragmentReuseViolation {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;

    static {
        int[] iArr = new int[FragmentManagerSaveBackStackState.values().length];
        try {
            iArr[FragmentManagerSaveBackStackState.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FragmentManagerSaveBackStackState.ACCEPTING_DELIVERIES.ordinal()] = 2;
            int i = write + 29;
            RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[FragmentManagerSaveBackStackState.ACCEPTING_DELIVERIES_NO_HELP_CENTER.ordinal()] = 3;
            int i3 = RemoteActionCompatParcelizer + 69;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                int i4 = 2 % 2;
            }
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[FragmentManagerSaveBackStackState.TURN_BY_TURN_NAVIGATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[FragmentManagerSaveBackStackState.LAST_STOP.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        IconCompatParcelizer = iArr;
    }
}

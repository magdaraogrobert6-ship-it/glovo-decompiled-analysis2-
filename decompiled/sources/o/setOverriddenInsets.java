package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class setOverriddenInsets {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public static final /* synthetic */ int[] read;

    static {
        int[] iArr = new int[instantiateActivity.values().length];
        try {
            iArr[instantiateActivity.GO_AND_START.ordinal()] = 1;
            int i = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[instantiateActivity.NOT_AVAILABLE_YET.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[instantiateActivity.NOT_AVAILABLE.ordinal()] = 3;
            int i2 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[instantiateActivity.START_NOW.ordinal()] = 4;
            int i3 = IconCompatParcelizer + 45;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                int i4 = 2 % 2;
            }
        } catch (NoSuchFieldError unused4) {
        }
        read = iArr;
        int i5 = RemoteActionCompatParcelizer + 1;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}

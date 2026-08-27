package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class getBoundingRectsFromInsets {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    public static final /* synthetic */ int[] read;
    private static int serializer = 0;
    private static int write = 1;

    static {
        int[] iArr = new int[sc.values().length];
        try {
            iArr[sc.START_NOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[sc.SCHEDULE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        IconCompatParcelizer = iArr;
        int[] iArr2 = new int[instantiateActivity.values().length];
        try {
            iArr2[instantiateActivity.START_NOW.ordinal()] = 1;
            int i = write + 73;
            serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[instantiateActivity.GO_AND_START.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[instantiateActivity.NOT_AVAILABLE_YET.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[instantiateActivity.NOT_AVAILABLE.ordinal()] = 4;
            int i3 = serializer + 69;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i4 = 2 % 2;
            }
        } catch (NoSuchFieldError unused6) {
        }
        read = iArr2;
    }
}

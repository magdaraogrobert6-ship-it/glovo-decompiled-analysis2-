package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class superDispatchKeyEvent {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;
    public static final /* synthetic */ int[] read;
    private static int serializer = 0;
    private static int write = 1;

    static {
        int[] iArr = new int[onServiceConnected.values().length];
        try {
            iArr[onServiceConnected.WORK_NOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[onServiceConnected.WORK_NOW_LOW_FILL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[onServiceConnected.GO_AND_START_NOW.ordinal()] = 3;
            int i = serializer + 99;
            write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[onServiceConnected.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        RemoteActionCompatParcelizer = iArr;
        int[] iArr2 = new int[instantiateActivity.values().length];
        try {
            iArr2[instantiateActivity.START_NOW.ordinal()] = 1;
            int i4 = serializer + 39;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } catch (Exception e) {
            throw e;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[instantiateActivity.GO_AND_START.ordinal()] = 2;
            int i7 = 2 % 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[instantiateActivity.NOT_AVAILABLE_YET.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[instantiateActivity.NOT_AVAILABLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        IconCompatParcelizer = iArr2;
        int[] iArr3 = new int[sc.values().length];
        try {
            iArr3[sc.SCHEDULE.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[sc.START_NOW.ordinal()] = 2;
            int i8 = 2 % 2;
        } catch (NoSuchFieldError unused10) {
        }
        read = iArr3;
    }
}

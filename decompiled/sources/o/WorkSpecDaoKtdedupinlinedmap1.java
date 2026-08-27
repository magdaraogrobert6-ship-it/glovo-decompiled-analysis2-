package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class WorkSpecDaoKtdedupinlinedmap1 {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;

    static {
        int[] iArr = new int[WorkDatabase_Impl.values().length];
        try {
            iArr[WorkDatabase_Impl.REQUIRED_NOT_WORKING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WorkDatabase_Impl.REQUIRED_PREPARING_TO_WORK.ordinal()] = 2;
            int i = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[WorkDatabase_Impl.REQUIRED_ON_BREAK.ordinal()] = 3;
            int i2 = RemoteActionCompatParcelizer + 69;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[WorkDatabase_Impl.REQUIRED_SUSPENDED.ordinal()] = 4;
            int i5 = read + 61;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = 5 % 2;
            } else {
                int i7 = 2 % 2;
            }
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[WorkDatabase_Impl.NOT_REQUIRED_WORKING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[WorkDatabase_Impl.NOT_REQUIRED_FEATURE_DISABLED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        IconCompatParcelizer = iArr;
    }
}

package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class WorkerWrapperlaunch1 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public static final /* synthetic */ int[] read;

    static {
        int[] iArr = new int[WorkDatabase_Impl.values().length];
        try {
            iArr[WorkDatabase_Impl.REQUIRED_NOT_WORKING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WorkDatabase_Impl.REQUIRED_PREPARING_TO_WORK.ordinal()] = 2;
            int i = IconCompatParcelizer + 113;
            RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[WorkDatabase_Impl.REQUIRED_ON_BREAK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[WorkDatabase_Impl.REQUIRED_SUSPENDED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[WorkDatabase_Impl.NOT_REQUIRED_WORKING.ordinal()] = 5;
            int i4 = IconCompatParcelizer + 93;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[WorkDatabase_Impl.NOT_REQUIRED_FEATURE_DISABLED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        read = iArr;
    }
}

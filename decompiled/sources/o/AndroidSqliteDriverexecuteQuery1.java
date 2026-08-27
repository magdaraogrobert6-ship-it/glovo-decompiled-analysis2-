package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AndroidSqliteDriverexecuteQuery1 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public static final /* synthetic */ int[] read;

    static {
        int[] iArr = new int[LogSqliteDriver.values().length];
        try {
            iArr[LogSqliteDriver.ManualLogin.ordinal()] = 1;
        } catch (Exception e) {
            throw e;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LogSqliteDriver.TWO_FA.ordinal()] = 2;
            int i = RemoteActionCompatParcelizer + 67;
            IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LogSqliteDriver.OTP.ordinal()] = 3;
            int i4 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[LogSqliteDriver.ApplicationFinished.ordinal()] = 4;
            int i5 = IconCompatParcelizer + 97;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
        } catch (NoSuchFieldError unused4) {
        }
        read = iArr;
    }
}

package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class d4ExternalSyntheticLambda6 {
    private static int RemoteActionCompatParcelizer = 1;
    public static final /* synthetic */ int[] read;
    private static int write;

    static {
        int[] iArr = new int[LogSqliteDrivernewTransaction1.values().length];
        try {
            iArr[LogSqliteDrivernewTransaction1.APPLICATION_URL_SAVED.ordinal()] = 1;
            int i = RemoteActionCompatParcelizer + 55;
            write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LogSqliteDrivernewTransaction1.APPLICATION_URL_DELETED.ordinal()] = 2;
            int i4 = write + 85;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        read = iArr;
    }
}

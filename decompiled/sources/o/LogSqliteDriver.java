package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class LogSqliteDriver {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ LogSqliteDriver[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    public static final LogSqliteDriver ManualLogin = new LogSqliteDriver("ManualLogin", 0);
    public static final LogSqliteDriver OTP = new LogSqliteDriver("OTP", 1);
    public static final LogSqliteDriver ApplicationFinished = new LogSqliteDriver("ApplicationFinished", 2);
    public static final LogSqliteDriver TWO_FA = new LogSqliteDriver("TWO_FA", 3);

    private LogSqliteDriver(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 9;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 67;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        LogSqliteDriver[] logSqliteDriverArr$values = $values();
        $VALUES = logSqliteDriverArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) logSqliteDriverArr$values);
        int i = RemoteActionCompatParcelizer + 47;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static LogSqliteDriver valueOf(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 115;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        LogSqliteDriver logSqliteDriver = (LogSqliteDriver) Enum.valueOf(LogSqliteDriver.class, str);
        int i4 = serializer + 9;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 23 / 0;
        }
        return logSqliteDriver;
    }

    public static LogSqliteDriver[] values() {
        int i = 2 % 2;
        int i2 = serializer + 87;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (LogSqliteDriver[]) $VALUES.clone();
        }
        int i3 = 21 / 0;
        return (LogSqliteDriver[]) $VALUES.clone();
    }

    private static final /* synthetic */ LogSqliteDriver[] $values() {
        LogSqliteDriver[] logSqliteDriverArr;
        int i = 2 % 2;
        int i2 = serializer + 57;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        if (i2 % 2 != 0) {
            LogSqliteDriver logSqliteDriver = ManualLogin;
            LogSqliteDriver logSqliteDriver2 = OTP;
            LogSqliteDriver logSqliteDriver3 = ApplicationFinished;
            LogSqliteDriver logSqliteDriver4 = TWO_FA;
            logSqliteDriverArr = new LogSqliteDriver[5];
            logSqliteDriverArr[1] = logSqliteDriver;
            logSqliteDriverArr[0] = logSqliteDriver2;
            logSqliteDriverArr[2] = logSqliteDriver3;
            logSqliteDriverArr[2] = logSqliteDriver4;
        } else {
            logSqliteDriverArr = new LogSqliteDriver[]{ManualLogin, OTP, ApplicationFinished, TWO_FA};
        }
        int i4 = i3 + 11;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 85 / 0;
        }
        return logSqliteDriverArr;
    }
}

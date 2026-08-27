package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class LogSqliteDrivernewTransaction1 {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ LogSqliteDrivernewTransaction1[] $VALUES;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;
    public static final LogSqliteDrivernewTransaction1 APPLICATION_URL_SAVED = new LogSqliteDrivernewTransaction1("APPLICATION_URL_SAVED", 0);
    public static final LogSqliteDrivernewTransaction1 APPLICATION_URL_DELETED = new LogSqliteDrivernewTransaction1("APPLICATION_URL_DELETED", 1);

    private LogSqliteDrivernewTransaction1(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 57;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 77;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        LogSqliteDrivernewTransaction1[] logSqliteDrivernewTransaction1Arr$values = $values();
        $VALUES = logSqliteDrivernewTransaction1Arr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) logSqliteDrivernewTransaction1Arr$values);
        int i = read + 5;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    private static final /* synthetic */ LogSqliteDrivernewTransaction1[] $values() {
        int i = 2 % 2;
        int i2 = serializer + 107;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return new LogSqliteDrivernewTransaction1[]{APPLICATION_URL_SAVED, APPLICATION_URL_DELETED};
        }
        LogSqliteDrivernewTransaction1 logSqliteDrivernewTransaction1 = APPLICATION_URL_SAVED;
        LogSqliteDrivernewTransaction1 logSqliteDrivernewTransaction2 = APPLICATION_URL_DELETED;
        LogSqliteDrivernewTransaction1[] logSqliteDrivernewTransaction1Arr = new LogSqliteDrivernewTransaction1[3];
        logSqliteDrivernewTransaction1Arr[1] = logSqliteDrivernewTransaction1;
        logSqliteDrivernewTransaction1Arr[0] = logSqliteDrivernewTransaction2;
        return logSqliteDrivernewTransaction1Arr;
    }

    public static LogSqliteDrivernewTransaction1 valueOf(String str) {
        int i = 2 % 2;
        int i2 = serializer + 43;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        LogSqliteDrivernewTransaction1 logSqliteDrivernewTransaction1 = (LogSqliteDrivernewTransaction1) Enum.valueOf(LogSqliteDrivernewTransaction1.class, str);
        int i4 = write + 59;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return logSqliteDrivernewTransaction1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static LogSqliteDrivernewTransaction1[] values() {
        int i = 2 % 2;
        int i2 = serializer + 119;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (LogSqliteDrivernewTransaction1[]) $VALUES.clone();
        }
        throw null;
    }
}

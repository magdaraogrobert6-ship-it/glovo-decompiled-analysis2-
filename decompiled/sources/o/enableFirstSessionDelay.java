package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class enableFirstSessionDelay {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ enableFirstSessionDelay[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int write;
    public static final enableFirstSessionDelay RETRYABLE = new enableFirstSessionDelay("RETRYABLE", 0);
    public static final enableFirstSessionDelay NON_RETRYABLE = new enableFirstSessionDelay("NON_RETRYABLE", 1);
    public static final enableFirstSessionDelay NO_PERMISSIONS = new enableFirstSessionDelay("NO_PERMISSIONS", 2);
    public static final enableFirstSessionDelay NOT_ALLOWED = new enableFirstSessionDelay("NOT_ALLOWED", 3);

    private enableFirstSessionDelay(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 109;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 91;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        enableFirstSessionDelay[] enablefirstsessiondelayArr$values = $values();
        $VALUES = enablefirstsessiondelayArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) enablefirstsessiondelayArr$values);
        int i = IconCompatParcelizer + 123;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static enableFirstSessionDelay valueOf(String str) {
        enableFirstSessionDelay enablefirstsessiondelay;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 111;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            enablefirstsessiondelay = (enableFirstSessionDelay) Enum.valueOf(enableFirstSessionDelay.class, str);
            int i3 = 34 / 0;
        } else {
            enablefirstsessiondelay = (enableFirstSessionDelay) Enum.valueOf(enableFirstSessionDelay.class, str);
        }
        int i4 = RemoteActionCompatParcelizer + 51;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return enablefirstsessiondelay;
        }
        throw null;
    }

    public static enableFirstSessionDelay[] values() {
        int i = 2 % 2;
        int i2 = read + 45;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (enableFirstSessionDelay[]) $VALUES.clone();
        }
        throw null;
    }

    private static final /* synthetic */ enableFirstSessionDelay[] $values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 111;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        enableFirstSessionDelay[] enablefirstsessiondelayArr = {RETRYABLE, NON_RETRYABLE, NO_PERMISSIONS, NOT_ALLOWED};
        int i5 = i2 + 83;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 79 / 0;
        }
        return enablefirstsessiondelayArr;
    }
}

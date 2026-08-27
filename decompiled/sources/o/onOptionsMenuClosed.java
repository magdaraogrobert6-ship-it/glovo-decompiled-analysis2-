package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class onOptionsMenuClosed {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ onOptionsMenuClosed[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private static int write;
    public static final onOptionsMenuClosed HIDDEN = new onOptionsMenuClosed("HIDDEN", 0);
    public static final onOptionsMenuClosed HEADER_ONLY = new onOptionsMenuClosed("HEADER_ONLY", 1);
    public static final onOptionsMenuClosed HEADER_AND_BODY = new onOptionsMenuClosed("HEADER_AND_BODY", 2);

    private onOptionsMenuClosed(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 75;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 79;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        onOptionsMenuClosed[] onoptionsmenuclosedArr$values = $values();
        $VALUES = onoptionsmenuclosedArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) onoptionsmenuclosedArr$values);
        int i = IconCompatParcelizer + 23;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 92 / 0;
        }
    }

    public static onOptionsMenuClosed valueOf(String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 87;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (onOptionsMenuClosed) Enum.valueOf(onOptionsMenuClosed.class, str);
        }
        throw null;
    }

    public static onOptionsMenuClosed[] values() {
        int i = 2 % 2;
        int i2 = write + 35;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        onOptionsMenuClosed[] onoptionsmenuclosedArr = (onOptionsMenuClosed[]) $VALUES.clone();
        int i4 = write + 97;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return onoptionsmenuclosedArr;
        }
        throw null;
    }

    private static final /* synthetic */ onOptionsMenuClosed[] $values() {
        int i = 2 % 2;
        int i2 = write + 75;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return new onOptionsMenuClosed[]{HIDDEN, HEADER_ONLY, HEADER_AND_BODY};
        }
        onOptionsMenuClosed onoptionsmenuclosed = HIDDEN;
        onOptionsMenuClosed onoptionsmenuclosed2 = HEADER_ONLY;
        onOptionsMenuClosed onoptionsmenuclosed3 = HEADER_AND_BODY;
        onOptionsMenuClosed[] onoptionsmenuclosedArr = new onOptionsMenuClosed[3];
        onoptionsmenuclosedArr[0] = onoptionsmenuclosed;
        onoptionsmenuclosedArr[1] = onoptionsmenuclosed2;
        onoptionsmenuclosedArr[4] = onoptionsmenuclosed3;
        return onoptionsmenuclosedArr;
    }
}

package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class fromHtml {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ fromHtml[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    public static final fromHtml VERBOSE = new fromHtml("VERBOSE", 0);
    public static final fromHtml DEBUG = new fromHtml("DEBUG", 1);
    public static final fromHtml INFO = new fromHtml("INFO", 2);
    public static final fromHtml WARNING = new fromHtml("WARNING", 3);
    public static final fromHtml ERROR = new fromHtml("ERROR", 4);

    private fromHtml(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 111;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 25;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        fromHtml[] fromhtmlArr$values = $values();
        $VALUES = fromhtmlArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) fromhtmlArr$values);
        int i = RemoteActionCompatParcelizer + 7;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static fromHtml valueOf(String str) {
        int i = 2 % 2;
        int i2 = read + 15;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        fromHtml fromhtml = (fromHtml) Enum.valueOf(fromHtml.class, str);
        int i4 = read + 91;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return fromhtml;
    }

    public static fromHtml[] values() {
        int i = 2 % 2;
        int i2 = read + 11;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (fromHtml[]) $VALUES.clone();
        }
        int i3 = 19 / 0;
        return (fromHtml[]) $VALUES.clone();
    }

    private static final /* synthetic */ fromHtml[] $values() {
        int i = 2 % 2;
        int i2 = read + 109;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        fromHtml[] fromhtmlArr = {VERBOSE, DEBUG, INFO, WARNING, ERROR};
        int i5 = i3 + 73;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return fromhtmlArr;
    }
}

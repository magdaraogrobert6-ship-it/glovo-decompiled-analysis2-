package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class LineBreakWordBreak {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ LineBreakWordBreak[] $VALUES;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;
    private final String value;
    public static final LineBreakWordBreak ENABLED = new LineBreakWordBreak("ENABLED", 0, "true");
    public static final LineBreakWordBreak DISABLED = new LineBreakWordBreak("DISABLED", 1, "false");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = serializer + 95;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 99;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = serializer + 77;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.value;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private LineBreakWordBreak(String str, int i, String str2) {
        super(str, i);
        this.value = str2;
    }

    private static final /* synthetic */ LineBreakWordBreak[] $values() {
        LineBreakWordBreak[] lineBreakWordBreakArr;
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 7;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            LineBreakWordBreak lineBreakWordBreak = ENABLED;
            LineBreakWordBreak lineBreakWordBreak2 = DISABLED;
            lineBreakWordBreakArr = new LineBreakWordBreak[2];
            lineBreakWordBreakArr[0] = lineBreakWordBreak;
            lineBreakWordBreakArr[0] = lineBreakWordBreak2;
        } else {
            lineBreakWordBreakArr = new LineBreakWordBreak[]{ENABLED, DISABLED};
        }
        int i4 = i2 + 13;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return lineBreakWordBreakArr;
    }

    static {
        LineBreakWordBreak[] lineBreakWordBreakArr$values = $values();
        $VALUES = lineBreakWordBreakArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) lineBreakWordBreakArr$values);
        int i = write + 125;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 44 / 0;
        }
    }

    public static LineBreakWordBreak valueOf(String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 121;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        LineBreakWordBreak lineBreakWordBreak = (LineBreakWordBreak) Enum.valueOf(LineBreakWordBreak.class, str);
        int i4 = serializer + 105;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 35 / 0;
        }
        return lineBreakWordBreak;
    }

    public static LineBreakWordBreak[] values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 73;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        LineBreakWordBreak[] lineBreakWordBreakArr = (LineBreakWordBreak[]) $VALUES.clone();
        int i3 = RemoteActionCompatParcelizer + 19;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return lineBreakWordBreakArr;
    }
}

package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class getSkewX {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ getSkewX[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    private static int write;
    private final String title;
    public static final getSkewX SILENT = new getSkewX("SILENT", 0, "Silent");
    public static final getSkewX NORMAL = new getSkewX("NORMAL", 1, "Normal");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 11;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 37;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        throw null;
    }

    public final String getTitle() {
        int i = 2 % 2;
        int i2 = serializer + 103;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.title;
        int i5 = i3 + 109;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    private getSkewX(String str, int i, String str2) {
        super(str, i);
        this.title = str2;
    }

    static {
        getSkewX[] getskewxArr$values = $values();
        $VALUES = getskewxArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) getskewxArr$values);
        int i = write + 45;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    private static final /* synthetic */ getSkewX[] $values() {
        int i = 2 % 2;
        int i2 = serializer + 63;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        getSkewX[] getskewxArr = {SILENT, NORMAL};
        int i5 = i3 + 79;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return getskewxArr;
        }
        throw null;
    }

    public static getSkewX valueOf(String str) {
        int i = 2 % 2;
        int i2 = serializer + 97;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getSkewX getskewx = (getSkewX) Enum.valueOf(getSkewX.class, str);
        int i4 = RemoteActionCompatParcelizer + 77;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return getskewx;
        }
        throw null;
    }

    public static getSkewX[] values() {
        getSkewX[] getskewxArr;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 59;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            getskewxArr = (getSkewX[]) $VALUES.clone();
            int i3 = 85 / 0;
        } else {
            getskewxArr = (getSkewX[]) $VALUES.clone();
        }
        int i4 = serializer + 37;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return getskewxArr;
        }
        throw null;
    }
}

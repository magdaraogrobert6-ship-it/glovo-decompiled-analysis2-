package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class format {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ format[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer;
    public static final format WEB_INTEGRATION = new format("WEB_INTEGRATION", 0);
    public static final format DEEP_LINK = new format("DEEP_LINK", 1);
    public static final format EXTERNAL_URL = new format("EXTERNAL_URL", 2);

    private format(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 91;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 57;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 2 / 0;
        }
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        format[] formatVarArr$values = $values();
        $VALUES = formatVarArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) formatVarArr$values);
        int i = serializer + 119;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static format valueOf(String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 123;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        format formatVar = (format) Enum.valueOf(format.class, str);
        int i4 = RemoteActionCompatParcelizer + 39;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return formatVar;
    }

    public static format[] values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 65;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (format[]) $VALUES.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ format[] $values() {
        format[] formatVarArr;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 43;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        if (i2 % 2 == 0) {
            format formatVar = WEB_INTEGRATION;
            format formatVar2 = DEEP_LINK;
            format formatVar3 = EXTERNAL_URL;
            formatVarArr = new format[5];
            formatVarArr[0] = formatVar;
            formatVarArr[0] = formatVar2;
            formatVarArr[2] = formatVar3;
        } else {
            formatVarArr = new format[]{WEB_INTEGRATION, DEEP_LINK, EXTERNAL_URL};
        }
        int i4 = i3 + 97;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return formatVarArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}

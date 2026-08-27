package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class setProgressBackgroundColor {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ setProgressBackgroundColor[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private static int serializer;
    public static final setProgressBackgroundColor DEFAULT = new setProgressBackgroundColor("DEFAULT", 0);
    public static final setProgressBackgroundColor DETECTION = new setProgressBackgroundColor("DETECTION", 1);
    public static final setProgressBackgroundColor SUCCESS = new setProgressBackgroundColor("SUCCESS", 2);

    private setProgressBackgroundColor(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 29;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 71;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        setProgressBackgroundColor[] setprogressbackgroundcolorArr$values = $values();
        $VALUES = setprogressbackgroundcolorArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) setprogressbackgroundcolorArr$values);
        int i = serializer + 107;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static setProgressBackgroundColor valueOf(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 77;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (setProgressBackgroundColor) Enum.valueOf(setProgressBackgroundColor.class, str);
        }
        int i3 = 49 / 0;
        return (setProgressBackgroundColor) Enum.valueOf(setProgressBackgroundColor.class, str);
    }

    public static setProgressBackgroundColor[] values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 85;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (setProgressBackgroundColor[]) $VALUES.clone();
        }
        throw null;
    }

    private static final /* synthetic */ setProgressBackgroundColor[] $values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 39;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        setProgressBackgroundColor[] setprogressbackgroundcolorArr = {DEFAULT, DETECTION, SUCCESS};
        int i5 = i2 + 31;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return setprogressbackgroundcolorArr;
    }
}

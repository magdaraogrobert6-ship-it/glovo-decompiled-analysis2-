package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class setOnSessionTrackingSucceededListener {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ setOnSessionTrackingSucceededListener[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;
    public static final setOnSessionTrackingSucceededListener VISIBLE = new setOnSessionTrackingSucceededListener("VISIBLE", 0);
    public static final setOnSessionTrackingSucceededListener PLACEBO = new setOnSessionTrackingSucceededListener("PLACEBO", 1);
    public static final setOnSessionTrackingSucceededListener HIDDEN = new setOnSessionTrackingSucceededListener("HIDDEN", 2);

    private setOnSessionTrackingSucceededListener(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 83;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i4 = i2 + 7;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        setOnSessionTrackingSucceededListener[] setonsessiontrackingsucceededlistenerArr$values = $values();
        $VALUES = setonsessiontrackingsucceededlistenerArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) setonsessiontrackingsucceededlistenerArr$values);
        int i = write + 75;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static setOnSessionTrackingSucceededListener valueOf(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 55;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (setOnSessionTrackingSucceededListener) Enum.valueOf(setOnSessionTrackingSucceededListener.class, str);
        }
        int i3 = 10 / 0;
        return (setOnSessionTrackingSucceededListener) Enum.valueOf(setOnSessionTrackingSucceededListener.class, str);
    }

    public static setOnSessionTrackingSucceededListener[] values() {
        int i = 2 % 2;
        int i2 = read + 33;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (setOnSessionTrackingSucceededListener[]) $VALUES.clone();
        }
        int i3 = 40 / 0;
        return (setOnSessionTrackingSucceededListener[]) $VALUES.clone();
    }

    private static final /* synthetic */ setOnSessionTrackingSucceededListener[] $values() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 17;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        setOnSessionTrackingSucceededListener[] setonsessiontrackingsucceededlistenerArr = {VISIBLE, PLACEBO, HIDDEN};
        int i5 = i2 + 111;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return setonsessiontrackingsucceededlistenerArr;
    }
}

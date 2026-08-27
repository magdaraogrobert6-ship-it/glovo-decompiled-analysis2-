package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class setReferrer {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ setReferrer[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    public static final setReferrer BACKGROUND_LOCATION = new setReferrer("BACKGROUND_LOCATION", 0);
    public static final setReferrer ACTIVITY_RECOGNITION = new setReferrer("ACTIVITY_RECOGNITION", 1);
    public static final setReferrer DISABLE_BATTERY_OPTIMIZATION = new setReferrer("DISABLE_BATTERY_OPTIMIZATION", 2);

    private setReferrer(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = read + 123;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 111;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 47 / 0;
        }
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        setReferrer[] setreferrerArr$values = $values();
        $VALUES = setreferrerArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) setreferrerArr$values);
        int i = IconCompatParcelizer + 125;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static setReferrer valueOf(String str) {
        int i = 2 % 2;
        int i2 = read + 109;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setReferrer setreferrer = (setReferrer) Enum.valueOf(setReferrer.class, str);
        int i4 = serializer + 43;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setreferrer;
    }

    public static setReferrer[] values() {
        int i = 2 % 2;
        int i2 = serializer + 3;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setReferrer[] setreferrerArr = (setReferrer[]) $VALUES.clone();
        int i4 = read + 119;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 0 / 0;
        }
        return setreferrerArr;
    }

    private static final /* synthetic */ setReferrer[] $values() {
        int i = 2 % 2;
        int i2 = read + 59;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        setReferrer[] setreferrerArr = {BACKGROUND_LOCATION, ACTIVITY_RECOGNITION, DISABLE_BATTERY_OPTIMIZATION};
        int i5 = i3 + 51;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return setreferrerArr;
    }
}

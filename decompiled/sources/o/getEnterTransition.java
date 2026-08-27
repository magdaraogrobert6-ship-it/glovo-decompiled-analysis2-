package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class getEnterTransition {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ getEnterTransition[] $VALUES;
    private static int IconCompatParcelizer = 1;
    public static final getEnterTransition OPEN_HELP_CENTER = new getEnterTransition("OPEN_HELP_CENTER", 0);
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;

    private getEnterTransition(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 115;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 111;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        throw null;
    }

    static {
        getEnterTransition[] getentertransitionArr$values = $values();
        $VALUES = getentertransitionArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) getentertransitionArr$values);
        int i = read + 17;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    private static final /* synthetic */ getEnterTransition[] $values() {
        getEnterTransition[] getentertransitionArr;
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 21;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            getentertransitionArr = new getEnterTransition[0];
            getentertransitionArr[0] = OPEN_HELP_CENTER;
        } else {
            getentertransitionArr = new getEnterTransition[]{OPEN_HELP_CENTER};
        }
        int i4 = i2 + 119;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return getentertransitionArr;
    }

    public static getEnterTransition valueOf(String str) {
        int i = 2 % 2;
        int i2 = serializer + 55;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        getEnterTransition getentertransition = (getEnterTransition) Enum.valueOf(getEnterTransition.class, str);
        int i3 = write + 21;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return getentertransition;
    }

    public static getEnterTransition[] values() {
        int i = 2 % 2;
        int i2 = serializer + 89;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getEnterTransition[] getentertransitionArr = (getEnterTransition[]) $VALUES.clone();
        int i4 = write + 61;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return getentertransitionArr;
    }
}

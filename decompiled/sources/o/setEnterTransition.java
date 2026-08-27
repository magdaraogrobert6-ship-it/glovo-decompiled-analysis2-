package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class setEnterTransition {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ setEnterTransition[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private static int serializer;
    public static final setEnterTransition LARGE = new setEnterTransition("LARGE", 0);
    public static final setEnterTransition EXTRA_LARGE = new setEnterTransition("EXTRA_LARGE", 1);

    private setEnterTransition(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 119;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 47;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        setEnterTransition[] setentertransitionArr$values = $values();
        $VALUES = setentertransitionArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) setentertransitionArr$values);
        int i = RemoteActionCompatParcelizer + 35;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static final /* synthetic */ setEnterTransition[] $values() {
        int i = 2 % 2;
        int i2 = read + 67;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        setEnterTransition[] setentertransitionArr = {LARGE, EXTRA_LARGE};
        int i5 = i3 + 23;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return setentertransitionArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static setEnterTransition valueOf(String str) {
        int i = 2 % 2;
        int i2 = read + 115;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setEnterTransition setentertransition = (setEnterTransition) Enum.valueOf(setEnterTransition.class, str);
        int i4 = read + 45;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return setentertransition;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static setEnterTransition[] values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 33;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (setEnterTransition[]) $VALUES.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}

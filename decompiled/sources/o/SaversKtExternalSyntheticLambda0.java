package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class SaversKtExternalSyntheticLambda0 {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ SaversKtExternalSyntheticLambda0[] $VALUES;
    public static final SaversKtExternalSyntheticLambda0 BACKGROUND = new SaversKtExternalSyntheticLambda0("BACKGROUND", 0, "background");
    public static final SaversKtExternalSyntheticLambda0 FOREGROUND = new SaversKtExternalSyntheticLambda0("FOREGROUND", 1, "foreground");
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    private final String value;

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = serializer + 125;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 103;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 33;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.value;
        int i5 = i2 + 37;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    private SaversKtExternalSyntheticLambda0(String str, int i, String str2) {
        super(str, i);
        this.value = str2;
    }

    static {
        SaversKtExternalSyntheticLambda0[] saversKtExternalSyntheticLambda0Arr$values = $values();
        $VALUES = saversKtExternalSyntheticLambda0Arr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) saversKtExternalSyntheticLambda0Arr$values);
        int i = RemoteActionCompatParcelizer + 47;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 57 / 0;
        }
    }

    private static final /* synthetic */ SaversKtExternalSyntheticLambda0[] $values() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 19;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        SaversKtExternalSyntheticLambda0[] saversKtExternalSyntheticLambda0Arr = {BACKGROUND, FOREGROUND};
        int i5 = i2 + 5;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return saversKtExternalSyntheticLambda0Arr;
    }

    public static SaversKtExternalSyntheticLambda0 valueOf(String str) {
        int i = 2 % 2;
        int i2 = serializer + 99;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (SaversKtExternalSyntheticLambda0) Enum.valueOf(SaversKtExternalSyntheticLambda0.class, str);
        }
        throw null;
    }

    public static SaversKtExternalSyntheticLambda0[] values() {
        int i = 2 % 2;
        int i2 = read + 17;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (SaversKtExternalSyntheticLambda0[]) $VALUES.clone();
        }
        throw null;
    }
}

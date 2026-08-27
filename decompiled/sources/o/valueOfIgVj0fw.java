package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class valueOfIgVj0fw {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ valueOfIgVj0fw[] $VALUES;
    private static int IconCompatParcelizer = 0;
    public static final valueOfIgVj0fw NAVIGATION = new valueOfIgVj0fw("NAVIGATION", 0);
    public static final valueOfIgVj0fw OVERVIEW = new valueOfIgVj0fw("OVERVIEW", 1);
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 0;
    private static int write = 1;

    private valueOfIgVj0fw(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 109;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 59;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        valueOfIgVj0fw[] valueofigvj0fwArr$values = $values();
        $VALUES = valueofigvj0fwArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) valueofigvj0fwArr$values);
        int i = RemoteActionCompatParcelizer + 123;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 5 / 0;
        }
    }

    private static final /* synthetic */ valueOfIgVj0fw[] $values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 75;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        valueOfIgVj0fw[] valueofigvj0fwArr = {NAVIGATION, OVERVIEW};
        int i5 = i2 + 53;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return valueofigvj0fwArr;
        }
        throw null;
    }

    public static valueOfIgVj0fw valueOf(String str) {
        valueOfIgVj0fw valueofigvj0fw;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 97;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            valueofigvj0fw = (valueOfIgVj0fw) Enum.valueOf(valueOfIgVj0fw.class, str);
            int i3 = 13 / 0;
        } else {
            valueofigvj0fw = (valueOfIgVj0fw) Enum.valueOf(valueOfIgVj0fw.class, str);
        }
        int i4 = write + 29;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return valueofigvj0fw;
    }

    public static valueOfIgVj0fw[] values() {
        int i = 2 % 2;
        int i2 = write + 69;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        valueOfIgVj0fw[] valueofigvj0fwArr = (valueOfIgVj0fw[]) $VALUES.clone();
        int i4 = write + 29;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 98 / 0;
        }
        return valueofigvj0fwArr;
    }
}

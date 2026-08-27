package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class changeUserlambda10 {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ changeUserlambda10[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int write;
    private final String value;
    public static final changeUserlambda10 IDEAL_FREELANCING = new changeUserlambda10("IDEAL_FREELANCING", 0, "ideal_freelancing");
    public static final changeUserlambda10 AVAILABILITY = new changeUserlambda10("AVAILABILITY", 1, "availability");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = write + 23;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 29;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    public final String getValue() {
        String str;
        int i = 2 % 2;
        int i2 = write + 81;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        if (i2 % 2 == 0) {
            str = this.value;
            int i4 = 44 / 0;
        } else {
            str = this.value;
        }
        int i5 = i3 + 13;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 31 / 0;
        }
        return str;
    }

    private changeUserlambda10(String str, int i, String str2) {
        super(str, i);
        this.value = str2;
    }

    static {
        changeUserlambda10[] changeuserlambda10Arr$values = $values();
        $VALUES = changeuserlambda10Arr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) changeuserlambda10Arr$values);
        int i = RemoteActionCompatParcelizer + 1;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    private static final /* synthetic */ changeUserlambda10[] $values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 107;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        changeUserlambda10[] changeuserlambda10Arr = {IDEAL_FREELANCING, AVAILABILITY};
        int i5 = i2 + 27;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return changeuserlambda10Arr;
    }

    public static changeUserlambda10 valueOf(String str) {
        int i = 2 % 2;
        int i2 = write + 47;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (changeUserlambda10) Enum.valueOf(changeUserlambda10.class, str);
        }
        int i3 = 69 / 0;
        return (changeUserlambda10) Enum.valueOf(changeUserlambda10.class, str);
    }

    public static changeUserlambda10[] values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 7;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        changeUserlambda10[] changeuserlambda10Arr = (changeUserlambda10[]) $VALUES.clone();
        int i4 = write + 67;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return changeuserlambda10Arr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}

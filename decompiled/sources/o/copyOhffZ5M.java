package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class copyOhffZ5M {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ copyOhffZ5M[] $VALUES;
    public static final copyOhffZ5Mdefault Companion;
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    private final String value;
    public static final copyOhffZ5M Pickup = new copyOhffZ5M("Pickup", 0, "pickup");
    public static final copyOhffZ5M Dropoff = new copyOhffZ5M("Dropoff", 1, "dropoff");
    public static final copyOhffZ5M Return = new copyOhffZ5M("Return", 2, "return");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 47;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i4 = i2 + 35;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 23;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.value;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private copyOhffZ5M(String str, int i, String str2) {
        super(str, i);
        this.value = str2;
    }

    static {
        copyOhffZ5M[] copyohffz5mArr$values = $values();
        $VALUES = copyohffz5mArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) copyohffz5mArr$values);
        Companion = new copyOhffZ5Mdefault();
        int i = serializer + 63;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean isDropOffGroup() {
        int i = 2 % 2;
        if (this == Dropoff) {
            int i2 = read + 93;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = read + 31;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public static copyOhffZ5M valueOf(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 65;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        copyOhffZ5M copyohffz5m = (copyOhffZ5M) Enum.valueOf(copyOhffZ5M.class, str);
        int i3 = read + 75;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return copyohffz5m;
        }
        obj.hashCode();
        throw null;
    }

    public static copyOhffZ5M[] values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 37;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        copyOhffZ5M[] copyohffz5mArr = (copyOhffZ5M[]) $VALUES.clone();
        int i3 = IconCompatParcelizer + 101;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 14 / 0;
        }
        return copyohffz5mArr;
    }

    private static final /* synthetic */ copyOhffZ5M[] $values() {
        copyOhffZ5M[] copyohffz5mArr;
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 99;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            copyOhffZ5M copyohffz5m = Pickup;
            copyOhffZ5M copyohffz5m2 = Dropoff;
            copyOhffZ5M copyohffz5m3 = Return;
            copyohffz5mArr = new copyOhffZ5M[4];
            copyohffz5mArr[1] = copyohffz5m;
            copyohffz5mArr[0] = copyohffz5m2;
            copyohffz5mArr[4] = copyohffz5m3;
        } else {
            copyohffz5mArr = new copyOhffZ5M[]{Pickup, Dropoff, Return};
        }
        int i4 = i2 + 13;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return copyohffz5mArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}

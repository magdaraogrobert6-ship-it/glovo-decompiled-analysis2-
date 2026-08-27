package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class invoke58bKbWc {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ invoke58bKbWc[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;
    public static final invoke58bKbWc DROPOFF_IN_PROGRESS = new invoke58bKbWc("DROPOFF_IN_PROGRESS", 0);
    public static final invoke58bKbWc NO_DELIVERIES = new invoke58bKbWc("NO_DELIVERIES", 1);

    private invoke58bKbWc(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = read + 109;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 3;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        invoke58bKbWc[] invoke58bkbwcArr$values = $values();
        $VALUES = invoke58bkbwcArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) invoke58bkbwcArr$values);
        int i = serializer + 81;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static final /* synthetic */ invoke58bKbWc[] $values() {
        invoke58bKbWc[] invoke58bkbwcArr;
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 61;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            invoke58bkbwcArr = new invoke58bKbWc[]{NO_DELIVERIES, DROPOFF_IN_PROGRESS};
        } else {
            invoke58bkbwcArr = new invoke58bKbWc[]{DROPOFF_IN_PROGRESS, NO_DELIVERIES};
        }
        int i4 = i2 + 55;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return invoke58bkbwcArr;
        }
        throw null;
    }

    public static invoke58bKbWc valueOf(String str) {
        int i = 2 % 2;
        int i2 = read + 125;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (invoke58bKbWc) Enum.valueOf(invoke58bKbWc.class, str);
        }
        throw null;
    }

    public static invoke58bKbWc[] values() {
        int i = 2 % 2;
        int i2 = write + 55;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        invoke58bKbWc[] invoke58bkbwcArr = (invoke58bKbWc[]) $VALUES.clone();
        int i4 = read + 61;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return invoke58bkbwcArr;
        }
        throw null;
    }
}

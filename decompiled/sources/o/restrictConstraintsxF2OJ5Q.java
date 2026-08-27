package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class restrictConstraintsxF2OJ5Q {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ restrictConstraintsxF2OJ5Q[] $VALUES;
    public static final Constraintsdefault Companion;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write = 1;
    private final String key;
    public static final restrictConstraintsxF2OJ5Q DISABLED = new restrictConstraintsxF2OJ5Q("DISABLED", 0, "disabled");
    public static final restrictConstraintsxF2OJ5Q NOT_INITIATED = new restrictConstraintsxF2OJ5Q("NOT_INITIATED", 1, "not_initiated");
    public static final restrictConstraintsxF2OJ5Q INITIATED = new restrictConstraintsxF2OJ5Q("INITIATED", 2, "initiated");
    public static final restrictConstraintsxF2OJ5Q FAILED = new restrictConstraintsxF2OJ5Q("FAILED", 3, "failed");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 83;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getKey() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 117;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.key;
        int i5 = i2 + 35;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 65 / 0;
        }
        return str;
    }

    private restrictConstraintsxF2OJ5Q(String str, int i, String str2) {
        super(str, i);
        this.key = str2;
    }

    static {
        restrictConstraintsxF2OJ5Q[] restrictconstraintsxf2oj5qArr$values = $values();
        $VALUES = restrictconstraintsxf2oj5qArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) restrictconstraintsxf2oj5qArr$values);
        Companion = new Constraintsdefault();
        int i = RemoteActionCompatParcelizer + 71;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public final boolean isDone() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 87;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i4;
        int i5 = i3 % 2;
        if (this == INITIATED) {
            int i6 = i4 + 51;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return true;
        }
        int i8 = i2 + 69;
        write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i8 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public static restrictConstraintsxF2OJ5Q valueOf(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 97;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        restrictConstraintsxF2OJ5Q restrictconstraintsxf2oj5q = (restrictConstraintsxF2OJ5Q) Enum.valueOf(restrictConstraintsxF2OJ5Q.class, str);
        int i4 = IconCompatParcelizer + 119;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return restrictconstraintsxf2oj5q;
    }

    public static restrictConstraintsxF2OJ5Q[] values() {
        int i = 2 % 2;
        int i2 = write + 119;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        restrictConstraintsxF2OJ5Q[] restrictconstraintsxf2oj5qArr = (restrictConstraintsxF2OJ5Q[]) $VALUES.clone();
        int i4 = write + 41;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return restrictconstraintsxf2oj5qArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ restrictConstraintsxF2OJ5Q[] $values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 101;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        restrictConstraintsxF2OJ5Q[] restrictconstraintsxf2oj5qArr = {DISABLED, NOT_INITIATED, INITIATED, FAILED};
        int i5 = i3 + 23;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return restrictconstraintsxf2oj5qArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}

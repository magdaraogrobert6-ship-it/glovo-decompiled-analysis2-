package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class sortByGeometryGroupingslambda1 {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ sortByGeometryGroupingslambda1[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;
    public static final sortByGeometryGroupingslambda1 LAUNCH_ENCRYPTION_FLOW = new sortByGeometryGroupingslambda1("LAUNCH_ENCRYPTION_FLOW", 0);
    public static final sortByGeometryGroupingslambda1 LAUNCH_DECRYPTION_FLOW = new sortByGeometryGroupingslambda1("LAUNCH_DECRYPTION_FLOW", 1);

    private sortByGeometryGroupingslambda1(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = serializer + 119;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        int i3 = 32 / 0;
        return $ENTRIES;
    }

    static {
        sortByGeometryGroupingslambda1[] sortbygeometrygroupingslambda1Arr$values = $values();
        $VALUES = sortbygeometrygroupingslambda1Arr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) sortbygeometrygroupingslambda1Arr$values);
        int i = IconCompatParcelizer + 35;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 57 / 0;
        }
    }

    private static final /* synthetic */ sortByGeometryGroupingslambda1[] $values() {
        int i = 2 % 2;
        int i2 = serializer + 9;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        sortByGeometryGroupingslambda1[] sortbygeometrygroupingslambda1Arr = {LAUNCH_ENCRYPTION_FLOW, LAUNCH_DECRYPTION_FLOW};
        int i5 = i3 + 37;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return sortbygeometrygroupingslambda1Arr;
        }
        throw null;
    }

    public static sortByGeometryGroupingslambda1 valueOf(String str) {
        int i = 2 % 2;
        int i2 = serializer + 73;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        sortByGeometryGroupingslambda1 sortbygeometrygroupingslambda1 = (sortByGeometryGroupingslambda1) Enum.valueOf(sortByGeometryGroupingslambda1.class, str);
        int i4 = serializer + 105;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return sortbygeometrygroupingslambda1;
    }

    public static sortByGeometryGroupingslambda1[] values() {
        int i = 2 % 2;
        int i2 = serializer + 39;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (sortByGeometryGroupingslambda1[]) $VALUES.clone();
        }
        int i3 = 41 / 0;
        return (sortByGeometryGroupingslambda1[]) $VALUES.clone();
    }
}

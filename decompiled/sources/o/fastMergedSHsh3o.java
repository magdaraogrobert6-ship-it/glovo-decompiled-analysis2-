package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class fastMergedSHsh3o {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ fastMergedSHsh3o[] $VALUES;
    public static final fastMergedSHsh3o CLOSE = new fastMergedSHsh3o("CLOSE", 0);
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;

    private fastMergedSHsh3o(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = write + 89;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        throw null;
    }

    static {
        fastMergedSHsh3o[] fastmergedshsh3oArr$values = $values();
        $VALUES = fastmergedshsh3oArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) fastmergedshsh3oArr$values);
        int i = serializer + 79;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 1 / 0;
        }
    }

    private static final /* synthetic */ fastMergedSHsh3o[] $values() {
        fastMergedSHsh3o[] fastmergedshsh3oArr;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 55;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        if (i2 % 2 == 0) {
            fastmergedshsh3oArr = new fastMergedSHsh3o[0];
            fastmergedshsh3oArr[1] = CLOSE;
        } else {
            fastmergedshsh3oArr = new fastMergedSHsh3o[]{CLOSE};
        }
        int i4 = i3 + 41;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return fastmergedshsh3oArr;
    }

    public static fastMergedSHsh3o valueOf(String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 55;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        fastMergedSHsh3o fastmergedshsh3o = (fastMergedSHsh3o) Enum.valueOf(fastMergedSHsh3o.class, str);
        int i3 = write + 3;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return fastmergedshsh3o;
    }

    public static fastMergedSHsh3o[] values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 53;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        fastMergedSHsh3o[] fastmergedshsh3oArr = (fastMergedSHsh3o[]) $VALUES.clone();
        int i3 = RemoteActionCompatParcelizer + 89;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 78 / 0;
        }
        return fastmergedshsh3oArr;
    }
}

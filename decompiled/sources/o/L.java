package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class L {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ L[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int write = 1;
    public static final L DEFAULT = new L("DEFAULT", 0);
    public static final L LAST_STOP = new L("LAST_STOP", 1);

    private L(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 23;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i4 = i3 + 1;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        L[] lArr$values = $values();
        $VALUES = lArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) lArr$values);
        int i = read + 71;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ L[] $values() {
        L[] lArr;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 55;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        if (i2 % 2 == 0) {
            L l = DEFAULT;
            L l2 = LAST_STOP;
            lArr = new L[2];
            lArr[1] = l;
            lArr[1] = l2;
        } else {
            lArr = new L[]{DEFAULT, LAST_STOP};
        }
        int i4 = i3 + 25;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 58 / 0;
        }
        return lArr;
    }

    public static L valueOf(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 123;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (L) Enum.valueOf(L.class, str);
        }
        throw null;
    }

    public static L[] values() {
        int i = 2 % 2;
        int i2 = write + 109;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        L[] lArr = (L[]) $VALUES.clone();
        int i4 = IconCompatParcelizer + 103;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return lArr;
    }
}

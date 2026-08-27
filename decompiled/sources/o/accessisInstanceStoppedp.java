package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class accessisInstanceStoppedp {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ accessisInstanceStoppedp[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;
    public static final accessisInstanceStoppedp Loading = new accessisInstanceStoppedp("Loading", 0);
    public static final accessisInstanceStoppedp Available = new accessisInstanceStoppedp("Available", 1);
    public static final accessisInstanceStoppedp Unavailable = new accessisInstanceStoppedp("Unavailable", 2);

    private accessisInstanceStoppedp(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 29;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i4 = i2 + 99;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        obj.hashCode();
        throw null;
    }

    static {
        accessisInstanceStoppedp[] accessisinstancestoppedpArr$values = $values();
        $VALUES = accessisinstancestoppedpArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) accessisinstancestoppedpArr$values);
        int i = serializer + 61;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 17 / 0;
        }
    }

    public static accessisInstanceStoppedp valueOf(String str) {
        int i = 2 % 2;
        int i2 = write + 121;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        accessisInstanceStoppedp accessisinstancestoppedp = (accessisInstanceStoppedp) Enum.valueOf(accessisInstanceStoppedp.class, str);
        int i4 = write + 93;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return accessisinstancestoppedp;
    }

    public static accessisInstanceStoppedp[] values() {
        int i = 2 % 2;
        int i2 = write + 91;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        accessisInstanceStoppedp[] accessisinstancestoppedpArr = (accessisInstanceStoppedp[]) $VALUES.clone();
        int i3 = write + 91;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return accessisinstancestoppedpArr;
    }

    private static final /* synthetic */ accessisInstanceStoppedp[] $values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 125;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return new accessisInstanceStoppedp[]{Loading, Available, Unavailable};
        }
        accessisInstanceStoppedp accessisinstancestoppedp = Loading;
        accessisInstanceStoppedp accessisinstancestoppedp2 = Available;
        accessisInstanceStoppedp accessisinstancestoppedp3 = Unavailable;
        accessisInstanceStoppedp[] accessisinstancestoppedpArr = new accessisInstanceStoppedp[4];
        accessisinstancestoppedpArr[0] = accessisinstancestoppedp;
        accessisinstancestoppedpArr[0] = accessisinstancestoppedp2;
        accessisinstancestoppedpArr[5] = accessisinstancestoppedp3;
        return accessisinstancestoppedpArr;
    }
}

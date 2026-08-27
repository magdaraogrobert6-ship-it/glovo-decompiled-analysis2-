package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class drawRGB {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ drawRGB[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    public static final drawRGB INACTIVE = new drawRGB("INACTIVE", 0);
    public static final drawRGB ACTIVE = new drawRGB("ACTIVE", 1);

    private drawRGB(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 19;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 5;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        throw null;
    }

    static {
        drawRGB[] drawrgbArr$values = $values();
        $VALUES = drawrgbArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) drawrgbArr$values);
        int i = serializer + 101;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static final /* synthetic */ drawRGB[] $values() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 123;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        drawRGB[] drawrgbArr = {INACTIVE, ACTIVE};
        int i5 = i2 + 107;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 98 / 0;
        }
        return drawrgbArr;
    }

    public static drawRGB valueOf(String str) {
        int i = 2 % 2;
        int i2 = read + 31;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        drawRGB drawrgb = (drawRGB) Enum.valueOf(drawRGB.class, str);
        int i3 = read + 113;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return drawrgb;
        }
        obj.hashCode();
        throw null;
    }

    public static drawRGB[] values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 37;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        drawRGB[] drawrgbArr = (drawRGB[]) $VALUES.clone();
        int i4 = RemoteActionCompatParcelizer + 113;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return drawrgbArr;
    }
}

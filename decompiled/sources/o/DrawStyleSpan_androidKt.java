package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class DrawStyleSpan_androidKt {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ DrawStyleSpan_androidKt[] $VALUES;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;
    public static final DrawStyleSpan_androidKt VENDOR = new DrawStyleSpan_androidKt("VENDOR", 0);
    public static final DrawStyleSpan_androidKt CUSTOMER = new DrawStyleSpan_androidKt("CUSTOMER", 1);

    private DrawStyleSpan_androidKt(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = write + 57;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 79;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        DrawStyleSpan_androidKt[] drawStyleSpan_androidKtArr$values = $values();
        $VALUES = drawStyleSpan_androidKtArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) drawStyleSpan_androidKtArr$values);
        int i = RemoteActionCompatParcelizer + 63;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ DrawStyleSpan_androidKt[] $values() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 67;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        DrawStyleSpan_androidKt[] drawStyleSpan_androidKtArr = {VENDOR, CUSTOMER};
        int i5 = i2 + 17;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return drawStyleSpan_androidKtArr;
    }

    public static DrawStyleSpan_androidKt valueOf(String str) {
        int i = 2 % 2;
        int i2 = write + 53;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        DrawStyleSpan_androidKt drawStyleSpan_androidKt = (DrawStyleSpan_androidKt) Enum.valueOf(DrawStyleSpan_androidKt.class, str);
        int i4 = write + 113;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return drawStyleSpan_androidKt;
        }
        throw null;
    }

    public static DrawStyleSpan_androidKt[] values() {
        int i = 2 % 2;
        int i2 = read + 95;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        DrawStyleSpan_androidKt[] drawStyleSpan_androidKtArr = (DrawStyleSpan_androidKt[]) $VALUES.clone();
        int i3 = read + 7;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return drawStyleSpan_androidKtArr;
        }
        obj.hashCode();
        throw null;
    }
}

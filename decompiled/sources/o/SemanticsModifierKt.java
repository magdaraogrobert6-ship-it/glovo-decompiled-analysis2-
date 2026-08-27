package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class SemanticsModifierKt {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ SemanticsModifierKt[] $VALUES;
    private static int IconCompatParcelizer = 1;
    public static final SemanticsModifierKt PHASE_1 = new SemanticsModifierKt("PHASE_1", 0);
    public static final SemanticsModifierKt PHASE_2 = new SemanticsModifierKt("PHASE_2", 1);
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;

    private SemanticsModifierKt(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 77;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 37;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        SemanticsModifierKt[] semanticsModifierKtArr$values = $values();
        $VALUES = semanticsModifierKtArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) semanticsModifierKtArr$values);
        int i = serializer + 99;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ SemanticsModifierKt[] $values() {
        int i = 2 % 2;
        int i2 = write + 121;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return new SemanticsModifierKt[]{PHASE_1, PHASE_2};
        }
        SemanticsModifierKt semanticsModifierKt = PHASE_1;
        SemanticsModifierKt semanticsModifierKt2 = PHASE_2;
        SemanticsModifierKt[] semanticsModifierKtArr = new SemanticsModifierKt[3];
        semanticsModifierKtArr[0] = semanticsModifierKt;
        semanticsModifierKtArr[0] = semanticsModifierKt2;
        return semanticsModifierKtArr;
    }

    public static SemanticsModifierKt valueOf(String str) {
        int i = 2 % 2;
        int i2 = write + 1;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        SemanticsModifierKt semanticsModifierKt = (SemanticsModifierKt) Enum.valueOf(SemanticsModifierKt.class, str);
        int i3 = read + 57;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return semanticsModifierKt;
        }
        throw null;
    }

    public static SemanticsModifierKt[] values() {
        int i = 2 % 2;
        int i2 = read + 37;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        SemanticsModifierKt[] semanticsModifierKtArr = (SemanticsModifierKt[]) $VALUES.clone();
        int i4 = read + 91;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return semanticsModifierKtArr;
    }
}

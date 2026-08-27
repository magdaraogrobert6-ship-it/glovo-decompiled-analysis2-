package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class isAttachedToTransitionOverlay implements writeGlobalCallbackParametersI {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ isAttachedToTransitionOverlay[] $VALUES;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    private final String variantName;
    public static final isAttachedToTransitionOverlay CONTROL = new isAttachedToTransitionOverlay("CONTROL", 0, "Control");
    public static final isAttachedToTransitionOverlay TREATMENT = new isAttachedToTransitionOverlay("TREATMENT", 1, "Variation1");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = serializer + 75;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 73;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        throw null;
    }

    @Override // o.writeGlobalCallbackParametersI
    public String getVariantName() {
        String str;
        int i = 2 % 2;
        int i2 = read + 113;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        if (i2 % 2 != 0) {
            str = this.variantName;
            int i4 = 63 / 0;
        } else {
            str = this.variantName;
        }
        int i5 = i3 + 107;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    private isAttachedToTransitionOverlay(String str, int i, String str2) {
        super(str, i);
        this.variantName = str2;
    }

    static {
        isAttachedToTransitionOverlay[] isattachedtotransitionoverlayArr$values = $values();
        $VALUES = isattachedtotransitionoverlayArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) isattachedtotransitionoverlayArr$values);
        int i = write + 69;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ isAttachedToTransitionOverlay[] $values() {
        int i = 2 % 2;
        int i2 = serializer + 67;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return new isAttachedToTransitionOverlay[]{CONTROL, TREATMENT};
        }
        isAttachedToTransitionOverlay isattachedtotransitionoverlay = CONTROL;
        isAttachedToTransitionOverlay isattachedtotransitionoverlay2 = TREATMENT;
        isAttachedToTransitionOverlay[] isattachedtotransitionoverlayArr = new isAttachedToTransitionOverlay[5];
        isattachedtotransitionoverlayArr[0] = isattachedtotransitionoverlay;
        isattachedtotransitionoverlayArr[1] = isattachedtotransitionoverlay2;
        return isattachedtotransitionoverlayArr;
    }

    public static isAttachedToTransitionOverlay valueOf(String str) {
        int i = 2 % 2;
        int i2 = read + 65;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        isAttachedToTransitionOverlay isattachedtotransitionoverlay = (isAttachedToTransitionOverlay) Enum.valueOf(isAttachedToTransitionOverlay.class, str);
        int i4 = read + 31;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return isattachedtotransitionoverlay;
    }

    public static isAttachedToTransitionOverlay[] values() {
        int i = 2 % 2;
        int i2 = read + 21;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        isAttachedToTransitionOverlay[] isattachedtotransitionoverlayArr = (isAttachedToTransitionOverlay[]) $VALUES.clone();
        int i4 = serializer + 115;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return isattachedtotransitionoverlayArr;
    }
}

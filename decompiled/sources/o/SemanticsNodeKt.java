package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class SemanticsNodeKt {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    private static int serializer = 0;
    private static int write = 1;

    static {
        int[] iArr = new int[SemanticsModifierKt.values().length];
        try {
            iArr[SemanticsModifierKt.PHASE_1.ordinal()] = 1;
        } catch (Exception e) {
            throw e;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SemanticsModifierKt.PHASE_2.ordinal()] = 2;
            int i = serializer + 55;
            write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        IconCompatParcelizer = iArr;
        int i4 = write + 43;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 35 / 0;
        }
    }
}

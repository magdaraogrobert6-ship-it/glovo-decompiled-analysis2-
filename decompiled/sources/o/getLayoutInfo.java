package o;

import com.roadrunner.appmigration.model.PhaseVariant;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class getLayoutInfo {
    private static int IconCompatParcelizer = 0;
    public static final /* synthetic */ int[] serializer;
    private static int write = 1;

    static {
        int[] iArr = new int[PhaseVariant.values().length];
        try {
            iArr[PhaseVariant.PHASE_1.ordinal()] = 1;
            int i = IconCompatParcelizer + 93;
            write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PhaseVariant.PHASE_2.ordinal()] = 2;
            int i4 = IconCompatParcelizer + 91;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        serializer = iArr;
    }
}

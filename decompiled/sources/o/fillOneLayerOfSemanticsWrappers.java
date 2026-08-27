package o;

import com.roadrunner.appmigration.model.PhaseVariant;
import com.roadrunner.appmigration.model.UrgencyVariant;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class fillOneLayerOfSemanticsWrappers {
    private static int IconCompatParcelizer = 0;
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;
    public static final /* synthetic */ int[] read;
    private static int write = 1;

    static {
        int[] iArr = new int[PhaseVariant.values().length];
        try {
            iArr[PhaseVariant.PHASE_2.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PhaseVariant.PHASE_1.ordinal()] = 2;
            int i = IconCompatParcelizer + 21;
            write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        read = iArr;
        int[] iArr2 = new int[UrgencyVariant.values().length];
        try {
            iArr2[UrgencyVariant.NEUTRAL.ordinal()] = 1;
            int i4 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[UrgencyVariant.WARNING.ordinal()] = 2;
            int i5 = IconCompatParcelizer + 37;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 4 / 3;
            } else {
                int i7 = 2 % 2;
            }
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[UrgencyVariant.URGENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        RemoteActionCompatParcelizer = iArr2;
    }
}

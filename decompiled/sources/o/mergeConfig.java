package o;

import com.roadrunner.appmigration.model.PhaseVariant;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class mergeConfig {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[PhaseVariant.values().length];
        try {
            iArr[PhaseVariant.PHASE_1.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PhaseVariant.PHASE_2.ordinal()] = 2;
            int i = read + 19;
            RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        write = iArr;
        int i3 = read + 37;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }
}

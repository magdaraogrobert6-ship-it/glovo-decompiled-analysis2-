package o;

import com.roadrunner.home.nest.api.data.TierType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class interpolateOutOfBoundsScroll {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public static final /* synthetic */ int[] read;

    static {
        int[] iArr = new int[TierType.values().length];
        try {
            iArr[TierType.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TierType.BRONZE.ordinal()] = 2;
            int i = IconCompatParcelizer + 29;
            RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TierType.SILVER.ordinal()] = 3;
            int i3 = IconCompatParcelizer + 123;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TierType.GOLD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[TierType.DIAMOND.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        read = iArr;
    }
}

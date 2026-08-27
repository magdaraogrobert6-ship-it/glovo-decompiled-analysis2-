package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class onAnimationRepeat {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[setLegacyRequestDisallowInterceptTouchEventEnabled.values().length];
        try {
            iArr[setLegacyRequestDisallowInterceptTouchEventEnabled.SuccessRightMovement.ordinal()] = 1;
            int i = read + 79;
            IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[setLegacyRequestDisallowInterceptTouchEventEnabled.InfoRightMovement.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[setLegacyRequestDisallowInterceptTouchEventEnabled.SuccessLeftMovement.ordinal()] = 3;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[setLegacyRequestDisallowInterceptTouchEventEnabled.InfoLeftMovement.ordinal()] = 4;
            int i4 = read + 89;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        } catch (NoSuchFieldError unused4) {
        }
        write = iArr;
    }
}

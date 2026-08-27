package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class getRootAlpha {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    private static int read = 0;
    private static int write = 1;

    static {
        int[] iArr = new int[setLegacyRequestDisallowInterceptTouchEventEnabled.values().length];
        try {
            iArr[setLegacyRequestDisallowInterceptTouchEventEnabled.InfoRightMovement.ordinal()] = 1;
            int i = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[setLegacyRequestDisallowInterceptTouchEventEnabled.InfoLeftMovement.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[setLegacyRequestDisallowInterceptTouchEventEnabled.InfoSmile.ordinal()] = 3;
            int i2 = write + 119;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        IconCompatParcelizer = iArr;
        int i5 = read + 13;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}

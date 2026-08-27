package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class setProgressBackgroundColorSchemeColor {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public static final /* synthetic */ int[] serializer;

    static {
        int[] iArr = new int[setLegacyRequestDisallowInterceptTouchEventEnabled.values().length];
        try {
            iArr[setLegacyRequestDisallowInterceptTouchEventEnabled.SuccessRightMovement.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[setLegacyRequestDisallowInterceptTouchEventEnabled.SuccessLeftMovement.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[setLegacyRequestDisallowInterceptTouchEventEnabled.SuccessSmile.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[setLegacyRequestDisallowInterceptTouchEventEnabled.FailRightMovement.ordinal()] = 4;
            int i = read + 97;
            RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[setLegacyRequestDisallowInterceptTouchEventEnabled.FailLeftMovement.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[setLegacyRequestDisallowInterceptTouchEventEnabled.FailSmile.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[setLegacyRequestDisallowInterceptTouchEventEnabled.InfoRightMovement.ordinal()] = 7;
            int i3 = RemoteActionCompatParcelizer + 37;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[setLegacyRequestDisallowInterceptTouchEventEnabled.InfoLeftMovement.ordinal()] = 8;
            int i6 = 2 % 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[setLegacyRequestDisallowInterceptTouchEventEnabled.InfoSmile.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[setLegacyRequestDisallowInterceptTouchEventEnabled.None.ordinal()] = 10;
            int i7 = RemoteActionCompatParcelizer + 67;
            read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                int i8 = 2 % 2;
            }
        } catch (NoSuchFieldError unused10) {
        }
        serializer = iArr;
    }
}

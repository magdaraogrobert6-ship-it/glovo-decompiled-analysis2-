package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class metaFor {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    private static int serializer = 1;
    private static int write;

    static {
        int[] iArr = new int[isTrackingEnabled.values().length];
        try {
            iArr[isTrackingEnabled.NOT_WORKING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[isTrackingEnabled.STARTING.ordinal()] = 2;
            int i = write + 41;
            serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[isTrackingEnabled.LATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[isTrackingEnabled.AVAILABLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[isTrackingEnabled.ON_PAID_BREAK.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[isTrackingEnabled.ON_BREAK.ordinal()] = 6;
            int i3 = write + 69;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i4 = 2 % 2;
            }
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[isTrackingEnabled.READY.ordinal()] = 7;
            int i5 = 2 % 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[isTrackingEnabled.WORKING.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[isTrackingEnabled.ENDING.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[isTrackingEnabled.SUSPENDED.ordinal()] = 10;
            int i6 = serializer + 69;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
        } catch (NoSuchFieldError unused10) {
        }
        IconCompatParcelizer = iArr;
    }
}

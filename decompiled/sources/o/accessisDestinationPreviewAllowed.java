package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class accessisDestinationPreviewAllowed {
    private static int RemoteActionCompatParcelizer = 0;
    public static final /* synthetic */ int[] read;
    private static int serializer = 1;

    static {
        int[] iArr = new int[isTrackingEnabled.values().length];
        try {
            iArr[isTrackingEnabled.NOT_WORKING.ordinal()] = 1;
            int i = RemoteActionCompatParcelizer + 11;
            serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[isTrackingEnabled.STARTING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[isTrackingEnabled.LATE.ordinal()] = 3;
            int i4 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[isTrackingEnabled.ON_PAID_BREAK.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[isTrackingEnabled.ON_BREAK.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[isTrackingEnabled.AVAILABLE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[isTrackingEnabled.READY.ordinal()] = 7;
            int i5 = RemoteActionCompatParcelizer + 71;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 3 % 5;
            } else {
                int i7 = 2 % 2;
            }
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[isTrackingEnabled.WORKING.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[isTrackingEnabled.ENDING.ordinal()] = 9;
            int i8 = serializer + 69;
            RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[isTrackingEnabled.SUSPENDED.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        read = iArr;
    }
}

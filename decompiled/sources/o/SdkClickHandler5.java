package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class SdkClickHandler5 {
    private static int IconCompatParcelizer = 0;
    public static final /* synthetic */ int[] read;
    public static final /* synthetic */ int[] serializer;
    private static int write = 1;

    static {
        int[] iArr = new int[ResponseData1.values().length];
        try {
            iArr[ResponseData1.DESTRUCTIVE.ordinal()] = 1;
            int i = IconCompatParcelizer + 83;
            write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ResponseData1.SECONDARY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ResponseData1.PRIMARY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ResponseData1.SMALL_PRIMARY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ResponseData1.SMALL_SECONDARY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        serializer = iArr;
        int[] iArr2 = new int[sendSdkClickI.values().length];
        try {
            iArr2[sendSdkClickI.NEUTRAL.ordinal()] = 1;
        } catch (Exception e) {
            throw e;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[sendSdkClickI.SUCCESS.ordinal()] = 2;
            int i3 = write + 75;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i4 = 5 / 2;
            } else {
                int i5 = 2 % 2;
            }
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[sendSdkClickI.CRITICAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[sendSdkClickI.ALERT.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        read = iArr2;
    }
}

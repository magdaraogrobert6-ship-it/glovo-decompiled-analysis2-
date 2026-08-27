package o;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class getScrollableParent {
    private static int RemoteActionCompatParcelizer = 1;
    public static final /* synthetic */ int[] read;
    private static int write;

    static {
        int[] iArr = new int[AndroidShadowContext_androidKt.values().length];
        try {
            iArr[AndroidShadowContext_androidKt.NANOSECONDS.ordinal()] = 1;
            int i = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AndroidShadowContext_androidKt.MILLISECONDS.ordinal()] = 2;
            int i2 = write + 65;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AndroidShadowContext_androidKt.SECONDS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[AndroidShadowContext_androidKt.BYTES.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[AndroidShadowContext_androidKt.KILOBYTES.ordinal()] = 5;
            int i5 = 2 % 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[AndroidShadowContext_androidKt.MEGABYTES.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[AndroidShadowContext_androidKt.RATIO.ordinal()] = 7;
            int i6 = write + 25;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[AndroidShadowContext_androidKt.PERCENTAGE.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[AndroidShadowContext_androidKt.PERCENTILE.ordinal()] = 9;
            int i9 = RemoteActionCompatParcelizer + 61;
            write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[AndroidShadowContext_androidKt.QUANTITY.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        read = iArr;
    }
}

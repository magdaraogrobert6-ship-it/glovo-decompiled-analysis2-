package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class jh {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    private static int read = 1;
    private static int write;

    static {
        int[] iArr = new int[fc.values().length];
        try {
            iArr[fc.CENTER.ordinal()] = 1;
        } catch (Exception e) {
            throw e;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[fc.LEFT.ordinal()] = 2;
            int i = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[fc.RIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[fc.TOP.ordinal()] = 4;
            int i2 = write + 67;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[fc.BOTTOM.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[fc.TOP_LEFT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[fc.TOP_RIGHT.ordinal()] = 7;
            int i5 = 2 % 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[fc.BOTTOM_LEFT.ordinal()] = 8;
            int i6 = read + 81;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[fc.BOTTOM_RIGHT.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        IconCompatParcelizer = iArr;
        int i9 = read + 119;
        write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i9 % 2 != 0) {
            int i10 = 16 / 0;
        }
    }
}

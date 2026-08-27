package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class FocusOrderModifier {
    public static final /* synthetic */ int[] read;

    static {
        int[] iArr = new int[setUp.values().length];
        read = iArr;
        try {
            iArr[setUp.CLEAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            read[setUp.SRC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            read[setUp.DST.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            read[setUp.SRC_OVER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            read[setUp.DST_OVER.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            read[setUp.SRC_IN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            read[setUp.DST_IN.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            read[setUp.SRC_OUT.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            read[setUp.DST_OUT.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            read[setUp.SRC_ATOP.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            read[setUp.DST_ATOP.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            read[setUp.XOR.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            read[setUp.PLUS.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            read[setUp.MODULATE.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            read[setUp.SCREEN.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            read[setUp.OVERLAY.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            read[setUp.DARKEN.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            read[setUp.LIGHTEN.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            read[setUp.COLOR_DODGE.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            read[setUp.COLOR_BURN.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            read[setUp.HARD_LIGHT.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            read[setUp.SOFT_LIGHT.ordinal()] = 22;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            read[setUp.DIFFERENCE.ordinal()] = 23;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            read[setUp.EXCLUSION.ordinal()] = 24;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            read[setUp.MULTIPLY.ordinal()] = 25;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            read[setUp.HUE.ordinal()] = 26;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            read[setUp.SATURATION.ordinal()] = 27;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            read[setUp.COLOR.ordinal()] = 28;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            read[setUp.LUMINOSITY.ordinal()] = 29;
        } catch (NoSuchFieldError unused29) {
        }
    }
}

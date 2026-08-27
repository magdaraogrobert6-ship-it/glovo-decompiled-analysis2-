package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class TwoDimensionalFocusSearchKt {
    public static final /* synthetic */ int[] serializer;

    static {
        int[] iArr = new int[getHeight.values().length];
        serializer = iArr;
        try {
            iArr[getHeight.BOOL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            serializer[getHeight.BYTES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            serializer[getHeight.DOUBLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            serializer[getHeight.ENUM.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            serializer[getHeight.FIXED32.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            serializer[getHeight.FIXED64.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            serializer[getHeight.FLOAT.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            serializer[getHeight.INT32.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            serializer[getHeight.INT64.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            serializer[getHeight.MESSAGE.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            serializer[getHeight.SFIXED32.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            serializer[getHeight.SFIXED64.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            serializer[getHeight.SINT32.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            serializer[getHeight.SINT64.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            serializer[getHeight.STRING.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            serializer[getHeight.UINT32.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            serializer[getHeight.UINT64.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
    }
}

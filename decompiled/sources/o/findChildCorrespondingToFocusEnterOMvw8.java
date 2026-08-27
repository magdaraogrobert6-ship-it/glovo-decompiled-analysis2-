package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class findChildCorrespondingToFocusEnterOMvw8 {
    public static final /* synthetic */ int[] read;
    public static final /* synthetic */ int[] serializer;

    static {
        int[] iArr = new int[TwoDimensionalFocusSearchKtWhenMappings.values().length];
        serializer = iArr;
        try {
            iArr[TwoDimensionalFocusSearchKtWhenMappings.BYTE_STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            serializer[TwoDimensionalFocusSearchKtWhenMappings.MESSAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            serializer[TwoDimensionalFocusSearchKtWhenMappings.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[findBestCandidate4WY_MpI.read.values().length];
        read = iArr2;
        try {
            iArr2[findBestCandidate4WY_MpI.read.MAP.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            read[findBestCandidate4WY_MpI.read.VECTOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            read[findBestCandidate4WY_MpI.read.SCALAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}

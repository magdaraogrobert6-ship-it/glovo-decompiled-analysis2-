package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class CompositionLocalsKtLocalDensity1 {
    public static final /* synthetic */ int[] serializer;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[decodeTextGeometricTransform.values().length];
        serializer = iArr;
        try {
            iArr[decodeTextGeometricTransform.BYTE_STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            serializer[decodeTextGeometricTransform.MESSAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            serializer[decodeTextGeometricTransform.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[CompositionLocalsKtLocalClipboardManager1.RemoteActionCompatParcelizer.values().length];
        write = iArr2;
        try {
            iArr2[CompositionLocalsKtLocalClipboardManager1.RemoteActionCompatParcelizer.MAP.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            write[CompositionLocalsKtLocalClipboardManager1.RemoteActionCompatParcelizer.VECTOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            write[CompositionLocalsKtLocalClipboardManager1.RemoteActionCompatParcelizer.SCALAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}

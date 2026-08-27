package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class hasHit {
    public static final /* synthetic */ int[] serializer;

    static {
        int[] iArr = new int[isSemanticsInvalidatedui.values().length];
        serializer = iArr;
        try {
            iArr[isSemanticsInvalidatedui.ENABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            serializer[isSemanticsInvalidatedui.DISABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            serializer[isSemanticsInvalidatedui.DESTROYED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}

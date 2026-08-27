package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class setToScaleimpl {
    public static final /* synthetic */ int[] read;

    static {
        int[] iArr = new int[rotateInternalimpl.values().length];
        try {
            iArr[rotateInternalimpl.END.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[rotateInternalimpl.ROLLBACK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[rotateInternalimpl.BEGIN_EXCLUSIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[rotateInternalimpl.BEGIN_IMMEDIATE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[rotateInternalimpl.BEGIN_DEFERRED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        read = iArr;
    }
}

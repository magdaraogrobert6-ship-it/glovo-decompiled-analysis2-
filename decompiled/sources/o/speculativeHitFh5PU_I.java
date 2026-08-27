package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class speculativeHitFh5PU_I {
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[nodeRemoved.values().length];
        write = iArr;
        try {
            iArr[nodeRemoved.ADDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            write[nodeRemoved.MODIFIED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            write[nodeRemoved.METADATA.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            write[nodeRemoved.REMOVED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}

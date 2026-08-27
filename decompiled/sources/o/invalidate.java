package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class invalidate {
    public static final /* synthetic */ int[] read;

    static {
        int[] iArr = new int[rebuildOutline.values().length];
        try {
            iArr[rebuildOutline.PRODUCTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[rebuildOutline.TESTING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[rebuildOutline.STAGING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        read = iArr;
    }
}

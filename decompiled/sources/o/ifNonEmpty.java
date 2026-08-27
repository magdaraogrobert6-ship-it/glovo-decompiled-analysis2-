package o;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class ifNonEmpty {
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[getPermissionRequestCount.values().length];
        write = iArr;
        try {
            iArr[getPermissionRequestCount.CT_ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            write[getPermissionRequestCount.CT_WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}

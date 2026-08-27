package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class ceilToIntPx {
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

    static {
        int[] iArr = new int[SelectionHandleIcon.values().length];
        try {
            iArr[SelectionHandleIcon.Vertical.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SelectionHandleIcon.Horizontal.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        RemoteActionCompatParcelizer = iArr;
    }
}

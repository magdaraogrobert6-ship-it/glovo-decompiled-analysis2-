package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class updateClipboardEntryfoundation {
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[SelectionHandleIcon.values().length];
        try {
            iArr[SelectionHandleIcon.Horizontal.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SelectionHandleIcon.Vertical.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        write = iArr;
    }
}

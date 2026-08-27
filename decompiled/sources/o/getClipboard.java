package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class getClipboard {
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

    static {
        int[] iArr = new int[nodeRemoved.values().length];
        RemoteActionCompatParcelizer = iArr;
        try {
            iArr[nodeRemoved.ADDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            RemoteActionCompatParcelizer[nodeRemoved.MODIFIED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            RemoteActionCompatParcelizer[nodeRemoved.REMOVED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}

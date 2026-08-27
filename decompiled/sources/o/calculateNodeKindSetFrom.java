package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class calculateNodeKindSetFrom {
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

    static {
        int[] iArr = new int[isUpdatingui.values().length];
        try {
            iArr[isUpdatingui.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[isUpdatingui.ESTIMATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[isUpdatingui.PREVIOUS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        RemoteActionCompatParcelizer = iArr;
    }
}

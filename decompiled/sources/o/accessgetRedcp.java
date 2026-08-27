package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class accessgetRedcp {
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

    static {
        int[] iArr = new int[accessdrawArcRadjd.values().length];
        try {
            iArr[accessdrawArcRadjd.NO_OP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[accessdrawArcRadjd.ADD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[accessdrawArcRadjd.REMOVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        RemoteActionCompatParcelizer = iArr;
    }
}

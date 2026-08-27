package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class InnerNodeCoordinatorCompanion {
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

    static {
        int[] iArr = new int[requestRemeasureui.values().length];
        RemoteActionCompatParcelizer = iArr;
        try {
            iArr[requestRemeasureui.TINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            RemoteActionCompatParcelizer[requestRemeasureui.CRUNCHY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            RemoteActionCompatParcelizer[requestRemeasureui.LEGACY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            RemoteActionCompatParcelizer[requestRemeasureui.RAW.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}

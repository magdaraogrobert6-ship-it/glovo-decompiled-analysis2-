package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class drawOutline {
    public static final /* synthetic */ int[] serializer;

    static {
        int[] iArr = new int[setCompositingStrategyaDBOjCE.values().length];
        try {
            iArr[setCompositingStrategyaDBOjCE.METERED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[setCompositingStrategyaDBOjCE.UNMETERED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[setCompositingStrategyaDBOjCE.NOT_ROAMING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        serializer = iArr;
    }
}

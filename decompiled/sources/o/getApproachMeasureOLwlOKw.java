package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class getApproachMeasureOLwlOKw {
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

    static {
        int[] iArr = new int[shouldHitTest.values().length];
        try {
            iArr[shouldHitTest.GREATER_THAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[shouldHitTest.EQUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[shouldHitTest.LESS_THAN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        RemoteActionCompatParcelizer = iArr;
    }
}

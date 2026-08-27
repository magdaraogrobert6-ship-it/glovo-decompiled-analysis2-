package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class disableZ {
    public static final /* synthetic */ int[] IconCompatParcelizer;

    static {
        int[] iArr = new int[clipRectN_I0leg.values().length];
        try {
            iArr[clipRectN_I0leg.REMOVED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[clipRectN_I0leg.VISIBLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[clipRectN_I0leg.GONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[clipRectN_I0leg.INVISIBLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        IconCompatParcelizer = iArr;
    }
}

package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class drawArc {
    public static final /* synthetic */ int[] IconCompatParcelizer;

    static {
        int[] iArr = new int[drawLines.values().length];
        try {
            iArr[drawLines.ADDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[drawLines.REMOVING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[drawLines.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        IconCompatParcelizer = iArr;
    }
}

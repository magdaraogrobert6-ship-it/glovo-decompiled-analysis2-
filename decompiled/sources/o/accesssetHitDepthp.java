package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class accesssetHitDepthp {
    public static final /* synthetic */ int[] IconCompatParcelizer;

    static {
        int[] iArr = new int[requestRemeasureui.values().length];
        IconCompatParcelizer = iArr;
        try {
            iArr[requestRemeasureui.LEGACY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            IconCompatParcelizer[requestRemeasureui.CRUNCHY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            IconCompatParcelizer[requestRemeasureui.TINK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            IconCompatParcelizer[requestRemeasureui.RAW.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}

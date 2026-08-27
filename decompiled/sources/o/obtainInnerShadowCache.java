package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class obtainInnerShadowCache {
    public static final /* synthetic */ int[] IconCompatParcelizer;

    static {
        int[] iArr = new int[rebuildOutline.values().length];
        try {
            iArr[rebuildOutline.STAGING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[rebuildOutline.TESTING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[rebuildOutline.PRODUCTION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        IconCompatParcelizer = iArr;
    }
}

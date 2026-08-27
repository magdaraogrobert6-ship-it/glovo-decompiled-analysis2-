package o;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class getSuffixFromUserIdHashAndApiKey {
    public static final /* synthetic */ int[] IconCompatParcelizer;

    static {
        int[] iArr = new int[optEnum.values().length];
        IconCompatParcelizer = iArr;
        try {
            iArr[optEnum.ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            IconCompatParcelizer[optEnum.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            IconCompatParcelizer[optEnum.INFO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}

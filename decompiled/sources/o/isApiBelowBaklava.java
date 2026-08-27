package o;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class isApiBelowBaklava {
    public static final /* synthetic */ int[] read;

    static {
        int[] iArr = new int[BackgroundInAppMessagePreparerdisplayPreparedInAppMessage2.values().length];
        try {
            iArr[BackgroundInAppMessagePreparerdisplayPreparedInAppMessage2.FIXED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BackgroundInAppMessagePreparerdisplayPreparedInAppMessage2.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BackgroundInAppMessagePreparerdisplayPreparedInAppMessage2.SIGNED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        read = iArr;
    }
}

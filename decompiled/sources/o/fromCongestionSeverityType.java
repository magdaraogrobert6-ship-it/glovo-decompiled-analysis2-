package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class fromCongestionSeverityType {
    private static int IconCompatParcelizer = 0;
    public static final /* synthetic */ int[] serializer;
    private static int write = 1;

    static {
        int[] iArr = new int[setProgressBackgroundColor.values().length];
        try {
            iArr[setProgressBackgroundColor.DEFAULT.ordinal()] = 1;
            int i = write + 33;
            IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (Exception e) {
            throw e;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[setProgressBackgroundColor.SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[setProgressBackgroundColor.DETECTION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        serializer = iArr;
        int i4 = write + 95;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}

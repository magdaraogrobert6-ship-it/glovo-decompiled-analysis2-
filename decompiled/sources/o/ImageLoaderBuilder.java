package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class ImageLoaderBuilder {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public static final /* synthetic */ int[] serializer;

    static {
        int[] iArr = new int[zgExternalSyntheticLambda11.values().length];
        try {
            iArr[zgExternalSyntheticLambda11.COD.ordinal()] = 1;
            int i = RemoteActionCompatParcelizer + 91;
            read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[zgExternalSyntheticLambda11.ONLINE.ordinal()] = 2;
            int i4 = RemoteActionCompatParcelizer + 1;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        serializer = iArr;
    }
}

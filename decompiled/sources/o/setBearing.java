package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class setBearing {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public static final /* synthetic */ int[] read;

    static {
        int[] iArr = new int[zgExternalSyntheticLambda11.values().length];
        try {
            iArr[zgExternalSyntheticLambda11.COD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[zgExternalSyntheticLambda11.ONLINE.ordinal()] = 2;
            int i = RemoteActionCompatParcelizer + 87;
            IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        read = iArr;
        int i4 = IconCompatParcelizer + 17;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}

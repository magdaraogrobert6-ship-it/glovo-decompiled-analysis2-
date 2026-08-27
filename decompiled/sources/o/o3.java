package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class o3 {
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;
    private static int serializer = 1;
    private static int write;

    static {
        int[] iArr = new int[o2ExternalSyntheticLambda3.values().length];
        try {
            iArr[o2ExternalSyntheticLambda3.NATIVE_PLUS_LEGACY_FALLBACK.ordinal()] = 1;
            int i = serializer + 125;
            write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[o2ExternalSyntheticLambda3.NATIVE_NO_FALLBACK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[o2ExternalSyntheticLambda3.LEGACY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        RemoteActionCompatParcelizer = iArr;
        int i3 = serializer + 107;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}

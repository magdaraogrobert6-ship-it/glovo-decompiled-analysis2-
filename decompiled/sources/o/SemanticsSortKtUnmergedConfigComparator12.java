package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class SemanticsSortKtUnmergedConfigComparator12 {
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;
    public static final /* synthetic */ int[] read;
    private static int serializer = 0;
    private static int write = 1;

    static {
        int[] iArr = new int[SemanticsSortKt.values().length];
        try {
            iArr[SemanticsSortKt.ENCRYPTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SemanticsSortKt.DECRYPTION.ordinal()] = 2;
            int i = write + 43;
            serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        read = iArr;
        int[] iArr2 = new int[sortByGeometryGroupingslambda1.values().length];
        try {
            iArr2[sortByGeometryGroupingslambda1.LAUNCH_ENCRYPTION_FLOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[sortByGeometryGroupingslambda1.LAUNCH_DECRYPTION_FLOW.ordinal()] = 2;
            int i4 = write + 17;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } catch (NoSuchFieldError unused4) {
        }
        RemoteActionCompatParcelizer = iArr2;
    }
}

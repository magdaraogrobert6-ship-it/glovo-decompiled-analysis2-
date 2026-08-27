package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class BrazeExternalSyntheticLambda75 {
    private static int RemoteActionCompatParcelizer = 1;
    public static final /* synthetic */ int[] read;
    public static final /* synthetic */ int[] serializer;
    private static int write;

    static {
        int[] iArr = new int[r8lambdaL7OLu8lNAZvDt7ctKnLhqGV_Huc.values().length];
        try {
            iArr[r8lambdaL7OLu8lNAZvDt7ctKnLhqGV_Huc.TNC.ordinal()] = 1;
            int i = write + 91;
            RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r8lambdaL7OLu8lNAZvDt7ctKnLhqGV_Huc.NONE.ordinal()] = 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[r8lambdaL7OLu8lNAZvDt7ctKnLhqGV_Huc.UNKNOWN.ordinal()] = 3;
            int i4 = RemoteActionCompatParcelizer + 109;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        serializer = iArr;
        int[] iArr2 = new int[r8lambdaGcPCuHbeI3f7gmV4PjjFd18oWYs.values().length];
        try {
            iArr2[r8lambdaGcPCuHbeI3f7gmV4PjjFd18oWYs.BACK.ordinal()] = 1;
        } catch (Exception e) {
            throw e;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[r8lambdaGcPCuHbeI3f7gmV4PjjFd18oWYs.CLOSE.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[r8lambdaGcPCuHbeI3f7gmV4PjjFd18oWYs.NONE.ordinal()] = 3;
            int i7 = 2 % 2;
        } catch (NoSuchFieldError unused6) {
        }
        read = iArr2;
    }
}

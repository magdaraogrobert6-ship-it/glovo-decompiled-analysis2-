package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AsyncListDiffer11 {
    private static int read = 0;
    public static final /* synthetic */ int[] serializer;
    private static int write = 1;

    static {
        int[] iArr = new int[invokeSuspendcomroadrunnerdeliverypickupdropofftaskssignaturepresentationSignatureTaskUiModelImplonOpenSignatureScreen1.values().length];
        try {
            iArr[invokeSuspendcomroadrunnerdeliverypickupdropofftaskssignaturepresentationSignatureTaskUiModelImplonOpenSignatureScreen1.NEUTRAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[invokeSuspendcomroadrunnerdeliverypickupdropofftaskssignaturepresentationSignatureTaskUiModelImplonOpenSignatureScreen1.SUCCESS.ordinal()] = 2;
            int i = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[invokeSuspendcomroadrunnerdeliverypickupdropofftaskssignaturepresentationSignatureTaskUiModelImplonOpenSignatureScreen1.CRITICAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[invokeSuspendcomroadrunnerdeliverypickupdropofftaskssignaturepresentationSignatureTaskUiModelImplonOpenSignatureScreen1.ALERT.ordinal()] = 4;
            int i2 = read + 17;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        } catch (NoSuchFieldError unused4) {
        }
        serializer = iArr;
        int i4 = write + 123;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}

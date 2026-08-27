package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class getSdkPrefix {
    private static int IconCompatParcelizer = 0;
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;
    public static final /* synthetic */ int[] read;
    private static int serializer = 1;

    static {
        int[] iArr = new int[enablePlayStoreKidsCompliance.values().length];
        try {
            iArr[enablePlayStoreKidsCompliance.GO_BACK.ordinal()] = 1;
            int i = IconCompatParcelizer + 7;
            serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (Exception e) {
            throw e;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[enablePlayStoreKidsCompliance.RETRY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[enablePlayStoreKidsCompliance.GRANT_PERMISSIONS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        RemoteActionCompatParcelizer = iArr;
        int[] iArr2 = new int[enableFirstSessionDelay.values().length];
        try {
            iArr2[enableFirstSessionDelay.RETRYABLE.ordinal()] = 1;
            int i4 = serializer + 85;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[enableFirstSessionDelay.NON_RETRYABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[enableFirstSessionDelay.NO_PERMISSIONS.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[enableFirstSessionDelay.NOT_ALLOWED.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        read = iArr2;
    }
}

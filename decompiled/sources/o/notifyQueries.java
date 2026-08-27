package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class notifyQueries {
    private static int IconCompatParcelizer = 0;
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;
    private static int serializer = 1;

    static {
        int[] iArr = new int[WorkDatabase_Impl.values().length];
        try {
            iArr[WorkDatabase_Impl.REQUIRED_NOT_WORKING.ordinal()] = 1;
            int i = serializer + 53;
            IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WorkDatabase_Impl.REQUIRED_PREPARING_TO_WORK.ordinal()] = 2;
            int i4 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[WorkDatabase_Impl.REQUIRED_ON_BREAK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[WorkDatabase_Impl.REQUIRED_SUSPENDED.ordinal()] = 4;
            int i5 = IconCompatParcelizer + 65;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[WorkDatabase_Impl.NOT_REQUIRED_WORKING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[WorkDatabase_Impl.NOT_REQUIRED_FEATURE_DISABLED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        RemoteActionCompatParcelizer = iArr;
    }
}

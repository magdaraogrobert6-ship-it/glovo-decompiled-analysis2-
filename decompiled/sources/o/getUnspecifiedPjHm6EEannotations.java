package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class getUnspecifiedPjHm6EEannotations {
    private static int RemoteActionCompatParcelizer = 1;
    public static final /* synthetic */ int[] read;
    private static int serializer;

    static {
        int[] iArr = new int[getPreviouseUduSuo.values().length];
        try {
            iArr[getPreviouseUduSuo.ADD_PHOTOS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[getPreviouseUduSuo.PHOTOS_AVAILABLE.ordinal()] = 2;
            int i = RemoteActionCompatParcelizer + 89;
            serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        read = iArr;
        int i4 = RemoteActionCompatParcelizer + 83;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}

package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class r8lambdauDp4EsjycxIdCWNcjVSmlIWbe8M {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[r8lambdav9lEwuigriKPLoepmU9DzDAsGns.values().length];
        try {
            iArr[r8lambdav9lEwuigriKPLoepmU9DzDAsGns.STANDALONE_ITEM.ordinal()] = 1;
            int i = serializer + 107;
            RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i2 = 5 / 5;
            } else {
                int i3 = 2 % 2;
            }
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r8lambdav9lEwuigriKPLoepmU9DzDAsGns.ACCORDION_NESTED_ITEM.ordinal()] = 2;
            int i4 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        write = iArr;
        int i5 = RemoteActionCompatParcelizer + 9;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}

package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class readObjectField {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[hashBoolean.values().length];
        try {
            iArr[hashBoolean.START.ordinal()] = 1;
            int i = serializer + 121;
            RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[hashBoolean.END.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        write = iArr;
        int i4 = serializer + 55;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}

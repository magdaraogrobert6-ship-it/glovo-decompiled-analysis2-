package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class BrushStyle {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[DrawStyleSpan_androidKt.values().length];
        try {
            iArr[DrawStyleSpan_androidKt.VENDOR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DrawStyleSpan_androidKt.CUSTOMER.ordinal()] = 2;
            int i = IconCompatParcelizer + 103;
            RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        write = iArr;
        int i3 = RemoteActionCompatParcelizer + 37;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}

package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class unmergedChildrenui {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    private static int read = 1;
    private static int serializer;

    static {
        int[] iArr = new int[semanticsdefault.values().length];
        try {
            iArr[semanticsdefault.NEUTRAL.ordinal()] = 1;
            int i = read + 115;
            serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[semanticsdefault.URGENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[semanticsdefault.WARNING.ordinal()] = 3;
            int i4 = read + 65;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        } catch (NoSuchFieldError unused3) {
        }
        IconCompatParcelizer = iArr;
        int i6 = serializer + 23;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
    }
}

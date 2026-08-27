package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class SemanticsConfigurationKtgetOrNull1 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public static final /* synthetic */ int[] read;

    static {
        int[] iArr = new int[setPaddingTop.values().length];
        try {
            iArr[setPaddingTop.HUAWEI.ordinal()] = 1;
            int i = RemoteActionCompatParcelizer + 123;
            IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        read = iArr;
        int i4 = IconCompatParcelizer + 53;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }
}

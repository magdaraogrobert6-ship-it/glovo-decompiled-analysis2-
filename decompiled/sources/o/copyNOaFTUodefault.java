package o;

/* JADX INFO: loaded from: classes3.dex */
public final class copyNOaFTUodefault extends Throwable {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final String write;

    @Override // java.lang.Throwable
    public final String getMessage() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 31;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.write;
        int i4 = i2 + 71;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public copyNOaFTUodefault(String str) {
        super(str);
        this.write = str;
    }
}

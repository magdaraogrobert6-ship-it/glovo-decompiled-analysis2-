package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fe {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final g5 serializer;

    public abstract g4 serializer();

    public g5 read() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 71;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        g5 g5Var = this.serializer;
        int i5 = i2 + 17;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return g5Var;
    }

    public fe(g5 g5Var) {
        this.serializer = g5Var;
    }
}

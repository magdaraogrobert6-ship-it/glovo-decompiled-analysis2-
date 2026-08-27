package o;

/* JADX INFO: loaded from: classes3.dex */
public final class toPaintCap implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    public static final toPaintCap read = new toPaintCap();
    private static int serializer;
    private static int write;

    private toPaintCap() {
    }

    static {
        int i = write + 25;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static final toPaintCap IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 3;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return read;
        }
        int i3 = 7 / 0;
        return read;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public /* synthetic */ Object write() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 27;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            serializer();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        toPaintJoin topaintjoinSerializer = serializer();
        int i3 = serializer + 41;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return topaintjoinSerializer;
    }

    public static final toPaintJoin RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        toPaintJoin topaintjoin = new toPaintJoin();
        int i2 = serializer + 109;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return topaintjoin;
    }

    public toPaintJoin serializer() {
        int i = 2 % 2;
        int i2 = serializer + 125;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        toPaintJoin topaintjoinRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        int i4 = IconCompatParcelizer + 73;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 69 / 0;
        }
        return topaintjoinRemoteActionCompatParcelizer;
    }
}

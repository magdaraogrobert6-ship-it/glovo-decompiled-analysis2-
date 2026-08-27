package o;

/* JADX INFO: loaded from: classes3.dex */
public final class LineHeightStyleSpan implements calculateTargetMetrics {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    public static final LineHeightStyleSpan read = new LineHeightStyleSpan();
    private static int serializer = 0;
    private static int write = 1;

    static {
        int i = serializer + 55;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 41;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return "Automatic";
        }
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 77;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 75;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return 363787627;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineHeightStyleSpan)) {
            int i2 = RemoteActionCompatParcelizer + 113;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 == 0;
        }
        int i3 = RemoteActionCompatParcelizer + 99;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}

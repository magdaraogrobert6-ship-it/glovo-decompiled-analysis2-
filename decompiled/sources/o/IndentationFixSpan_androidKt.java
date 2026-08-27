package o;

/* JADX INFO: loaded from: classes3.dex */
public final class IndentationFixSpan_androidKt implements IndentationFixSpan {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public static final IndentationFixSpan_androidKt serializer = new IndentationFixSpan_androidKt();
    private static int write;

    static {
        int i = read + 87;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 57;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 17;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 90 / 0;
        }
        return "None";
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 35;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return -1677504679;
        }
        int i3 = 7 / 0;
        return -1677504679;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            return !((obj instanceof IndentationFixSpan_androidKt) ^ true);
        }
        int i2 = write + 5;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 37;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 86 / 0;
        }
        return true;
    }
}

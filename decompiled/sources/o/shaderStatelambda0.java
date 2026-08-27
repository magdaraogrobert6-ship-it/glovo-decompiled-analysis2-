package o;

/* JADX INFO: loaded from: classes3.dex */
public final class shaderStatelambda0 extends r8lambdaKeMyxhuF3EYMhl9vgBGt4ME3jBA {
    private static int IconCompatParcelizer = 1;
    public static final shaderStatelambda0 RemoteActionCompatParcelizer = new shaderStatelambda0();
    private static int read = 1;
    private static int serializer;
    private static int write;

    static {
        int i = IconCompatParcelizer + 51;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 71;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 15;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return "NotDisplayable";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 25;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 23;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return 957941292;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof shaderStatelambda0) {
                int i2 = serializer + 27;
                read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return true;
            }
            int i4 = serializer;
            int i5 = i4 + 3;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            boolean z = !(i5 % 2 != 0);
            int i6 = i4 + 73;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return z;
        }
        int i8 = serializer + 27;
        read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i8 % 2 != 0;
    }
}

package o;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaSl5Gsj0TJzfof28oj8MYkxu6Io {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    public static final r8lambdaSl5Gsj0TJzfof28oj8MYkxu6Io write = new r8lambdaSl5Gsj0TJzfof28oj8MYkxu6Io();

    static {
        int i = RemoteActionCompatParcelizer + 7;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 57;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 113;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return "Close";
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 19;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 73;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return 373666881;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 29;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 67;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (!(!(obj instanceof r8lambdaSl5Gsj0TJzfof28oj8MYkxu6Io))) {
            return true;
        }
        int i7 = i3 + 77;
        serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}

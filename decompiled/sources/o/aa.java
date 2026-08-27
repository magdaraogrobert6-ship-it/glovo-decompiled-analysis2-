package o;

/* JADX INFO: loaded from: classes3.dex */
public final class aa extends ac {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public static final aa read = new aa();
    private static int serializer = 1;
    private static int write;

    static {
        int i = RemoteActionCompatParcelizer + 19;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 85;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 51;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return "NavigateToSignInScreen";
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 117;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return 1956248706;
        }
        int i3 = 46 / 0;
        return 1956248706;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 23;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            int i4 = i3 + 123;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return true;
        }
        if (!(!(obj instanceof aa))) {
            return true;
        }
        int i6 = i3 + 107;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}

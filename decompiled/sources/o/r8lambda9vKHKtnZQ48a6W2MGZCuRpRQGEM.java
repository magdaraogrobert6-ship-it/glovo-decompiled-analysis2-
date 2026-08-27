package o;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambda9vKHKtnZQ48a6W2MGZCuRpRQGEM implements r8lambda6sk4DzA3gskBkuQlANQmRL8Dlpk {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public static final r8lambda9vKHKtnZQ48a6W2MGZCuRpRQGEM read = new r8lambda9vKHKtnZQ48a6W2MGZCuRpRQGEM();
    private static int serializer = 1;
    private static int write;

    static {
        int i = write + 15;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 61;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 3;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return "ChooseChatLanguage";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 5;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 9;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return -82800382;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 29;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this != obj) {
            return obj instanceof r8lambda9vKHKtnZQ48a6W2MGZCuRpRQGEM;
        }
        int i5 = i2 + 37;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        int i7 = i2 + 53;
        IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return true;
    }
}

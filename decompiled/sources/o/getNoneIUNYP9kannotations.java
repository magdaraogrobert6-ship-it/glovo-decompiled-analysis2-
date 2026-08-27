package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getNoneIUNYP9kannotations implements getUnspecifiedIUNYP9kannotations {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    public static final getNoneIUNYP9kannotations write = new getNoneIUNYP9kannotations();

    static {
        int i = IconCompatParcelizer + 45;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 83 / 0;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 83;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 49;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 42 / 0;
        }
        return "NotDisplayable";
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 95;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        if (i2 % 2 != 0) {
            int i4 = 18 / 0;
        }
        int i5 = i3 + 125;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return 1351712216;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 5;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getNoneIUNYP9kannotations)) {
            int i4 = i3 + 21;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            z = i4 % 2 == 0;
            int i5 = i3 + 71;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        return z;
    }
}

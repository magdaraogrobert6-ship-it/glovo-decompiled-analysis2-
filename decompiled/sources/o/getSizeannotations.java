package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getSizeannotations extends isSpecified0680j_4annotations {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    public static final getSizeannotations serializer = new getSizeannotations();
    private static int write;

    static {
        int i = RemoteActionCompatParcelizer + 1;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 17;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 4 / 0;
        }
        int i5 = i2 + 63;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return "NotDisplayable";
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 15;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 101;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return 1976438261;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 101;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj || (obj instanceof getSizeannotations)) {
            return true;
        }
        int i4 = i2 + 111;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return false;
        }
        throw null;
    }
}

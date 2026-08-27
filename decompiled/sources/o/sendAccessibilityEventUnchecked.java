package o;

/* JADX INFO: loaded from: classes3.dex */
public final class sendAccessibilityEventUnchecked extends getBridge {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public static final sendAccessibilityEventUnchecked serializer = new sendAccessibilityEventUnchecked();
    private static int write;

    static {
        int i = RemoteActionCompatParcelizer + 81;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 105;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = i2 + 95;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return "SelectionCleared";
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 57;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return -334370227;
        }
        int i3 = 39 / 0;
        return -334370227;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 63;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i4;
        if (i3 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this != obj) {
            if (obj instanceof sendAccessibilityEventUnchecked) {
                return true;
            }
            int i5 = i4 + 17;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i5 % 2 == 0;
        }
        int i6 = i2 + 71;
        int i7 = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i7;
        int i8 = i6 % 2;
        int i9 = i7 + 101;
        IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return true;
    }
}

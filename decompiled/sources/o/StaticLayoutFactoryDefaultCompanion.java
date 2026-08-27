package o;

/* JADX INFO: loaded from: classes3.dex */
public final class StaticLayoutFactoryDefaultCompanion extends StaticLayoutFactory33 {
    public static final StaticLayoutFactoryDefaultCompanion IconCompatParcelizer = new StaticLayoutFactoryDefaultCompanion();
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;

    static {
        int i = RemoteActionCompatParcelizer + 99;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 11;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return "NotDisplayable";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 41;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = i2 + 11;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 29 / 0;
        }
        return 1433122324;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(!(obj instanceof StaticLayoutFactoryDefaultCompanion))) {
                return true;
            }
            int i2 = write;
            int i3 = i2 + 69;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            boolean z = i3 % 2 != 0;
            int i4 = i2 + 23;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return z;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i5 = read + 55;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return true;
    }
}

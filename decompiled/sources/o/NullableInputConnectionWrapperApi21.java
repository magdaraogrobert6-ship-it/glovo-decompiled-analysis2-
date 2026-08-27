package o;

/* JADX INFO: loaded from: classes3.dex */
public final class NullableInputConnectionWrapperApi21 implements beginBatchEdit {
    private static int IconCompatParcelizer = 1;
    public static final NullableInputConnectionWrapperApi21 RemoteActionCompatParcelizer = new NullableInputConnectionWrapperApi21();
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;

    static {
        int i = write + 55;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 53;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 87;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return "Idle";
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 103;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 33;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return -110990166;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 113;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i4 + 1;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return true;
        }
        if (!(obj instanceof NullableInputConnectionWrapperApi21)) {
            return false;
        }
        int i8 = i2 + 55;
        IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i8 % 2 != 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}

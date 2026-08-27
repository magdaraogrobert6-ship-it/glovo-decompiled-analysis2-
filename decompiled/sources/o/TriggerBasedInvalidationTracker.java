package o;

/* JADX INFO: loaded from: classes3.dex */
public final class TriggerBasedInvalidationTracker extends onValidateSchema {
    private static int IconCompatParcelizer = 1;
    public static final TriggerBasedInvalidationTracker RemoteActionCompatParcelizer = new TriggerBasedInvalidationTracker();
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;

    static {
        int i = read + 25;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 21;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 84 / 0;
        }
        int i5 = i2 + 125;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return "NotAvailable";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 107;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 5;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return -1236254219;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 39;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        if (this != obj) {
            if (!(!(obj instanceof TriggerBasedInvalidationTracker))) {
                return true;
            }
            int i5 = i3 + 33;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = 60 / 0;
            }
            return false;
        }
        int i7 = i3 + 93;
        int i8 = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i8;
        int i9 = i7 % 2;
        int i10 = i8 + 53;
        IconCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i10 % 2 != 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}

package o;

/* JADX INFO: loaded from: classes3.dex */
public final class SdkClickResponseData implements SdkClickHandler2 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public static final SdkClickResponseData read = new SdkClickResponseData();
    private static int serializer = 1;
    private static int write;

    static {
        int i = serializer + 85;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 11 / 0;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 1;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 43;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return "NotAvailable";
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 67;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 17;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return -1265139226;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 41;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i2 + 111;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return true;
        }
        if (!(obj instanceof SdkClickResponseData)) {
            int i8 = i4 + 69;
            IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return false;
        }
        int i10 = i2 + 115;
        RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i10 % 2 != 0) {
            return true;
        }
        throw null;
    }
}

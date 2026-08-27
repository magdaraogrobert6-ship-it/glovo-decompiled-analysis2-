package o;

/* JADX INFO: loaded from: classes3.dex */
public final class ca {
    private static int read = 1;
    private static int write;

    public final String toString() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 77;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = i2 + 61;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return "DialogViewState(description=2132018711, buttonText=null)";
        }
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 15;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i2 % 2 != 0 ? Integer.hashCode(com.logistics.rider.glovo.R.string.no_mobile_services) << 40 : Integer.hashCode(com.logistics.rider.glovo.R.string.no_mobile_services) * 31;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 93;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 105;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else if (!(obj instanceof ca)) {
            int i6 = i2 + 11;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        return true;
    }
}
